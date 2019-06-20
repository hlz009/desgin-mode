package com.xiaozhi.designMode.abstractfactory;

/**
 * 抽象工厂
 * 这里分为抽离了  shape和color两大产品工厂
 * @author xiaozhi009
 *
 */
public interface IFactory {
	/**
	 * 创建形状
	 * @return
	 */
	Shape createShape();

	/**
	 * 创建颜色
	 * @return
	 */
	Color createColor();
}
