package demo;

public class SplitEx {
	public static void main(String[] args) {
		String s ="Siva Is Learning Java Programming";
		String[] words = s.split("\\s");
		for(String w:words) {
			System.out.println(w);
		}
		
	}

}
