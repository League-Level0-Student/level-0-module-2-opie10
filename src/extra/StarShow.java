package extra;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in
 * this recipe. 2. ask students how they might use the method to make the
 * picture in the laminated hand-outs.
 */

public class StarShow {

	Robot robjames = new Robot("batman");

	void makeStars() {

		// 5. delete this line. you will draw the star again in step 8.
		// 13. Set the speed to 8
		robjames.setSpeed(1999999999);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
		int rjx = 480;
		// 7. Make a variable to hold the Y position of the Robot and set it to 600
		int rjy = 300;
		// 8. Make a variable to hold the star size and set it to 25
		int sS = 25;
		// 12. Repeat the steps #19 to #18, 30 times
		for (int i = 0; i < 110; i++) {

			// 19. Set the pen width to i
			robjames.setPenWidth(i);
			// 10. Set the X position of the robot to your X variable
			robjames.setX(rjx);
			// 11. Set the Y position of the robot to your Y variable
			robjames.setY(rjy);
			// 9. Call the drawStar() method with your star size variable
			drawStar(sS);
			// 14. Increase the X position by star size. See Figure 2.
			robjames.setX(rjx + sS);
			// 15. decrease the Y position by star size. See Figure 3.
			robjames.setY(rjy - sS);
			// 16. Increase the star size by 20
			sS = 25 + 20;
			// 17. Turn the robot 12 degrees
			robjames.turn(3);
			// 18. Make each star a different random color like in Figure 4.
			robjames.setRandomPenColor();

		}
		robjames.sparkle();
		
		robjames.unSparkle();
		robjames.hide();

	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
		robjames.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		robjames.move(starSize);
		robjames.turn(144);
		robjames.move(starSize);
		robjames.turn(144);
		robjames.move(starSize);
		robjames.turn(144);
		robjames.move(starSize);
		robjames.turn(144);
		// 1. Move the robot the distance of the starSize variable

		robjames.move(starSize);
		// 3. Turn the robot 144 degrees
		robjames.turn(144);
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
