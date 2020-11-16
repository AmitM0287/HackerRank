package sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;
/**
 * 	Iterable(I) <- Collection(I) <- Set(I) <- SortedSet(I) <- TreeSet(C)
 */
public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<>();
		
		set.add("Amit Manna");
		set.add("Minu Manna");
		set.add("Rohit Roy");
		set.add("Arijit Mondal");
		
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
	}
}