package contest._02quadrepair7_5;

import resources.robot.NGCRobot;

/**
 * Worlds:
 *  1. quad13x8.kwld
 *  2. quad13x10.kwld
 * */

public class QuadRepairRunner{
	public static void main(String [] args){
		new QuadRepair(1, 1, NGCRobot.East, NGCRobot.infinity,"quad13x10.kwld");
	}
	
}
