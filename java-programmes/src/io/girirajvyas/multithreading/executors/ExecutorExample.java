package io.girirajvyas.multithreading.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {

	public static void main(String[] args) {
		try {
			oddEvenInDifferentThreads(5);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	private static void oddEvenInDifferentThreads(int num) throws InterruptedException, ExecutionException {
		Callable<Integer> callableTask1 = () -> {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
				}
			}
			return sum;
		};

		Callable<Integer> callableTask2 = () -> {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					sum = sum + i;
				}
			}
			return sum;
		};

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> future1 = executorService.submit(callableTask1);
		Future<Integer> future2 = executorService.submit(callableTask2);
		System.out.println("value from callableTask1 is:" + future1.get());
		System.out.println("value from callableTask1 is:" + future2.get());
		executorService.shutdown();
	}

}
