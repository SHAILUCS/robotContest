package contest._07midpoint10;

import resources.robot.NGCRobot;

public class MidpointFinder extends NGCRobot {

	public MidpointFinder(int street, int avenue, Direction direction, int beepers, String world) {
		super(street, avenue, direction, beepers, world);
	}

	public void run() {
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
				moveToWall();
			}
			moveToBeeperAndPlaceBeeperCloserToCenter();
		}
		cleanUp();
	}

	/*
	 * It will pick the extra beeper from the center cell, to ensure that only
	 * single beeper is present in center cell
	 */
	private void cleanUp() {
		turnAround();
		while (frontIsClear()) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
	}

	/*
	 * It will move until it finds a beeper, then it will pick up the beeper and
	 * move it one step towards center
	 */
	private void moveToBeeperAndPlaceBeeperCloserToCenter() {
		while (frontIsClear()) {
			move();
			if (beepersPresent()) {
				pickBeeper();
				turnAround();
				move();
				putBeeper();
			}
		}

	}

	/*
	 * It will move ahead until it finds a wall, after that it will turn around,
	 * and put the beeper
	 */
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
		if (noBeepersPresent()) {
			putBeeper();
			turnAround();
		}
	}
}
