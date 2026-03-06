
package database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class dynasemo {
    public static void main(String[] args) {
        JFrame f=new JFrame("JAYOM");
        JLabel l=new JLabel("ID");
        l.setBounds(20, 20, 110, 30);
        f.add(l);
        JTextField t=new JTextField();
        t.setBounds(150, 20, 210, 30);
        f.add(t);
        
        JLabel l1=new JLabel("ROLL NO");
        l1.setBounds(20, 50, 110, 30);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(150, 50, 210, 30);
        f.add(t1);
        
        JLabel l2=new JLabel("STUDENT NAME");
        l2.setBounds(20, 90, 110, 30);
        f.add(l2);
        JTextField t2=new JTextField();
        t2.setBounds(150, 90, 210, 30);
        f.add(t2);
        
        JButton b=new JButton("SUBMIT");
        b.setBounds(90, 150, 110, 30);
        f.add(b);
        
        b.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1=t.getText();
                String rollno1=t1.getText();
                String name1=t2.getText();
                        
                try {
                    String dbpath="jdbc:ucanaccess://F:/TY-BCA-SEM-6=19-A/studinfo.accdb";
                    Connection con=DriverManager.getConnection(dbpath);
                     System.out.println("Database connection succesfully");
                     
                     String sql="INSERT INTO stud(ID,rollno,name)VALUES(?,?,?) ";
                     PreparedStatement pre=con.prepareStatement(sql);
                     pre.setInt(1, Integer.parseInt(id1));
                     pre.setInt(2, Integer.parseInt(rollno1));
                     pre.setString(3, name1);
                     
                     int row=pre.executeUpdate();
                     if (row>0) {
                System.out.println("DATABASE ADD SUCCESSFULLY");
                
            } else {
                System.out.println("DATABASE NOT ADD");
            }
            
           
                }catch (Exception e1) {
                    e1.printStackTrace();
                      System.out.println("error:"+e1.getMessage());
                    
                }
            }
        });
            JButton b1=new JButton("UPDATE");
            b1.setBounds(220, 150, 110, 30);
            f.add(b1);
            
            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 
                
                try {
                    String dbpath1="jdbc:ucanaccess://F:/TY-BCA-SEM-6=19-A/studinfo.accdb";
                    Connection con1=DriverManager.getConnection(dbpath1);
                     System.out.println("Database connection succesfully");
                     
                     String sql1="UPDATE stud SET rollno=?,name=? WHERE ID=?";
                     PreparedStatement pre1=con1.prepareStatement(sql1);
                     
                   
                    pre1.setInt(1, Integer.parseInt(t1.getText()));
                    pre1.setString(2,t2.getText());
                    pre1.setInt(3, Integer.parseInt(t.getText()));
                    
                    int row1=pre1.executeUpdate();
                     if (row1>0) {
                        System.out.println("DATABASE  UPDATED");
                
                     } else {
                        System.out.println("DATABASE NOT UPDATED");
                        }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    System.out.println(e2.getMessage());
                }
            }
        });
         JButton b2=new JButton("DELETE");
            b2.setBounds(350, 150, 110, 30);
            f.add(b2);
            b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                     String dbpath1="jdbc:ucanaccess://F:/TY-BCA-SEM-6=19-A/studinfo.accdb";
                    Connection con1=DriverManager.getConnection(dbpath1);
                     System.out.println("Database connection succesfully");
                     
                     String sql2="DELETE FROM stud WHERE ID=?";
                     PreparedStatement pre1=con1.prepareStatement(sql2);
                     
                     pre1.setInt(1,Integer.parseInt(t.getText()));
                     
                     int row2=pre1.executeUpdate();
                     if (row2>0) {
                        System.out.println("DATABASE  DELETED");
                
                     } else {
                        System.out.println("DATABASE NOT DELETED");
                        }
                    
                } catch (Exception e3) {
                     e3.printStackTrace();
                    System.out.println(e3.getMessage());
                }
            }
        });
            String column[] = {"ID", "RollNo", "Name"};
             DefaultTableModel model = new DefaultTableModel(column, 0);
             JTable j=new JTable(model);
             JScrollPane s=new JScrollPane(j);
             s.setBounds(20, 280, 400, 150);
             f.add(s);
            JButton b3=new JButton("SHOW RESULT");
            b3.setBounds(470, 150, 190, 30);
            f.add(b3);
            b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 try {
                    model.setRowCount(0);
                    String dbpath1="jdbc:ucanaccess://F:/TY-BCA-SEM-6=19-A/studinfo.accdb";
                    Connection con1=DriverManager.getConnection(dbpath1);
                     System.out.println("Database connection succesfully");
                     
                     String sql3="SELECT * FROM stud";
                     PreparedStatement pre1=con1.prepareStatement(sql3);
                     
                     ResultSet rs=pre1.executeQuery();
                     while(rs.next())
                     {
                         int i = rs.getInt("ID");
                         int r = rs.getInt("rollno");
                         String n = rs.getString("name");
                         
                         model.addRow(new Object[]{i,r,n});
                         
                     }
                    
                } catch (Exception e5) {
                     e5.printStackTrace();
                    System.out.println(e5.getMessage());
                }
                
            }
        });
       
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
