abstract class Demo 
{

       public int i,j ;
       
       public int add ( int  a , int b)                    // concrete method - method with body
       { 
              return a+b;

       }

       public abstract int sub ( int a , int b);
    



}

class Hello extends Demo 
{


}

class AbstractDemoX
{

       public static void main ( String A[])
       {

              Hello hobj = new Hello();
              
              



       }
}