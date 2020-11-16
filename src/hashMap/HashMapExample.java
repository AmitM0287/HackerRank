package hashMap;

import java.util.HashMap;
import java.util.Map;

class Vendor {
	int id;
	String name, email, city, state;
	
	Vendor (int id, String name, String email, String city, String state) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", state=" + state + "]";
	}
	
}

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, Vendor> map = new HashMap<>();
		
		map.put(1, new Vendor(101, "Rohit Roy", "rohitroy@gmail.com", "Mumbai", "Maharastra"));
		map.put(2, new Vendor(102, "Arijit Mondal", "arijitmondal@gmail.com", "Kolkata", "West Bengal"));
		map.put(3, new Vendor(103, "Somnath Dey", "somnathdey@gmail.com", "Howrah", "West Bengal"));
		map.put(4, new Vendor(104, "Arpita Roy", "arpitaroy@gmail.com", "Barasat", "West Bengall"));
		map.put(5, new Vendor(105, "Rajkumar Mondal", "rmondal@gmail.com", "Kolkata", "West Bengal"));
		
		System.out.println(map.get(1));
		System.out.println(map.get(5));
		
		for (Map.Entry<Integer, Vendor> m : map.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		
		System.out.println(map.size());
		
	}

}
