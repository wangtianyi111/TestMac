package w.t.y.subway;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;

import com.test1.FileUtil;

public class Pretreatment {
	public static void main(String[] args) {
		
		ArrayList<String> pStrings = new ArrayList<String>();
		
		String[] content = FileUtil.read("C:\\Users\\wty\\Desktop\\test3.csv", null);
		for (int i = 1; i < content.length; i++) {
			String[] sline = content[i].split(" ");
			boolean f1 = false;
			boolean f2 = false;
			for (int j = 0; j < pStrings.size(); j++) {
				if (pStrings.get(j).equals(sline[1]) == true)  {
					f1 = true;
				}
				if (pStrings.get(j).equals(sline[2]) == true) {
					f2 = true;
				}
				if (f1 == true && f2 == true) {
					break;
				}
			}
			if (f1 == false) {
				pStrings.add(sline[1]);
			}
			if (f2 == false) {
				pStrings.add(sline[2]);
				if (sline[1] == sline[2]) {
					pStrings.remove(sline[2]);
				}
			}
			
			
		}
		
		for (int i = 0; i < pStrings.size()-1; i++) {
			for (int j = i+1; j < pStrings.size(); j++) {
				if (pStrings.get(i).equals(pStrings.get(j))) {
					pStrings.remove(j);
				}
			}
		}
		
		String[] newCont = new String[content.length];
		
		for (int i = 1; i < content.length; i++) {
			String[] sline = content[i].split(" ");
			for (int j = 0; j < pStrings.size(); j++) {
				if (sline[1].equals(pStrings.get(j))) {
					sline[1] = j + "";
				}
				if (sline[2].equals(pStrings.get(j))) {
					sline[2] = j + "";
				}
			}
			newCont[i] = sline[1] + "," + sline[2];
		}
		FileUtil.write("C:\\Users\\wty\\Desktop\\test5.csv", newCont, true);
		
		
		
		System.out.println(pStrings.size());
	}
}
