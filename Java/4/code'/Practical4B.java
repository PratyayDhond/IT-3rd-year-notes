//String Buffer

import java.util.Scanner;

class Practical4B{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp;
        int length;

        System.out.print("Enter your first name : ");
        //  StringBuffer str1 = new StringBuffer("James");
        temp = sc.next();
        StringBuffer str1 = new StringBuffer(temp);
        length = str1.length();
        System.out.print("Enter your Surname : ");
        //  StringBuffer str2 = new StringBuffer("Gosling");
        temp = sc.next();
        StringBuffer str2 = new StringBuffer(temp);

        // Append function and insert function of String buffer class
        System.out.println("The Name entered is : " + str1.append(str2).insert(length,' '));

        //setCharAt() function of String buffer class
        str1.setCharAt(length,'-');
        System.out.println("Using setCharAt() function : " + str1);


        System.out.print("Enter the length of the string : ");
        length = sc.nextInt();

        if(length > str1.length()){
            System.out.println("The string has less characters than the inputted length");
//            System.out.println("The extra characters will be replaced with '0's. ");
            str1.setLength(length);
            System.out.println("Your String with length " + length + " is : " + str1);
        }else if(length <= 0){
            System.out.println("Length of string cannot be zero or less than zero.");
        }else{
            str1.setLength(length);
            System.out.println("Your string with length " + length + " is : " + str1);
        }


    }

}