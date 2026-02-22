package ASSIGNEMENT2;

import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Q3 extends JFrame{

    public Q3() throws HeadlessException {
        
        JLabel l=new JLabel("SELECT GENDER");
        l.setBounds(20, 20, 110, 30);
        add(l);
        
        JRadioButton r=new JRadioButton("MALE");
        r.setBounds(150, 20, 110, 30);
        add(r);
        
        JRadioButton r1=new JRadioButton("FEMALE");
        r1.setBounds(270, 20, 110, 30);
        add(r1);
        
        JRadioButton r2=new JRadioButton("OTHER");
        r2.setBounds(390, 20, 110, 30);
        add(r2);
        
        ButtonGroup b=new ButtonGroup();
        b.add(r);
        b.add(r1);
        b.add(r2);
        
        JButton b1=new JButton("SHOW RESULT");
        b1.setBounds(80, 90, 110, 30);
        add(b1);
        
        b1.addActionListener(e->{
           
           String message="SELECTED OPTION\n";
           if(r.isSelected())message="MALE";
           if(r1.isSelected())message="FEMALE";
           if(r2.isSelected())message="OTHER";
           
           
            JOptionPane.showMessageDialog(null, "SELECTED OPTION"+message);
        
        });
        setSize(500, 500);
        setTitle("JAYOM");
        setLayout(null);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Q3();
    }
    
}
