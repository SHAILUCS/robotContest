package contest._08clearchad10;

import resources.robot.NGCRobot;

public class ClearChad extends NGCRobot {

	public ClearChad(int street, int avenue, Direction East, int infinity, String world) {
		super(street, avenue, East, infinity, world);
	}

	public void run() {
		while (frontIsClear()) {
			move();
			checkBoxForExtraChad();
			move();
		}
		
	}

	private void checkBoxForExtraChad() {
		if(beepersPresent()){
			turnLeft();
			move();
			if(beepersPresent()){
				turnAround();
				move();
				move();
				if (beepersPresent()) {
					turnAround();
					move();
					turnRight();
				}else{
					turnAround();
					move();
					turnRight();
					clearExtraChad();
				}
			}else{
				turnAround();
				move();
				turnRight();
				clearExtraChad();
			}
		}else{
			clearExtraChad();
		}
	}

	private void clearExtraChad() {
		while(beepersPresent()){
			pickBeeper();
		}
		
		turnLeft();
		move();
		
		while(beepersPresent()){
			pickBeeper();
		}
		
		turnAround();
		move();
		move();
		
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();
	}
	
}
