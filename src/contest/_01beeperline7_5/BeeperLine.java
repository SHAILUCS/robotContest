package contest._01beeperline7_5;

import resources.robot.NGCRobot;

public class BeeperLine extends NGCRobot{

	public BeeperLine(int street, int avenue, Direction direction, int beepers, String world) {
		super(street, avenue, direction, beepers, world);
	}
	
	public void run() {
		while(frontIsClear()){
			putBeeper();
			move();
		}
		putBeeper();
	}

}
