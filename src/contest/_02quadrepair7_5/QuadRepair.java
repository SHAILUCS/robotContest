package contest._02quadrepair7_5;

import resources.robot.NGCRobot;

/**
 * Don't be intimidated by its perceived complexity, there is a reason for
 * everything and with understanding, it will reveal its simplicity 
 * - unknown
 */
public class QuadRepair extends NGCRobot{
	
	public QuadRepair(int street, int avenue, Direction direction, int beepers,String world) {
		super(street, avenue, direction, beepers,world);
	}

	public void run() {
		fixColumn();
		while (frontIsClear()){
			moveBelowColumn();
			fixColumn();
		}
		
	}

	private void fixColumn() {
		turnLeft();
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		
		if(noBeepersPresent()){
			putBeeper();
		}
		
		turnAround();
		
		while(frontIsClear()){
			move();
		}
		
		turnLeft();
	}

	private void moveBelowColumn() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}

}
