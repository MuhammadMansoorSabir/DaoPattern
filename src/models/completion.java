package models;

public class completion extends baseModel {

	String status;
	public String toString() {
		return status;
		
	}
	public completion(int id,String status) {
		super(id);
		this.status=status;
		// TODO Auto-generated constructor stub
	}

}
