package com.accolite.p5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BooleanParse {

	public static void main(String[] args) {
		/*Set<String> set  =  new HashSet<>();

		set.add("Saurabh");
		set.add("Gaurabh");
		set.add("Faurabh");
		set.add("Daurabh");
		System.out.println(set);
		set.removeIf(item -> {
			return item.startsWith("D");
		});*/
		Map<String, List<Integer>> map =  new HashMap<>();


		List<Integer> al = new ArrayList<>(); 
		al.add(10); 
		al.add(20); 
		al.add(30); 
		al.add(1); 
		al.add(2); 
		map.put("K1", al);
		al.add(90);
		List<Integer> al2 = new ArrayList<>(al);
		al2.add(4);
		map.put("K2", al2);
		System.out.println(map);
		map.entrySet().stream().forEach(e -> {
			 List<Integer> item = e.getValue();
			item.removeIf(i-> i>10);
		});
		
		System.out.println("Modified ArrayList : +"+map); 
	}

}
