import java.awt.Font;
import javax.swing.*;   
import java.awt.event.*;  
 

public class Menu extends JFrame implements ActionListener{
    JButton b1,b2;  
    JPanel newPanel;  
    JLabel heading,game1,game2, input;  
   // final JTextField inputBox;  
     JFrame frame; 
    //calling constructor  
    Menu()  
    {     
        frame=new JFrame();
         
            
        heading = new JLabel(); 
        game1 = new JLabel();
        game2 = new JLabel();
        heading.setFont(new Font("serif",Font.BOLD, 48));
        heading.setText("MINI GAMES");
        heading.setBounds(200,100,600,40);
        game1.setFont(new Font("serif",Font.BOLD, 20));
        game1.setText("1. Break The Bricks");
        game1.setBounds(75,275,200,30); //(250,80,200,30)
        game2.setFont(new Font("serif",Font.BOLD, 20));
        game2.setText("2. Tic Tac Toe");
        game2.setBounds(425,275,200,30);//(250,110,200,30)
        
//        input = new JLabel();  
//        input.setText("Your choice: ");      
//        input.setBounds(250,140,200,30);  
          
//        inputBox = new JTextField(1); 
//        inputBox.setBounds(250,170,200,30);
            
        b1 = new JButton("PLAY"); 
        b1.setBounds(75,310,200,30);//(250,200,200,30)
        
        
        b2 = new JButton("PLAY"); 
        b2.setBounds(425,310,200,30);
         
        frame.add(game1);
        frame.add(game2);
        frame.add(heading);
               // frame.add(input);
                frame.add(b1);
                frame.add(b2);
               // frame.add(inputBox);
                frame.setSize(700,700);
                frame.setLayout(null);
                frame.setVisible(true);
         
        b1.addActionListener(this); 
        b2.addActionListener(this);
        frame.setTitle("Main Menu");         
    }  
      
       
    public void actionPerformed(ActionEvent ae)       
    {  
         
      //  String passValue = inputBox.getText();           
        //if (passValue.equals("1"))
        if(ae.getSource()==b1){    
              JFrame obj=new JFrame();
            
            Gameplay gamePlay = new Gameplay();  
              frame.setVisible(false);
            obj.setSize(700,700);
		obj.setTitle("Break The Bricks");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
                obj.setVisible(true); 
                frame.setVisible(false);
            
        }  
        
       // if (passValue.equals("2"))
       if(ae.getSource()==b2){    
            TTT TicTacToe = new TTT();  
               frame.setVisible(false);
            }  
    }  
}  
