import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 <html>
<body>
<applet code="PR11.class" width=750 height=250></applet>
</body>
</html>
 */

public class PR11 extends JApplet{
    JComboBox jComboBox;
    JLabel label1,label2,label3,label4,label5;
    JTextField textField;
    String[] elements = {"Lightning","Fire","Water","Earth","wind"};
    ImageIcon icon;
    JLabel buttonPress = new JLabel("");
    String msg = "Button Pressed: ";

    public void init(){
        Container con = getContentPane();
        con.setLayout(new GridBagLayout());
        textField = new JTextField("Selected Label");
        textField.setSize(300,300);
        textField.setLocation(200,150);



        Icon cpp = (Icon) new ImageIcon("c++.png");

        Icon java = (Icon) new ImageIcon("java.png");
        Icon cSharp = (Icon) new ImageIcon("c.png");

        JButton cppButton = new JButton(cpp);
        cppButton.setSize(50,50);
        JButton javaButton = new JButton(java);
        javaButton.setSize(50,50);
        JButton cSharpButton = new JButton(cSharp);
        cSharpButton.setSize(50,50);

        cppButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonPress.setText(msg + "C");
            }
        });

        javaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonPress.setText(msg + "Java");
            }
        });

        cSharpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonPress.setText(msg + "C sharp");
            }
        });

        cSharpButton.setLocation(100,100);

        jComboBox = new JComboBox(elements);
        jComboBox.setSize(200,150);
        jComboBox.setLocation(0,0);

        getContentPane().add(textField);
        getContentPane().add(jComboBox);
        getContentPane().add(cppButton);
        getContentPane().add(javaButton);
        getContentPane().add(cSharpButton);
        getContentPane().add(buttonPress);

        Object ob = jComboBox.getSelectedItem();
        System.out.println(ob);
        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jComboBox.getSelectedItem().toString();
                System.out.println(s);
                textField.setText(s);
                repaint();
            }
        });

    }


}