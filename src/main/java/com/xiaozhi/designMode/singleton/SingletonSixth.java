package com.xiaozhi.designMode.singleton;

/**
 * 枚举（线程安全）
 * 我查了很多文档，据说这个是最佳实现方式，不仅简洁，而且可以自动支持序列化机制，
 * 绝对防止多次实例化
 * @author xiaozhi009
 *
 */
public enum SingletonSixth {
	INSTANCE;
}
