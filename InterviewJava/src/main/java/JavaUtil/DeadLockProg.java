package JavaUtil;

import java.util.LinkedList;

public class DeadLockProg {

	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(10);
		ll.add(30);
		ll.add(20);
		LinkedList<Integer> l2= new LinkedList<Integer>();
		System.out.println(ll.size());
		System.out.println(ll);
		int len=ll.size()-1;
		while(len>=0) {
			l2.add(ll.get(len));
			len--;
		}
		System.out.println(l2);
	}

}
