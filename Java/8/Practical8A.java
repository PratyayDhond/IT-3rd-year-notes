
// single inheritance

import java.util.Scanner;
import java.util.Vector;

class Employee{
    String name;
    int age;
    float salary;

    void display(){
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }

    Employee(String name,int age,float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}

class Programmer extends Employee{

    String[] languages;

    Programmer(String name, int age, float salary, String[] languages){
        super(name,age,salary);
        this.languages = languages;
    }


    void display(){
        System.out.println("\n");
        super.display();
        System.out.println("Programming Languages : ");
        for(String a : languages){
            System.out.println("   " + a);
        }
    }

}

class Practical8A{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        float salary;
        Vector<String> list = new Vector<>();

        System.out.print("Enter your full name : ");
        name = sc.nextLine();

        System.out.print("Enter your age : ");
        age = sc.nextInt();

        System.out.print("Enter your Salary : ");
        salary = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter the name of programming languages you know. Enter -1 to end input");

        String temp;
        do{
            System.out.print("Enter language : ");
            temp = sc.nextLine();
            if(!temp.equals("-1") )
                list.add(temp);
        }while(!temp.equals("-1"));

        String[] languages = new String[list.size()];
        for(int i = 0; i < list.size(); i++)
            languages[i] = list.elementAt(i);

        Programmer p1 = new Programmer(name,age,salary,languages);
        p1.display();
    }

}