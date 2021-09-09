package com.douzone.paint.main;

import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rectangle;
import com.douzone.paint.shape.Shape;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(10,10);
		
		//point1.setX(10);
		//point1.setY(10);
		
		draw(point1);
		point1.show(false);
		
		Point point2 = new ColorPoint(100,200,"red");
		
		/*
		point2.setX(100);
		point2.setY(200);
		((ColorPoint)point2).setColor("red");
		*/
		
		draw(point2);
		
		point2.show(false);
		point2.show(true);
		
		Triangle triangle = new Triangle();
		draw(triangle);
		
		Rectangle rect = new Rectangle();
		draw(rect);
		
		Circle circle = new Circle();
		draw(circle);
		
		GraphicText text = new GraphicText("Hello world");
		draw(text);
		
		//instanceof test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 오류 : class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다.
		// interface는 hierachy와 상관없잉 instanceof 연산자를 사용할 수 있다.
		//System.out.println(circle instanceof Rectangle);
		
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	
	/*
	public static void drawPoint(Point point) {
		point.show();
	}
	
	public static void drawColorPoint(Point colorPoint) {
		colorPoint.show();
	}
	
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	
	 public static void drawTriangle(Triangle triangle) {
		triangle.draw();
	}
	
	public static void drawRectangle(Rectangle rectangle) {
		rectangle.draw();
	}
	
	public static void drawCircle(Circle circle) {
		circle.draw();
	}
	 */

}
