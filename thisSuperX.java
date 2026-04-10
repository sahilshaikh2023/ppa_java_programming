class Base
{
       public int i;
       public int j ;

       public Base()
       {
              System.out.println("Inside base constructor");
              this.i =11;
              this.j = 21;

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
              this.x = 51;
       }

       public void gun()
       {
                  System.out.println("inside derived gun");
              System.out.println("Value of i : "+i);
              System.out.println("Value of j : "+j);
              System.out.println("Value of x : "+x);
          

       }

}
class thisSuperX
{

       public static void main(String A[])
        {
              Derived dobj = new Derived();

              dobj.gun();
              

       }
}