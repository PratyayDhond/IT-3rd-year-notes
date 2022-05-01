import java.awt.*;

public class Bean extends Canvas{
  private String msg;
  public Bean(){
    setSize(70,50);
    setBackground(Color.green);
    msg =  "Hello Bean Development Kit";
  }

  public void setMessage(String msg){
    this.msg = msg;
  }

  public String getMessage(){
    return this.msg;
  }

  public void paint(Graphics g){
    g.drawString(msg,10,10);
  }

}