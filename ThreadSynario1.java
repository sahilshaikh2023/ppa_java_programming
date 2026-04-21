class Demo extends Thread
{
       public void Run()
       {
              System.out.println("Inside the Run Mathod");

       }



}
class  ThreadSynario1
{

       public static void main(String[] args)
        {


              System.out.println("main Thread Is running......");
              Demo dobj = new Demo();

              dobj.start();






              
              
       }
}