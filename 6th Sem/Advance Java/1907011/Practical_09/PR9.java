
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class PR9{
    private int count = 0;
    PR9(){
        JFrame jFrame = new JFrame("Practical 9");
        jFrame.setSize(750 ,250);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(new GridLayout(1,1,2,2));
        JLabel label = new JLabel("Hey Pratyay! Click count is : " + count);
        jFrame.add(label);
        JButton button = new JButton("Press Me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                //System.out.println(e);
                label.setText("Hey Pratyay! Click count is : " + count);
            }
        });
        button.setPreferredSize(new Dimension(100,100));
        jFrame.add(button);







        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        PR9 m = new PR9();
    }
}
