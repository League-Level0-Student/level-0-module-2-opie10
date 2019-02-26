//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {

		// 1. Make a main method that includes all the steps below….done

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int rand = new Random().nextInt(5);
		// 3. Print out this variable
		System.out.println(rand);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("What is your question for the all knowing magic 8 ball?");
		// 5. If the random number is 0
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		else if (rand == 0) {
			JOptionPane.showMessageDialog(null, "I am tired today, you should talk to my assistant,Google.");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Your question is not revealed to me at the moment");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Maybe,maybe not,I will not tell you");
		// -- write your own answer
	}
}
}