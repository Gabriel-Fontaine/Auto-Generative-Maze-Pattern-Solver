import becker.robots.*;
import java.util.Random;
/**
* RobotTask Class
*
* @author
* @version
*/
public class RobotTask {
	public City square;
	/**
	 * run method
	 *
	 * @param none
	 * @return void
	 */
	public void run() {
		// constructs a new random Maze City
		MazeCity square = new MazeCity(10, 10, 1, 1); //random maze city
		square.showThingCounts(true);
		
		Random rG= new Random();  //random generator
		int rA = rG.nextInt(10); //sets random avenue
		int rS = rG.nextInt(10); //sets random street
		Thing t = new Thing(square,rA,rS);  //places thing at random location
		
		// initially creating an object called bot
		MazeBot bot = new MazeBot(square, 4, 3, Direction.SOUTH); // street = y, avenue = x
		
		
		do { // a loop which is going to be running until it has picked up the thing hidden within the maze
			bot.solve(); // solve is a method telling the robot to try getting to the thing in the maze
		} while (bot.countThingsInBackpack() < 1);
		
		
		
	} // end run
	
	
} // end class

