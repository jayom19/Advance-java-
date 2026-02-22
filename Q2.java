package ASSIGNEMENT2;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Q2 extends JFrame{

    public Q2() throws HeadlessException {
        
        JLabel l=new JLabel("SLECT COURSE:");
        l.setBounds(20, 20, 110, 30);
        add(l);
        
        
        JCheckBox c=new JCheckBox("BCA");
        c.setBounds(150, 20, 110, 30);
        add(c);
        
        JCheckBox c1=new JCheckBox("MCA");
        c1.setBounds(270, 20, 110, 30);
        add(c1);
        
        JCheckBox c2=new JCheckBox("MSC(it)");
        c2.setBounds(390, 20, 110, 30);
        add(c2);
        
        JButton b=new JButton("SUBMIT");
        b.setBounds(90, 80, 110, 30);
        add(b);
        
        b.addActionListener(e->{
           String message="SELECTRED OPTION:\n";
           if(c.isSelected())message +="BCA\n";
           if(c1.isSelected())message+="MCA\n";
           if(c2.isSelected())message+="MSC(it)";
           
            JOptionPane.showMessageDialog(null, message);
      
        
        
        });
        
        setSize(500, 500);
        setTitle("JAYOM");
        setLayout(null);
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new Q2();
    }
    
}
