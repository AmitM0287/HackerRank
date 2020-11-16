package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *	ArrayList class uses a dynamic array for storing the elements. 
 *	It is like an array, but there is no size limit.
 *
 *	The important points about Java ArrayList class are:
 *		Java ArrayList class can contain duplicate elements.
 *		Java ArrayList class maintains the insertion order internally.
 *		Java ArrayList class is non synchronized.
 *  	Java ArrayList allows random access because array works at the index basis.
 *  	In ArrayList, manipulation is little bit slower than the LinkedList in Java
 *  	because a lot of shifting needs to occur if any element is removed from the array list.
 *  
 *  Iterable(I) <- Collection(I) <- List(I) <- AbstractList(AC) <- ArrayList(C)
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
//		  Index started from 0
		list.add("Mango");
		list.add("Banna");
		list.add("Orange");
		list.add("Apple");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.size());
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(0));
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
	}

}
