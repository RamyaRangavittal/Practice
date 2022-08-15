package practice;

public class StringPractice {

	public static void main(String[] args) {
		String s="Welcome";
		String s1="To Java";
		System.out.println(s.equalsIgnoreCase("welcome")); //This ignoring case
		System.out.println(s.concat(s1));
		System.out.println(s.length());
		System.out.println(s.substring(1,3));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

	}

}
