package com.xiaozhi.designMode.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealAudio  extends AbstractFile implements Audio{

	private String fileName;
	
	public RealAudio(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void play() {
		log.info("play {}", fileName);
	}

	@Override
	public void stop() {
		log.info("stop {}", fileName);
	}
}
