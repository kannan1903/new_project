package org.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Theory {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp=new LinkedHashMap<>();
		
		mp.put(10, "tham");
		mp.put(20, "black");
		mp.put(30, "kannan");
		mp.put(40, "Rtk");
		mp.put(50, "kann");
		mp.put(50, "mr.blacky");
	
		
		mp.remove(40);
		System.out.println(mp);
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		
		Collection<String> values = mp.values();
		System.out.println(values);
		
		Set<Entry<Integer,String>> entrySet = mp.entrySet();
		System.out.println("===="+entrySet);

		for(Entry<Integer,String> x:entrySet) {
			System.out.println(x);
			System.out.println(x.getKey());
			System.out.println(x.getValue());

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
