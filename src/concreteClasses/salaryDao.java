package concreteClasses;

import java.util.List;

import interfaces.baseRepo;
import models.salary;


public class salaryDao extends baseRepo<salary> {
	List<salary> li;
	@Override
	public void update(salary t) {
		t.setSalary(t.getSalary());
		System.out.println("updated salary of "+t.getEmployee().getName());
		
	}
}
