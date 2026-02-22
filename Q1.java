
package ASSIGNEMENT2;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Q1 extends JFrame{

    public Q1() throws HeadlessException {
        
        
        
        JLabel l=new JLabel("ENTER NAME:");
        l.setBounds(20, 20, 110, 30);
        add(l);
        
        
        JTextField t=new JTextField();
        t.setBounds(130, 20, 220, 30);
        add(t);
        
        JButton b=new JButton("CLICK ME");
        b.setBounds(150, 70, 110, 30);
        add(b);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data=t.getText();
                JOptionPane.showMessageDialog(null, "YOUR MESSAGE: "+data);
            }
        });
        
        
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Q1();
    }
    
}
