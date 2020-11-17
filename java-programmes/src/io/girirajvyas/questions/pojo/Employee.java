package io.girirajvyas.questions.pojo;

public class Employee {
	
	private EmployeeId empId;
	
	public Employee(){
		
	}
			
	public Employee(EmployeeId id){
		this.empId = id;
	}
	
	public EmployeeId getEmpId() {
		return empId;
	}

	public void setEmpId(EmployeeId empId) {
		this.empId = empId;
	}
	
}
