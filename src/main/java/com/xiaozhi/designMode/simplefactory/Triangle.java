package com.xiaozhi.designMode.simplefactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle implements Shape {

	@Override
	public void draw() {
		log.info("Inside Triangle:: draw() method");	
	}
}
