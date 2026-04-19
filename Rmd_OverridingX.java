class Base 
{
       public   int i ,j ;
       public void fun ()
       {     System.out.println("Inside the fun ");   }

       public void gun ()
       {     System.out.println("Inside the gun ");   }

       public void sun ()
       {     System.out.println("Inside the sun ");   }

       

}
class Derived extends Base 
{

       public int x ,y ;

       public void gun ( )
       {    System.out.println("Inside Derived gun \n");    }

       public void sun ( )
       {    System.out.println("Inside Derived gun \n");    }

       public void run ( )
       {    System.out.println("Inside Derived gun \n");    }

}
class Rmd_OverridingX
{

       public static void main ( String A [])
       {
         

              Base bobj = new Derived ();

              bobj.fun();      //  base fun
              bobj.gun();      //   derived gun
              bobj.sun();      //  derived sun 
              // bobj.run();       //error


       }

}