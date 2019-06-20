package com.xiaozhi.designMode.factory;

public class Demo {
	public static void main(String[] args) {
		ShapeFactory rectangleFactory = new RectangleFactory();
		Shape shape1 = rectangleFactory.getShape();
		shape1.draw();
		
		ShapeFactory triangleFactory = new TriangleFactory();
		Shape shape2 = triangleFactory.getShape();
		shape2.draw();
	}
}
