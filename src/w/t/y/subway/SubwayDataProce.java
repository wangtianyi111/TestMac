package w.t.y.subway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import com.test1.FileUtil;

public class SubwayDataProce {
	public static void main(String[] args) throws ParseException {
		ArrayList<person> persons = new ArrayList<>();
		//String[] strings = FileUtil.read("D:\\SODA\\一卡通乘客刷卡数据1\\SPTCC-20150401.csv", null);
		String[] strings = FileUtil.read("D:\\SODA\\一卡通乘客刷卡数据1\\SPTCC-20150401.csv", null);
		System.out.println("strings.length="+strings.length);
		for (int i = 1; i <= 1000000; i++) {
			
			if (strings[i] == null) {
				System.out.println("null" + i);
			}
			String[] sline = strings[i].split("\\,");
			
			if (persons.size() == 0) {
				person p = new person();
				p.id = new String(sline[0]);
				
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				p.dy = sdf.parse(sline[1]);
				//System.out.println(sline[1]);
				//System.out.println(p.dy);
				SimpleDateFormat sd=new SimpleDateFormat("HH:mm:ss");
				p.dd.add(sd.parse(sline[2]));  
				p.place.add(sline[3]);
				p.price.add(Double.parseDouble(sline[5]));
				p.count = 1;
				persons.add(p);
			}else {
				person p = persons.get(persons.size()-1);
				if(p.id.equals(sline[0])){
					SimpleDateFormat sd=new SimpleDateFormat("HH:mm:ss");
					p.dd.add(sd.parse(sline[2]));  
					p.place.add(sline[3]);
					p.price.add(Double.parseDouble(sline[5]));
					p.count++;
				}else {
					p = new person();
					p.id = new String(sline[0]);
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
					p.dy = sdf.parse(sline[1]);
					SimpleDateFormat sd=new SimpleDateFormat("HH:mm:ss");
					p.dd.add(sd.parse(sline[2]));  
					p.place.add(sline[3]);
					p.price.add(Double.parseDouble(sline[5]));
					p.count = 1;
					persons.add(p);
				}
			}
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd=new SimpleDateFormat("HH:mm:ss");
		
		for (int i = 0; i < persons.size(); i++) {
			person p = persons.get(i);
			for (int j = 0; j < p.dd.size()-1; j++) {
				for (int k = 0; k < p.dd.size()-1-j; k++) {
					if (p.dd.get(k).after(p.dd.get(k+1))) {
						Date date = p.dd.remove(k);
						p.dd.add(k+1, date);
						String s1 = p.place.remove(k);
						p.place.add(k+1,s1);
						double s2 = p.price.remove(k);
						p.price.add(k+1,s2);
					}
				}
				
			}
		}
		
		
		
		
		
		for (int i = 0; i < persons.size(); i++) {
			
			person p = persons.get(i);
			
			/*String s1 = sd.format(p.dd.get(0));
			s1 = s1.replace(":", "");
			String s2 = sd.format(p.dd.get(1));
			s2 = s2.replace(":", "");*/
			
			String string = "09:30:00";
		
			Date d = sd.parse(string);
			if (p.count % 2 == 1 ||p.dd.get(1).after(d) || p.dd.get(0).after(d) ) {
				persons.remove(p);
				System.out.println("deleted:" + sd.format(p.dd.get(0)));
			}
		}
		String[] contents = new String[persons.size()];
		for (int i = 0; i < persons.size(); i++) {
			person p = persons.get(i);
			
			if (p.place.size()<2) {
				continue;			}
			
			
			contents[i] = p.id + " " + p.place.get(0) + " " + p.place.get(1);
		
			/*for (int j = 0; j < persons.get(i).count; j++) {
				System.out.print(persons.get(i).id+ " ");
				System.out.print(sdf.format(persons.get(i).dy) + " ");
				System.out.print(sd.format(persons.get(i).dd.get(j)) + " ");
				System.out.print(persons.get(i).place.get(j) + " ");
				System.out.print(persons.get(i).price.get(j) + " ");
				System.out.println();
				System.out.println("######################");
			}*/
			
		}
		
		FileUtil.write("C:\\Users\\wty\\Desktop\\test3.txt", contents, true);
		
		System.out.println("------------");
		System.out.println(persons.size());
		
	}
	
	
}
