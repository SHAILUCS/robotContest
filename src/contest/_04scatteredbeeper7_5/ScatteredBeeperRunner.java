package contest._04scatteredbeeper7_5;

import resources.robot.NGCRobot;


/**
 * Worlds:
 * 	1. scatteredbeeper10x10.kwld
 * 	2. scatteredbeepers10x10.kwld
 * */
public class ScatteredBeeperRunner {

	public static void main(String[] args) {
		new ScatteredBeeper(1, 1, NGCRobot.East, NGCRobot.infinity, "scatteredbeepers10x10.kwld");
	}

}
