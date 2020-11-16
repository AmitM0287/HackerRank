package treeSet;

import java.util.TreeSet;
/*
 * contains unique elements only.
 * access and retrieval times are quiet fast.
 * doesn't allow null element.
 * maintains ascending order.
 * non synchronized.
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();  
        set.add("A");  
        set.add("B"); 
        set.add("C");  
        set.add("D");
        set.add("E");  
        
//        By Default TreeSet Sort the elements in Ascending order
        System.out.println(set);
        
//        Reverse order
        System.out.println(set.descendingSet());
        
//        Subset
        System.out.println(set.subSet("A", "E"));
        System.out.println(set.subSet("A",true, "E",true));
        
//        HeadSet
        System.out.println(set.headSet("C"));
        System.out.println(set.headSet("C",true));
        
//        TailSet
        System.out.println(set.tailSet("C"));
        System.out.println(set.tailSet("C",false));
        
//        First Element
        System.out.println(set.first());
        
//        Last Element
        System.out.println(set.last());
	}

}
