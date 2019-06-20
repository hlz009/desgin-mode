package com.xiaozhi.designMode.singleton;

/**
 * 双检索（线程非安全）
 * 采用了双锁机制，在并发不高的情况下，可以使用。
 * 如果是并发很高，此时线程非安全的，使用instance可能会抛出NullpointerException
 * 原因就出在 new SingletonFourth()上。
 * @author xiaozhi009
 *
 */
public class SingletonFourth {
	private volatile static SingletonFourth instance;
	private SingletonFourth() {}
	
	public static SingletonFourth getInstance() {
		if (instance == null) {
			synchronized (SingletonFourth.class) {
				if (instance == null) {
					instance = new SingletonFourth();
				}
			}
		}
		return instance;
	}
	
}
