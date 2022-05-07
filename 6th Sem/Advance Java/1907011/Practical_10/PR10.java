
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PR10 implements ActionListener {
    JCheckBox checkBox;
    JTable jTable;
    JFrame jFrame;
    String[][] data = { {"1907011","Pratyay Dhond"},{"1907025","Priyanshu Lapkale"},{"1907054", "Varad Nimbarte"},{"1907018", "Janhavi Itankar"}};
    String[] column = {"Roll Number", "Name"};
    JPanel panel;

    PR10(){
        jFrame = new JFrame("Practical No 10");
        jFrame.setSize(750,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(new GridLayout(2,1,2,2));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        jFrame.add(jPanel);

        JLabel label = new JLabel("Click here to show table data");
        checkBox = new JCheckBox();
        checkBox.addActionListener(this);
        jPanel.add(checkBox);
        jPanel.add(label);

        jTable = new JTable(data,column);
        jTable.setShowHorizontalLines(false);
        jTable.setShowVerticalLines(false);
        panel = new JPanel(new BorderLayout());
        jFrame.add(panel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        PR10 m = new PR10();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[][] emptyData = {{}};
        String[] emptyColumn = {};
        if(checkBox.isSelected()){
            System.out.println("Checked");
            jTable = new JTable(data,column);

            panel.add(jTable,BorderLayout.CENTER);
        }else{
            panel.remove(jTable);
            System.out.println("Unchecked");
            jTable = null;
        }
        jFrame.validate();
        jFrame.repaint();


    }
}
