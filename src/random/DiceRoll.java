//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.awt.Dimension;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DiceRoll {

	private JFrame window = new JFrame("Roll the Dice!");
	private JPanel panel = new JPanel();
	private JButton rollButton = new JButton("CLICK HERE TO ROLL");
	private JLabel label = new JLabel();

	private Icon oneImg;
	private Icon twoImg;
	private Icon threeImg;
	private Icon fourImg;
	private Icon fiveImg;
	private Icon sixImg;

	public static void main(String[] args) {
		new DiceRoll().run();
	}
	
	public void run() {
		try {
			oneImg = new ImageIcon(getClass().getResource("dice 1.png"));
			twoImg = new ImageIcon(getClass().getResource("dice 2.png"));
			threeImg = new ImageIcon(getClass().getResource("dice 3.png"));
			fourImg = new ImageIcon(getClass().getResource("dice 4.png"));
			fiveImg = new ImageIcon(getClass().getResource("dice 5.png"));
			sixImg = new ImageIcon(getClass().getResource("dice 6.png"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Could not find one or more dice images");
			System.exit(0);
		}

		label.setIcon(oneImg);

		rollButton.addActionListener((e) -> {

			// 1. Make randomChoice equal to a random number between 1 and 6
			int randomChoice =new Random().nextInt(6);

			// 2. Fix the code below so that it displays the correct image
			if (randomChoice == 0) {
				label.setIcon(oneImg);
			} else if (randomChoice == 1) {
				label.setIcon(twoImg);
			} else if (randomChoice == 2) {
				label.setIcon(threeImg);
			} else if (randomChoice == 3) {
				label.setIcon(fourImg);
			} else if (randomChoice == 4) {
				label.setIcon(fiveImg);
			} else {
				label.setIcon(sixImg);
			}
		});

		panel.setPreferredSize(new Dimension(700, 700));
		panel.add(rollButton);
		panel.add(label);
		window.add(panel);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}

}
