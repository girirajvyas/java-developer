package io.girirajvyas.cloning;
/**
 * Test class for 
 * @author giri
 *
 */
public class TestCloning {

	public static void main(String[] args) {
		// create a new Object of Employee
		Employee originalEmployee = new Employee(1, "Giri", 25, new Address("Pune", "India"));
		System.out.println("Original employee before cloning: " + originalEmployee.toString());
		try {
			Employee clonedEmployee = (Employee) originalEmployee.clone();
			//change city of cloned employee and it should not affect the original empoloyee's city
			//above issue occurs if we do shallow copy, to avoid this we have to do DEEP cloning
			//uncomment constructors in Employee class to understand both kind of behaviour
			clonedEmployee.getAddress().setCity("Nagpur");
			
			//now if Employee's clone method has shallow copy implementation, 
			//it will affect original Employee Object Instance as well
			System.out.println("Cloned Employee: " + clonedEmployee.toString());
			System.out.println("Original employee after cloning and modifying city in clone: " +originalEmployee.toString());
		} catch (CloneNotSupportedException e) {
			System.out.println("Add implements Cloneable to the class being cloned");
			e.printStackTrace();
			// we will be in this situation if you remove implements Cloneable
			// interface from Employee POJO
		}

	}
}
