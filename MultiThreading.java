class Demo extends Thread
{
       public void run()
       {
              System.out.println("Inside the Run Mathod");

       }

}
class  MultiThreading
{

       public static void main(String A[])
        {


              System.out.println("main Thread Is running......");

              Demo dobj1 = new Demo();

              Demo dobj2 = new Demo ();

              dobj1.start();
              dobj2.start();
             
       }
}