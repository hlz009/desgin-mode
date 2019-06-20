package com.xiaozhi.designMode.factory;

public class TriangleFactory implements ShapeFactory {

	@Override
	public Shape getShape() {
		return new Triangle();
	}
}
