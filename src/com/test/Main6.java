package com.test;

public class Main6 {//½«¿Õ¸ñÌæ»»Îª%20

	public static void main(String[] args) {

	}

	public String replaceSpace(StringBuffer str) {
		int index = 0;
		String s;
		while(str.indexOf(" ")!=-1){
			index = str.indexOf(" ");
			str = str.deleteCharAt(index);
			str = str.insert(index, "%20");
		}
		s = str.toString();
		return s;
	}

}
