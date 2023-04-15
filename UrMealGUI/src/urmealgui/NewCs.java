package urmealgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.*;

public class NewCs extends JFrame {

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;


    private JPanel panelT1;
    private JPanel panelT2;
    private JPanel panelT3;


    private JPanel panelT4;

    private JPanel panelT5;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;

    static JTextField text1;
    static JTextField text2;
    static JTextField text3;
    static JTextField text4;
    static JTextField text5;

    private JButton button1;
    private JButton button2;

    ImageIcon Img = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/HealthyFood2.jpeg");
    private JLabel imgLabel = new JLabel(Img , JLabel.CENTER);
    private JPanel imgPanel;
    static Order O1;

      

    public NewCs() {
        
        setTitle("new account");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);


        panel1 = new JPanel(new BorderLayout());
        panel2 = new JPanel(new BorderLayout());
        panel3 = new JPanel();
        
       


        panelT1 =new JPanel();
        panelT2 =new JPanel();
        panelT3 =new JPanel();
        panelT4 =new JPanel();
        panelT5 =new JPanel();

        label1 = new JLabel("Enter the username");
        text1 = new JTextField(10);

        label2 = new JLabel("Enter your full name");
        text2 = new JTextField(10);
        label3 = new JLabel("Enter your phone");
        text3 = new JTextField(10);

        label4 = new JLabel("Enter your City");
        text4 = new JTextField(10);
        label5 = new JLabel("Enter your address");
        text5 = new JTextField(10);


        panelT1.add(label1);
        panelT1.add(text1);

        panelT2.add(label2);
        panelT2.add(text2);

        panelT3.add(label3);
        panelT3.add(text3);

        panelT4.add(label4);
        panelT4.add(text4);

        panelT5.add(label5);
        panelT5.add(text5);

        panel1.add(panelT1, BorderLayout.NORTH);
        panel1.add(panelT2 , BorderLayout.CENTER);
        panel1.add(panelT3 , BorderLayout.SOUTH);

        panel2.add(panelT4,BorderLayout.NORTH);
        panel2.add(panelT5,BorderLayout.CENTER);

        


       
        button1 = new JButton("OK");
        button1.addActionListener(new ActionListener() {
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                O1 = new Order();
            }
        });
        
        button2= new JButton("Cancel");
        button2.addActionListener(new ActionListener() {
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                menu a = new menu();
            }
        });
        
        panel3.add(button2);
        panel3.add(button1);
        


        add(panel1 ,BorderLayout.NORTH);
        add(panel2 , BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);




    }


}
