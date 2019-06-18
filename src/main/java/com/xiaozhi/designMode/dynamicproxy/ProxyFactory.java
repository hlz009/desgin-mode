package com.xiaozhi.designMode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 动态代理对象，无需实现任何接口
 * 通过传入任何类型的目标对象并指定接口
 * 调用JDK接口动态创建代理对象
 * @author xiaozhi009
 *
 */
@Slf4j
public class ProxyFactory {
	private Object targetObject;
	
	public ProxyFactory(Object targetObject) {
		this.targetObject = targetObject;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),// 和目标对象的类加载器保持一致
				targetObject.getClass().getInterfaces(), // 目标对象实现的接口，因为需要根据接口动态生成对象
				new InvocationHandler() { // InvocationHandler:事件处理器，即对目标对象方法的执行
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				log.info("前拦截...");
				Object result = method.invoke(targetObject, args);
				log.info("后拦截...");
				return result;
			}
		});
	}
}
