package com.accolite.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public ArrayList<String> popularNFeatures(int numFeatures, 
			int topFeatures, 
			List<String> possibleFeatures, 
			int numFeatureRequests, 
			List<String> featureRequests)
	{ 
		Map<String, Integer> mp = new HashMap<>();
		for(String val : possibleFeatures) {
			mp.put(val,0); 
		}
		for(int i = 0;i< numFeatureRequests;i++) {
			String description = featureRequests.get(i);

			for(int j =0;j< numFeatures;j++) {
				String feature =  possibleFeatures.get(j);
				if(description.contains(feature)) {
					int count = mp.get(feature);
					count++;
					mp.put(feature, count);
				}
			}
		}

		List<Map.Entry<String, Integer> > list = 
				new LinkedList<Map.Entry<String, Integer> >(mp.entrySet()); 

		// Sort the list 
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
			public int compare(Map.Entry<String, Integer> o1,  
					Map.Entry<String, Integer> o2) 
			{ 
				return (o1.getValue()).compareTo(o2.getValue()); 
			} 
		});
		ArrayList<String> list2 =  new ArrayList<>();
		for(Entry<String, Integer> st : list) {
			list2.add(st.getKey());  
		}
		return list2;}	

}
