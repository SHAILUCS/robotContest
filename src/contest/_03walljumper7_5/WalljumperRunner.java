package contest._03walljumper7_5;

import resources.robot.NGCRobot;

/**
 * Worlds:
 *  1. walljumper9col.kwld
 * */

public class WalljumperRunner {
	public static void main(String[] args) {
		new Walljumper(1, 1, NGCRobot.East, NGCRobot.infinity, "walljumper9col.kwld");
	}
}
