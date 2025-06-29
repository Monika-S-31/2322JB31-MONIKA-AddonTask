package Day5;
import java.util.ArrayList;
public class Task1{

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("A");
		arr.add("Computer Science");
		arr.add("3 year");
		arr.add(0,"Hari");
		arr.set(0,"John");
		System.out.println(arr.get(1));
		//for (type iterator:existing variable)
		for(Object data:arr) {
			System.out.println(data);
		}
	}

}


