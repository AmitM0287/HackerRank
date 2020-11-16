package treeSet;

import java.util.TreeSet;

class Student implements Comparable<Student>{
	int roll;
	String name, email, school;
	
	public Student (int roll, String name, String email, String school) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.school = school;
	}
	
	@Override
	public int compareTo(Student s) {
		return roll<s.roll?1:-1;
	}

}

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Student> set = new TreeSet<Student>();
		
		set.add(new Student(28, "Amit Manna", "amitmanna0287@gmail.com", "BGI"));
		set.add(new Student(7, "Mahasina Khatun", "mahasinakhatun0287@gmail.com", "BC"));
		set.add(new Student(1, "Rohit Roy", "rohitroy01@gmail.com", "TIG"));
		
		for (Student s : set) {
			System.out.println(s.roll + "  " + s.name + "  " + s.email + "  " + s.school);
		}
		
	}

}
