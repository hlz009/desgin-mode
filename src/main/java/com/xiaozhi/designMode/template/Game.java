package com.xiaozhi.designMode.template;

public abstract class Game {
	abstract void initialize();
	abstract void start();
	abstract void end();
	
	// 抽出通用的作为 模板
	public final void play() {
		initialize();
		start();
		end();
	}
}
