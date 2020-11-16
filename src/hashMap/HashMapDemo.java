package hashMap;

import java.util.HashMap;
import java.util.Map;
/**
 *	Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique.
 *	If you try to insert the duplicate key, it will replace the element of the corresponding key.
 *	It allows us to store the null elements as well, but there should be only one null key.
 *	It is denoted as HashMap<K,V>, where K stands for key and V for value.
 *	It inherits the AbstractMap class and implements the Map interface. 
 *
 *	Points to remember
 *		HashMap contains values based on the key.
 *		HashMap contains only unique keys.
 *		HashMap may have one null key and multiple null values.
 *		HashMap is non synchronized.
 *		HashMap maintains no order.
 *
 *	Map(I) <- AbstractMap(AC) <- HashMap(C)
 */
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Amit Manna");
		map.put(102, "Minu Manna");
		map.put(103, "Rohit Roy");
		map.put(104, "Arijit Roy");
		
		System.out.println(map.get(101));
		
		System.out.println(map.size());
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
	}

}
