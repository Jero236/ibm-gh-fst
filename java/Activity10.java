package fst;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<>();
		
		hs.add("maha");
		hs.add("raja");
		hs.add("k7");
		hs.add("arun");
		hs.add("ohm");
		hs.add("maha");
		
		System.out.println(hs.size());
		
		System.out.println(hs.remove("ohm"));
		System.out.println(hs.remove("mk"));
		
		for(String h : hs) {
			System.out.println(h);
		}
		
	}

}
