package com.javaex.basicapi.objectclass.clone;

public class Point {
	//	필드
	private int x;
	private int y;
	
	//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Point) {
			Point otherPoint = (Point)other;
			boolean result;
			result = this.x == otherPoint.x &&
					this.y == otherPoint.y;
			return result;
		} else {
			return super.equals(other);
		}
		
	}

	//	getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
