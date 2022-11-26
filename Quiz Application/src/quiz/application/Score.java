
package quiz.application;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Score extends JFrame implements ActionListener {
    
    Score(String name,int score){
        
        setResizable(false);
        setBounds(500,157,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pics/score.jpg"));
        JLabel img = new JLabel(i1);
        img.setBounds(20,150,300,350);
        add(img);
        
        JLabel heading = new JLabel(" ThankYou " + name + " from Simple Minds ");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        
        JLabel scr = new JLabel(" Your Score is " + score);
        scr.setBounds(350,200,300,30);
        scr.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(scr);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
//        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    
    public static void main(String[]args){
        new Score("user",0);
    }
    
}
