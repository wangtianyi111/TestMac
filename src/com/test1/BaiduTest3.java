package com.test1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BaiduTest3 {

	private static ArrayList<IPoint> points = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String sn = scanner.nextLine();
			int n = Integer.parseInt(sn);
			for (int i = 0; i < n; i++) {
				IPoint point = new IPoint();
				String string = scanner.nextLine();
				String[] strings = string.split(" ");
				point.c = strings[0];
				point.x = Integer.valueOf(strings[1]);
				point.y = Integer.valueOf(strings[2]);
				point.z = Integer.valueOf(strings[3]);
				points.add(point);
				
			}
			
			DecimalFormat df = new DecimalFormat("0.00000");
			double max = 0;
			for (int i = 0; i < points.size()-2; i++) {
				for (int j = i+1; j < points.size()-1; j++) {
					for (int k = j+1; k < points.size(); k++) {
						 if ((points.get(i).c.equals(points.get(j).c)) && (points.get(i).c.equals(points.get(k).c)) && (points.get(j).c.equals(points.get(k).c))) {
							if (area(points.get(i), points.get(j), points.get(k)) > max) {
								max = area(points.get(i), points.get(j), points.get(k));
							}
						}else if ((points.get(i).c.equals(points.get(j).c))!= true && (points.get(i).c.equals(points.get(k).c))!= true && (points.get(j).c.equals(points.get(k).c))!= true) {
							if (area(points.get(i), points.get(j), points.get(k)) > max) {
								max = area(points.get(i), points.get(j), points.get(k));
							}
						 }else {
							continue;
						}
					}
				}
			}
			System.out.println(df.format(max));
			
			 
		}
	}

	public static double area(IPoint p1, IPoint p2, IPoint p3) {
		double a = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
				* (p1.y - p2.y) + (p1.z - p2.z) * (p1.z - p2.z));
		double b = Math.sqrt((p2.x - p3.x) * (p2.x - p3.x) + (p2.y - p3.y)
				* (p2.y - p3.y) + (p2.z - p3.z) * (p2.z - p3.z));
		double c = Math.sqrt((p1.x - p3.x) * (p1.x - p3.x) + (p1.y - p3.y)
				* (p1.y - p3.y) + (p1.z - p3.z) * (p1.z - p3.z));
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return s;
	}

}

class IPoint {
	String c;
	int x;
	int y;
	int z;
}
