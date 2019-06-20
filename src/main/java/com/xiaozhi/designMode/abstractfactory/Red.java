package com.xiaozhi.designMode.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Red implements Color {

	@Override
	public void fill() {
		log.info("Inside Red:: fill() method");
	}
}
