 import java.util.Scanner;
import java.util.Random;

class PracticalTwoB{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int number = rand.nextInt(50) + 1;
    int guess;
    if(args.length == 0){
    System.out.print("Enter a number between 1-50 : ");
    guess = sc.nextInt();
    }else{
      guess = Integer.parseInt(args[0]);
    }
    
    if(guess > number){
      System.out.println("The number you entered is greater than target.");
    }else if(guess < number){
      System.out.println("The number you entered is less than target.");
    }else{
      System.out.println("The number you entered is equal to Target!");
    }

    System.out.println("The target number was : " + number);    

  }

}