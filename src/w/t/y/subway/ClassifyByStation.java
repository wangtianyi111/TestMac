package w.t.y.subway;

import java.text.ParseException;
import com.test1.FileUtil;

public class ClassifyByStation {
	public static void main(String[] args) throws ParseException {
		System.out.println("------start!-------");
		String[] stations = FileUtil.read("C:\\Users\\wty\\Desktop\\station_num.txt", null);
		
		String[] strings = FileUtil.read("C:\\Users\\wty\\Desktop\\xinzhuang_1_1.csv", null);
		System.out.println("strings.length="+strings.length);
		String[] station = new String[5000];
		int j = 0;
		for (int i = 1; i <= 10000; i++) {
			String[] sline = strings[i].split("\\,");
			String[] name = sline[3].split("线");
			System.out.println(name);
			if (sline[3].equals("1号线莘庄")) {
				station[j++] = strings[i];
			}
			
		}
		
		

		
		System.out.println("--------------------------------");
		System.out.println("station.length="+station.length);
		
		
		FileUtil.write("C:\\Users\\wty\\Desktop\\xinzhuang_1_1_day.txt", station, true);
		
		System.out.println("------end！------");
		
	}
	
	
}
