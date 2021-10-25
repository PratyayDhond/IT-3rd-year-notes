import java.util.Scanner;

class PracticalOneA {
  public static void main(String[] args) {
    final double PI = 3.14;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Radius of Circle : ");
    float radius = sc.nextFloat();
    System.out.println("Area of circle : " + (PI * radius * radius) );

    System.out.print("Enter length and breadth of Rectangle : ");
    float length = sc.nextFloat();
    float breadth = sc.nextFloat();
    System.out.println("Area of Rectangle : " + (length * breadth) );

    System.out.print("Enter Side of Square : ");
    float side = sc.nextFloat();
    System.out.println("Area of Square : " + (side * side) );

  }
}