package w.t.y.subway;

import java.util.ArrayList;

import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.test1.FileUtil;

public class TimeSorted_2 {
	public static void main(String[] args) {
		System.out.println("------start!-------");
		String[] strings = FileUtil.read("C:\\Users\\wty\\Desktop\\10000.csv", null);
		for (int i = 1; i < 288; i++) {
			List<String> list = new ArrayList<>();
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int j = 1; j < strings.length; j++) {
				String[] s1 = strings[j].split("\\,");
				if (Integer.parseInt(Name2Id.stringProce(s1[3])) == i) {
					list.add(TimeProc.timeDivided(s1[2]) + "");
				}
				else {
					TimeProc.timeMap(list, "C:\\Users\\wty\\Desktop\\10000_result.csv", i + "");
					break;
				}
			}
		}
		
		
		
		System.out.println("TEST");
		System.out.println("--------end---------");
	}
	
}



