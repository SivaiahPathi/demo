package demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TreeMap<String, String> hm = new TreeMap<String, String>();
			hm.put("Venkat B", "9703896655");
			hm.put("Siva P", "9182125656");
			hm.put("Priya B", "9100832025");
			
			System.out.println(hm);
			
			for(Entry<String, String>  entry: hm.entrySet()) {
				System.out.println("Name::"+entry.getKey()+"----->"+"Phone Number::"+entry.getValue());
			}
			
			System.out.println(hm.get("Priya B"));
			
			for(Entry<String, String> entry : hm.entrySet()) {
				if(entry.getValue() == "9703896655") {
					System.out.println("Person name who has 9703896655 as phone number is --->"+entry.getKey());
					hm.remove(entry.getKey());
				}
			}
			System.out.println(hm);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("*********************************************catch block");
		}finally {
			System.err.println("final block");
		}

	}

}
