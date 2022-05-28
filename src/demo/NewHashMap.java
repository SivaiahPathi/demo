package demo;

import java.util.HashMap;
import java.util.Map.Entry;

public class NewHashMap {
	public static void main(String[] args) {
		try {
			HashMap<String, String> hs = new HashMap<String, String>();
			hs.put("Renigunta", "final stop");
			hs.put("kadapa", "first starting point");
			hs.put("Rly Kodur", "No stopping point");
			hs.put("Obulavari Palli", "No stopping point");
			hs.put("Rajampet", "second stop");
			System.out.println(hs);
			for (Entry<String, String> entry : hs.entrySet() ) {
				System.out.println(entry);
				
				
			}
			System.out.println();
			System.out.println();
			for (Entry<String , String> entry : hs.entrySet()) {
				if(entry.getValue()=="No stopping point") {
					System.out.println("This IS THE LIST OF NO STOPPING POINTS ----->"+entry.getKey());
				}
			}
		} catch (Exception e) {
			System.out.println("**************************************************** THIS IS CATCH BLOCK");
		}finally {
			System.out.println("This Is The Final Block");
		}
	}

}
