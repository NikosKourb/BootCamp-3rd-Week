package cb;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBunnyMain {

	public static void main(String[] args) {

		
		ArrayList<Bunny> al=new ArrayList<>();
		System.out.println(al.size());
		for (int i=1;i<=15;i++) {
			al.add(new Bunny(i));
		}
		
		for(int i=0;i<al.size();i++) {
			al.get(i).hop();
		}
		
		Iterator<Bunny> it=al.iterator();
		while(it.hasNext())
			it.next().hop();
		
	}
}
