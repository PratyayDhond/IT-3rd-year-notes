

class Employee{
  String name;
  float Salary;
  String position;
  String id;
  
  Employee(String name, float Salary, String position, String id){
    this.name = name;
    this.Salary = Salary;
    this.position = position;
    this.id = id;
  }

  Employee(String name, float Salary, String id){
    this.name = name;
    this.Salary = Salary;
    this.position = "Office Worker";
    this.id = id;
  }

  Employee(String name, String position, String id){
    this.name = name;
    this.Salary = 45000;
    this.position = position;
    this.id = id;
  }

  void display(){
    System.out.println();
    System.out.println("Name   : " + name);
    System.out.println("Post   : " + position);
    System.out.println("ID     : " + id);
    System.out.println("Salary : " + Salary);
  }

}

class Practical6B{

  public static void main(String[] args){
      Employee e1 = new Employee("Pratyay Dhond",50000,"SDE-2","FA0093");
      e1.display();

      Employee e2 = new Employee("Priyanshu Lapkale","SDE-1","E90082");
      e2.display();

      Employee e3 = new Employee("Manthan Ghonge",40000,"D80071");
      e3.display();


  }

}