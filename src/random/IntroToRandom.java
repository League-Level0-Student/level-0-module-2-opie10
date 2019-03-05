//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r =  new Random().nextInt(101);;
		
		//3. Now make r random.√ 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		

		//4. Limit the random number between 0 and 100√

		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		int r2 = 25 + new Random().nextInt(51);
		//6. Challenge: Limit the random number between -222 and 88
		int r3 = -222 + new Random().nextInt(310);
		//1. Print out the value of r
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);

		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}