package contest._05doublebeeper10;

import resources.robot.NGCRobot;

public class DoubleBeeper extends NGCRobot{

	public DoubleBeeper(int street, int avenue, Direction East, int infinity, String world) {
		super(street, avenue, East, infinity, world);
	}
	
	public void run() {
		move();
		putTwoBeepersNextCell();
		repositionBeepers();
		maveBackToOriginalPosition();
	}

	private void maveBackToOriginalPosition() {
		move();
		move();
		turnAround();
	}

	private void repositionBeepers() {
		move();
		turnAround();
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			moveBack();
		}
		
	}

	private void moveBack() {
		turnAround();
		move();
		turnAround();
	}

	private void putTwoBeepersNextCell() {
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			putBeeper();
			moveBack();
		}
	}
}
