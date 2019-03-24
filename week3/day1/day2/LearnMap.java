package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer> sportsItems = new TreeMap<>();
		sportsItems.put("ReeBok", 10);
		sportsItems.put("MRF", 10);
		sportsItems.put("SS", 20);
		sportsItems.put("MRF", 5);
		sportsItems.put("SG", null);
		//System.out.println(sportsItems.entrySet()); 
		for( Entry<String, Integer> eachItem  : sportsItems.entrySet()) {
			System.out.println(eachItem.getKey()+" --> "+eachItem.getValue());
		}
		
		
		
		
		//System.out.println(sportsItems.get("MRf"));  
		/*System.out.println(sportsItems);
		System.out.println(sportsItems.keySet());
		System.out.println(sportsItems.values());  
		System.out.println(sportsItems.containsKey("MRF"));*/
	}

}








