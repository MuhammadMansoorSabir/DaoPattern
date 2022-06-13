package models;

public class task extends baseModel {
		String name;
		String type;
		completion status;
		
		public String toString() {
			return "Taskname :"+" " +name+ " "+"Type :"+" "+ type+" "+"status :"+" "+status;
		}
		
		public task(int id,String name, String type,completion status) {
			super(id);
			this.name = name;
			this.type = type;
			this.status=status;
		}
		public completion getStatus() {
			return status;
		}

		public void setStatus(completion status) {
			this.status = status;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getId() {
			return id;
		}
		
}
