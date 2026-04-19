interface circle 
{

       // characteristic 

       float PI = 3.14f;     // public static final 

}

class DemoInterface 
{

       public static void main( String A[]){


              System.out.println(circle.PI); 
              circle.PI = 7.12f;                                                // error due to final and static 

       }
}