package io.girirajvyas.cloning;

/**
 * Employee POJO containing his details along with reference to Address POJO
 * 
 * @author giri
 *
 */
public class Employee implements Cloneable {

	// Encapsulation: All fields private, getter & setter 
	private Integer id;
	private String name;
	private int age;
	private Address address;

	public Employee() {

	}

	public Employee(Integer id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Always override toString to get more meaningful detail of your object
	// when you invoke toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	/**
	 * Shallow cloning
	 * 
	 * In below case the default implementation of cloning passes the reference
	 * of memory location at which the Address object is residing. Hence, by
	 * changing the value of address in either original object or clone will
	 * result change in another and this will cause bug in our system.
	 * 
	 * Hence, to avoid such kind of situations Deep cloning is preferred for
	 * Complex Objects
	 */
	/*
	 * public Object clone() throws CloneNotSupportedException{ return
	 * super.clone(); }
	 */

	/**
	 * Deep cloning
	 */
	public Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		Address address = (Address) getAddress().clone();
		// you can use below code instead of using clone in above statement
		// Address address = new Address(getAddress().getCity(), getAddress().getCountry());
		employee.setAddress(address);
		return employee;
	}
}
