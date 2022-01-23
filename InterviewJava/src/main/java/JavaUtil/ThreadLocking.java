package JavaUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadLocking extends Thread{
	
	 //static HashMap hm = new HashMap();
	static ConcurrentHashMap<Integer,Integer> hm = new ConcurrentHashMap<Integer,Integer>();
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Custom Thread");
			hm.put(2, 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
	hm.put(1, 1);
	hm.put(3, 3);	
	ThreadLocking t = new ThreadLocking();
	t.start();
	
	Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
	
	Iterator it = entrySet.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		Thread.sleep(2000);
		
	}
	
	
	/*
	 * for(Object o : hm.entrySet()) { System.out.println(o); Thread.sleep(2000); }
	 */
	System.out.println(hm);
	Iterator it1 = entrySet.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
		
		
	}
		
		
	}

}
