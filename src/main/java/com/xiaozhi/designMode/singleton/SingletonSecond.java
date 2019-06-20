package com.xiaozhi.designMode.singleton;

/**
 * 懒汉式（线程安全）
 * 除非你确定加了synchronized 对程序的性能影响不是很关键，便可使用
 * @author xiaozhi009
 *
 */
public class SingletonSecond {
	private static SingletonSecond instance;
	private SingletonSecond() {}
	
	public static synchronized SingletonSecond getInstance() {
		if (instance == null) {
			instance = new SingletonSecond();
		}
		return instance;
	}
	
}
