package w.t.y.subway;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test1.FileUtil;

/*public class TimeDivided {
	public static void main(String[] args) {
		System.out.println("------start!-------");
		String[] strings = FileUtil.read("C:\\Users\\wty\\Desktop\\xinzhuang_1_1_day.txt", null);
		int count = 0;
		int j = 0;
		String[] ts = new String[strings.length];
		for (int i = 1; i < strings.length; i++) {
			String[] times  = strings[i].split("\\,");
			String[] t = times[2].split("\\:");
			//五分钟为一个时间段
			count = Integer.parseInt(t[0]) * 12;
			count +=  Math.round((double)Integer.parseInt(t[1]) / 10) * 10 / 5;
			
			//20分钟为一个时间段
			count = Integer.parseInt(t[0]) * 3;
			count += Math.floor((double)Integer.parseInt(t[1]) / 20) + 1;
			
			times[2] = count + "";
			ts[j++] = times[2] + "";
			
		}
		
		FileUtil.write("C:\\Users\\wty\\Desktop\\xinzhuang_1_1_20.txt", ts, true);
		System.out.println("------end-------");
	}
}*/



//封装一下
public class TimeProc{
	public static int timeDivided(String time){
		int count = 0;
		String[] t = time.split("\\:");
		//五分钟为一个时间段
		/*count = Integer.parseInt(t[0]) * 12;
		count +=  Math.round((double)Integer.parseInt(t[1]) / 10) * 10 / 5;*/
		
		//20分钟为一个时间段
		count = Integer.parseInt(t[0]) * 3;
		count += Math.floor((double)Integer.parseInt(t[1]) / 20) + 1;
		
		return count;
	}
	
	public static void timeMap(List<String> list,String filename,String id){
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
		String[] strings2 = new String[map.size()];
		int k = 0;
		for(String key : map.keySet()){
			strings2[k++] = id + "," + key + "," + map.get(key);
		}
		
		FileUtil.write(filename, strings2, true);
	}
}