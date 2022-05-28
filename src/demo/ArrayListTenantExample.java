package demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTenantExample {

	public static void main(String[] args) {
		try {
			ArrayList<Tenant> tenantList = new ArrayList<Tenant>();
			
			Tenant t1 = new Tenant("Ram", 25, "123", "SE", "13/05/1997");
			Tenant t2 = new Tenant("Raghav", 26, "456", "BPO", "12/03/1996");
			Tenant t3 = new Tenant("Siva", 27, "789", "SE", "12/06/1995");
			
			tenantList.add(t1);
			tenantList.add(t2);
			tenantList.add(t3);
			Collections.sort(tenantList);
			
			System.out.println(tenantList);
			for(Tenant t : tenantList) {
//				if(t.getAge() > 25) {
					System.out.println(t.getName()+"---"+t.getAge()+"---"+t.getMobileNo()+"---"+t.getOccupation()+"---"+t.getDob());
					
//				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("block");
		}

	}

}
