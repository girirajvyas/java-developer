package io.girirajvyas.questions.pojo;

public class EmployeeId {

	private int kin;
	private String name;

	public EmployeeId(int kin, String name) {
		super();
		this.kin = kin;
		this.name = name;
	}

	public int getKin() {
		return kin;
	}

	public void setKin(int kin) {
		this.kin = kin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
