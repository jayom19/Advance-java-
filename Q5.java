package ASSIGNEMENT2;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Q5 extends JFrame{
    

    public Q5() throws HeadlessException {
    
        JMenuBar m=new JMenuBar();
        setJMenuBar(m);
        
        JMenu filemenu=new JMenu("File");
        m.add(filemenu);
        
        JMenuItem exititem=new JMenuItem("Exit");
        filemenu.add(exititem);
        
        exititem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setSize(500, 500);
        setTitle("JAYOM");  
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Q5();
    }
    
}
