package demo;

import java.util.*;

public class NewArrayListEx {

	public static void main(String[] args) {
		try {
			LinkedList<Integer> ls = new LinkedList<Integer>();
			ls.add(0,1);
			ls.add(1,2);
			ls.add(3);
			ls.add(4);
			System.out.println("first linked list"+ls);
			String sl =ls.toString();
			
			System.out.println("new list after assigned to list ------->"+sl);
			for( Integer i : ls) {
				System.out.println(i);
				
			}
			ls.remove(0);
			System.out.println("after removing index----->"+ls);
			ls.add( 5);
			System.out.println("adding the set ----->"+ ls);
			ls.add(4);
			System.out.println("adding the set ----->"+ ls);
			ls.set(4, 5);
			System.out.println("adding the set ----->"+ ls);
			for(Integer i : ls) {
				if(i<=3) {
					System.out.println("this is linked list contain <=3 values --->"+i);
				}
			}
//			
//			ls.set(4, 5);
//			System.out.println("adding the set ----->"+ ls);
////			ls.size();
			System.out.println("the current size of the list ->" + ls.size());
			
			}
			
			
		 catch (Exception e) {
			System.out.println("*************************************----->catch Block");
		}finally {
			System.out.println("Final block");
		}

	}

}
