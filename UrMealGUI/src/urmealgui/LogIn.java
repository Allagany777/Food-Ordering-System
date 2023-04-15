package urmealgui;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LogIn extends JFrame {

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;


    private JLabel label2;
    private JLabel label1;

    private JTextField text;
    private JTextField text2;

    private JButton button1;
    private JButton button2;

    Order O1;
    public LogIn() {
        
        setTitle("login page");
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);


        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();


        label1 = new JLabel("Enter your user name");
        panel1.add(label1);
        text = NewCs.text1 = new JTextField(10);
        panel1.add(text);
        label2 = new JLabel("Enter your phone");
        panel2.add(label2);
        text2 = NewCs.text3 = new JTextField(10);
        panel2.add(text2);
        button1 = new JButton("ok");
        button1.addActionListener(new ActionListener() {
            
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                O1 = new Order();
            }
        });
        button2 = new JButton("Cancel");
        button2.addActionListener(new ActionListener() {
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                menu a = new menu();
            }
        });
        panel3.add(button2);
        panel3.add(button1);


        add(panel1); //BorderLayout.NORTH
        add(panel2); // BorderLayout.CENTER
        add(panel3); // BorderLayout.SOUTH


        setVisible(true);
    }


}

