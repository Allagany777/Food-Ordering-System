package urmealgui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import static urmealgui.CustomerPanel.orders;

public class Order extends JFrame {

    private JButton btnMeat;
    private JButton btnFish;
    private JButton btnChicken;
    private JButton btnSoup;
    private JButton btnCombo;
    private JButton btnTotal;
    private JButton btnClear;
    private JButton Backbtn;
    private JButton Customerbtn;
    private JButton btnCustomerPanel;
    static JTextArea billArea;
    static int counterFish = 0;
    static int counterMeat = 0;
    static int counterSoup = 0;
    static int counterCombo = 0;
    static int counterChicken = 0;
    JPanel rightPanel=new JPanel();
    JPanel leftPanel=new JPanel();
    JPanel centerPanel;
    ImageIcon helpImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/help.jpeg");
    ImageIcon returnImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/return.jpeg");
    ImageIcon userImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/user.jpeg");
    JButton returnBtn =new JButton(returnImg);
    JButton helpBtn =new JButton(helpImg);
    JButton userBtn =new JButton(userImg);
    static String typeMeat;
    static String typeFish;
    static String typeChicken;
    static String typeSoup;
    static String typeCombo;
    static Invoice a;
    int MainCounter = 0;
    
    
    

    DecimalFormat df = new DecimalFormat("#.##");
    static double total = 0;

    public Order() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Restaurant UJ");
        setSize(470, 470);
        setLocationRelativeTo(null);
        setVisible(true);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        centerPanel = new JPanel();

        btnMeat = new JButton("Meat");
        btnFish = new JButton("Fish");
        btnChicken = new JButton("Chicken");
        btnSoup = new JButton("Soup");
        btnCombo = new JButton("combo drink and fries");
        btnTotal = new JButton("Checkout");
        btnClear = new JButton("Clear");
        btnCustomerPanel = new JButton("Order Summary");
        billArea = new JTextArea(25, 40);
        billArea.setEditable(false);
        Font font = new Font("Monospaced", Font.BOLD, 12);
        billArea.setFont(font);
        Backbtn = new JButton("Back");
        
        Backbtn.addActionListener(new ActionListener() {
            
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                LogIn newWi = new LogIn();
            }
        });
        Customerbtn = new JButton("Account");
        Customerbtn.addActionListener(new ActionListener() {

            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                CustomerPanel a = new CustomerPanel();
            }
        });
        
        
        
        cp.add(btnMeat);
        cp.add(btnFish);
        cp.add(btnChicken);
        cp.add(btnSoup);
        cp.add(Customerbtn);
        cp.add(btnCombo);
        cp.add(btnTotal);
        cp.add(btnClear);
        cp.add(btnCustomerPanel);
        cp.add(billArea);
        
        centerPanel.add(btnMeat);
        centerPanel.add(btnFish);
        centerPanel.add(btnChicken);
        centerPanel.add(btnSoup);
        centerPanel.add(btnCombo);
        centerPanel.add(btnTotal);
        centerPanel.add(btnClear);
        centerPanel.add(btnCustomerPanel);
        centerPanel.add(billArea);
        setLayout(new BorderLayout());
        buildLeftPanel();
        buildRightPanel();
        
        
        btnCustomerPanel.addActionListener(new ActionListener() {
           
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                CustomerPanel r = new CustomerPanel();
            }
        });
        
        
        btnMeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ++counterMeat;
                billArea.append("Meat\t\t\t$\t 5.99\n");
                total += 5.99;
                typeMeat = String.valueOf("Meat\t$" + String.valueOf(5.99));
                CustomerPanel.orders[MainCounter++]=typeMeat;

            }
        });

        btnFish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ++counterFish;
                billArea.append("Fish\t\t\t$\t 6.99\n");
                total += 6.99;
                typeFish = String.valueOf("Fish\t$" + String.valueOf(6.99));
                CustomerPanel.orders[MainCounter++]=typeFish;
            }
        });

        btnChicken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ++counterChicken;
                billArea.append("Chicken\t\t\t$\t 4.99\n");
                total += 4.99;
                typeChicken = String.valueOf("Chicken\t$" + String.valueOf(4.99));
                CustomerPanel.orders[MainCounter++]=typeChicken;
            }
        });

        btnSoup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ++counterSoup;
                billArea.append("Soup\t\t\t$\t 2.99\n");
                total += 2.99;
                typeSoup = String.valueOf("Soup\t$" + String.valueOf(2.99));
                CustomerPanel.orders[MainCounter++]=typeSoup;
            }
        });

        btnCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ++counterCombo;
                billArea.append("combo\t\t\t$\t 1.99\n");
                total += 1.99;
                typeCombo = String.valueOf("combo\t$" + String.valueOf(1.99));
                CustomerPanel.orders[MainCounter++]=typeCombo;
            }
        });

        btnTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                a = new Invoice();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                billArea.setText("");
                total = 0;
                counterChicken=0;
                counterCombo=0;
                counterFish=0;
                counterMeat=0;
                counterSoup=0;
                orders[0] = null;
                orders[1] = null;
                orders[2] = null;
                orders[3] = null;
                orders[4] = null;
                orders[5] = null;
                orders[6] = null;
                orders[7] = null;
                orders[8] = null;
                orders[9] = null;
                orders[10] = null;
                orders[11] = null;
                orders[12] = null;
                orders[13] = null;
                orders[14] = null;
                orders[15] = null;
                orders[16] = null;
                orders[17] = null;
                orders[18] = null;
                orders[19] = null;

                for(int ii = 0 ; ii < 10 ; ii++){
                    CustomerPanel.orders[ii]=null;
                }
            }
        });
    }
    public void buildLeftPanel(){
        leftPanel.setLayout(new GridLayout(6,1));
        returnBtn.setBorder(BorderFactory.createBevelBorder(1, Color.lightGray, Color.lightGray));
        returnBtn.addActionListener(new ActionListener() {
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                LogIn newWi = new LogIn();
            }
        });
        leftPanel.add(returnBtn);
        for(int i=0;i<3;i++){
            leftPanel.add(new JPanel());
        }
    }
    public void buildRightPanel(){
        rightPanel.setLayout(new GridLayout(6,1));
        userBtn.setBorder(BorderFactory.createBevelBorder(1, Color.lightGray, Color.lightGray));
        userBtn.addActionListener(new ActionListener() {

            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                NewCs o = new NewCs();
                o.setTitle("Edit information");
            }
        });
        
        rightPanel.add(userBtn);
        for(int i=0;i<4;i++){
            rightPanel.add(new JPanel());
        }
        helpBtn.setBorder(BorderFactory.createBevelBorder(1, Color.lightGray, Color.lightGray));
        helpBtn.addActionListener(new ActionListener() {
            public
            void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "In this page you can add the order to the basket.");
            }
        });
        rightPanel.add(helpBtn);
        add(centerPanel,BorderLayout.CENTER);
        add(leftPanel,BorderLayout.WEST);
        add(rightPanel,BorderLayout.EAST);
    }
    
}
