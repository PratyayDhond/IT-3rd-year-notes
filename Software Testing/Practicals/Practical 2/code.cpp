#include <iostream>
using namespace std;

void circle(){
    float r;
    cout<<"Enter radius of circle (1-200) : ";
    cin>>r;
    if (r > 200 || r < 1)
        cout <<  "Invalid Input";
    else
        cout << "Area of circle with radius " << r << " = " << 3.14 * r * r;
}

void triangle(){
    float h,b;
    cout<<"Enter height of triangle (1-200) : ";
    cin>>h;
    cout<<"Enter base of triangle (1-200) : ";
    cin>>b;
    if (h > 200 || h < 1 || b > 200 || b < 1)
        cout << "Invalid Input";
    else
        cout << "Area of circle with height " << h <<  " and base " << b << " = " << 0.5*b*h;
}

void square(){
    float s;
    cout<<"Enter side of square (1-200) : ";
    cin>>s;
    if (s > 200 || s < 1)
        cout << "Invalid Input";
    else
        cout << "Area of square with side " << s << " = " << s * s;
}

void rectangle(){
    float l,b;
    cout<<"Enter length of rectangle (1-200) : ";
    cin>>l;
    cout<<"Enter breadth of rectangle (1-200) : ";
    cin>>b;

    if (l > 200 || l < 1 || b > 200 || b < 1)
        cout << "Invalid Input";
    else
        cout << "Area of rectangle with length " << l << " and breadth " << b << " = " << l * b;
}


int main() {

    int choice = 0;

    while(choice != 5){
        cout<<"Enter your choice : "<<"\n";
        cout<<"1. Area of circle"<<"\n";
        cout<<"2. Area of triangle"<<"\n";
        cout<<"3. Area of square"<<"\n";
        cout<<"4. Area of rectangle"<<"\n";
        cout<<"5. Exit"<<"\n";
        cout<<"Choice : ";
        cin>>choice;

        if(choice == 5)
            break;
        else{

            switch (choice) {
                case 1:
                    circle();
                    break;
                case 2:
                    triangle();
                    break;
                case 3:
                    square();

                    break;
                case 4:
                    rectangle();
                    break;
                default:
                    cout<<"Enter a valid choice.";
                    break;
            }
            cout<<"\n";
            system("pause");
            system("cls");
        }
    }
}
