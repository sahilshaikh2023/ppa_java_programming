class Demo extends Thread
{
       public void Run()
       {
              System.out.println("Inside the Run Mathod");

       }



}
class  ThreadSynario1X
{

       public static void main(String A[])
        {


              System.out.println("main Thread Is running......");

              Demo dobj = new Demo();

              Thread tobj = new Thread(dobj);

              tobj.start();






              
              
       }
}