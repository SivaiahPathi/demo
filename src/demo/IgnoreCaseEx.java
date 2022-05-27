package demo;

public class IgnoreCaseEx {
	public static void main(String[] args) {
		String s1 = "Sivaiah";
		String s2 = "Sivaiah";
		String s3 = "SIVAIAH";
		String s4 = "Python";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
