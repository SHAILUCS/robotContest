package contest._06insideborder10;

import resources.robot.NGCRobot;

/**
 * Worlds:
 *  1. insideborder3x3.kwld
 *  2. insideborder6x6.kwld
 *  3. insideborder9x9.kwld
 * */
public class InsideBorderRunner {
	public static void main(String[] args) {
		new InsideBorder(1, 1, NGCRobot.East, NGCRobot.infinity, "insideborder6x6.kwld");
	}
}
