package string;

import java.util.SortedSet;
import java.util.TreeSet;
/*
 *A set is used to provide a particular ordering on its element.
 * The elements are ordered either by using a natural ordering or by using a Comparator.
 *  All the elements which are inserted into a sorted set must implement the Comparable interface.
 */
public class AlphabeticalOrder {

	public static void main(String[] args) {
		String str = "welcometojava";
		int k = 3;
		
		SortedSet<String> sets=new TreeSet<String>();
		
	    for(int i=0; i<=str.length()-k; i++){
	        sets.add(str.substring(i,i+k));
	    }
	    
		System.out.println(sets);
		System.out.println(sets.first());
		System.out.println(sets.last());
	}
}
