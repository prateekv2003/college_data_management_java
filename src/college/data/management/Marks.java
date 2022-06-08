package college.data.management;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

   JTextArea t1;
   JPanel p1;
   String sub1, sub2, sub3, sub4, sub5, rollNo;
   int flag = 1;
   Marks(){}
   Marks(String str){
       super("Result of Examination");
       rollNo = str;
       setSize(400,400);
       setLayout(new BorderLayout());
       
       p1 = new JPanel();

       t1 = new JTextArea(25,15);
       JScrollPane jsp = new JScrollPane(t1);
       t1.setFont(new Font("Senserif",Font.ITALIC,18));
       t1.setEditable(false);
       add(p1,"North");
       
       add(jsp,"Center");
       
       setLocation(450,200);
       mark(str);
   }
   
   public void mark(String s){
    try{
           conn c = new conn();
           t1.setText("Roll No = "+rollNo);
           t1.append("\n-----------------------------------------");
           t1.append("\n   Subject\tMarks");
           
           ResultSet rs1 = c.s.executeQuery("select * from subject where rollno="+s);
           
           if(rs1.next()){
                 sub1 = rs1.getString("subject1");
                 sub2 = rs1.getString("subject2");
                 sub3 = rs1.getString("subject3");
                 sub4 = rs1.getString("subject4");
                 sub5 = rs1.getString("subject5");
               t1.append("\n-----------------------------------------");
               t1.append("\n");
           }else{
               t1.setText("Roll No = "+rollNo+"\n");
               t1.append("\n  Result not generated for this student!!!");
               flag = 0;
           }
           
           ResultSet rs2 = c.s.executeQuery("select * from marks where rollno="+s);
           
           if(rs2.next() && flag == 1){
               t1.append("\n   "+sub1+"\t"+rs2.getString("marks1"));
               t1.append("\n   "+sub2+"\t"+rs2.getString("marks2"));
               t1.append("\n   "+sub3+"\t"+rs2.getString("marks3"));
               t1.append("\n   "+sub4+"\t"+rs2.getString("marks4"));
               t1.append("\n   "+sub5+"\t"+rs2.getString("marks5"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");
           }
         
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void main(String[] args){
       new Marks().setVisible(true);
   }
}