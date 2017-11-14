package w.t.y.subway;

import java.util.Arrays;

import com.test1.FileUtil;

public class Station2Num {
	public static void main(String[] args) {
		String[] str1 = FileUtil.read("C:\\Users\\wty\\Desktop\\0424_metro_gps_full.txt", null);
		str1[0] = "0";
		//System.out.println(str1.length);
		//System.out.println(str1[0]);
		//System.out.println(str1[0]);
		Arrays.sort(str1);
		String[] str3 = new String[str1.length];
		for (int i = 1; i < str1.length; i++) {
			String[] str2 = str1[i].split("	");
			str3[i] = i + "," + str2[0];
		}
		/*for(String s : str3){
			System.out.println(s);
		}*/
		FileUtil.write("C:\\Users\\wty\\Desktop\\station_num.txt", str3, true);
	}
	
}
