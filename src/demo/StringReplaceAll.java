package demo;

public class StringReplaceAll {
	public static void main(String[] args) {
		try {
			String s1="javatpoint is a very good website"; 
			System.out.println(s1);
			try {
				System.out.println(s1.charAt(90));
				
			}catch(Exception e) {
				throw new StringIndexOutOfBoundsException("Invalid input");
			}
			String replaceString=s1.replaceAll("a","e");//replaces all occurrences of " a" to "e"  
			System.out.println(replaceString);  
			String str = "Hi venkat";  
		    String rs = str.replace("Hi venkat","Hi siva"); // Replace 'h' with 's'  
		    System.out.println(rs);  
		    rs = rs.replace("s","h"); // Replace 's' with 'h'  
		    System.out.println(rs); 

		}catch(Exception e) {
			System.out.println("Some thing is fishy.. please check your code..");
		} finally {
			System.out.println("You must execute the program...");
		}
	}

}
