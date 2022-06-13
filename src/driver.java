import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import concreteClasses.employeeDao;
import concreteClasses.salaryDao;
import concreteClasses.taskDao;
import interfaces.Dao;
import models.branch;
import models.completion;
import models.employee;
import models.salary;
import models.task;

public class driver {

	public static void main(String[] args) {

//		employee e1=new employee();
		List<employee> li=new ArrayList<employee>();
		List<task> ts=new ArrayList<task>();
		List<task> te1=new ArrayList<task>();
		List<task> te2=new ArrayList<task>();
		List<task> te3=new ArrayList<task>();
		Dao<task> td=new taskDao();
		Dao<salary> sd=new salaryDao();
		salary s1=new salary(1, 2000000);
		salary s2=new salary(2, 3000000);
		salary s3=new salary(3, 205500);
		branch b=new branch(1,"HBL");
		completion c1=new completion(1,"not completed");
		task t1=new task(1,"deployment","severe",c1);
		task t2=new task(2,"testing","severe",c1);
		task t3=new task(2,"coding","severe",c1);
		employee e1= new employee(1,"mansoor",te1,s1,b);
		employee e2= new employee(2,"ali",te2,s2,b);
		employee e3= new employee(3,"asasi",te3,s3,b);
		employee e4= new employee(4,"abdullah",te3,s3,b);
		li.add(e1);
		li.add(e2);
		li.add(e3);
		te1.add(t1);
		te2.add(t2);
		te3.add(t3);
		Dao<employee> d=new employeeDao(li);
		
		for(employee s:li) {             //printing list before
			System.out.println(s);
		}
		
		
//		for(task s:te1) {
//			System.out.println(s);    //printing task for each employee.
//		}   
		
//		t1.setName("farooq");
//		td.update(t1);          //updating tasks.
		
//		e1.setName("ali muhammad");   //updating employees.
//		d.update(e1);
		
//		s1.setEmployee(e1);
//		s1.setSalary(456333);       //updating salary.
//		sd.update(s1);
		
//		d.insert(0, e4);    
		d.getAll();
		
		for(employee s:li) {
			System.out.println(s);          //printing list after
		}

	}

}
