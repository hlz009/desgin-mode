package com.xiaozhi.designMode.abstractfactory;

public class GreenTriangleFactory implements IFactory {

	@Override
	public Shape createShape() {
		return new Triangle();
	}

	@Override
	public Color createColor() {
		return new Green();
	}
}
