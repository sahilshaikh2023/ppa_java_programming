class MainThreadPriority
{

       public static void main(String[] args) {

              System.out.println("Inside main thread");

              Thread tobj = Thread.currentThread();

              String name = tobj.getName();

              System.out.println("Name of Cureent Thread  : " + name);
              

              System.out.println("Priority of thread   :  " + tobj.getPriority());

              
              
       }
}