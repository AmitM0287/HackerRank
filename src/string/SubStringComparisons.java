package string;

public class SubStringComparisons {

	public static void main(String[] args) {
		
		String str = "welcometojava";
		int k=3;
		
		java.util.TreeSet<String> set = new java.util.TreeSet<String>();
		
		for (int i=0; i<=str.length()-k; i++) {
			set.add(str.substring(i, i+k));
		}
		
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
	}

}
