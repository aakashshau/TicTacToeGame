package tictactoegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame implements ActionListener
    
{
     int count=0;
     String str="X";
    JButton JB1,JB2,JB3,JB4,JB5,JB6,JB7,JB8,JB9;
    Color color;
    boolean win=(false);
    JFrame Jf;
TicTacToeGame()
{
    Jf=new JFrame();
    Jf.setTitle("Tic Tac Toe Game");
    Jf.setSize(500,500);
    Jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Jf.setLocationRelativeTo(null);
    Jf.setLayout(new GridLayout(3,3));
    Jf.setResizable(false);
    
    JB1=new JButton();
    JB1.addActionListener(this);
    Jf.add(JB1);
    
   JB2 = new JButton();
   JB2.addActionListener(this);
    Jf.add(JB2);
            
    JB3=new JButton();
    JB3.addActionListener(this);
    Jf.add(JB3);
            
    JB4=new JButton();
    JB4.addActionListener(this);
    Jf.add(JB4);
    
    JB5=new JButton();
    JB5.addActionListener(this);
    Jf.add(JB5);        
    
    JB6=new JButton();
    JB6.addActionListener(this);
    Jf.add(JB6);
    
    JB7=new JButton();
    JB7.addActionListener(this);
    Jf.add(JB7);
            
    JB8=new JButton();
    JB8.addActionListener(this);
    Jf.add(JB8);
            
    JB9=new JButton();
    JB9.addActionListener(this);
    Jf.add(JB9);        
            
            
            
       
    Jf.setVisible(true);
       
}
    
    public static void main(String[] args) 
    {
        new TicTacToeGame();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        count=count+1;
        if (count%2==0)
        {
            str="0"; 
            color=Color.MAGENTA;
        }
        else
        {
           str="X"; 
           color=Color.YELLOW;
        }
        Font font=new Font("ArialBlack",Font.BOLD,100);
        
        if(e.getSource()==JB1)
        {
        JB1.setText(str);
        JB1.setFont(font);
        JB1.setBackground(color);
        JB1.setEnabled(false);
        }
        if(e.getSource()==JB2)
        {
        JB2.setText(str);
        JB2.setFont(font);
        JB2.setBackground(color);
        JB2.setEnabled(false);
        
        }
        if(e.getSource()==JB3)
        {
        JB3.setText(str);
        JB3.setFont(font);
        JB3.setBackground(color);
        JB3.setEnabled(false);
        }
        if(e.getSource()==JB4)
        {
        JB4.setText(str);
        JB4.setFont(font);
        JB4.setBackground(color);
        JB4.setEnabled(false);
        }
        if(e.getSource()==JB5)
        {
        JB5.setText(str);
        JB5.setFont(font);
        JB5.setBackground(color);
        JB5.setEnabled(false);
        }
        if(e.getSource()==JB6)
        {
        JB6.setText(str);
        JB6.setFont(font);
        JB6.setBackground(color);
        JB6.setEnabled(false);
        }
        if(e.getSource()==JB7)
        {
        JB7.setText(str);
        JB7.setFont(font);
        JB7.setBackground(color);
        JB7.setEnabled(false);
        }
        if(e.getSource()==JB8)
        {
        JB8.setText(str);
        JB8.setFont(font);
        JB8.setBackground(color);
        JB8.setEnabled(false);
        }
        if(e.getSource()==JB9)
        {
        JB9.setText(str);
        JB9.setEnabled(false);
        JB9.setBackground(color);
        JB9.setFont(font);
        }
        winPossibilites();
        }

    void winPossibilites()
    {
        //Horizontally Winning Possiblity
        if(JB1.getText()==JB2.getText()&& JB2.getText()==JB3.getText()&&JB1.getText()!="")
        {
           win=true; 
        }
        else if(JB4.getText()==JB5.getText()&& JB5.getText()==JB6.getText()&& JB4.getText()!="")
        {
            win=true;
        }
        else if(JB7.getText()==JB8.getText()&& JB8.getText()==JB9.getText()&& JB7.getText()!="")
        {
            win=true;
        }
         //columnwise Winning Possiblity
        else if(JB1.getText()==JB4.getText()&& JB4.getText()==JB7.getText()&& JB1.getText()!="")
        {
            win=true;
        }
        else if(JB2.getText()==JB5.getText()&& JB5.getText()==JB8.getText()&& JB5.getText()!="")
        {
            win=true;
        }
        else if(JB3.getText()==JB6.getText()&& JB6.getText()==JB9.getText()&& JB9.getText()!="")
        {
            win=true;
        }
        //DiagonalWise Winning Possiblity
        else if(JB1.getText()==JB5.getText()&& JB5.getText()==JB9.getText()&& JB5.getText()!="")
        {
            win=true;
        }
        else if(JB3.getText()==JB5.getText()&& JB5.getText()==JB7.getText()&& JB5.getText()!="")
        {
            win=true;
        }
        whoWin();
    }
    void whoWin()
    {
        if(win==true)
        {
          JOptionPane.showMessageDialog(Jf,str+" wins");
          restartGame();
        }
        else if(win==false && count==9)
        {
            JOptionPane.showMessageDialog(Jf," Match Draw");
            restartGame();
        } 
        
    }
    void restartGame()
    {
       int i=JOptionPane.showConfirmDialog(Jf, "Do you want to play again?");
       if(i==0)
       {
        count=0;
        str="";
        color=(null);
        win=(false);
        
        JB1.setText("");
        JB1.setBackground(color);
        JB1.setEnabled(true);
        
        JB2.setText("");
        JB2.setBackground(color);
        JB2.setEnabled(true);
        
        JB3.setText("");
        JB3.setBackground(color);
        JB3.setEnabled(true);
        
        JB4.setText("");
        JB4.setBackground(color);
        JB4.setEnabled(true);
        
        JB5.setText("");
        JB5.setBackground(color);
        JB5.setEnabled(true);
        
        JB6.setText("");
        JB6.setBackground(color);
        JB6.setEnabled(true);
        
        JB7.setText("");
        JB7.setBackground(color);
        JB7.setEnabled(true);
        
        JB8.setText("");
        JB8.setBackground(color);
        JB8.setEnabled(true);
        
        JB9.setText("");
        JB9.setBackground(color);
        JB9.setEnabled(true);
       }
       else if(i==1)
       {
           System.exit(0);
       }
       else
      {
          JB1.setEnabled(false);
          JB2.setEnabled(false);
          JB3.setEnabled(false);
          JB4.setEnabled(false);
          JB5.setEnabled(false);
          JB6.setEnabled(false);
          JB7.setEnabled(false);
          JB8.setEnabled(false);
          JB9.setEnabled(false);
          
      }
    } 
    }
  
