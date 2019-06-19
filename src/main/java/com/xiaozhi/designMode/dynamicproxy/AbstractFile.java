package com.xiaozhi.designMode.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractFile {

	void loadFromDisk(String fileName) {
		log.info("loading {}", fileName);
	}
}
