/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college.data.management;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1,bgImg;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    
    public FeeStructure(){
        
        setSize(1500,600);
        setLocation(50,100);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setBounds(500,10,400,70);
        add(i1);

        bgImg=new JLabel();
        bgImg.setBounds(10,100,1411,372);
        bgImg.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("college/data/management/icons/TSECFees.png"));
        Image i3 = img.getImage().getScaledInstance(1411, 372,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        bgImg.setIcon(icc3);
        add(bgImg);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}
