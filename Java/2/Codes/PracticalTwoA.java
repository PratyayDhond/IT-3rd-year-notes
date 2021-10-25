import java.util.Scanner;

class PracticalTwoA{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sc.nextInt();
    if(number%2 == 0){
      System.out.println("The entered number '" + number + "' is even.");
    }else{
      System.out.println("The entered number '" + number + "' is odd.");
    }
  }

}