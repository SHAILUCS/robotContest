package contest._10maze20;

import resources.robot.NGCRobot;

public class Maze extends NGCRobot{

	public Maze(int street, int avenue, Direction East, int infinity, String world) {
		super(street, avenue, East, infinity, world);
	}

	public void run() {
		while(noBeepersPresent()){
			if(rightIsBlocked()){
				if (frontIsClear()) {
					move();
				}else {
					if(leftIsBlocked()){
						turnAround();
						move();
					}else{
						turnLeft();
						move();
					}
				}
			}else{
				turnRight();
				move();
			}
		}
	}

}
