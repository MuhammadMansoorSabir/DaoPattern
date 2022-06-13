package models;

public class salary extends baseModel{

	double salary;
	employee employee;

	public salary(int id, double salary) {
		
		super(id);
		this.salary = salary;
		
	}
	
//	public String toString() {
//		return salary;
//	}

	public double getSalary() {
		
		return salary;
	}

	public void setSalary(double salary) {
		
		this.salary = salary;	
	}

	public employee getEmployee() {
		
		return employee;
	}

	public void setEmployee(employee employee) {
		
		this.employee = employee;
	}
	
}
