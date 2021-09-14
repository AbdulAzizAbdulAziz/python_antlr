grammar T;

@header {import java.util.Collection;}

@members{actions act=new actions();}

prog : statementlist
     ;

statementlist:statement (statement)*;

statement:assign|slicing|unpack|print|add;

assign
      :s1=ID '=' s2=ID {act.gen_var($s1.text,act.var.get($s2.text));}
      |ID '=' Int {act.gen_var($ID.text,Integer.parseInt($Int.text));}
      |ID '=' String {act.gen_var($ID.text,$String.text.substring(1,$String.text.length()-1));}
      |ID '=' tup_main [$ID.text]
      |ID '=' add {act.gen_var($ID.text,$add.a);}
      |ID '=' slicing {act.slicing_assignment($ID.text,$slicing.a);}
      ;

slicing returns[Object a]:ID '[' Int ']' {a=act.slice($ID.text,$Int.text,"null","Int");}
       |ID '[' s1=Int ':' s2=Int ']' {$a=act.slice_Int($ID.text,$s1.text,$s2.text,"Int");}
       |ID '[' Int ':' ']' {$a=act.slice($ID.text,$Int.text,"x:","Int");}
       |ID '[' ':' Int ']' {$a=act.slice($ID.text,$Int.text,":x","Int");}
       |s1=ID '[' s2=ID ']' {$a=act.slice($s1.text,$s2.text,"null","ID");}
       |s1=ID '[' s2=ID ':' s3=ID ']' {$a=act.slice_Int($s1.text,$s2.text,$s3.text,"ID");}
       |s1=ID '[' s2=ID ':' ']' {$a=act.slice($s1.text,$s2.text,"x:","ID");}
       |s1=ID '[' ':' s2=ID ']' {$a=act.slice($s1.text,$s2.text,":x","ID");}
       |s1=ID '[' Int ':' s2=ID ']' {$a=act.slice_Int($s1.text,$Int.text,$s2.text,"MIX1");}
       |s1=ID '[' s2=ID ':' Int ']' {$a=act.slice_Int($s1.text,$Int.text,$s2.text,"MIX2");}
       |ID '['':'']' {$a=act.tup.get($ID.text);}
       ;

unpack returns[ArrayList<Object> a]@init {$a = new ArrayList<Object>();}
:'('s1=ID{a.add($s1.text);}(','s2=ID{a.add($s2.text);})*')''='s3=ID{act.unpack($a,$s3.text);}
|'('s1=ID{a.add($s1.text);}(','s2=ID{a.add($s2.text);})*')''='int_tuple{act.unpack($a,$int_tuple.a);}
;

add returns[Object a]
   :(s1=ID{$a=act.getID($s1.text);}|s2=Int{$a=Integer.parseInt($s2.text);}|s3=String{$a=$s3.text.substring(0,$s3.text.length()-1);}) ('+' (s4=ID{$a=act.addID($s4.text,a);}|s5=Int{$a=(Integer)a+Integer.parseInt($s5.text);}|s6=String{$a=(String)a+$s6.text.substring(1,$s6.text.length()-1);}|int_tuple{$a=act.concat_tup(a,$int_tuple.a);}))+
   ;

tup_main [String Id]:{act.gen_tup($Id);}tuple [$Id]('+'(int_tuple {act.tup.get($Id).addAll($int_tuple.a);}|ID {act.tup.get($Id).addAll(act.tup.get($ID.text));}))*;

tuple [String Id] : '(' (s1=Int{act.push_tup($Id,Integer.parseInt($s1.text));}|s2=String{act.push_tup($Id,$s2.text);}|s3=int_tuple {act.push_tup($Id,$s3.a);}|s7=ID {act.push_tup($Id,act.getID($s7.text));})(',' (s4=Int{act.push_tup($Id,Integer.parseInt($s4.text));}|s5=String{act.push_tup($Id,$s5.text);}|s6=int_tuple{act.push_tup($Id,$s6.a);}|s8=ID {act.push_tup($Id,act.getID($s8.text));}))*')'
      |'('')'
      ;

int_tuple returns[ArrayList<Object> a]@init {$a = new ArrayList<Object>();}
         :'(' (s1=Int{$a.add(Integer.parseInt($s1.text));}|s2=String{$a.add($s2.text);}|s3=int_tuple{$a.add($s3.a);}) (',' (s4=Int{$a.add(Integer.parseInt($s4.text));}|s5=String{$a.add($s5.text);}|s6=int_tuple{$a.add($s6.a);}))* ')'
         |'('')'
         ;

print:'print' '('print_var(',' {System.out.print(" ");} print_var)*')' {System.out.print('\n');}
     |'print' '('')'{System.out.println();}
     ;

print_var:String {String s=$String.text.replace("\\n",System.lineSeparator()).replace("\\t","    "); System.out.print(s.substring(1,$String.text.length()-1));}
         |int_tuple{System.out.print(act.print_sliced_tup($int_tuple.a));}
         |Int {System.out.print(Integer.parseInt($Int.text));}
         |ID {act.print($ID.text);}
         |add {System.out.print($add.a);}
         |slicing {System.out.print(act.print_sliced_tup($slicing.a));}
         ;

Int : ('-')? '0'..'9'('0'..'9')*;

String : '"' (~('"'))* '"'|'\'' ~('\'')* '\'';

ID : ('a'..'z'|'A'..'Z'|'_')(Int|('a'..'z'| 'A'..'Z'|'_'))*;

WS : (' '|'\t'|'\n'|'\r')+ {skip();};

COMMENTS  :   ('#')~('\n'|'\r')* {skip();} ;