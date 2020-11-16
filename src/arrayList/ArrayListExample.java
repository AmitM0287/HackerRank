package arrayList;

import java.util.ArrayList;
import java.util.Collections;

class Vendor implements Comparable<Vendor> {
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

	@Override
	public int compareTo(Vendor v) {
		if (name.compareTo(v.name) > 0) {
			return 1;
		} else {
			return -1;
		}
	}
	
}

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Vendor> list = new ArrayList<Vendor>();
		
		list.add(new Vendor(101, "Rohit Roy", "rohitroy@gmail.com", "Mumbai", "Maharastra"));
		list.add(new Vendor(102, "Arijit Mondal", "arijitmondal@gmail.com", "Kolkata", "West Bengal"));
		list.add(new Vendor(103, "Somnath Dey", "somnathdey@gmail.com", "Howrah", "West Bengal"));
		list.add(new Vendor(104, "Arpita Roy", "arpitaroy@gmail.com", "Barasat", "West Bengall"));
		list.add(new Vendor(105, "Rajkumar Mondal", "rmondal@gmail.com", "Kolkata", "West Bengal"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
		System.out.println(list.size());
		Collections.sort(list);
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
