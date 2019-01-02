package contest._00newspaper0;

import resources.robot.NGCRobot;

/**
 * Don't be intimidated by its perceived complexity, there is a reason for
 * everything and with understanding, it will reveal its simplicity 
 * - unknown
 */
public class FetchNewspaper extends NGCRobot{
	
	public FetchNewspaper(int street, int avenue, Direction direction, int beepers, String world) {
		super(street, avenue, direction, beepers, world);
	}
	
	public void run() {
		moveToNewsPaper();
		pickPaper();
		moveBackToStartingPoint();
	}

	private void moveBackToStartingPoint() {
		//Moving to West Wall
		while (frontIsClear()){
			move();
		}
		
		//Turning the robot face to North
		turnRight();
		
		//Moving to North Wall, thus our Robot will be at NW corner of the house
		while (frontIsClear()){
			move();
		}
		
		//Turning the robot face to East, as it was at starting
		turnRight();
				
	}

	private void pickPaper() {

		//Moving ahead till we found the paper(beeper)
		while(noBeepersPresent()){
			move();
		}
		
		//picking up the beeper
		pickBeeper();
		
		//Turning the robot face to West
		turnAround();
		
	}

	private void moveToNewsPaper() {
		
		//Moving to East Wall
		while (frontIsClear()){
			move();
		}
		
		//Turning robot face to South direction
		turnRight();
		
		//Moving ahead till we found the door
		while (leftIsBlocked()) {
			move();
		}
		
		//Turning robot face to East direction
		turnLeft();
		
	}
	
}
