package contest._07midpoint10;

import resources.robot.NGCRobot;

/**
 * Worlds:
 *  1. midpoint3x3.kwld
 *  2. midpoint7x7.kwld
 *  3. midpoint8x8.kwld
 * */
public class MidpointFinderRunner {
	public static void main(String[] args) {
		new MidpointFinder(1, 1, NGCRobot.East, NGCRobot.infinity, "midpoint7x7.kwld");
	}

}
