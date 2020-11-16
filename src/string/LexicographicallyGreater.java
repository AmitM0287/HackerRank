package string;

public class LexicographicallyGreater {

	public static void main(String[] args) {
		String A = "hello";
		String B = "java";

		System.out.println(A.length() + B.length());

		System.out.println(A.compareTo(B) > 0 ? "YES" : "NO");

		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " "
				+ B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));
	}

}
