package com.xiaozhi.designMode.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 委托类，具体处理业务
 * 实现代理业务
 * @author xiaozhi009
 *
 */
@Slf4j
public class RealImage extends AbstractFile implements Image {
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		log.info("display {}", fileName);
	}
}
