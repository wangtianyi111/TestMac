package w.t.y.subway;

import java.util.ArrayList;
import java.util.List;

import com.test1.FileUtil;

public class TimeClassify {
	public static void timeClassify() {
		String[] s1 = FileUtil.read("/Users/yy/learngit/name2Id.csv", null);
		List<String> list = new ArrayList<>();
		
		for(int i = 1;i< s1.length-1;i++) {
			String[] s2 = s1[i].split(",");
			list.add(TimeProc.timeDivided(s2[0]) + "");
			String[] s3 = s1[i+1].split(",");
			if (s3[1].equals(s2[1]) == false) {
				TimeProc.timeMap(list, "/Users/yy/learngit/name2Id_result.csv", s2[1]);
				list.clear();
				continue;
			}
		}
		System.out.println("tset");
	}
	
	public static void main(String[] args) {
		TimeClassify.timeClassify();
	}
}
