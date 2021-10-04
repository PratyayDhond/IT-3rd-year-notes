#include<bits/stdc++.h>
using namespace std;

int main(){

	 int a,b,c,d;
	cout << "The equation is a(x^2)+b(x)+c = 0 \n";
	cout << "Enter value of a : ";
	cin  >> a;
	cout << "Enter value of b : ";
	cin  >> b;
	cout << "Enter value of c : ";
	cin  >> c;
	
	if(a < 0 || b < 0 || c < 0 || a > 100 || b > 100 || c > 100){
		cout<<"Invalid Input\n";
	}else{
		d = b*b - 4*a*c;
		if(a == 0){
			cout << "Not a quadratic equation\n";
		}else if(d == 0){
			cout << "Roots are equal\n";
		}else if(d < 0){
			cout << "Imaginary Roots\n";
		}else{
			cout << "Roots are real\n";
		}
		system("pause");
	}	
	system("cls");	

	return 0;
}
