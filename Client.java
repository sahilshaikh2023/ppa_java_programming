// user defined packages

import PPA.Marvellous;
import PPA.InfoSystems;
import PPA.LB.Pune;


class Client
{

    
    
    public static void main (String A[])
  {
        Marvellous mobj  = new Marvellous();
        InfoSystems iobj =  new InfoSystems();
        Pune pobj = new Pune();


        System.out.println("inside main of client");


        mobj.Fun();
        iobj.Gun();
        pobj.sun();




    }
}