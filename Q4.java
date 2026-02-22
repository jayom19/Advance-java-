package ASSIGNEMENT2;



import dem.springlayoutdemo;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Q4 extends JFrame{

    public Q4() throws HeadlessException {
        
        JButton b=new JButton("add");
        JButton b1=new JButton("SUb");
        JButton b2=new JButton("mul");
        JButton b3=new JButton("div");
        
        JPanel p=new JPanel();
    
        p.add(b1);
        p.add(b2);
        p.add(b3);
        
        add(p);
        setSize(500, 500);
        setTitle("JAYOM");
        p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
        setVisible(true);
       }
    
    public static void main(String[] args) {
        new Q4();
    }
    
}
