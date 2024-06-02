package com.company;

/**
 * This class ball will change the direction of the ball and move it
 * @author vedaa
 *
 */
public class Ball {

	private int myRadius;
	private Point myPoint;
	private int mySpeed;
	private double myangleInRadians;
	private int myDeltaX;
	private int myDeltaY;
	
	public Ball(int radius, Point point, int speed, int direction) {
	
		myRadius = radius;
		myPoint = point;
		mySpeed = speed;
		//convert angle to radians
		myangleInRadians = Math.toRadians(direction);
		//get the change of position in x
		float floatDeltaX = mySpeed * (float) Math.cos(myangleInRadians);
		//get the change of position in y
		float floatDeltaY = - mySpeed * (float) Math.sin(myangleInRadians);
		myDeltaX = (int) floatDeltaX;
		myDeltaY = (int) floatDeltaY;
		System.out.println("myangleInRadians is " + myangleInRadians );
		System.out.println("The X and Y speeds are " + myDeltaX + "  ------  " + myDeltaX);
	}
	//this method will move the ball by delta and set new 
	//location of the Point
	public void move() {
		myPoint.setLocation(myPoint.getX() + myDeltaX, 
				myPoint.getY() + myDeltaY);		
	}
	//it will return the unchanging radius to us
	public int getRadius() {
		return myRadius;
	   
	}
	//it continuously tracks the position of the ball
	public Point getPoint() {
		return myPoint;
		
	}
	//change direction of x when the container is hit
	public void changeDirectionX() {
		myDeltaX = - myDeltaX;
		
	}
	//change direction of y when the container is hit
	public void changeDirectionY() {
		myDeltaY = - myDeltaY;
		
	}

}
