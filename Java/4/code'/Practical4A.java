
// String

import java.util.Scanner;

class Practical4A {

    public static void main(String[] args){
        String city[] = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter names of five cities : ");
        for(int i = 0;i<5;i++){
            String temp = sc.nextLine();
            city[i] = temp;
        }

        System.out.println("Cities without sorting : ");
        for(String a : city){
            System.out.println(a);
        }

        for(int i = 0; i< city.length;i++){
            for(int j = i+1; j< city.length; j++){
                if(city[i].compareToIgnoreCase(city[j]) > 0){
                    String temp = city[i];
                    city[i] = city[j];
                    city[j] = temp;
                }
            }
        }

        System.out.println("Cities Sorted Alphabetically : ");
        for(String a : city){
            System.out.println(a);
        }

    }

}