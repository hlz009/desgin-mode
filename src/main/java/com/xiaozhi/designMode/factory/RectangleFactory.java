package com.xiaozhi.designMode.factory;

public class RectangleFactory implements ShapeFactory {

	@Override
	public Shape getShape() {
		return new Rectangle();
	}
}
