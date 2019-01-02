package contest._01beeperline7_5;

import resources.robot.NGCRobot;

/**
 * World:
 *  1. beeperline10x10.kwld
 *  2. beeperline5x5.kwld
 * */
public class BeeperLineRunner {
	public static void main(String[] args) {
		new BeeperLine(1, 1, NGCRobot.East, NGCRobot.infinity, "beeperline5x5.kwld");
	}
}
