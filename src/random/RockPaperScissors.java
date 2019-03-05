//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RockPaperScissors extends JPanel implements ActionListener{
  
	private JFrame window = new JFrame("Rock Paper Scissors");
	private JButton rockButton = new JButton();
	private JButton paperButton = new JButton();
	private JButton scissorsButton = new JButton();

	private JLabel instructionLabel = new JLabel();

	private Icon rockImage;
	private Icon paperImage;
	private Icon scissorsImage;

	private Dimension buttonDim = new Dimension(300, 200);
    
    public void run(){

		try {
		
			rockImage = new ImageIcon(getClass().getResource("rock.png"));
			paperImage = new ImageIcon(getClass().getResource("paper.jpeg"));
			scissorsImage = new ImageIcon(getClass().getResource("scissors.jpeg"));

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Cannot find one or more of your images");
		}
        
		rockButton.setIcon(rockImage);
		paperButton.setIcon(paperImage);
		scissorsButton.setIcon(scissorsImage);
        
        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);
        
        rockButton.setPreferredSize(buttonDim);
        paperButton.setPreferredSize(buttonDim);
        scissorsButton.setPreferredSize(buttonDim);
        
        instructionLabel.setText("Choose Your Weapon!");
        
        add(instructionLabel);
        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        
        window.add(this);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
    }
    
    public static void main(String[] args) {
        new RockPaperScissors().run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //1. Run the program and play many rounds of Rock Paper Scissors. Does the computer always choose the same thing?

        //2. Change the value of opponentSelection to be a random number between 0 and 2;
	//   Don't forget to create a Random object.
    	
        //2. Change the value of opponentSelection to be a random number between 0 and 2; 
        int opponentSelection =  new Random().nextInt(3); ;
        
        //3. Run the program again. Is the result different?
 
        int selection = 0;
       
        if(e.getSource() == paperButton){
            selection = 1;
        }else if(e.getSource() == scissorsButton){
            selection = 2;
        }
        
        JOptionPane.showMessageDialog(null, "You chose: " + convertSelection(selection) + ".\n"
                    + "The computer chose: " + convertSelection(opponentSelection) + ".\n");
        
        if(selection == opponentSelection){
            JOptionPane.showMessageDialog(null, "No Winner.  Play again.");
        }else if((selection == 0 && opponentSelection == 2) || 
                 (selection == 1 && opponentSelection == 0) ||
                 (selection == 2 && opponentSelection == 1)){
            JOptionPane.showMessageDialog(null, "You Win!");
        }else{
            JOptionPane.showMessageDialog(null, "You Lose!");
        }
    }
    
    private String convertSelection(int s){
       if (s==0)
            return "ROCK";
       else if (s==1)
            return "PAPER";
       else if (s==2)
            return "SCISSORS";
       else
            return "";
        }
    }
    
