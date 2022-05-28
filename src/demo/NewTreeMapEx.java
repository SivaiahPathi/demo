package demo;

import java.util.Map.Entry;
import java.util.TreeMap;

public class NewTreeMapEx {
	public static void main(String[] args) {
		try {
			TreeMap<String, String> tm = new TreeMap<String, String>();
			tm.put("Renigunta", "final stop");
			tm.put("kadapa", "first starting point");
			tm.put("Rly Kodur", "No stopping point");
			tm.put("Obulavari Palli", "No stopping point");
			tm.put("Rajampet", "second stop");
			tm.put("Rly Kodur", "Third stoping point");
			System.out.println(tm);
			for (Entry<String, String> entry : tm.entrySet() ) {
				System.out.println(entry);
			}
			tm.remove("Obulavari Palli");
			System.out.println("after removing obvp::"+tm);
		} catch (Exception e) {
			System.out.println("*****************************************this is the Catch Block");
		}finally {
			System.out.println("this is the final block");
		}
	}

}
