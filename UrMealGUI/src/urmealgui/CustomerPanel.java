package urmealgui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class CustomerPanel extends JFrame{
    
    JPanel rightPanel=new JPanel();
    JPanel leftPanel=new JPanel();
    JPanel bottomPanel=new JPanel();
    JPanel centerPanel=new JPanel();
    JPanel orderPanel=new JPanel();
    JList orderList=new JList();
    JScrollPane pane;
    ImageIcon helpImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/help.jpeg");
    ImageIcon returnImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/return.jpeg");
    ImageIcon userImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/user.jpeg");
    static JButton clearBtn =new JButton("Clear");
    JButton returnBtn =new JButton(returnImg);
    JButton helpBtn =new JButton(helpImg);
    JButton userBtn =new JButton(userImg);
    static Object orders[] = new Object[20];
    
    
    
    public CustomerPanel(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        buildLeftPanel();
        buildRightPanel();
        buildBottomPanel();
        buildCenterPanel();
        add(centerPanel,BorderLayout.CENTER);
        add(bottomPanel,BorderLayout.SOUTH);
        add(leftPanel,BorderLayout.WEST);
        add(rightPanel,BorderLayout.EAST);
        setVisible(true);
        
        
        clearBtn.addActionListener(new ActionListener() {
      
            public
            void actionPerformed(ActionEvent e) {
             
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
                   Order.counterChicken=0;
                   Order.counterCombo=0;
                   Order.counterFish=0;
                   Order.counterMeat=0;
                   Order.counterSoup=0;
                   
            
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
                new Order();
                Order.counterChicken=0;
                Order.counterCombo=0;
                Order.counterFish=0;
                Order.counterMeat=0;
                Order.counterSoup=0;
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
                JOptionPane.showMessageDialog(null, "In this page you can edit your information.");
            }
        });
        rightPanel.add(helpBtn);
    }
    public void buildCenterPanel(){
        orderPanel.setLayout(new GridLayout(0,1));
        centerPanel.setLayout(new GridLayout(1,3));
        centerPanel.add(new JPanel());
        orderList.setListData(orders);
        orderList.setVisibleRowCount(5);
        pane=new JScrollPane(orderList);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        centerPanel.add(pane);
        centerPanel.add(new JPanel());

    }
    public void buildBottomPanel(){
        bottomPanel.setLayout(new GridLayout(1,6));
        for(int i=0;i<2;i++) bottomPanel.add(new JPanel());
        bottomPanel.add(clearBtn);
        for(int i=0;i<2;i++) bottomPanel.add(new JPanel());
    }
    
}
