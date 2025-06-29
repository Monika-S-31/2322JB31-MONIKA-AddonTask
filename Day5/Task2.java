package Day5;
import java.util.HashSet;
public class Task2 {
	public static void main(String[] args) {
		HashSet<String> stuemail=new HashSet();
		stuemail.add("monika@gmail.com");
		stuemail.add("monika@gmail.com");
		for(String data:stuemail) {
			System.out.println(data);
		}
	}
}

