#include <iostream>
using namespace std;

int main() {
	top:
    cout<<"Input sides of triangle : \n";
    int s1,s2,s3;
    cout<<"Input side 1 : ";
    cin>>s1;
    cout<<"Input side 2 : ";
    cin>>s2;
    cout<<"Input side 3 : ";
    cin>>s3;

    if(s1 != 0 && s2 != 0 && s3 != 0){
           if(s1 == s2 && s2 == s3){
               cout<<"The given sides are of an equilateral triangle";
           }else if(s1 != s2 && s2 != s3 && s1 != s3){
               cout<<"The given sides are of an Scalene triangle";
           }else{
               cout<<"The given side are of an isosceles triangle";
           };
    }else{
    	goto top;
    };

}
