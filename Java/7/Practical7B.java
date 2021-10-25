//nested class

class Outer{

    static int age = 18;
    String phoneNo = "9022137587";
    static private String name = "Pratyay";

    class innerClass{
      void display(){
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Phone no : " + phoneNo);
      }

    }

}

class Practical7B{

  public static void main(String[] args){
    Outer outerObj = new Outer();
    Outer.innerClass innerObj = outerObj.new innerClass();
    innerObj.display();
  
      
  }


}