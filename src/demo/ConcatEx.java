package demo;

public class ConcatEx {
	public static void main(String[] args) {
		String str = "Sivaiah";
		System.out.println(str);
		str.concat("pathi");
		System.out.println(str);
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		str = str.concat(" Pathi");
		System.out.println(str);
	}

}
