package contest._10maze20;

import resources.robot.NGCRobot;


/**
 * Worlds:
 * 	1. maze7x7.kwld
 *  2. maze10x10.kwld
 * */
public class MazeRunner {

	public static void main(String[] args) {
		new Maze(1, 1, NGCRobot.North, NGCRobot.infinity, "maze7x7.kwld");
	}

}
