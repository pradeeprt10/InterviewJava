package JavaUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Custom Array List Class where duplicates are not allowed
class MyArray<String> extends ArrayList {
	@Override
	public boolean add(Object e) {
		if (this.contains(e)) {
			return true;
		} else
			return super.add(e);	}
}

public class ArrayListLearning {

	public static void main(String[] args) {
		final int x;
		x = 30;
		System.out.println(x);// 30
		// x=40; error
		final List<String> li = new ArrayList<String>();
		li.add("PKR");
		li.add("PKR");
		li.add("PKR");
		
		// li = new ArrayList<String>(); // we can't reassign the final variable
		MyArray<String> myArrayList = new MyArray<String>();
		myArrayList.add("AA");
		myArrayList.add("AA");
		myArrayList.add("AB");
		System.out.println(myArrayList);//Custom Array List where duplicates are not allowed
		
		
	}

}
