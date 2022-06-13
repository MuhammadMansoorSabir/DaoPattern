package concreteClasses;
//models.employee;
import java.util.List;

import interfaces.baseRepo;
import models.employee;

public  class employeeDao extends baseRepo<employee> {

	List<employee> li;
	public employeeDao(List<employee> li) {
		super();
		this.li = li;
	}
	@Override
	public void update(employee t) {
//		int i=t.getId()-1;
		t.setName(t.getName());
		System.out.println("updated");
		
	}

}
