package JavaUtil;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Emp {
	String name;
	int id;

	public Emp(String name, int id) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	public String toString() {

		return name + " " + id;
	}
}

public class SetLearning {

	public static void main(String[] args) {
		Set s = new HashSet<>();
		s.add("ABC");
		s.add("ABC");
		s.add("CBA");
		System.out.println(s);// Duplicates are not allowed

		Set<Emp> set = new HashSet<Emp>();
		set.add(new Emp("AA", 1));
		set.add(new Emp("AA", 1));
		set.add(new Emp("AB", 1));
		System.out.println(set);// Duplicates are not allowed
	}

}
