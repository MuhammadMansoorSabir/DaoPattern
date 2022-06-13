package models;

public class branch extends baseModel{

	String branchName;
	public branch(int id,String branchName) {
		super(id);
		this.branchName=branchName;
		// TODO Auto-generated constructor stub
	}
	 public String toString() {
		return branchName;
	}
}
