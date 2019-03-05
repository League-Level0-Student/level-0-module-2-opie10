//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		

		

		

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 11; i++) {
			Random randomMaker = new Random();
			int rN = randomMaker.nextInt(5);
			System.out.println(rN);
			if (rN == 0) {

				JOptionPane.showMessageDialog(null, "You are looking good today");

			}
			else if (rN == 1) {

				JOptionPane.showMessageDialog(null, "Your clothes are nice");

			}

			else if (rN == 2) {

				JOptionPane.showMessageDialog(null, "You are really kind");

			} else if (rN == 3) {

				JOptionPane.showMessageDialog(null, "You are good at coding");

			} else if (rN == 4) {

				JOptionPane.showMessageDialog(null, "You are smart ");

			}
		}
		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
