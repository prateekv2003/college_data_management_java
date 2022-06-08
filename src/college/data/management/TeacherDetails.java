package college.data.management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TeacherDetails implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3, bgImg;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","Years of Experience", "Class XII(%)", "Aadhar No","Course","Department", "Employee Id", "Subject"};
    String y[][] = new String[20][14];
    int i=0, j=0;
    TeacherDetails(){
        f = new JFrame("Teacher Details");
        f.setBackground(Color.white);
        f.setLayout(null);

        bgImg=new JLabel();
//        bgImg.setBounds(0,0,900,700);
        bgImg.setBounds(0,0,1250,700);
        bgImg.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("college/data/management/icons/TeacherDetailsColoured.png"));
        Image i3 = img.getImage().getScaledInstance(1280, 720,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        bgImg.setIcon(icc3);
        f.setSize(1250,730);
        f.setLocation(150,70);
        f.setLayout(null);
        

        f.add(bgImg);
        l1 = new JLabel("Enter employee ID to delete Teacher : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        l1.setForeground(Color.white);
        bgImg.add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        bgImg.add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        bgImg.add(b1);
            
        l2 = new JLabel("Add New Teacher");
        l2.setBounds(50,450,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l2.setForeground(Color.white);
        bgImg.add(l2);
        
        b2 = new JButton("Add");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        bgImg.add(b2);
        
        l3 = new JLabel("Update Teacher Details");
        l3.setBounds(50,490,400,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l3.setForeground(Color.white);
        bgImg.add(l3);
        
        b3 = new JButton("Update");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300, 490, 150 ,30);
        bgImg.add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        f.setVisible(true);
        
        try{
            conn c1  = new conn();
            String s1 = "select * from teacher";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fathers_name");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("years_of_exp");
                y[i][j++]=rs.getString("class_xii");
                y[i][j++]=rs.getString("aadhar");
                y[i][j++]=rs.getString("education");
                y[i][j++]=rs.getString("dept");
                y[i][j++]=rs.getString("emp_id");
                y[i][j++]=rs.getString("Subject");
                i++;
               j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        bgImg.add(sp);
        
        //getContentPane().setBackground(Color.WHITE);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from teacher where emp_id = '"+a+"'";
                c1.s.executeUpdate(q);
                f.setVisible(false);
                //new TeacherDetails().f.setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddTeacher().f.setVisible(true);
            f.setVisible(false);
        }else if(ae.getSource() == b3){
            new UpdateTeacher().f.setVisible(true);
            f.setVisible(false);
        }
    }
    public static void main(String[] args){
        new TeacherDetails();
        
        
    }
    
}

