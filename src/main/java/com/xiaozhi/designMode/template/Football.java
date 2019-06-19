package com.xiaozhi.designMode.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Football extends Game {

	@Override
	void initialize() {
		log.info("Football Game Initialized! Start playing");
	}

	@Override
	void start() {
		log.info("Football Game Started! Start playing");
	}

	@Override
	void end() {
		log.info("Football Game Finished!");
	}

}
