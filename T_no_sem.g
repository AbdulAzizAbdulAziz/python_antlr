grammar T_no_sem;

prog : statementlist
     ;

statementlist:statement (statement)*;

statement:assign|slicing|unpack|print|add;

assign
      :s1=ID '=' s2=ID 
      |ID '=' Int
      |ID '=' String
      |ID '=' tup_main
      |ID '=' add
      |ID '=' slicing;

slicing:ID '[' Int ']'
       |ID '[' s1=Int ':' s2=Int ']'
       |ID '[' Int ':' ']' 
       |ID '[' ':' Int ']'
       |s1=ID '[' s2=ID ']'
       |s1=ID '[' s2=ID ':' s3=ID ']'
       |s1=ID '[' s2=ID ':' ']' 
       |s1=ID '[' ':' s2=ID ']'
       |s1=ID '[' Int ':' s2=ID ']'
       |s1=ID '[' s2=ID ':' Int ']'
       |ID '['':'']';

unpack:'('s1=ID(','s2=ID)*')''='s3=ID|'('s1=ID(','s2=ID)*')''='int_tuple;

add:(s1=ID|s2=Int|s3=String) ('+' (s4=ID|s5=Int|s6=String|int_tuple))+;

tup_main :tuple('+'(int_tuple|ID))*;

tuple : '(' (s1=Int|s2=String|s3=int_tuple|s7=ID)(',' (s4=Int|s5=String|s6=int_tuple|s8=ID))*')'
      |'('')'
      ;

int_tuple:'(' (s1=Int|s2=String|s3=int_tuple) (',' (s4=Int|s5=String|s6=int_tuple))* ')'
         |'('')'
         ;

print:'print' '('print_var(',' print_var)*')'
     |'print' '('')'
     ;

print_var:String |int_tuple|Int|ID|add|slicing;

Int : ('-')? '0'..'9'('0'..'9')*;

String : '"' (~('"'))* '"'|'\'' ~('\'')* '\'';

ID : ('a'..'z'|'A'..'Z'|'_')(Int|('a'..'z'| 'A'..'Z'|'_'))*;

WS : (' '|'\t'|'\n'|'\r')+ {skip();};

COMMENTS  :   ('#')~('\n'|'\r')* {skip();} ;