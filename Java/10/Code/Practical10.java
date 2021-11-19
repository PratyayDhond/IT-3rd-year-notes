import practical10.Circle;
import java.util.Scanner;

class Practical10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float radius;
		System.out.print("Enter Radius of Circle : " );
		radius = sc.nextFloat();
		Circle circle = new Circle(radius);
		System.out.println("Radius    : " + circle.getRadius());
		System.out.println("Area      : " + circle.getArea());
		System.out.println("Perimeter : " + circle.getPerimeter());
	}
}