package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class HashSetExample {
	
	public static void main(String[] args) {
		try {
			CopyOnWriteArraySet<String> intSet = new CopyOnWriteArraySet<String>();
			intSet.add("9182125656");
			intSet.add("97038966559");
			intSet.add("9885864829");
			intSet.add("9010125646");
			intSet.add("901012564622");
			System.out.println(intSet);
			
			for(String s : intSet) {
				if(s.startsWith("97")) {
					System.out.println(s);
				}
			}

			for(String s : intSet) {
				if(s.contains("88")) {
					System.out.println(s);
				}
			}
			
			for(String s : intSet) {
				if(s.length() > 10) {
					System.out.println(s+"---> this is invalid mobile number");
					intSet.remove(s);
				}
			}
			System.out.println(intSet);
			
		} catch (Exception e) {
			System.out.println("catch block");
			// TODO: handle exception
		}finally {
			System.out.println("final block");
		}
	}

}
