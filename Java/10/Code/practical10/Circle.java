package practical10;

import static java.lang.Math.PI;

public class Circle{
	public float radius;
    public float _area;
    public float _perimeter;

    public Circle(float radius){
        this.radius = radius;
        area();
		perimeter();
    }

    public void area(){
        _area = (float) PI * radius * radius;
    }

    public void perimeter(){
        _perimeter = 2 * (float) PI * radius;
    }

    public float getRadius(){
        return radius;
    }

    public float getArea(){
        return _area;
    }

    public float getPerimeter(){
        return _perimeter;
    }

}