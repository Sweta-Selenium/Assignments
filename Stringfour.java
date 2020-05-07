package stringAssignment;

public class Stringfour {

	public static void main(String[] args) {
    String a = "java";
	String b = "java";
	String c = "java1";
    String d = "JAVA";
	System.out.println(a == c);
	System.out.println(a == b);
	String e = new String("abc");
	String f = new String("abc");
	System.out.println(f == e);
	System.out.println("cequals(d) " + e.equals(f));
	System.out.println(a.equalsIgnoreCase(d));

	}

}
