package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetBunnyMain {

	public static void main(String[] args) {
		Set<Bunny> set = new HashSet<Bunny>();
		for (int i = 1; i <= 15; i++) {
			Bunny b=new Bunny(i);
			set.add(b);
		}
		/*
		Iterator<Bunny> it = set.iterator();
		while(it.hasNext()) {
			Bunny name = it.next();
			Bunny b2 = set.(name);
			
		}*/
		
		int x;
		String y="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Give me a Bunny number to check if i already have it");
		x=sc.nextInt();
		Bunny b0=new Bunny(x);
		System.out.print(b0);/*
		b0.setNumber(x);
		System.out.println("Give me a Bunny name to check if i already have it");
		y=sc.next();
		b0.setName(y);*/
		System.out.print(set);
		
		//sc.close();
		
	}
}