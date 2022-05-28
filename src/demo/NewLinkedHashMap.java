package demo;

import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NewLinkedHashMap {

	public static void main(String[] args) {
		try {
			LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
			lhm.put("Renigunta", "final stop");
			lhm.put("kadapa", "first starting point");
			lhm.put("Rly Kodur", "No stopping point");
			lhm.put("Obulavari Palli", "No stopping point");
			lhm.put("Rajampet", "second stop");
			
			System.out.println(lhm);
			lhm.put("Rly Kodur", "Third stoping point");
			System.out.println(lhm);
			for (Entry<String, String> entry : lhm.entrySet() ) {
				System.out.println(entry);
				}
			for(Entry<String , String> entry : lhm.entrySet()) {
				if(entry.getKey()=="Rly Kodur") {
					System.out.println("now i am going to remove the Rly Kodur::"+entry.getValue());
					lhm.remove("Rly Kodur");
					break;
				}
			}
			lhm.remove("Obulavari Palli");
			System.out.println("after removing obvp::"+lhm);
		} catch (Exception e) {
			System.out.println("*****************************************this is the Catch Block");
		}finally {
			System.out.println("this is the final block");
		}
	
	}

}
