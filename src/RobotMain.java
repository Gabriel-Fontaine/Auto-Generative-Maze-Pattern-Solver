/**
* RobotMain
* Task - A2 Maze EscapeBot: Showcasing the use and functionality of loops and control structures to have students demonstrate these skills through the purpose of having a robot navigate a randomly generated maze, so that it can arrive at a thing with minimal delays that prevent the robot from taking unnecessary detours and alternate pathways, this is completed through the purpose of having the robot attempt solving the maze via traversing through every available pathway until it can reach the destination over the course of a specified number of simulations so that the code is optimized for the robot to solve the maze using the shortest generated path that the robot can take to complete the maze path
* U4A2
* @author Gabriel Fontaine
* @version April 16 Tuesday 2024
*
*/
public class RobotMain {
	/**
	 * main method runs a robot task, this method is needed so Java knows where
	 * to start
	 *
	 * @param args
	 *            - optional input arguments from the operating system, not used
	 * @return void
	 */
	public static void main(String[] args) {
		RobotTask task = new RobotTask();
		task.run();
	} // end main
} // end class


