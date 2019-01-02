package contest._05doublebeeper10;

import resources.robot.NGCRobot;

/**
 * Worlds:
 * 	1. doublebeeper.kwld
 * */
public class DoubleBeeperRunner {
	public static void main(String[] args) {
		new DoubleBeeper(1, 1, NGCRobot.East, NGCRobot.infinity, "doublebeeper.kwld");
	}
}
