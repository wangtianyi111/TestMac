package w.t.y.subway;

import java.util.HashMap;
import java.util.Map;

import com.test1.FileUtil;

public class Name2Id {
	
	public static void main(String[] args) {
		Name2Id.name2Id();
	}
	
	public static String stringProce(String str){
		str = str.replaceAll("\\d", "");
		str = str.replaceAll("号线", "");
		return str;
	}
	
	public static void name2Id(){
		String[] s1 = FileUtil.read("C:\\Users\\wty\\Desktop\\10000.csv", null);
		String[] s2 = FileUtil.read("C:\\Users\\wty\\Desktop\\station_num.txt", null);
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 1;i < s2.length;i++){
			String[] s = s2[i].split(",");
			map.put(s[0], s[1]);//key:id   value:name 
		}
		//System.out.println(map.size());
		//System.out.println(map.values());
		
		String[] s3 = new String[s1.length];
		int k = 0 ;
		for(int j = 1;j < s1.length;j++){
			String[] s1_1 = s1[j].split(",");
			for(String key : map.keySet()){
				//System.out.println("key:" + key + "|| value:" + map.get(key) );
				//System.out.println(s1_1[3]);
				if (Name2Id.stringProce(s1_1[3]).equals(map.get(key))) {
					s3[k++] = s1_1[2] + "," + key;
					break;
				}
			}
		}
		System.out.println(s3.length);
		System.out.println(s3[3]);
		
		FileUtil.write("C:\\Users\\wty\\Desktop\\name2Id.csv", s3, true);
	}
}
