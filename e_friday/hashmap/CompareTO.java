package hashmap;

import java.util.Iterator;
import java.util.TreeSet;

public class CompareTO {

	public CompareTO() {}

	public static void main(String[] args) {
		TreeSet<Student> set =new TreeSet<Student>();
		set.add(new Student("Ann",87));
		set.add(new Student("Bob",83));
		set.add(new Student("Cat",99));
		Iterator<Student> itr=set.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			System.out.println(s.name+" "+s.score);
			System.out.println(set);
		}

	}

}
