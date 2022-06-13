package interfaces;



import java.util.List;

public abstract class baseRepo<T> implements Dao<T> {
	
	List<T> li;
	

	 public List<T> getAll(){
		 return li;
		 
	 }
	 
	 public void delete(int i) {
		 System.out.println("here");
		 	li.remove(i);
	 }
	 
	 
	 
	 public void insert(int t,T j) {
		 li.add(t,j);
	 }
	 public abstract void update(T t);
}


