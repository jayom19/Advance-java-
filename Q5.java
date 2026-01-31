
package assignment1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;


public class Q5 extends Frame{

    public Q5() throws HeadlessException {
    
        Label l=new Label("STUDENT REGISTARTION FORM");
        l.setBounds(80, 20, 250, 80);
        add(l);
        
        Label l1=new Label("STUDENT NAME");
        l1.setBounds(20, 100, 130, 60);
        add(l1);
        
        TextField t=new TextField();
        t.setBounds(170, 100, 220, 30);
        add(t);
        
        Label l2=new Label("SUBJECT");
        l2.setBounds(20, 170, 130, 60);
        add(l2);
        
        Checkbox c=new Checkbox("JAVA");
        c.setBounds(170, 170, 200, 60);
        add(c);
        
        Checkbox c1=new Checkbox("Python");
        c1.setBounds(370, 170, 200, 60);
        add(c1);
        
        Label l3=new Label("Address");
        l3.setBounds(20, 230, 130, 60);
        add(l3);
        
        TextArea t2=new TextArea();
        t2.setBounds(170, 230, 220, 60);
        add(t2);
        
        Button b=new Button("SUBMIT");
        b.setBounds(170, 320, 130, 30);
        add(b);
       
        
        
        setSize(500, 500);
        setTitle("JAYOM");
        setLayout(null);
        setVisible(true);
    }
    
    
    
     
       public static void main(String[] args) {
        new Q5();
    }
    
}
