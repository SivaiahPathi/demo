package demo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEmployeeExample {

	public static void main(String[] args) {

		try {
			
			HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
			
			Employee e1 = new Employee(111, "Venkat B", 30, "SSE");
			Employee e2 = new Employee(222, null, 25, "SE");
			Employee e3 = new Employee(333, "Priya B", 29, "SE");
			
			empMap.put(e1.getEmpId(), e1);
			empMap.put(e2.getEmpId(), e2);
			empMap.put(e3.getEmpId(), e3);
			
			System.out.println(empMap.size());
			
			System.out.println(empMap);
			for(Entry<Integer, Employee> entry : empMap.entrySet()) {
				Employee emp = entry.getValue();
				if("Siva P".equals(emp.getEmpName())) {
					System.out.println(entry.getKey()+"---"+emp.getEmpId()+"::"+emp.getEmpName()+"::"+emp.getEmpAge()+"::"+emp.getEmpDesignation());
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("final block");
		}
	}

}
