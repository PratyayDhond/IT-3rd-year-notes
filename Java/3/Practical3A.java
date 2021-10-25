import java.util.Scanner;

class Practical3A{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int no;  
    if(args.length == 0){
      System.out.print("Enter number of Rows : ");
      no = sc.nextInt();
    }else{
      try{
      no =  Integer.parseInt(args[0]);
      }catch(Exception e){
        no = args[0].length();
      }
    }  

    for(int i = 1; i<=no ; i++){
      for(int j = 1; j<=i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}