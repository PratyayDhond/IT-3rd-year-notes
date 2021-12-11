
import java.awt.*;
import java.applet.*;

/*<applet code="Input.class" height="500" width="500">*/

public class Input extends Applet{
	TextField text1, text2;

	public void init(){
		text1 = new TextField(8);
		text2 = new TextField(8);
		add(text1);
		add(text2);
		text1.setText("0");
		text2.setText("0");
	}

	public void paint(Graphics g){
		double x = 0;
		double y = 0;
		double sum = 0, mul=0, div = 0, remainder = 0, sub = 0;
		String s1="",s2="",s3="";

		g.drawString("Input a number in each box",10,50);
		try{
			s1 = text1.getText();
			x = Double.parseDouble(s1);
			s2 = text2.getText();
			y = Double.parseDouble(s2);
		}catch(Exception e){
			System.out.println("Exception Occured : " + e);
		}finally{
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = x / y;
		remainder = x % y;

		s3 = String.valueOf(sum);
		String temp = "The Sum of " + s1 + " + " + s2 + " is " + s3;
		g.drawString(temp,10,75);
		temp = "The Subtraction of " + s1 + " - " + s2 + " is " + String.valueOf(sub);
		g.drawString(temp,10,100);
		temp = "The Multiplication of " + s1 + " * " + s2 + " is " + String.valueOf(mul);
		g.drawString(temp,10,125);
		temp = "The Division of " + s1 + " / " + s2 + " is " + String.valueOf(div);
		g.drawString(temp,10,150);
		temp = "The Remainder of " + s1 + " % " + s2 + " is " + String.valueOf(remainder);
		g.drawString(temp,10,175);
		}
		
	}

	public boolean action(Event event, Object object){	
		repaint();
		return true;
	}

}