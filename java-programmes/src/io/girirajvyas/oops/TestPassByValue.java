package io.girirajvyas.oops;
/**
 * 
 * Output: 
 * <pre>
 * 	inside swap, value of a is : 2
 *	inside swap, value of b is : 1
 *	After swapping, value of a is : 1
 *	After swapping, value of b is : 2
 *	inside swapObject, value1 is : SwapMe [name=raj, id=2]
 *	inside swapObject, value2 is : SwapMe [name=Giri, id=1]
 *	After swapping, value1 is : SwapMe [name=Giri, id=1]
 *	After swapping, value2 is : SwapMe [name=properties can be changed anywhere, id=2]
 * </pre>
 * 
 * 
 * @author giri
 *
 */
public class TestPassByValue {

	public static void main(String[] args) {
		TestPassByValue testPassByValue = new TestPassByValue();

		// Primitives example
		int a = 1;
		int b = 2;
		testPassByValue.swap(a, b);
		// Now if you check here, no change happened.
		System.out.println("After swapping, value of a is : " + a);
		System.out.println("After swapping, value of b is : " + b);

		// Lets try with the objects now
		SwapMe value1 = new SwapMe("Giri", 1);
		SwapMe value2 = new SwapMe("raj", 2);
		testPassByValue.swapObject(value1, value2);
		System.out.println("After swapping, value1 is : " + value1);
		System.out.println("After swapping, value2 is : " + value2);
	}

	private void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
		// swapping is done here and it works till here.
		System.out.println("inside swap, value of a is : " + a);
		System.out.println("inside swap, value of b is : " + b);
	}

	private void swapObject(SwapMe value1, SwapMe value2) {
		SwapMe temp = value1;
		value1 = value2;
		value2 = temp;
		// swapping is done here and it works till here.
		System.out.println("inside swapObject, value1 is : " + value1);
		System.out.println("inside swapObject, value2 is : " + value2);

		// lets change the value of id and it will reflect
		// Currently value1 is pointing to value2, Hence value2 Object will be modified
		value1.setName("properties can be changed anywhere");
	}

}
