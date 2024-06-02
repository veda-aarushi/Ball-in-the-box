package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        setLocation(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int f, int g) {
        this.x = f;
        this.y = g;
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    public String toString() {
        return "{" + x + "," + y + "}";
    }

    /**
     * Repositions the current Point to the newX position
     */
	public void setX(int newX) {
		this.x = newX;
		
	}
	
	/**
	 * Repositions the current Point to the newY position
	 */
	public void setY(int newY) {
		this.y = newY;
		
	}
}
