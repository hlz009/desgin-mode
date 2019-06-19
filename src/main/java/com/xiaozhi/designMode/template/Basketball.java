package com.xiaozhi.designMode.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Basketball extends Game {

	@Override
	void initialize() {
		log.info("Basketball Game Initialized! Start playing");
	}

	@Override
	void start() {
		log.info("Basketball Game Started! Start playing");
	}

	@Override
	void end() {
		log.info("Basketball Game Finished!");
	}

}
