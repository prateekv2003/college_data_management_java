package college.data.management;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{
        
        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            super("About Us - Thadomal Shahani Engineering College");
            setSize(1280,720);
            setLocation(100,100);
            //setBackground(Color.white);
            setLayout(null);

            //JLabel l1 = new JLabel("New label");//
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("college/data/management/icons/AboutUsMain.png"));
            Image i2 = i1.getImage().getScaledInstance(1280, 720,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel j1= new JLabel(i3); 
            j1.setBounds(0,0,1260,700);
            add(j1);
            
            /*l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);*/


            /*JLabel l3 = new JLabel("College");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);*/

//            JLabel l6 = new JLabel("Developed By : ");
//            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
//            l6.setBounds(70, 198, 600, 35);
//            contentPane.add(l6);

//            JLabel l7 = new JLabel("Roll Number - ??");
//            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
//            l7.setBounds(70, 260, 600, 34);
//            contentPane.add(l7);

            /*JLabel l8 = new JLabel("Contact : gtthampi@gmail.com.com");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - B.Tech (Information Technology)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Phone - +91 9594696888");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);*/
	}
        

}


