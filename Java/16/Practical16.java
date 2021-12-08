import java.awt.*;
import java.applet.*;
/*<applet code="Practical16.class" height="500" width="800"></applet>*/
public class Practical16 extends Applet{
	Font f1,f2;
	public void init(){
		setBackground(Color.CYAN);
		f2 = new Font("Times New Roman",Font.BOLD,18);
	}

	public void paint(Graphics g){
		f1 = g.getFont();
		g.drawRect(10,10,150,60);
		g.setColor(Color.RED);
		g.fillRect(165,10,150,60);
		g.setColor(Color.BLACK);
		g.setFont(f2);
		g.drawString("example of drawRect() and fillRect()",320,50);
	
		g.setColor(Color.BLACK);
		g.drawOval(10,75,150,60);
		g.setColor(Color.RED);
		g.fillOval(165,75,150,60);
		g.setColor(Color.BLACK);
		g.setFont(f2);
		g.drawString("example of drawOval()) and fillOval()",320,110);

		g.setColor(Color.BLACK);
		g.drawArc(10,140,150,60,45,-180);
		g.setColor(Color.RED);
		g.fillArc(165,140,150,60,45,-180);
		g.setColor(Color.BLACK);
		g.setFont(f2);
		g.drawString("example of drawOval()) and fillOval()",320,170);

	}

}