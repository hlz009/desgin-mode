package com.xiaozhi.designMode.abstractfactory;

public class Demo {
	/**
	 * 实际应用中，‘红色’和‘矩形’作为两类产品，应该具有某种共性，
	 * 所以叫做产品族
	 * @param args
	 */
	public static void main(String[] args) {
		// 红色矩形工厂
		IFactory redRectangleFactory = new RedRectangleFactory();
		// 生产矩形
		Shape rectangle = redRectangleFactory.createShape();
		rectangle.draw();
		// 生产红色
		Color red = redRectangleFactory.createColor();
		red.fill();

		// 绿色三角形工厂
		IFactory greenTriangleFactory = new GreenTriangleFactory();
		// 生产三角形
		Shape triangle = greenTriangleFactory.createShape();
		triangle.draw();
		// 生产绿色
		Color green = greenTriangleFactory.createColor();
		green.fill();
	}
}
