import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
//import java.lang.Exception;  

public class Menu extends JFrame implements ActionListener{
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel1,userLabel2, passLabel;  
    final JTextField textField2;  
     JFrame frame; 
    //calling constructor  
    Menu()  
    {     
          frame=new JFrame();
          
        userLabel1 = new JLabel();
        userLabel2 = new JLabel();
        userLabel1.setText("1. Break The Bricks");
        userLabel1.setBounds(250,80,200,30);
        userLabel2.setText("2.Tic Tac Toe");
        userLabel2.setBounds(250,110,200,30);
        
        passLabel = new JLabel();  
        passLabel.setText("Your choice: ");      
        passLabel.setBounds(250,140,200,30);  
          
        textField2 = new JTextField(1); 
        textField2.setBounds(250,170,200,30);
            
        b1 = new JButton("CONFIRM"); 
        b1.setBounds(250,200,200,30);
         
        frame.add(userLabel1);
        frame.add(userLabel2);
                frame.add(passLabel);
                frame.add(b1);
                frame.add(textField2);
                frame.setSize(700,700);
                frame.setLayout(null);
                frame.setVisible(true);
        //create panel to put form elements  
//        newPanel = new JPanel(new FlowLayout(FlowLayout.LEADING,20,25));  
//        newPanel.add(userLabel1);
//        newPanel.add(userLabel2);//set username label to panel  
//       // newPanel.add(textField1);   //set text field to panel  
//        newPanel.add(passLabel);    //set password label to panel  
//        newPanel.add(textField2);   //set text field to panel  
//        newPanel.add(b1);           //set button to panel  
//          
//        //set border to panel   
//        add(newPanel, BorderLayout.CENTER);  
          
        //perform action on button click   
        b1.addActionListener(this);     //add action listener to button  
        frame.setTitle("Main Menu");         //set title to the login form  
    }  
      
    //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        //String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
          
        //check whether the credentials are authentic or not  
        if (passValue.equals("1")) {  //if authentic, navigate user to a new gamePlay  
              JFrame obj=new JFrame();
            //create instance of the NewPage  
            Gameplay gamePlay = new Gameplay();  
              
            obj.setSize(700,700);
		obj.setTitle("Break The Bricks");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
                obj.setVisible(true); 
              
            
        }  
        
        if (passValue.equals("2")) {    
            TTT TicTacToe = new TTT();  
              
            }  
        
        else{  
            //show error message  
            System.out.println("Please enter valid choice");  
        }  
    }  
}  
//create the main class  
//class LoginFormDemo  
//{  
//    //main() method start  
//    public static void main(String arg[])  
//    {    
//            //create instance of the Menu  
//            Menu form = new Menu();  
//            form.setSize(300,100);  //set size of the frame  
//            form.setVisible(true);  //make form visible to the user  
//        
//    }  
//}
