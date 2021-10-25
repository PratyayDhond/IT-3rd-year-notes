import java.util.Scanner;
import java.util.Vector;

@SuppressWarnings("unchecked")
class Practical5B{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> list = new Vector<Integer>();
        int marks;
        for(int i = 0;i < 5 ; i++){
            System.out.print("Enter Marks in subject " + (i+1) + " : ");
            marks = sc.nextInt();
            Integer wrappedMarks = marks;
            list.add(wrappedMarks);
        }

        Integer total = 0;
        Float percent = 0.0f;

        for(Integer a : list){
            total += a;
        }

        percent = total/(float) list.size();

        System.out.println("Marks : " + total + "/" + 500);
        System.out.println("Percentage : " + percent + "%");

    }

}
