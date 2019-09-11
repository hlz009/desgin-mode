package com.xiaozhi.designMode.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context contextAdd = new Context(new OperationAdd());
		log.info("10 + 5 = {}", contextAdd.executeStragtegy(10, 5));

		Context contextSubstract = new Context(new OperationSubstract());
		log.info("10 - 5 = {}", contextSubstract.executeStragtegy(10, 5));
		
		// or else
		Context context = new Context();
		context.setStrategy(new OperationAdd());
		log.info("10 + 5 = {}", context.executeStragtegy(10, 5));
		context.setStrategy(new OperationSubstract());
		log.info("10 - 5 = {}", context.executeStragtegy(10, 5));
	}
}
