// package com.practicals;

import java.util.Vector;
import java.util.Scanner;

public class Practical3B {

    public static void main(String[] args) {
        Vector<Integer> binary = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.print("Enter a number : ");
        try {
            no = sc.nextInt();
        }catch (Exception e){
            System.out.println("Invalid Input");
            System.out.println("Exitting Program...");
            return;
        }

        int num = no;
        while(no != 0){
            int temp = no%2;
            no = no/2;
            binary.add(temp);
        }

        System.out.print("Binary number of " + num + " is : ");
        for(int i = binary.size()-1;i>=0;i--){
            System.out.print(binary.elementAt(i));
        }

    }
}
