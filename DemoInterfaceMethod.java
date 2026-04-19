interface circle 
{

       // characteristic (public static final )
       float PI = 3.14f;     

       // Behaviours        (public and abstract )
       float Area( float radius);
       float Circumference( float radius);

}

class Marvellous implements circle
{
       // error due to missing of the body of area and circumfrence 
       
}

class DemoInterfaceMethod
{

       public static void main( String A[]){

              Marvellous mobj = new Marvellous();




       }
}