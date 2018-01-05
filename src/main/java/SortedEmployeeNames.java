import java.util.ArrayList;
import java.util.Collections;




public class SortedEmployeeNames {

	public static void main(String[] args) {
		
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name ("bob", "smith"));
		names.add(new Name("fred", "jones"));
		names.add(new Name ("alan", "kostrick"));
		names.add(new Name ("zach", "williams"));
		
		
		CompareLastThenFirst lastName = new CompareLastThenFirst();
		Collections.sort(names, lastName);
		
		
		System.out.println(names);
	}

}
