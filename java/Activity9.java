package fst;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myLists = new ArrayList<>();
		myLists.add("maha");
		myLists.add("jeeva");
		myLists.add("amar");
		myLists.add("3sha");
		myLists.add("malai");
		myLists.add(3,"jerome");
		
		
		for (String myList : myLists) {
			System.out.println(myList);
		}
		
		System.out.println();
		
		System.out.println(myLists.get(2));
		
		System.out.println();
		
		System.out.println((myLists.contains("malai")));
		System.out.println((myLists.contains("shruti")));
		
		System.out.println();
		
		System.out.println(myLists.size());
		
		System.out.println();
		
		System.out.println(myLists.remove("3sha"));
		System.out.println(myLists.size());
		
	}

}
