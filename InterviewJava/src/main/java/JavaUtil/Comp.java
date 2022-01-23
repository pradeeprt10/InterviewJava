package JavaUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee implements Comparable{
	
	int  id;
	String name;
	double price;
	
	
	public Employee(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public int compareTo(Object o) {
		Employee emp =(Employee) o;
		if(price>emp.price)
			return -1;
		else if(price<emp.price)
			return 1;
		else
		return 0;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

class Employee1 {
	
	int  id;
	String name;
	double price;
	
	
	public Employee1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

class myComparator implements Comparator<Employee1>{
	
	public int compare(Employee1 e1, Employee1 e2) {
		
		return e1.name.compareTo(e2.name);
	}
	
}

public class Comp {
	
	private static final String Collection = null;

	public static void main(String[] args) {
		
		ArrayList<Employee> lis = new ArrayList<Employee>();
		lis.add(new Employee(1,"ASA",2000));
		lis.add(new Employee(6,"ABA",5000));
		lis.add(new Employee(3,"ASA",9000));
		//System.out.println(lis);
		Collections.sort(lis);
		//System.out.println(lis);
		
		List<Employee1> li = new ArrayList<Employee1>();
		li.add(new Employee1(1,"ASA",2000));
		li.add(new Employee1(6,"ABA",5000));
		li.add(new Employee1(3,"ACA",9000));
		System.out.println(li);
		//Collections.sort(li, new myComparator());
		//li.stream().sorted((e1,e2) -> if((e1.price)>(e2.price))?-1:if((e1.price)<(e2.price))?1:0).;
		li=li.stream().sorted((e1,e2)->(e1.price)>(e2.price)?-1:(e1.price)<(e2.price)?1:0).collect(Collectors.toList());
		System.out.println(li);
		
		/*
		 * Iterator it = li.iterator(); while(it.hasNext()) { li.add(new
		 * Employee1(66,"ACA",9000)); System.out.println(it.next()); }
		 */
		

	}

}
