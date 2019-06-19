package com.xiaozhi.designMode.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	public static void main(String[] args) {
		Image realImage = new RealImage("xxx.jpg");
		Image proxyImage = (Image) new ProxyFactory(realImage).getProxyInstance();
		proxyImage.display();
		
		Audio realAudio = new RealAudio("xxx.mp3");
		Audio proxyAudio = (Audio) new ProxyFactory(realAudio).getProxyInstance();
		proxyAudio.play();
		proxyAudio.stop();
	}
}
