import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

public class actions {

    //Hashmaps containing all tuples and variables
    
    static HashMap<String,ArrayList<Object>> tup = new HashMap<String,ArrayList<Object>>();

    static HashMap<String,Object> var = new HashMap<String,Object>();
    
    //generate tuple with key=ID and an empty ArrayList

    static void gen_tup(String ID)
    {
        if(tup.containsKey(ID))
        {
            tup.remove(ID);
        }
        else if(var.containsKey(ID))
        {
            var.remove(ID);
        }
        tup.put(ID,new ArrayList<Object>());
    }

    //generate variable with key=ID and value O

    static void gen_var(String ID,Object O)
    {
        if(var.containsKey(ID))
        {
            var.remove(ID);
        }
        else if(tup.containsKey(ID))
        {
            tup.remove(ID);
        }
        var.put(ID,O);
    }

    //push values into ArrayList at tup.get(ID)

    static void push_tup(String ID,Object O)
    {
        tup.get(ID).add(O);
    }

    //print for IDs

    static void print(String ID)
    {
        if(tup.containsKey(ID))
        {
            String s="";
            s=print_tup(tup.get(ID));
            System.out.print(s);
        }
        else
        {
            if(var.get(ID) instanceof Collection)
            {
                String s="";
                s=print_sliced_tup(var.get(ID));
                System.out.print(s);
            }
            else
            {
                System.out.print(var.get(ID));
            }
        }
    }

    //Addition of 2 IDs

    @SuppressWarnings("unchecked")
    static Object addID(String ID,Object A)
    {
        if(var.containsKey(ID))
        {
            if(var.get(ID).getClass()==A.getClass())
            {
                if(A instanceof Integer)
                {
                    return (Integer)A+(Integer)var.get(ID);
                }
                else
                {
                    return ((String)A)+((String)var.get(ID));
                }
            }
            else
            {
                System.out.println("Type mismatch");
            }
        }
        else if(tup.containsKey(ID))
        {
            if(tup.get(ID).getClass()==A.getClass())
            {
                ((ArrayList<Object>)A).addAll(tup.get(ID));

                return A;
            }
            else
            {
                System.out.println("Type mismatch");
            }
        }
        return null;
    }

    //gets variable/tuple with key=ID

    static Object getID(String ID)
    {
        if(var.containsKey(ID))
        {
            return var.get(ID);
        }
        else
        {
            return tup.get(ID).clone();
        }
    }

    //unpacks ID thats a tuple into various IDs

    static void unpack(ArrayList<Object> a,String ID)
    {
        if(var.containsKey(ID))
        {
            System.out.println(ID+" not of type tuple");
        }
        else
        {
            ArrayList<Object> b=tup.get(ID);

            if(b.size()!=a.size())
            {
                System.out.println("Size mismatch");
            }
            
            else
            {
                for(int i=0;i<b.size();i++)
                {
                    gen_var((String)a.get(i),b.get(i));
                }
            }
        }
    }

    //unpacks tuple into various IDs

    static void unpack(ArrayList<Object> a,ArrayList<Object> tup)
    {
        if(tup.size()!=a.size())
        {
            System.out.println("Size mismatch");
        }
        else
        {
            for(int i=0;i<tup.size();i++)
            {
                gen_var((String)a.get(i),tup.get(i));
            }
        }
    }

    //prints tuples done recursively for tuples inside tuples

    @SuppressWarnings("unchecked")
    static String print_tup(ArrayList<Object> ID) 
    {
        String x="(";
        for(int i=0;i<ID.size();i++)
        {
            if(ID.get(i) instanceof Collection)
            {
                x=x+print_tup((ArrayList<Object>)ID.get(i))+',';
            }
            else
            {
                x=x+ID.get(i).toString()+',';
            }
        }
        if(x.length()==1){x=x+')';}
        else{x=x.substring(0,x.length()-1)+')';}
        return x;
    }

    //prints sliced tuples also recursive for tuples inside tuples
    //prints single variables without "()"

    @SuppressWarnings("unchecked")
    static String print_sliced_tup(Object a)
    {
        if(a instanceof Collection)
        {
        String x=new String("(");
        Iterator<Object> i = ((Collection<Object>)a).iterator();
        while(i.hasNext())
        {
            Object y=i.next();
            if(y instanceof Collection)
            {
                x=x+print_sliced_tup(y)+',';
            }
            else
            {
                x=x+y+',';
            }
        }
        if(x.length()>1)x=x.substring(0,x.length()-1)+')';
        else{x=x+')';}
        return x;
        }
        else
        {
            if(a.toString().charAt(0)=='"'||a.toString().charAt(0)=='\'')
            {
                return a.toString().substring(1,a.toString().length()-1);
            }
            else
            {
                return a.toString();
            }
        }
    }

