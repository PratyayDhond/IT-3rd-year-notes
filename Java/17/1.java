
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Mouse.class" height="600" width="900"> </applet>*/

public class Mouse extends Applet implements MouseListener{
    int clicks = 0;
    int x = 0;
    int y = 0;
    public void init(){
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent mb){
        clicks++;
        System.out.println(mb.getClickCount());
        repaint();
        x = mb.getX();
        String str = String.valueOf(x);
        System.out.println(str);
        y = mb.getY();
        str = String.valueOf(y);
        System.out.println(str);
    }

    public void mousePressed(MouseEvent mb){
        showStatus("Mouse is clicked");
        
    }

    public void mouseReleased(MouseEvent mb){
        showStatus("Mouse click is released");
    }

    public void mouseEntered(MouseEvent mb){

    }

    public void mouseExited(MouseEvent mb){

    }
    Font f1 = new Font("Times New Roman",Font.BOLD,20);
    public void paint(Graphics g){
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("XD Applet senses mouse",50,150);
        g.drawString("Mouse clicks till now " + clicks, 100,200);
        g.drawString("Co-ordinates of last click : x = " + x + " y = " + y,75,250);
    }


}

// comments 