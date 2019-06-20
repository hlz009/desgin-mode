package com.xiaozhi.designMode.simplefactory;

public class Demo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("TRIANGLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
	}
}
