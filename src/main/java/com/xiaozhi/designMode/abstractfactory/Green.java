package com.xiaozhi.designMode.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Green implements Color {

	@Override
	public void fill() {
		log.info("Inside Green:: fill() method");
	}
}
