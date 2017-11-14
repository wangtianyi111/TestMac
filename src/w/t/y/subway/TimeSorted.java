package w.t.y.subway;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.test1.FileUtil;

public class TimeSorted {
	public static void main(String[] args) {
		System.out.println("------start!-------");
		List<String> list = new ArrayList<>();
		String[] strings = FileUtil.read("C:\\Users\\wty\\Desktop\\xinzhuang_1_1_20.txt", null);
		for(int i = 1;i < strings.length;i++){
			list.add(strings[i]);
			//System.out.println(strings[i]);
		}
		//System.out.println(list.size());
		//这里也没必要排序
		Collections.sort(list, new Comparator<String>() {
			public int compare(String a ,String b){
				int one = Integer.parseInt(a);
				int two = Integer.parseInt(b);
				return one - two;
			}
		});
		
		//shiyong map lai save list shuju
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : list) {
			if (map.containsKey(s)) {
				int i = map.get(s) + 1;
				map.put(s, i); 
			}
			else {
				map.put(s, 1);
			}
		}
		
		//这里不一定要排序！！
		map = sortMapByKey(map);
		//System.out.println(map);
		String[] strings2 = new String[map.size()];
		int k = 0;
		for(String key : map.keySet()){
			strings2[k++] = key + "," + map.get(key);
		}
		
		FileUtil.write("C:\\Users\\wty\\Desktop\\xinzhuang_1_1_20_result.txt", strings2, true);
		/*System.out.println("--------------");
		System.out.println("--------------");
		System.out.println(list);
		System.out.println(list.size());*/
		System.out.println("--------end---------");
	}
	
	public static Map<String, Integer> sortMapByKey(Map<String, Integer> map){
		if (map == null || map.isEmpty()) {
			return null;
		}
		Map<String, Integer> sortMap = new TreeMap<String,Integer>(new MapKeyComparator());
		sortMap.putAll(map);
		return sortMap;
	}
}

class MapKeyComparator implements Comparator<String>{
	public int compare(String str1,String str2){
		return str1.compareTo(str2);
	}
}

