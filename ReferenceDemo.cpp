#include<iostream>
using namespace std ;

int main()
{

    int No = 11 ;
    int & x =  No ;


    cout<< "Value of No : "<<No<<endl;     // 11
    cout<< "Value of x : "<<x<<endl;       // 11

    cout<< "Address of No : "<<&No<<endl;   // 100
    cout<< "Address of x : "<<&x<<endl;     //100

    cout<< "Size of no : "<< sizeof(No)<<endl;   // 4
    cout<< "Size of x : "<< sizeof(x)<<endl;     // 4

    
    return 0; 
}