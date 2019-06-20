package com.xiaozhi.designMode.singleton;

/**
 * 懒汉式（线程安全）
 * 可以做到lazy加载，
 * 除非你确定你的代码在并发很小的情况下使用，否则不建议用。
 * @author xiaozhi009
 *
 */
public class SingletonFirst {
	private static SingletonFirst instance;
	private SingletonFirst() {}
	
	public static SingletonFirst getInstance() {
		if (instance == null) {
			instance = new SingletonFirst();
		}
		return instance;
	}
	
}
