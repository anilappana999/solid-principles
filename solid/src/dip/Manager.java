package dip;

public class Manager {

	Employee emp;
	
	public void setEmp(Employee employee) {
		this.emp = employee;
	}
	
	public void manage() {
		emp.work();
	}
}
