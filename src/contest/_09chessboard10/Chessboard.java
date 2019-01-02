package contest._09chessboard10;

import resources.robot.NGCRobot;

public class Chessboard extends NGCRobot{

	public Chessboard(int street, int avenue, Direction direction, int beepers, String world) {
		super(street, avenue, direction, beepers, world);
	}
	
	public void run() {
		if (frontIsBlocked()) {
			turnLeft();
		}
		
		while(frontIsClear()){
			if (noBeepersPresent()) {
				putBeeper();
			}
			moveForward();
			if (frontIsClear()) {
				moveForward();
				if (noBeepersPresent()) {
					putBeeper();
				}
			}
		}
	}

	private void moveForward() {
		move();
		setDirection();
	}

	private void setDirection() {
		if (facingEast()) {
			if (frontIsBlocked()) {
				turnLeft();
			}
		}else if (facingWest()) {
			if (frontIsBlocked()) {
				turnRight();
			}
		}else if (facingNorth()) {
			if (rightIsBlocked()) {
				if (leftIsClear()) {
					turnLeft();
				}
			}else if (leftIsBlocked()) {
				turnRight();
			}
		}
	}
	
}
