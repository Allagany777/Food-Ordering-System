package urmealgui;
////////////////////////////////////////////////////////// Needed Libraries..
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
////////////////////////////////////////////////////////// Importing static variables from other classes..
import static urmealgui.CustomerPanel.orders;
import static urmealgui.Order.counterChicken;
import static urmealgui.Order.counterCombo;
import static urmealgui.Order.counterFish;
import static urmealgui.Order.counterMeat;
import static urmealgui.Order.counterSoup;
import static urmealgui.Order.total;
////////////////////////////////////////////////////////// 
public
        class Invoice extends JFrame {
    ////////////////////////////////////////////////////////// Panel's declaration
    JPanel rightPanel=new JPanel();
    JPanel leftPanel=new JPanel();
    JPanel bottom_Cancelorder_FileChooser_panel=new JPanel();
    JPanel center_CustomerInfo_Panel;
    JPanel center_Order_Summary_Panel=new JPanel();
    ////////////////////////////////////////////////////////// JTextArea declaration
    JTextArea InvoiceArea1 = new JTextArea(5,2);
    JTextArea InvoiceArea2 = new JTextArea("\t       Invoice\n", 10, 10);
    ////////////////////////////////////////////////////////// Font declaration
    Font font = new Font("Monospaced", Font.BOLD, 12);
    ////////////////////////////////////////////////////////// ImageIcon declaration
    ImageIcon helpImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/help.jpeg");
    ImageIcon returnImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/return.jpeg");
    ImageIcon userImg = new ImageIcon("//Users/klnimri/NetBeansProjects/UrMealGUI/user.jpeg");
    ////////////////////////////////////////////////////////// Buttons declaration
    JButton FileChooserButton = new JButton("Browse");
    JButton returnBtn =new JButton(returnImg);
    JButton helpBtn =new JButton(helpImg);
    JButton userBtn =new JButton(userImg);
    JButton CancelOrderbtn = new JButton("Cancel order");
    ////////////////////////////////////////////////////////// Object variables declaration
    Object CustomerUserName;
    Object CustomerFullName;
    Object CustomerPhoneNumber;
    Object CustomerCity;
    Object CustomerAddress;
    ////////////////////////////////////////////////////////// JFileChooser declaration
    JFileChooser FileChooser;
    ////////////////////////////////////////////////////////// Integer variables declaration
    int status;
    int RandomDay;
    int RandomTime;
    ////////////////////////////////////////////////////////// Double variables declaration
    double tax = 0.15;
    double PriceAddedAfterTax = Order.total*tax;
    double TotalAfterTax = 0;
    ////////////////////////////////////////////////////////// Random Object declaration
    Random Day = new Random();
    Random Time = new Random();
    //////////////////////////////////////////////////////////
    
    public Invoice(){                                         // Invoice Constructor
        //////////////////////////////////////////////////////////
        setSize(525,300);
        setTitle("Invoice page");
        setLocationRelativeTo(null);                          // JFrame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5,5));
        setBackground(Color.gray);
        //////////////////////////////////////////////////////////
        buildCustomerArea();
        buildRightPanel();
        buildOrderSummaryArea();                              // Methods call
        buildbottomPanel();
        //////////////////////////////////////////////////////////
        add(InvoiceArea1,BorderLayout.WEST);
        add(InvoiceArea2,BorderLayout.CENTER);                // Adding components to JFrame
        add(rightPanel,BorderLayout.EAST);
        ////////////////////////////////////////////////////////// 
        InvoiceArea1.setFont(font);                          // Setting the JTextArea's font to (Font) > Monospaced
        InvoiceArea2.setFont(font);
        //////////////////////////////////////////////////////////
        setVisible(true);                                    // Setting Visibility true
        //////////////////////////////////////////////////////////
    }
    
    public void buildCustomerArea(){                         // BuildCustomerArea method
        
        ////////////////////////////////////////////////////////// Checking if the Username text field is not empty
        if(NewCs.text1 != null){                                   
        CustomerUserName = NewCs.text1.getText();  // <   <   < // Then get the text and save it into the variable
        }
        else {
            CustomerUserName = null;         // <     <     <   // If it is indeed empty then set assign the variable 
        }                                                       // To null
        if(NewCs.text2 != null){
        CustomerFullName = NewCs.text2.getText();
        }
        else {
            CustomerFullName = null;
        }
        if(NewCs.text3 != null){                                // Same operations ...
        CustomerPhoneNumber = NewCs.text3.getText();
        }
        else{
            CustomerPhoneNumber = null;
        }
        if(NewCs.text4 != null){                                // Same operations ...
        CustomerCity = NewCs.text4.getText();
        }
        else {
            CustomerCity = null;
        }
        if(NewCs.text5 != null){                                // Same operations ...
        CustomerAddress = NewCs.text5.getText();
        }
        else {
            CustomerAddress = null;
        }
        ////////////////////////////////////////////////////////// Adding the user's information to the JTextArea
        InvoiceArea1.append(String.valueOf("Customer Username: "+CustomerUserName) +'\n');
        InvoiceArea1.append(String.valueOf("Customer Fullname: "+CustomerFullName) +'\n');
        InvoiceArea1.append(String.valueOf("Customer Phone number: "+CustomerPhoneNumber) +'\n');
        InvoiceArea1.append(String.valueOf("Customer City: "+CustomerCity) +'\n');
        InvoiceArea1.append(String.valueOf("Customer Address: "+CustomerAddress) +'\n');
        //////////////////////////////////////////////////////////
        InvoiceArea1.setEditable(false);                        // Making the JTextArea not editable
        //////////////////////////////////////////////////////////
        FileChooserButton.setToolTipText("Click here to choose a file to save in \"Txt\""); // Hint for the button
        //////////////////////////////////////////////////////////
        setVisible(true);                                       // Setting the visibility true
        //////////////////////////////////////////////////////////
    }
    public void buildbottomPanel(){                                      // BuildbottomPanel method
        bottom_Cancelorder_FileChooser_panel.setSize(20,20);             // Setting the bottom panel's size
        CancelOrderbtn.setToolTipText("Click here to canel the order!"); // Hint for the cancel button
        CancelOrderbtn.addActionListener(new ActionListener() {          // Adding ActionListener to the cancel button
        //////////////////////////////////////////////////////////    
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                Order.billArea.setText("");
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
                orders[5] = null;                                        // If the button got clicked it will clear
                orders[6] = null;                                        // And reset everything.
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
                total = 0;
                counterChicken=0;
                counterCombo=0;
                counterFish=0;
                counterMeat=0;
                counterSoup=0;
                Order ko = new Order();                                 // Making a new Order Window to ensure that
                                                                        // everything is reset and erased
            }
        });
        //////////////////////////////////////////////////////////     
        FileChooserButton.addActionListener(new ActionListener() {      // Adding ActionListener to the FileChooser Button
            public                                                      // Beginning of the ActionListener
            void actionPerformed(ActionEvent e) {                       // Start of the ActionListener
                FileChooser = new JFileChooser();                       // Making the FileChooser Object
                FileChooser.showSaveDialog(FileChooserButton);          // Showing the save dialog window to browse 
                
                if (status == JFileChooser.APPROVE_OPTION){             // If the user clicked save then the following
                    File selectedFile = FileChooser.getSelectedFile();  // Will happen...
                    String FileName = selectedFile.getPath();
                    try                                                 // Try statement to check if there is Exceptions
                    {
                        FileWriter fw = new FileWriter(FileName);
                        PrintWriter OutPutFile = new PrintWriter(fw);
                        OutPutFile.println("");
                        OutPutFile.append("\t\t    Invoice");           // Writing to the file choosen
                        OutPutFile.println("");
                        OutPutFile.append("---------------------------------------------");
                        OutPutFile.println("");
                        OutPutFile.append("Customer Username: "+CustomerUserName);
                        OutPutFile.println("");
                        OutPutFile.append("Customer Fullname: "+CustomerFullName);
                        OutPutFile.println("");
                        OutPutFile.append("Customer Phone number: "+CustomerPhoneNumber);
                        OutPutFile.println("");
                        OutPutFile.append("Customer City: "+CustomerCity);
                        OutPutFile.println("");
                        OutPutFile.append("Customer Address: "+CustomerAddress);
                        OutPutFile.println("");
                        OutPutFile.append("---------------------------------------------");
                        OutPutFile.println("");                 
                        if(CustomerPanel.orders[0] != null){   // If there's no order in Index 0 then don't write anything
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[0]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[1] != null){            // Same operation..
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[1]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[2] != null){
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[2]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[3] != null){
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[3]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[4] != null){
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[4]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[5] != null){           // Same operation..
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[5]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[6] != null){
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[6]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[7] != null){
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[7]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[8] != null){
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[8]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[9] != null){
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[9]));
                        OutPutFile.println("");
                        }
                        if(CustomerPanel.orders[10] != null){         // Same operation..
                        OutPutFile.append(String.valueOf(CustomerPanel.orders[10]));
                        OutPutFile.println("");
                        }
                        //////////////////////////////////////////////////////////
                        RandomDay = Day.nextInt(1,4);                 // Making a random number between 1-4
                        RandomTime = Time.nextInt(1,12);              // Making a random number between 1-12
                        OutPutFile.append("---------------------------------------------\n"); // proceed writing to the file
                        OutPutFile.append("Estimated delivary time: "+String.valueOf(RandomDay)+" Days "
                         +"at "+String.valueOf(RandomTime)+"PM\n");
                        OutPutFile.append("Tax is: %15\n"+"added cost after tax: $"+(int)PriceAddedAfterTax+'\n');
                        OutPutFile.append("The total price is: $"+(int)TotalAfterTax+'\n');
                        OutPutFile.append("---------------------------------------------\n");
                        OutPutFile.close();                         // Closing the file.
                        System.exit(0);                             // Closing the application after saving the bill to the file
                    }
                    catch (IOException ex)                          // Catch the Exception if found and do what is needed.
                    {
                        Logger.getLogger(Invoice.class.getName()).
                                log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        //////////////////////////////////////////////////////////      // Ending of the ActionListener
        bottom_Cancelorder_FileChooser_panel.add(CancelOrderbtn);       // Adding the cancel button to the panel
        bottom_Cancelorder_FileChooser_panel.add(FileChooserButton);    // Adding the FileChooser button to the panel
        add(bottom_Cancelorder_FileChooser_panel,BorderLayout.SOUTH);   // Adding the panel to the JFrame
        //////////////////////////////////////////////////////////
    }
        //////////////////////////////////////////////////////////
    public void buildOrderSummaryArea(){                                // buildOrderSummaryArea method
                int Counter = 0;
                InvoiceArea2.append("--------------------------------------\n");
        while(CustomerPanel.orders.length > Counter){
                
                if (CustomerPanel.orders[Counter] == null){             // If Index 0 is empty break the loop.
                    break;
                }
                 InvoiceArea2.append(String.valueOf(CustomerPanel.orders[Counter++]) + '\n');
                }                                                       // if not then add the order to the JTextArea
                InvoiceArea2.append("--------------------------------------\n");
               
                TotalAfterTax = Order.total+(Order.total*tax);          // Calculations..
                RandomDay = Day.nextInt(1,4);
                RandomTime = Time.nextInt(1,12);
                InvoiceArea2.append("Estimated delivary time: "+String.valueOf(RandomDay)+" Days "
                +"at "+String.valueOf(RandomTime)+"PM\n");              // Adding the delivary time to the JTextArea
                InvoiceArea2.append("Tax is: %15\n"+"added cost after tax: $"+(int)PriceAddedAfterTax+'\n'); 
                InvoiceArea2.append("The total price is: $"+(int)TotalAfterTax);
                                                                        // Adding the price to the JTextArea
        //////////////////////////////////////////////////////////                                                                
        setVisible(true);                                               // Setting the visibility true 
        //////////////////////////////////////////////////////////
    }
        //////////////////////////////////////////////////////////
     public void buildRightPanel(){                             // buildRightPanel method
        rightPanel.setLayout(new GridLayout(6,1));              // Setting the layout to Grid "6 Rows & 1 Column"
        userBtn.setBorder(BorderFactory.createBevelBorder(1, Color.lightGray, Color.lightGray)); // Adding border
        userBtn.setToolTipText("Click here to edit your information!");                          // Hint fot the button
        userBtn.addActionListener(new ActionListener() {        // Adding ActionListner to the button
        ////////////////////////////////////////////////////////// Beginning of the ActionListener
            public
            void actionPerformed(ActionEvent e) {
                setVisible(false);
                NewCs o = new NewCs();
                o.setTitle("Edit information");
            }
        });
        ////////////////////////////////////////////////////////// Ending of the ActionListener
        rightPanel.add(userBtn);                                // Adding the button to the panel
        for(int i=0;i<4;i++){
            rightPanel.add(new JPanel());                       // Adding 4 more Panels to the current Panel
        }
        helpBtn.setBorder(BorderFactory.createBevelBorder(1, Color.lightGray, Color.lightGray)); // Adding border
        helpBtn.setToolTipText("what is this page?");                                            // Hint for the button
        helpBtn.addActionListener(new ActionListener() {        // Adding ActionListner to the button
        ////////////////////////////////////////////////////////// Beginning of the ActionListener
            public
            void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "In this page you are checking out the order");
            }
        });
        ////////////////////////////////////////////////////////// Ending of the ActionListener
        rightPanel.add(helpBtn);                                // Adding the help button to the panel.
    }
        
}
