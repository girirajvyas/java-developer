package io.girirajvyas.multithreading.threads;

public class GoToGood extends Thread {
	
	public static void main(String[] args) {
		try {
			new GoToGood().makeItSo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public GoToGood() {
		System.out.println("Test");
		x = 5;
		start();
	}

	private int x = 2;

	public void makeItSo() throws Exception {
		join();
		x = x - 1;
		System.out.println(x);
	}
	
	public void run (){
		System.out.println("run");
		x *= 2;
	}

}
