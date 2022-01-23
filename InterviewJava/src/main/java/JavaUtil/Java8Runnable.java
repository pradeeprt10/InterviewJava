package JavaUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Java8Runnable {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println(i);
		};

		Thread t = new Thread(r);
		// t.start();

		HashMap<String, Integer> m = new HashMap<String, Integer> ();
		m.put("A", 10);
		m.put("A", 20);
		m.put("B", 30);
		m.put("B", 40);
		m.put(null, 50);
		m.put(null, 60);		
		for (Object o : m.entrySet()) {
			System.out.println(o + ":" + m.get(o));
		}
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
