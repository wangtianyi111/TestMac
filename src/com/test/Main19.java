package com.test;
//hashMap‘ı√¥ÕÊ£ø£ø£ø£ø£ø£ø£ø£ø£ø£ø£ø£ø£ø£ø
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main19 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> h1 = new HashMap<>();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			h1.put(scanner.nextInt(), scanner.nextInt());
		}
		int m = scanner.nextInt();
		Map<Integer, Integer> h2 = new HashMap<>();
		for (int i = 0; i < m; i++) {
			h2.put(scanner.nextInt(), scanner.nextInt());
		}
		/*Set set = h1.keySet();
		for(Iterator iterator  = set.iterator();iterator.hasNext();){
			String value  = (String) iterator.next();
			
		}*/
		
		/*Iterator iter = h1.entrySet().iterator();
		°°°°while (iter.hasNext()) {
		°°°°Map.Entry entry = (Map.Entry) iter.next();
		°°°°Integer key = entry.getKey();
		°°°°Integer val = entry.getValue();
		°°°°}*/
		Iterator iterator = h1.entrySet().iterator();
		Iterator iterator2 = h2.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<String, String> entry = (Map.Entry) iterator.next();
			String value = entry.getValue();
			String key = entry.getKey();
			
			while (iterator2.hasNext()) {
				Map.Entry<String, String> entry2 = (Map.Entry) iterator.next();
				String value2 = entry2.getValue();
				String key2 = entry2.getKey();
				if (key.equals(key2) == true) {
					h1.remove(key);
					h1.put(Integer.parseInt(key)+Integer.parseInt(key2),Integer.parseInt(value));
				}
				
				
			}
		}
		
	}
}
