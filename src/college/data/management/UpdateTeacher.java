
package college.data.management;


import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class UpdateTeacher implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id15,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    JButton b,b1,b2; 
    String id_emp;
    JComboBox c1,c2,c3;

    UpdateTeacher(){
        f=new JFrame("Update Teacher details");
        f.setSize(900,700);
        f.setLocation(450,150); 
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("college/data/management/icons/UpdateStudent.png"));
        Image i3 = img.getImage().getScaledInstance(900, 700,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);
        f.add(id15);
        
        JLabel l1 = new JLabel("Enter employee id to update the data of teacher");
        l1.setBounds(50,100,500,30);
        l1.setFont(new Font("serif",Font.ITALIC,20));
        l1.setForeground(Color.white);
        id15.add(l1);
        
        t12 = new JTextField();
        t12.setBounds(500,100,200,30);
        id15.add(t12);
        
        b2 = new JButton("Update");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720,100,100,30);
        id15.add(b2);
        b2.addActionListener(this);

        
        id8 = new JLabel("Update Teacher Details:");
        id8.setBounds(50,10,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,40));
        id8.setForeground(Color.white);
        id15.add(id8);


        id1 = new JLabel("Name");
        id1.setBounds(50,170,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.white);
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,170,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id2.setForeground(Color.white);
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,170,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id3.setForeground(Color.white);
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,220,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,220,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.white);
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,220,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,270,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id5.setForeground(Color.white);
        id15.add(id5);
        

        t5=new JTextField();
        t5.setBounds(200,270,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,270,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id6.setForeground(Color.white);
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,270,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,320,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id7.setForeground(Color.white);
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,320,150,30);
        id15.add(t7);

        id9= new JLabel("Years of Experience");
        id9.setBounds(400,320,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        id9.setForeground(Color.white);
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,320,150,30);
        id15.add(t8);

        id10= new JLabel("Class XII(%)");
        id10.setBounds(50,370,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id10.setForeground(Color.white);
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(200,370,150,30);
        id15.add(t9);


        id11= new JLabel("Aadhar No");
        id11.setBounds(400,370,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id11.setForeground(Color.white);
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,370,150,30);
        id15.add(t10);

        id12= new JLabel("Employee Id");
        id12.setBounds(50,420,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id12.setForeground(Color.white);
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,420,150,30);
        id15.add(t11);


        lab=new JLabel("Education");
        lab.setBounds(400,420,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        lab.setForeground(Color.white);
        id15.add(lab);
            
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,420,150,30);
        id15.add(c1);
        
        id13= new JLabel("Subject");
        id13.setBounds(400,470,150,30);
        id13.setFont(new Font("serif",Font.BOLD,20));    
        id13.setForeground(Color.white);
        id15.add(id13);

        t15=new JTextField();
        t15.setBounds(600,470,150,30);
        id15.add(t15);
        
        /*t13=new JTextField();   
        t13.setBounds(600,420,150,30);
        id15.add(t13);*/
        
        lab2=new JLabel("Department");
        lab2.setBounds(50,470,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        lab2.setForeground(Color.white);
        id15.add(lab2);
            
        String branch[] = {"Computer Science","Information Technology","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,470,150,30);
        id15.add(c2);
        
        
        
        /*t14=new JTextField();   
        t14.setBounds(200,470,150,30);
        id15.add(t14);*/
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,520,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,520,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
    }



    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "update teacher set name='"+t1.getText()+"',fathers_name='"+t2.getText()+"',age='"+t3.getText()+"', dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',years_of_exp='"+t8.getText()+"',class_xii='"+t9.getText()+"',aadhar='"+t10.getText()+"',education='"+c1.getSelectedItem()+"', emp_id = '"+t11.getText()+"',dept='"+c2.getSelectedItem()+"',subject='"+t15.getText()+"' where emp_id='"+t12.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new TeacherDetails().f.setVisible(true);
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Project().setVisible(true);
        }
        if(ae.getSource() == b2){
            try{
                conn con = new conn();
                String str = "select * from teacher where emp_id = '"+t12.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                    f.setVisible(true);
             

                    t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    t5.setText(rs.getString(5));
                    t6.setText(rs.getString(6));
                    t7.setText(rs.getString(7));
                    t8.setText(rs.getString(8));
                    t9.setText(rs.getString(9));
                    t10.setText(rs.getString(10));
                    c1.setSelectedItem(rs.getString(11));
                    t11.setText(rs.getString(12));
                    c2.setSelectedItem(rs.getString(13));
                    t15.setText(rs.getString(14));
                }

                
            }catch(Exception ex){}
        
            f.setVisible(true);
            f.setSize(900,650);
            f.setLocation(450,250);
        }
    }

    public static void main(String[] arg){
        new UpdateTeacher().f.setVisible(true);
    }
}