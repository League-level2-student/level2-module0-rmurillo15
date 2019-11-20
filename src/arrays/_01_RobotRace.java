	package arrays;

	import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

	public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {

	//2. create an array of 5 robots.

	Robot[] yee = new Robot[8];

	//3. use a for loop to initialize the robots.
	for (int i = 0; i < yee.length; i++) {
		
	yee[i] = new Robot();
	yee[i].miniaturize();
	yee[i].setSpeed(60);
	//4. make each robot start at the bottom of the screen, side by side, facing up

	yee[i].moveTo(i*9 + 8, 500);
	}	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	Random random = new Random();
	boolean racerunning = true;
	while (racerunning == true ) {
	for (int i = 0; i < yee.length; i++) {
	
	yee[i].turn(10);
	yee[i].move(random.nextInt(10)); 
	if (yee[i].getY() <= 0) {
		racerunning = false;
		System.out.println("You're the winner #" + i + "!!!");
	}
	}	
	}
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.


}
}