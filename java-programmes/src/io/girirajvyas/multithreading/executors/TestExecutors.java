package io.girirajvyas.multithreading.executors;

public class TestExecutors {

	public static void main(String[] args) {
		NumberAdder numberAdder = new NumberAdder(1, 111115);
		numberAdder.sequentialAdder();
		numberAdder.parallelAdder();
	}

}
