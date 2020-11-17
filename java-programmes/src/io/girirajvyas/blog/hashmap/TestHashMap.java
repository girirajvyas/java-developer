package io.girirajvyas.blog.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		// case 1
		// defaultHashCodeEqualsImplTest();

		// case 2
		// overriddenHashCodeEqualsTest();

		// case 3
		// hashMapWithdefaultHashCodeEqualsKey();

		// case 4
		hashMapWithOverriddenHashCodeEquals();

		// case 5
		// checkImmutabilityIssue();
	}

	private static void checkImmutabilityIssue() {
		Map<OverriddenHashCodeEqualsImpl, String> map = new HashMap<>();
		OverriddenHashCodeEqualsImpl overriddenImpl = new OverriddenHashCodeEqualsImpl(1, "Raj");

		map.put(overriddenImpl, "overriddenImpl");
		System.out.println("value can be retrieved for overriddenImpl and value is: " + map.get(overriddenImpl));

		overriddenImpl.setId(51);

		// value cannot be retrieved as hashCode generated for above object i.e
		// with id 51 is different than that with the id 1
		System.out.println("value for overriddenImpl after changing id is: " + map.get(overriddenImpl));

		// hashCode will match here and then it will try to check for equality,
		// now we are passing id as 1 whereas the value of id is 51 in the key
		// object, Hence, o/p will be null
		System.out.println("value for overriddenImpl after changing id is: "
				+ map.get(new OverriddenHashCodeEqualsImpl(1, "Raj")));

	}

	private static void hashMapWithOverriddenHashCodeEquals() {
		Map<OverriddenHashCodeEqualsImpl, String> map = new HashMap<>();
		OverriddenHashCodeEqualsImpl overriddenImpl = new OverriddenHashCodeEqualsImpl(1, "Raj");
		OverriddenHashCodeEqualsImpl overriddenImpl2 = new OverriddenHashCodeEqualsImpl(1, "Raj");
		OverriddenHashCodeEqualsImpl overriddenImpl3 = new OverriddenHashCodeEqualsImpl(2, "Giri");

		// here first 2 objects are equal according to the equals and hashCode
		// implementation provided in the OverriddenHashCodeEqualsImpl
		map.put(overriddenImpl, "overriddenImpl");
		map.put(overriddenImpl2, "overriddenImpl2");
		map.put(overriddenImpl3, "overriddenImpl3");

		System.out.println("Size of map is: " + map.size());
		System.out.println(map.get(overriddenImpl));
		System.out.println(map.get(overriddenImpl2));
		System.out.println(map.get(overriddenImpl3));
		System.out.println();
	}

	private static void hashMapWithdefaultHashCodeEqualsKey() {
		Map<DefaultHashCodeEqualsImpl, String> map = new HashMap<>();
		DefaultHashCodeEqualsImpl defaultImpl = new DefaultHashCodeEqualsImpl(1, "Giri");
		DefaultHashCodeEqualsImpl defaultImpl2 = new DefaultHashCodeEqualsImpl(1, "Giri");

		map.put(defaultImpl, "defaultImpl");
		map.put(defaultImpl2, "defaultImpl2");

		// here above two objects will be considered as different as they have
		// different address in memory
		System.out.println("Size of map is: " + map.size());
		System.out.println();
	}

	/**
	 * This method is to check the default behavior of equals and hashCode.
	 * 
	 * Default hashCode: value is obtained by converting the internal address of
	 * the object into an integer <br/>
	 * 
	 * Default equals: Two objects X and Y are equal if and only if X and Y
	 * refer to the same object
	 * 
	 */
	private static void defaultHashCodeEqualsImplTest() {
		DefaultHashCodeEqualsImpl defaultImpl = new DefaultHashCodeEqualsImpl(1, "Giri");
		DefaultHashCodeEqualsImpl defaultImpl2 = new DefaultHashCodeEqualsImpl(1, "Giri");
		DefaultHashCodeEqualsImpl defaultImpl3 = defaultImpl;

		System.out.println("defaultHashCodeEqualsImplTest call started");
		System.out.println("HashCode of defaultImpl is: " + defaultImpl.hashCode());
		System.out.println("HashCode of defaultImpl2 is: " + defaultImpl2.hashCode());
		System.out.println("defaultImpl and defaultImpl2 are equal: " + defaultImpl.equals(defaultImpl2));
		System.out.println("defaultImpl and defaultImpl3 are equal: " + defaultImpl.equals(defaultImpl3));
		System.out.println();
	}

	/**
	 * This method is to check the behavior of overridden equals and hashCode.
	 * 
	 * overridden hashCode: value is obtained by multiplying a prime number with
	 * fields hashCode to generate unique number, Uniqueness helps in preventing
	 * hash collisions <br/>
	 * 
	 * overridden equals: Two objects X and Y are equal if and only if id and
	 * name of X is equal to id and name of Y
	 * 
	 */
	private static void overriddenHashCodeEqualsTest() {
		OverriddenHashCodeEqualsImpl overriddenImpl = new OverriddenHashCodeEqualsImpl(1, "Raj");
		OverriddenHashCodeEqualsImpl overriddenImpl2 = new OverriddenHashCodeEqualsImpl(1, "Raj");
		OverriddenHashCodeEqualsImpl overriddenImpl3 = new OverriddenHashCodeEqualsImpl(2, "Giri");

		System.out.println("overriddenHashCodeEqualsTest call started");
		System.out.println("HashCode of overriddenImpl is: " + overriddenImpl.hashCode());
		System.out.println("HashCode of overriddenImpl2 is: " + overriddenImpl2.hashCode());
		System.out.println("HashCode of overriddenImpl3 is: " + overriddenImpl3.hashCode());
		System.out.println("defaultImpl and defaultImpl2 are equal: " + overriddenImpl.equals(overriddenImpl2));
		System.out.println("defaultImpl and defaultImpl2 are equal: " + overriddenImpl.equals(overriddenImpl3));
		System.out.println();
	}
}
