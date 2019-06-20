package com.xiaozhi.designMode.singleton;

/**
 * 饿汉式（线程安全）
 * 类在加载时就进行了初始化，便保证了线程安全，但浪费内存，没有达到lazy加载
 * @author xiaozhi009
 *
 */
public class SingletonThird {
	private static SingletonThird instance = new SingletonThird();
	private SingletonThird() {}
	
	public static SingletonThird getInstance() {
		return instance;
	}
	
}
