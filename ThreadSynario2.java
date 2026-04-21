class Demo implements Runnable
{
       public void Run()
       {
              System.out.println("Inside the Run Mathod");

       }



}
class  ThreadSynario2
{

       public static void main(String[] args)
        {


              System.out.println("main Thread Is running......");
              Demo dobj = new Demo();

              Thread tobj = new Thread(dobj);

              tobj.start();






              
              
       }
}