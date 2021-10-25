

import java.util.Scanner;

class calculations{

    final float PI = 3.142f ;

    float area(float radius){
        return radius*radius*PI;
    }

    float area(float length,float breadth){
        return length * breadth;
    }

}

class Practical6A{

    public static void main(String[] args){
        calculations obj = new calculations();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float radius = sc.nextFloat();
        System.out.println("Area of circle : " + obj.area(radius) + " units" );
        System.out.print("Enter length of rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter breadth of rectangle : ");
        float breadth = sc.nextFloat();
        System.out.println("Area of circle : " + obj.area(length,breadth) + " units" );
    }

}