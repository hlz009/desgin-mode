package com.xiaozhi.designMode.abstractfactory;

/**
 * 红色矩形工厂 具体实现类
 * @author xiaozhi009
 *
 */
public class RedRectangleFactory implements IFactory {

	@Override
	public Shape createShape() {
		return new Rectangle();
	}

	@Override
	public Color createColor() {
		return new Red();
	}
	
}
