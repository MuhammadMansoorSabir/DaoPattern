package interfaces;
import java.util.List;

public interface Dao<T> {
	
	 List<T> getAll();
	 
	 void delete(int i);
	 
	 void insert(int t,T j);
	 
	 void update(T t);
}


