//nested class

class Practical7A{

    static int age = 18;
    String phoneNo = "9022137587";
    static private String name = "Pratyay";

    static class nestedClass{
      void display(){
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);

        // Can't access non static variables 
        // System.out.println("Phone no : " + phoneNo);
      }

    }


  public static void main(String[] args){
    Practical7A.nestedClass nestedObject = new Practical7A.nestedClass();
    nestedObject.display();
      
  }


}