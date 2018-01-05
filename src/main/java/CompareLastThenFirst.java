import java.util.Comparator;


public class CompareLastThenFirst implements Comparator<Name>{
		public int compare(Name one, Name another) {
			return one.getLastName().compareTo(another.getLastName());

			
}
}

		
