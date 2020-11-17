package io.girirajvyas.designpatterns.creational.singleton;

/**
 * 1. Declare instance variable <br/>
 * 2. private constructor <br/>
 * 3. static getInstance method, name can be anything
 * 
 * @author giri
 *
 */
public class SingletonDemo {

	// Eager initialization
	// private static SingletonDemo singletonDemo = new SingletonDemo();

	// Lazy initialization
	private static SingletonDemo singletonDemo;

	/**
	 * prevent initialization with private constructor
	 */
	private SingletonDemo() {

	}

	/**
	 * Not good solution as it will not let multiple threads access the
	 * getInstance method simultaneously
	 * 
	 * @return
	 */
	public synchronized static SingletonDemo getInstance() {
		if (singletonDemo == null) {
			singletonDemo = new SingletonDemo();
		}
		return singletonDemo;
	}

	/**
	 * Optimized solution
	 * 
	 * @return
	 */
	public static SingletonDemo getInstance2() {
		/**
		 * Check synchronization only if the instance is null. There will be a
		 * little impact in performance only for the first time.
		 */
		if (singletonDemo == null) {
			synchronized (SingletonDemo.class) {
				if (singletonDemo == null) {
					singletonDemo = new SingletonDemo();
				}
			}
		}

		return singletonDemo;
	}

	/**
	 * Bill pugh implementation
	 * 
	 * @return
	 */
	public static SingletonDemo getInstance3() {
		return InnerStaticClass.INSTANCE;
	}

	private static class InnerStaticClass {
		public static final SingletonDemo INSTANCE = new SingletonDemo();
	}

	protected Object readResolve() {
		return singletonDemo;
	}
}
