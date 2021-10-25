import java.util.Scanner;

class PracticalOneC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a;
    int b;

    System.out.print("Enter First Number : ");
    a = sc.nextInt();
    System.out.print("Enter Second Number : ");
    b = sc.nextInt();

    System.out.println(a + " + " + b + " = " + (a + b ));

    System.out.println(a + " - " + b + " = " + (a - b ));

    System.out.println(a + " * " + b + " = " + (a * b ));

    System.out.println(a + " / " + b + " = " + (a / b ));

    System.out.println(a + " % " + b + " = " + (a % b ));


  }
}