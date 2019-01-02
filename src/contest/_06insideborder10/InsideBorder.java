package contest._06insideborder10;

import resources.robot.NGCRobot;

public class InsideBorder extends NGCRobot {

	public InsideBorder(int street, int avenue, Direction East, int infinity, String world) {
		super(street, avenue, East, infinity, world);
	}

	public void run() {
		move();
		createWall();
		createWall();
		createWall();
		createWall();
	}

	private void createWall() {
		turnLeft();
		move();
		while (frontIsClear()) {
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		turnAround();
		move();
	}
}
