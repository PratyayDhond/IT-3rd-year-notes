import java.util.Scanner;

class PracticalTwoC{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int marks = 0;
    if(args.length == 0 ){
      System.out.print("Enter marks (Out of 100) : ");
      marks = sc.nextInt();
    }else{
      try{
        marks = Integer.parseInt(args[0]);
      }catch(Exception e){
        marks = 0;
        System.out.println(e.toString());
      }
    }
    String grade;

    switch(marks/10){
      case 10:
              grade = "A+";
              break;
      case 9:
              grade = "A";      
              break;
      case 8:
              grade = "A-";      
              break;
      case 7:
              grade = "B+";      
              break;
      case 6:
              grade = "B";      
              break;
      case 5:
              grade = "C";      
              break;
      case 4:
              grade = "D";      
              break;
      default:
              grade = "F";      
              break;
    }

  System.out.println("Your grade with " + marks + " marks is " + grade + ".");     

  }

}