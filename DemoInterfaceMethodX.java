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

       public float Area( float radius)
         {
              return circle.PI *radius*radius;

         }

        public float Circumference( float radius)
       {

              return circle.PI*2*radius;

       }
       
       
}

class DemoInterfaceMethodX
{
       public static void main( String A[]){


              // circle cobj = new circle();   not allowed

              Marvellous mobj = new Marvellous();

              
              float Ret =0.0f;

              Ret = mobj.Area(10.5f);

              System.out.println("Area is : "+ Ret);


              Ret = mobj.Circumference(10.5f);

              System.out.println("circumference is   : " + Ret);



       }
}