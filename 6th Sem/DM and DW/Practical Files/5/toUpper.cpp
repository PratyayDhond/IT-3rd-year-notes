#include<iostream>
using namespace std;

string upper(string str){
	
	for(int i = 0; i < str.length(); i++){
		int ch = str[i];
		if(ch > 96 && ch < 123 ){
			str[i] = ch - 32;
		}
	}
	
	return str;
}

int main(){
	
	string firstName, lastName;
	cout<<"Enter first name: ";
	cin>>firstName;
	cout<<"Enter last name: ";
	cin>>lastName;
	
	cout<<"\nUser Input: \n";
	cout<<firstName<<" "<<lastName<<endl;
	firstName = upper(firstName);
	lastName = upper(lastName);
	cout<<"\nData cleansing by applying uppercase: \n";
	cout<<firstName<<" "<<lastName<<"\n";
	
	return 0;
}
