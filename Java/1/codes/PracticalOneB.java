import java.util.Scanner;

class PracticalOneB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    var name = " ";
    var age = 0;
    var department = " ";

    System.out.print("Enter your full name  : ");
    name = sc.nextLine();
    System.out.print("Enter your Department : ");
    department = sc.nextLine();
    System.out.print("Enter your age        : ");
    age = sc.nextInt();

    System.out.println("Name       : " + name );
    System.out.println("Department : " + department );
    System.out.println("Age        : " + age );


  }
}