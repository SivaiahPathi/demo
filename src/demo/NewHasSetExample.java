package demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class NewHasSetExample {

	public static void main(String[] args) {
		try {
			HashSet<String> hs = new HashSet<String>();
			hs.add("ravi");
			hs.add("ragava");
			hs.add("revathi");
			hs.add("rekha");
			hs.add("ravi");
			System.out.println(hs);
			
			for( String s: hs) {
				System.out.println(s);
			}
			TreeSet<String> ts = new TreeSet<String>();
			ts.add("z ravi");
			ts.add("b ragava");
			ts.add("a revathi");
			ts.add("rekha");
			ts.add("ravi");
			
			ts.add("ravi");
			ts.add("ragava");
			ts.add("revathi");
			ts.add("rekha");
			ts.add("ravi");
		
			System.out.println(ts);
			for( String s: ts) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println("****************************************************************This is the Catch Block");
		}finally {
			System.out.println("this is the final block");
		}

	}

}
