package demo;

import java.util.*;
import java.util.Collections;

public class NewArrayList {

	public static void main(String[] args) {
		try {
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(2);
			al.add(3);
			al.add(4);
			al.add(5);
			al.add(2);
			System.out.println(al);
			System.out.println("ths is the arraylist size--->"+al.size());
//			ArrayList<>as =al.clone();
			System.out.println(al.isEmpty());
			System.out.println("this is before sort-->" +al);
			Collections.sort(al);
			System.out.println("this is after sort --->"+al);
			al.remove(0);
			System.out.println("After removing 0 index"+al);
			al.set(0,1 );
			System.out.println(al);
			al.add(1,2);
			System.out.println(al);
			
			int sum = 0;
			for(int i : al) {
				if(i % 2 !=0) {
					sum = sum + i;
				}
			}
			System.out.println(sum);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("it has to be execute mandatory");
		}

	}

}
