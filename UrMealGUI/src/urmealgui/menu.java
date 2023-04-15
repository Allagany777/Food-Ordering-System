package urmealgui;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class menu extends JFrame {

    private JLabel messageLabel;
    private final int LABEL_WIDTH = 399;
    private final int LABEL_HEIGHT = 375;


    private JMenuBar menuBar;
    private JMenu fMenu;
    private JMenu tMenu;

    private JLabel exitItem;
    private JRadioButtonMenuItem Login;
    private JRadioButtonMenuItem newRegistration;
    ImageIcon Img = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/HealthyFood2.jpeg");
    private JLabel imgLabel = new JLabel(Img);
    private JPanel imgPanel;




    public  menu()
    {
        setTitle(" Menu System");
        


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        messageLabel = new JLabel("Use the menu at the top of the page to get started",
                SwingConstants.CENTER);


        messageLabel.setPreferredSize(
                new Dimension(LABEL_WIDTH, LABEL_HEIGHT));



        imgLabel.setBounds(0,0,399,375);
        add(imgLabel);
        add(messageLabel);




        buildMenuBar();

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);

        setVisible(true);
    }

    private void buildMenuBar()
    {

        menuBar = new JMenuBar();


        buildFileMenu();
        buildTextMenu();


        menuBar.add(fMenu);
        menuBar.add(tMenu);

    }

    private void buildFileMenu()
    {

        exitItem = new JLabel("We provide you with the service of providing your healthy food");


        fMenu = new JMenu("  ?  ");
        fMenu.setMnemonic(KeyEvent.VK_F);


        fMenu.add(exitItem);
    }

    private void buildTextMenu()
    {

        Login = new JRadioButtonMenuItem("Login");
        Login.setMnemonic(KeyEvent.VK_B);
        Login.addActionListener(new Listener());

        newRegistration = new JRadioButtonMenuItem("new account");
        newRegistration.setMnemonic(KeyEvent.VK_R);
        newRegistration.addActionListener(new Listener());


        ButtonGroup group = new ButtonGroup();
        group.add(Login);
        group.add(newRegistration);



        tMenu = new JMenu("Start");
        tMenu.setMnemonic(KeyEvent.VK_T);


        tMenu.add(Login);
        tMenu.add(newRegistration);
        tMenu.addSeparator();

    }


    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (Login.isSelected()){
                dispose();
                LogIn newWi = new LogIn();



            }

            else if (newRegistration.isSelected()) {
                dispose();
                NewCs NC = new NewCs();
            }

        }
    }

}
