package com.company;

/**
 * 
 * @author vedaa
 *
 */
public class Container {
	private Point myUpperLeftPoint;
	private Point myLowerRightPoint;
	
	public Container (Point p1, Point p2) {
		myUpperLeftPoint = p1;
		myLowerRightPoint = p2;		
	}

	/*
	 * Calculate the new position of the ball collides with the container
	 * boundary and change the direction of the ball based on the collision.
	 */
	public void collidesWith(Ball ball) {
		//To find the boundaries of the container to change the direction of the ball
		// when it collides with it
		int ballMinx = myUpperLeftPoint.getX();
		int ballMiny = myLowerRightPoint.getY();
		int ballMaxx = myLowerRightPoint.getX() - ball.getRadius();
		int ballMaxy = myUpperLeftPoint.getY() - ball.getRadius();
	
		//this calculates if the ball is touching the boundary
		if (ball.getPoint().getX() < ballMinx ) {
			ball.changeDirectionX();
			// Set the Position of the ball to the minimum position of x within the container.
			ball.getPoint().setX(ballMinx);
		}
		else if (ball.getPoint().getX() > ballMaxx ) {
			ball.changeDirectionX();
			// Set the Position of the ball to the maximum position of x within the container.
			ball.getPoint().setX(ballMaxx);
				
		}
		if (ball.getPoint().getY() < ballMiny ) {
			ball.changeDirectionY();
			// Set the Position of the ball to the minimum position of y within the container.
			ball.getPoint().setY(ballMiny);
		}
		else if (ball.getPoint().getY() > ballMaxy ) {
			ball.changeDirectionY();
			// Set the Position of the ball to the maximum position of y within the container.
			ball.getPoint().setY(ballMaxy);
				
		}
			
	}
		
	

	public int getWidth() {
		//it will subtract the minimum of x from maximum of x to get the width of the 
		//drawing panel
		return Math.abs(myUpperLeftPoint.getX() - myLowerRightPoint.getX());
	}

	public int getHeight() {
		//it will subtract the maximum of y from minimum of y to get the height of the 
		//drawing panel
		return Math.abs(myUpperLeftPoint.getY() - myLowerRightPoint.getY());
	}

}
