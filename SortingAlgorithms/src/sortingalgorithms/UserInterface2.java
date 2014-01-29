/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Shubham
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.awt.*;
public class UserInterface2 {
    
    JTextField arr=new JTextField(20);
    JButton start=new JButton("Start");
    JLabel heading1;
    
    JPanel p2=new JPanel();
    JPanel p1=new JPanel();
    
    JPanel panel_gp_1=new JPanel();
    JPanel panel_gp_2=new JPanel();
    JPanel panel_gp_3=new JPanel();
    static JLabel text_algo;
    static JLabel sorted_text;
    JFrame home2;
    UserInterface2()
    {
       home2=new JFrame();
       
       // heading panel/////////////////////////
       heading1=new JLabel("Heading");
       heading1.setForeground(Color.BLUE);
       heading1.setFont(heading1.getFont().deriveFont(30.0f));
       p1.add(heading1);
       home2.add(p1,BorderLayout.NORTH);
       ////////////////Array Data/////////////////////////
       
       p2.add(arr);
       p2.add(start);
       p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Array-data"));
       home2.add(p2,BorderLayout.LINE_START);
       //////////////Algorithm panel//////////////////////////
       text_algo=new JLabel();
       panel_gp_1.add(text_algo);
       panel_gp_1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Sort-Algorithm"));
       
       
       ////////////////////Sorted Elements Panel...///////////////////////////////////
       sorted_text=new JLabel();
       sorted_text.setForeground(Color.RED);
       sorted_text.setFont(sorted_text.getFont().deriveFont(15.0f));
       panel_gp_2.add(sorted_text);
       panel_gp_2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Output Window"));
       panel_gp_3.setLayout(new GridLayout(1,2));
       panel_gp_3.add(panel_gp_1);
       panel_gp_3.add(panel_gp_2);
       home2.add(panel_gp_3,BorderLayout.PAGE_END);
       ////////////////////////////
       home2.setSize(900, 600);
       home2.setVisible(true);
       
    }
    
    
}
