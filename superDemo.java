class Base
{
       public int i;


       public Base(int no)
       {
              System.out.println("Inside base constructor");
              this.i =no;
          

       }

       public void fun()
       {
              System.out.println("inside base fun");
              
       }

}

class Derived extends Base
{
       public int i ; 

       public Derived()
       {
              System.out.println("Inside Derived constructor");
              this.i = 21;
       }

       public void gun()
       {
                  System.out.println("inside derived gun");
              System.out.println("Value of i : "+i);
              System.out.println("Value of i from base  : "+super.i);
              
              
          

       }

}
class superDemo
{

       public static void main(String A[])
        {
              Derived dobj = new Derived();   // error

              dobj.gun();

       }
}