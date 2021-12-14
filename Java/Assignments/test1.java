// Java program to create frames
// using association
 
import javax.swing.*;
public class test1
{
    JFrame frame;
 
    test1()
    {
        // creating instance of JFrame with name "first way"
        frame=new JFrame("Assignment No. 4");
         
        // creates instance of JButton
        JButton button = new JButton("Button Using Frame");
 
        button.setBounds(350, 225, 180, 100);
         
        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.add(button);
 
        frame.setSize(900, 900);
         
        // uses no layout managers
        frame.setLayout(null);
         
        // makes the frame visible
        frame.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        new test1();
    }
}