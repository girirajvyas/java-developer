package io.girirajvyas.questions.pojo;
/**
 * Company ABC corporation limited with 1 Lakh employees <br/>
 * 
 * 
 * 
 * @author giri
 *
 */
public class EmployeeLoginSystem {

	static {
		System.out.println("Day On");
	}
	
	//final int empLoginCounter=0; //Original in question
	static int empLoginCounter=0;
	int empId;
	String empFrstName;
	String empLstName;
	String loginGate = "Default gate for all employees";
	
	public EmployeeLoginSystem(int empId, String empFrstName, String empLstName) {
		super();
		this.empId = empId;
		this.empFrstName = empFrstName;
		this.empLstName = empLstName;
	}
	
	public void increment(){
		empLoginCounter++;
		System.out.println("Employee LOgin counter" + empLoginCounter);
	}
	
}
