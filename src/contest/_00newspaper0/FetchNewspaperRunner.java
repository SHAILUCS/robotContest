package contest._00newspaper0;

import resources.robot.NGCRobot;

/**
 * Worlds:
 * 1.	newspaper.kwld
 * */
public class FetchNewspaperRunner{
	public static void main(String [] args){	
		new FetchNewspaper(8, 4, NGCRobot.East, NGCRobot.infinity , "newspaper.kwld");
	}
}
