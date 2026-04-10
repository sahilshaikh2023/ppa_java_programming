class Base
{
       public int i;
       public int j ;

       public Base()
       {
              System.out.println("Inside base constructor");
              this.i =0;
              this.j = 0;

       }

       protected void finalize()
       {
              System.out.println("Inside finalize method of Base ");
       }

       public void fun()
       {
              System.out.println("inside base fun");
       }

}

class Derived extends Base
{
       public int x; 

       public Derived()
       {
              System.out.println("Inside Derived constructor");
              this.x = 0;
       }
       protected void finalize(){

              System.out.println("Inside finalize method of derived class");
       }

       public void gun()
       {
              System.out.println("inside derived gun");

       }

}
class single 
{

       public static void main(String A[])
        {
              System.out.println("inside main ");

              Derived dobj = new Derived();

              System.out.println(dobj.i);
              System.out.println(dobj.j);
              System.out.println(dobj.x);

              dobj.fun();
              dobj.gun();

              System.out.println("End of main");

              
       }
}