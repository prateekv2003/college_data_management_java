
package college.data.management;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FeeDetails extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Roll no","Name","Father's name","Course","Branch","Semester","Fees Paid in Rs."};
    String d[][]=new String[15][7];  
    int i=0,j=0;
    
    FeeDetails(){
        super("View Paid Fee Details");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from fee";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("name");
                d[i][j++]=rs.getString("fathers_name");
                d[i][j++]=rs.getString("course");
                d[i][j++]=rs.getString("branch");
                d[i][j++]=rs.getString("semester");
                d[i][j++]=rs.getString("fee_paid");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new FeeDetails().setVisible(true);
    }
}
   