    //Assigns slicing operation to correct hashmap with key=ID

    @SuppressWarnings("unchecked")
    static void slicing_assignment(String ID,Object a)
    {
        
        if(a instanceof Collection)
        {
            gen_tup(ID);
            tup.get(ID).addAll((Collection<Object>)a);
        } 
        else 
        {
            gen_var(ID,a);
        }
    }

    //Various slicing operations that takes in 2 inputs (ex:T[1:],T[:-2],T[y] etc.)

    static Object slice(String s1,String s2,String op,String type)
    {
        if (type.equals("Int"))
        {
            int Index=Integer.parseInt(s2);

            if(Index<0){Index=tup.get(s1).size()+Integer.parseInt(s2);}

            if (op.equals("null"))
            {
                return tup.get(s1).get(Index);
            }
            else if(op.equals("x:"))
            {
                return tup.get(s1).subList(Index,tup.get(s1).size());
            }
            else
            {
                return tup.get(s1).subList(0,Index);
            }
        }
        else
        {
            if(!(var.get(s2) instanceof Integer))
            {
                System.out.println("ID not of type Int");
                return null;
            }

            int Index=(Integer)var.get(s2);

            if(Index<0){Index=tup.get(s1).size()+(Integer)var.get(s2);}
            
            if(op.equals("null"))
            {
                return tup.get(s1).get(Index);
            }
            else if(op.equals("x:"))
            {
                return tup.get(s1).subList(Index,tup.get(s1).size());
            }
            else
            {
                return tup.get(s1).subList(0,Index);
            }
        }
    }

    //Various slicing operations that takes in 3 inputs (ex:T[1:x],T[-8:-2] etc.)

    static Object slice_Int(String s1,String s2,String s3,String type)
    {
        if (type.equals("Int"))
        {
            int IndexA=Integer.parseInt(s2);

            int IndexB=Integer.parseInt(s3);

            if(IndexA<0){IndexA=tup.get(s1).size()+Integer.parseInt(s2);}

            if(IndexB<0){IndexB=tup.get(s1).size()+Integer.parseInt(s3);}
            
            try{return tup.get(s1).subList(IndexA,IndexB);}
            catch(Exception e){return new ArrayList<>();}
            
        }
        else if(type.equals("ID"))
        {
            if(!(var.get(s2) instanceof Integer))
            {
                System.out.println("ID not of type Int");
                return null;
            }

            int IndexA=(Integer)var.get(s2);
            int IndexB=(Integer)var.get(s2);

            if(IndexA<0){IndexA=tup.get(s1).size()+(Integer)var.get(s2);}
            if(IndexB<0){IndexB=tup.get(s1).size()+(Integer)var.get(s3);}
            
            return tup.get(s1).subList(IndexA,IndexB);    
        }
        else if(type.equals("MIX1"))
        {
            if(!(var.get(s3) instanceof Integer))
            {
                System.out.println("ID not of type Int");
                return null;
            }

            int IndexA=Integer.parseInt(s2);
            int IndexB=(Integer)var.get(s3);

            if(IndexA<0){IndexA=tup.get(s1).size()+Integer.parseInt(s2);}
            if(IndexB<0){IndexB=tup.get(s1).size()+(Integer)var.get(s3);}
            
            return tup.get(s1).subList(IndexA,IndexB);   
        }
        else
        {
            if(!(var.get(s3) instanceof Integer))
            {
                System.out.println("ID not of type Int");
                return null;
            }

            int IndexB=Integer.parseInt(s2);
            int IndexA=(Integer)var.get(s3);

            if(IndexB<0){IndexB=tup.get(s1).size()+Integer.parseInt(s2);}
            if(IndexA<0){IndexA=tup.get(s1).size()+(Integer)var.get(s3);}
            
            return tup.get(s1).subList(IndexA,IndexB); 
        }
    }

    //Concatinates 2 tuples

    @SuppressWarnings("unchecked")
    static Object concat_tup(Object a,ArrayList<Object> b)
    {
        ((ArrayList<Object>)a).addAll(b);
        return a;
    }
}