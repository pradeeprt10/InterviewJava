package JavaUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {	
		String s = "  abc  def\t";
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		for (char c: ch) {
			if(c!=' ')
				sb.append(c);
		}
		System.out.println(sb);
	}
}
