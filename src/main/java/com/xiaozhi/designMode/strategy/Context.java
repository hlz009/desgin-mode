package com.xiaozhi.designMode.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Context {
	private Strategy strategy;

	public int executeStragtegy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
