import java.io.*;
import java.io.Serializable;

class Data implements java.io.Serializable{
	public String name;
	public int age;

	public Data(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Practical19{
	public static void main(String[] args){

		Data obj = new Data("Pratyay Dhond",18);
		String filename = "output.txt";

		try{
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(obj);
			out.close();
			file.close();

		System.out.println("Object Serialization Completed Successfully");

		}catch(Exception e){
					System.out.println("Error : Object Serialization Failed");
					System.out.println("Error : " + e);
		}

		try{
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			Data from_file = null;

			from_file = (Data) in.readObject();
			in.close();
			file.close();


			System.out.println("Object De-Serialization complete");
			System.out.println("Name " + from_file.name);
			System.out.println("Age  " + from_file.age);			
		}catch(Exception e){
						System.out.println("Error : Object De-Serialization failed...");
									System.out.println("Error : " + e);

		}


	}
}

