
package assignment1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;


public class Q4 extends Frame{

    public Q4() throws HeadlessException {
        
        setSize(500, 500);
        setTitle("JAYOM");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.red);
        g.fillRect(20, 50, 140, 80);
         g.drawRect(20, 50, 140, 80);
        
         g.setColor(Color.blue);
         g.fillOval(20, 150, 100, 100);
         g.drawOval(20, 150, 100, 100);
         
         g.setColor(Color.green);
         g.drawString("JAYOM ", 150, 250);
    }
    
    public static void main(String[] args) {
        new Q4();
    }
}
