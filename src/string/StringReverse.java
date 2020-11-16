package string;

public class StringReverse {

	public static void main(String[] args) {
		String str = "madam";
		
		StringBuilder sb = new StringBuilder(str);
		
        String rev = String.valueOf(sb.reverse());
        
        if (str.equals(rev)) {
            System.out.println("YES");
        
        } else {
            System.out.println("NO");
        }
	}

}
