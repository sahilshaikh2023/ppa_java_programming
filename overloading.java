class Demo 
{
       public int Addition (int A , int B)   // Addition@2ii
       {
              return A+B;

       }
       public  double Addition (double A , double B)   // Addition@2dd
       {
              return A+B;

       }
       public float Addition (float A , float B , float C)   // Addition@3ff
       {
              return A+B+C;

       }
}
class overloading {
       public static void main(String[] args) {

              Demo dobj = new Demo();

              System.out.println(dobj.Addition(10, 11));
              System.out.println(dobj.Addition(10.899, 20.24));
              System.out.println(dobj.Addition(1.2f, 1.1f,1.1f));             
       }     
}
