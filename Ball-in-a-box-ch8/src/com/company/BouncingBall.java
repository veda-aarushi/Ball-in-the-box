package com.company;

import java.awt.*;


public class BouncingBall {

    public static void main(String[] args) {

        //Step 2) Create your own classes to make the following code display and print the coordinates of a bouncing ball
        Point p = new Point(50,125);// STARTING POSITION FOR BALL
        Ball b = new Ball(30, p, 10, 130); 
        // radius, a Point p, speed, direction (degrees)
        Point p1 = new Point(0,500);//UPPER LEFT POINT IN OUR BOX
        Point p2 = new Point (500,0);//LOWER RIGHT POINT IN OUR BOX
        Container box = new Container(p1,p2); // upper left and lower right corner points
        System.out.println("container is " + box.getWidth() +"/" +box.getHeight());
        
        DrawingPanel dp = new DrawingPanel(box.getWidth(), box.getHeight());
        dp.setBackground(Color.black);
        Graphics g = dp.getGraphics();
        //b.setXY(10,25);  // optional, just makes it easier to set both x and y
        while (true) {
            b.move();
            box.collidesWith(b);
            g.setColor(Color.cyan);
            g.fillOval(b.getPoint().getX(), b.getPoint().getY(), b.getRadius(),b.getRadius());
            //System.out.println(b); 	// prints "Ball at (x, y) of velocity (Δx, Δy)"
            try {
                Thread.sleep(100);
                g.setColor(Color.black);
                g.fillRect(b.getPoint().getX(), b.getPoint().getY(), b.getRadius(),b.getRadius());
                // wait 50ms to move at 20 frames/second
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
