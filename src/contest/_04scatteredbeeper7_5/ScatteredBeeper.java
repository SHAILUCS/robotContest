package contest._04scatteredbeeper7_5;

import resources.robot.NGCRobot;

public class ScatteredBeeper extends NGCRobot {

	public ScatteredBeeper(int street, int avenue, Direction East, int infinity, String world) {
		super(street, avenue, East, infinity, world);
	}

	public void run() {
		while (frontIsClear()) {
			pickAllBeepers();
			if (frontIsClear()) {
				move();
			}
			if (frontIsBlocked()) {
				pickAllBeepers();
				setDirection();
			} 
		}
	}

	private void pickAllBeepers() {
		while (beepersPresent()) {
			pickBeeper();
		}
	}

	private void setDirection() {
			if(facingEast()){
				turnLeft();
				if(frontIsClear()){
					move();
					turnLeft();
				}
			}else if (facingWest()) {
				turnRight();
				if(frontIsClear()){
					move();
					turnRight();
				}
			}
		
	}

}
