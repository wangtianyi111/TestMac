package com.test1;

import java.util.ArrayList;


public class MapData {
	public static void main(String[] args){
		sort();
	}
	
	public static void sort(){
		ArrayList<Point>pointList = new ArrayList<Point>();
		String[] points = FileUtil.read("C:\\Users\\wty\\Desktop\\地铁站点_geo_ok.csv", null);
		for (int i = 1; i < points.length; i++) {
			String[] line = points[i].split(",");
			double longtitude = Double.parseDouble(line[3]);
			double langtitude = Double.parseDouble(line[2]);
			int count = Integer.parseInt(line[4]);
			Point point = new Point();
			point.setLongtitude(longtitude);
			point.setLangtitude(langtitude);
			point.setCount(count);
			pointList.add(point);
		}
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < pointList.size(); i++) {
			if (pointList.get(i).getCount() > max) {
				max = pointList.get(i).getCount();
			}
			if (pointList.get(i).getCount() < min) {
				min =  pointList.get(i).getCount();
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
}
