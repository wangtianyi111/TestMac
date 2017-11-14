package com.test;

import java.util.Scanner;

public class ReChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while(sc.hasNext()){
			String str = sc.nextLine();
			int[] visited = new int[str.length()];
			int flag;
			for(int i = 0; i < str.length(); i++){
				flag = 0;
				for(int j = i+1; j < str.length(); j++){
					if(visited[j] == 0){
						if(flag==0 && str.charAt(i) == str.charAt(j)){
							sb.append(str.charAt(i)+":"+i+"," + str.charAt(i) + ":" + j );
							flag = 1;
							visited[j] = 1;
						}
						else if ( flag == 1 && str.charAt(i) == str.charAt(j) ){
							sb.append("," + str.charAt(i) + ":" + j);
							visited[j] = 1;
						}
					}
				}
				if(flag == 1){
					System.out.println(sb.toString());
					sb.setLength(0);
				}
			}
			
		}
	}
}




