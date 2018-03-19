package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 10, 100, 50);
		r.draw();
		
		Circle c = new Circle(30, 30, 10);
		c.draw();

		Point p = new Point(10, 10);
		p.draw();
		
		Drawable[] objs = new Drawable[3];
		
		objs[0] = r;
		objs[1] = c;
		objs[2] = p;
		
		for (Drawable obj:objs) {
			obj.draw();
			
//			if (obj instanceof Rectangle) {
//				System.out.println("면적:" 
//						+ ((Rectangle)obj).area());
//			} else if (obj instanceof Circle) {
//				System.out.println("면적:"
//						+ ((Circle)obj).area());
//			}
			if (obj instanceof Shape) {
				System.out.println("면적:" + ((Shape)obj).area());
			}
		}
	}

}
