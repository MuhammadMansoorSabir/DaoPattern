package concreteClasses;

import java.util.List;

import interfaces.baseRepo;
import models.task;



public class taskDao extends baseRepo<task> {
	List<task> li;
	@Override
	public void update(task t) {
		t.setName(t.getName());
		System.out.println("updated task");
		
	}

}
