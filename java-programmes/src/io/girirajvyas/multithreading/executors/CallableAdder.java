package io.girirajvyas.multithreading.executors;

import java.util.concurrent.Callable;

/**
 * A Simple Callable implementation to add two values that are provided while
 * initializing the Callable
 * 
 */
public class CallableAdder implements Callable<Integer> {

	Integer operand1;
	Integer operand2;

	public CallableAdder(Integer operand1, Integer operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("Running Thread is " + Thread.currentThread().getName() + " and sum for addition of "
				+ operand1 + " and " + operand2 + " is: " + (operand1 + operand2));
		return operand1 + operand2;
	}

}
