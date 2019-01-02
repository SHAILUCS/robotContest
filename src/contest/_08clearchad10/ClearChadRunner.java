package contest._08clearchad10;

import resources.robot.NGCRobot;

/**
 * Worlds:
 *  1. clearchad11x11.kwld
 *  2. clearchad7x7.kwld
 * */
public class ClearChadRunner {
	public static void main(String[] args) {
		new ClearChad(3, 1, NGCRobot.East, NGCRobot.infinity, "clearchad7x7.kwld");
	}
}
