package models;

import java.util.List;
import models.task;
public class employee extends baseModel {
		
		String name;
		List<task> task;
		salary salary;
		branch branchName;
		
		
		public String toString() {
			return "id "+id+" "+"name :"+name+" "+"tasks"+" " +task +" "+"salary :"+" " +salary.getSalary()+" "+branchName;
		}
		
		public employee(int id,String name, List<task> task,salary salary,branch branchName) {
			super(id);
			this.name = name;
			this.task = task;
			this.salary=salary;
			this.branchName=branchName;
		}
		public salary getSalary() {
			return salary;
		}

		public void setSalary(salary salary) {
			this.salary = salary;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<task> getTask() {
			return task;
		}
		public void setTask(List<task> task) {
			this.task = task;
		}	
		public int getId() {
			return id;
		}
}
