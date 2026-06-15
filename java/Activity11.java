package fst;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> maps = new HashMap<>();
		maps.put(1, "red");
		maps.put(2, "blue");
		maps.put(3, "green");
		maps.put(4, "yellow");
		maps.put(5, "black");
		
		System.out.println(maps);
		
		System.out.println(maps.remove(1));
		
		System.out.println(maps);
		
		if(maps.containsValue("green")) {
			System.out.println("present");
		} else {
			System.out.println("green is not present");
		}
		
		System.out.println(maps.size());
		

	}

}
