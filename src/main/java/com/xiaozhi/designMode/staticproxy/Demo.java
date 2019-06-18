package com.xiaozhi.designMode.staticproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	public static void main(String[] args) {
		Image image = new ProxyImage("xxx.jpg");
		image.display();
	}
}
