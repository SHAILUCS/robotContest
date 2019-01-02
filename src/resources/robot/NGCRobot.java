package resources.robot;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.Enumeration;
import java.util.Observer;

import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.UrRobot;
import kareltherobot.World;



/**
 * Don't be intimidated by its perceived complexity, there is a reason for
 * everything and with understanding, it will reveal its simplicity 
 * - unknown
 */
public class NGCRobot extends Robot implements Directions {
	
	public static final String WORLD_FOLDER_PATH=System.getProperty("user.dir")+"\\src\\resources\\worlds\\";
	
	public NGCRobot(int street, int avenue, Direction East, int infinity,String world){	
		super(street, avenue, East, infinity);
		initWorld(WORLD_FOLDER_PATH+world);
	}
	
	private void initWorld(String world) {
		World.smallView(500);
		World.setupThread(this);
		World.readWorld(world);
		World.setVisible(true);
		World.showSpeedControl(true,true);
		World.setBeeperColor(Color.MAGENTA);
	}
	
	/**Starting point of your commands*/
	public void run() {
	}
	
	@Deprecated
	public synchronized void acceptConnection(PipedOutputStream s, ConnectStrategy strat) throws IOException {
		super.acceptConnection(s, strat);
	}
	
	@Deprecated
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}
	
	@Deprecated
	public synchronized void acceptConnectionFrom(UrRobot sender, PipedOutputStream s, ConnectStrategy strat)
			throws IOException {
		super.acceptConnectionFrom(sender, s, strat);
	}
	
	@Deprecated
	public boolean anyBeepersInBeeperBag() {
		return super.anyBeepersInBeeperBag();
	}
	
	/**Are there beepers in Robot’s bag?
	 * @return true, if beeper present in bag*/
	public boolean beepersInBag() {
		return super.anyBeepersInBeeperBag();
	}
	
	/**Are there beepers in Robot’s bag?
	 * @return true, if No beeper found in bag*/
	public boolean noBeepersInBag(){
		return !super.anyBeepersInBeeperBag();
	}
	
	@Deprecated
	protected synchronized void clearChanged() {
		super.clearChanged();
	}
	
	@Deprecated
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Deprecated
	public BufferedWriter connectTo(UrRobot other, ConnectStrategy strat) throws IOException {
		return super.connectTo(other, strat);
	}
	
	@Deprecated
	public synchronized int countObservers() {
		return super.countObservers();
	}
	
	@Deprecated
	public synchronized void deleteObserver(Observer o) {
		super.deleteObserver(o);
	}
	
	@Deprecated
	public synchronized void deleteObservers() {
		super.deleteObservers();
	}
	
	@Deprecated
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	/**Is Robot facing east?
	 * @return true, if robot is facing east*/
	public boolean facingEast() {
		return super.facingEast();
	}

	/**Is Robot facing east?
	 * @return true, if robot is not facing east*/
	public boolean notFacingEast() {
		return !super.facingEast();
	}
	
	/**Is Robot facing north?
	 * @return true, if robot is facing north*/
	public boolean facingNorth() {
		return super.facingNorth();
	}
	
	/**Is Robot facing north?
	 * @return true, if robot is not facing north*/
	public boolean notFacingNorth() {
		return !super.facingNorth();
	}

	/**Is Robot facing south?
	 * @return true, if robot is facing south*/
	public boolean facingSouth() {
		return super.facingSouth();
	}
	
	/**Is Robot facing south?
	 * @return true, if robot is not facing south*/
	public boolean notFacingSouth() {
		return super.facingSouth();
	}
	
	/**Is Robot facing west?
	 * @return true, if robot is facing west*/
	public boolean facingWest() {
		return super.facingWest();
	}
	
	/**Is Robot facing west?
	 * @return true, if robot is not facing west*/
	public boolean notFacingWest() {
		return !super.facingWest();
	}
	
	@Deprecated
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	/**Is there a wall in front of Robot?
	 * @return true, if front is clear*/
	public boolean frontIsClear() {
		return super.frontIsClear();
	}
	
	/**Is there a wall in front of Robot?
	 * @return true, if front is not clear*/
	public boolean frontIsBlocked() {
		return !super.frontIsClear();
	}
	
	@Deprecated
	public String getNextCommunication() {
		return super.getNextCommunication();
	}
	
	@Deprecated
	public synchronized boolean hasChanged() {
		return super.hasChanged();
	}
	
	@Deprecated
	public int hashCode() {
		return super.hashCode();
	}
	
	/**
	 * Asks Robot to move forward one block. Robot cannot respond to a move()
	 * command if there is a wall blocking its way.
	 */
	public void move() {
		super.move();
	}
	
	@Deprecated
	public Enumeration<?> neighbors() {
		return super.neighbors();
	}
	
	@Deprecated
	public boolean nextToABeeper() {
		return super.nextToABeeper();
	}
	
	/**Any beepers on this corner?
	 * @return true, if beeper present on this corner*/
	public boolean beepersPresent(){
		return super.nextToABeeper();
	} 
	
	/**Any beepers on this corner?
	 * @return true, if no beeper found on this corner*/
	public boolean noBeepersPresent(){
		return !super.nextToABeeper();
	}
	
	@Deprecated
	public boolean nextToARobot() {
		return super.nextToARobot();
	}
	
	@Deprecated
	public void notifyObservers() {
		super.notifyObservers();
	}
	
	@Deprecated
	public void notifyObservers(Object arg) {
		super.notifyObservers(arg);
	}

	/**
	 * "Asks Robot to pick up one beeper from a corner and stores the beeper in
	 * its beeper bag, which can hold an infinite number of beepers. Robot
	 * cannot respond to a pickBeeper() command unless there is a beeper on the
	 * current corner."
	 */
	public void pickBeeper() {
		super.pickBeeper();
	}
	
	/**
	 * "Asks Robot to take a beeper from its beeper bag and put it down on the
	 * current corner. Robot cannot respond to a putBeeper() command unless
	 * there are beepers in its beeper bag."
	 */
	public void putBeeper() {
		super.putBeeper();
	}
	
	@Deprecated
	public void send(BufferedWriter other, String s) throws IOException {
		super.send(other, s);
	}
	
	@Deprecated
	protected synchronized void setChanged() {
		super.setChanged();
	}
	
	@Deprecated
	protected void sleep() {
		super.sleep();
	}
	
	/**Asks Robot to rotate 90 degrees to the left (counterclockwise).*/
	public void turnLeft() {
		super.turnLeft();
	}
	
	/**Asks Robot to rotate 90 degrees to the right (clockwise).*/
	public void turnRight() {
		int delay=World.delay();
		World.setDelay(1);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(delay);
	}
	
	/**Asks Robot to rotate 180 degrees*/
	public void turnAround() {
		int delay=World.delay();
		World.setDelay(1);
		turnLeft();
		turnLeft();
		World.setDelay(delay);
	}
	
	@Deprecated
	public void turnOff() {
		super.turnOff();
	}
	
	@Deprecated
	public void userPause(String message) {
		super.userPause(message);
	}
	
	@Deprecated
	public String waitForCommunication() {
		return super.waitForCommunication();
	}
	
	@Deprecated 
	public String waitForNextCommunication() {
		return super.waitForNextCommunication();
	}

	@Deprecated
	public World world() {
		return super.world();
	}
	
	/**Is there a wall to Robot’s left?
	 * @return true, if left is clear*/
	public boolean leftIsClear(){
		boolean flag=false;
		int delay=World.delay();
		World.setDelay(1);
		turnLeft();
		flag = frontIsClear();
		turnRight();
		World.setDelay(delay);
		return flag;
	}
	
	/**Is there a wall to Robot’s left?
	 * @return true, if left is not clear*/
	public boolean leftIsBlocked(){
		return !leftIsClear();
	}
	
	/**Is there a wall to Robot’s right?
	 * @return true, if right is clear*/
	public boolean rightIsClear(){
		boolean flag=false;
		int delay=World.delay();
		World.setDelay(1);
		turnRight();
		flag=frontIsClear();
		turnLeft();
		World.setDelay(delay);
		return flag;
	}
	
	/**Is there a wall to Robot’s right?
	 * @return true, if right is not clear*/
	public boolean rightIsBlocked() {
		return !rightIsClear();
	}
}