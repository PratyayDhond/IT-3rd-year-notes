// hierachical inheritance

import java.util.Scanner;

abstract class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    abstract void makeSound();

}

class dog extends Animal{

    dog(String name){
        super(name);
    }

    void details(){
        System.out.println("\nName : " + super.getName());
    }

    void makeSound(){
        System.out.println("woof..woof!");
    }

}

class cat extends Animal{

    cat(String name){
        super(name);
    }

    void details(){
        System.out.println("\nName : " + super.getName());
    }

    void makeSound(){
        System.out.println("meow..meow!");
    }

}

class Practical8C{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name;

        System.out.print("Enter dog's name : ");
        name = sc.next();
        dog d1 = new dog(name);

        System.out.print("Enter cat's name : ");
        name = sc.next();
        cat c1 = new cat(name);

        System.out.println("Press 1 to check the sound dog makes\nPress 2 to check the sound cat makes\nPress 3 to Exit");
        String choice;

        do{
            System.out.print("Enter choice : ");
            choice = sc.next();

            if(choice.equals("1")){
                d1.details();
                d1.makeSound();
            }else if(choice.equals("2")){
                c1.details();
                c1.makeSound();
            }else if(choice.equals("3")){
                System.out.println("Exitting Program...");
            }else{
                System.out.println("Enter a valid choice! \n");
            }
        }while(!choice.equals("3"));

    }

}