package contest._03walljumper7_5;

import resources.robot.NGCRobot;

public class Walljumper extends NGCRobot{

	public Walljumper(int street, int avenue, Direction direction, int beepers, String world) {
		super(street, avenue, direction, beepers, world);
	}

	public void run() {
		for (int i = 0; i < 8; i++) {
			if(frontIsBlocked()){
				jumpWall();		
			}else{
				move();
			}
		}
	}

	private void jumpWall() {
		moveUp();
		jumpAcross();
		moveDown();
	}

	private void moveDown() {
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}

	private void jumpAcross() {
		turnRight();
		move();
		turnRight();
	}

	private void moveUp() {
		turnLeft();
		while(rightIsBlocked()){
			move();
		}
	}
	
}
