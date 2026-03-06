    
package database;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Form {
    public static void main(String[] args) {
        
        JFrame f=new JFrame("jayom");
        JLabel l=new JLabel("Student Registration Form");
        l.setFont(new Font("Arial",Font.BOLD,24));
        l.setBounds(120, 20, 300, 50);
        f.add(l);
        JLabel l1=new JLabel("Student ID");
        l1.setBounds(20, 90, 110, 30);
        f.add(l1);
        JTextField t=new JTextField();
        t.setBounds(140, 90, 280, 30);
        f.add(t);
        JLabel l2=new JLabel("Full Name");
        l2.setBounds(20, 130, 110, 30);
        f.add(l2);
        JTextField t2=new JTextField();
        t2.setBounds(140, 130, 280, 30);
        f.add(t2);
        JLabel l3=new JLabel("Age");
        l3.setBounds(20, 170, 110, 30);
        f.add(l3);
        JTextField t3=new JTextField();
        t3.setBounds(140, 170, 90, 30);
        f.add(t3);
        JLabel l4=new JLabel("Gender");
        l4.setBounds(20, 220, 110, 30);
        f.add(l4);
        JRadioButton r=new JRadioButton("MALE");
        r.setBounds(140, 220, 110, 30);
        f.add(r);
        JRadioButton r1=new JRadioButton("Female");
        r1.setBounds(270, 220, 110, 30);
        f.add(r1);
        JLabel l5=new JLabel("Course");
        l5.setBounds(20, 270, 110, 30);
        f.add(l5);
        String course[]={"SELECT COURSE","BCA","MSC","MCA"};
        JComboBox c=new JComboBox(course);
        c.setBounds(140, 270, 150, 30);
        f.add(c);
        JLabel l6=new JLabel("Email");
        l6.setBounds(20, 320, 110, 30);
        f.add(l6);
        JTextField t4=new JTextField();
        t4.setBounds(140, 320, 280, 30);
        f.add(t4);
        
        JLabel l7=new JLabel("Phone NO");
        l7.setBounds(20, 370, 110, 30);
        f.add(l7);
        JTextField t5=new JTextField();
        t5.setBounds(140, 370, 280, 30);
        f.add(t5);
        JLabel l8=new JLabel("Address");
        l8.setBounds(20, 420, 110, 30);
        f.add(l8);
        
        JTextArea t6=new JTextArea();
        t6.setBounds(140, 420, 280, 60);
        f.add(t6);
        
        JButton b=new JButton("Submit");
        b.setBackground(Color.green);
        b.setFont(new Font("Arial",Font.BOLD,12) {
        });
        b.setBounds(30, 500, 110, 30);
        f.add(b);
        JButton b1=new JButton("Clear");
        b1.setBounds(150, 500, 110, 30);
        f.add(b1);
        
        JButton b2=new JButton("Update");
        b2.setBounds(270, 500, 110, 30);
        f.add(b2);
        
        JButton b3=new JButton("Delete");
        b3.setBounds(400, 500, 110, 30);
        f.add(b3);
        f.setSize(900, 900);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
