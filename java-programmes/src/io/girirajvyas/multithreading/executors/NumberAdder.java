package io.girirajvyas.multithreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Number adder class
 * 
 * 
 * @author giri
 *
 */
public class NumberAdder {

	private int start;
	private int end;

	/**
	 * As we want to compare the sequential and parallel execution as well , we
	 * will take parameters in constructor to avoid redundancy
	 * 
	 * @param start
	 * @param end
	 */
	public NumberAdder(Integer start, Integer end) {
		this.start = start;
		this.end = end;
	}

	public int sequentialAdder() {
		Long startTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		Long completionTime = System.currentTimeMillis();
		System.out.println("Sequentially added all numbers between " + start + " and " + end + "\nresult is : " + sum);
		System.out.println("Time take for execution in milliseconds: " + (completionTime - startTime));
		return sum;
	}

	/**
	 * Step 1: Have some grouping Logic we will add adjacent numbers and then
	 * sum results.
	 * 
	 * <pre>
	 *  eg. (1,2)(3,4)(5,6)...
	 *        3 + 7 + 11 + ..
	 *         final sum
	 * </pre>
	 * 
	 * Note: you can have any grouping logic so as to process data parallely
	 * 
	 * Step 2: Create Threads and submit the two numbers and sum the result of
	 * each Thread execution We will use Executor Framework, Callable and
	 * Futures for this task
	 * 
	 * @return
	 */
	public int parallelAdder() {
		// group and submit to different threads
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		// newFixedThreadPool.submit // This takes Runnable and Callable
		// newFixedThreadPool.execute // it only takes Runnable as input

		for (int i = start; i <= end; i++) {
			
			Future<Integer> future = newFixedThreadPool.submit(new CallableAdder(i, i < end ? i : end));

		}

		return 0;
	}

}
