import javax.swing.*;
import java.awt.Color;

public class Main
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("FIR Registration Page");
        f.getContentPane().setBackground(Color.BLUE);

        JLabel l8 =new JLabel(" FIR REGISTRATION PAGE ");
        l8.setBounds(700,20,200,100);
        f.add(l8);

        JLabel l1 = new JLabel("NAME:");
        l1.setBounds(600,100,200,40);
        f.add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(700,100,200,30);
        f.add(t1);

        JLabel l2 = new JLabel("DATE OF BIRTH:");
        l2.setBounds(600,200,200,40);
        f.add(l2);
        JTextField t2 = new JTextField();
        t2.setBounds(700,200,200,30);
        f.add(t2);

        JLabel l3 = new JLabel("MOBILE NO:");
        l3.setBounds(600,300,200,40);
        f.add(l3);
        JTextField t3 = new JTextField();
        t3.setBounds(700,300,200,30);
        f.add(t3);

        JLabel l5 = new JLabel("GENDER:");
        l5.setBounds(600,400,200,40);
        f.add(l5);
        JCheckBox t5 = new JCheckBox("MALE");
        t5.setBounds(700,400,200,30);
        f.add(t5);
        JCheckBox t6 = new JCheckBox("FEMALE");
        t6.setBounds(700,440,200,30);
        f.add(t6);

        JLabel l7 = new JLabel("EMAIL-ID");
        l7.setBounds(600,500,200,40);
        f.add(l7);
        JTextField t7 = new JTextField();
        t7.setBounds(700,500,200,30);
        f.add(t7);


        JLabel l4 = new JLabel("ADDRESS:");
        l4.setBounds(600,570,200,60);
        f.add(l4);
        JTextArea t4 = new JTextArea();
        t4.setBounds(700,570,200,50);
        f.add(t4);

        JButton b1 = new JButton(" LOGIN ");
        b1.setBounds(700,670,100,20);
        f.add(b1);
        JTextField t8 = new JTextField();
        t8.setBounds(700,670,100,15);
        f.add(t8);





        f.setSize(1920,1080);
        f.setLayout(null);
        f.setVisible(true);
    }
}