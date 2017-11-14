package com.test;

public class TestString {

	public static void main (String[] args){
		//String s1="01jlA0msdfjoiewnJLSDKFJx,dfhsdlka394sdf*&678wer";
		//String s2="12eoiwrkdfjsdffnjdfi";
		String s3="jsdjavaeiojavajjavalkoijava";
		int count=0;
		String s5="java";
		int i=0;
		while((i=s3.indexOf(s5))!=-1){
			s3=s3.substring(i+s5.length());
			count++;
		}
		System.out.println(count);
		//char []c={'a','b','c','d'};
		/*
	    for (int i = 0; i < s2.length(); i++) {
			System.out.println(s2[i]);
		}
		*/
		//String s3=String.valueOf(c);                               //valueOf是静态方法直接用类名来调用
		//System.out.println(s1.codePointAt(0));                    //返回字节码
		//System.out.println(s1.codePointCount(1, 2));           //不懂什么意思
		//System.out. println(s1.compareTo(s2));                  //比较两个字符串的大小用s1-s2;
		//System.out.println(s1.concat(s2));  
		//System.out.println(s3);//将s2接在s1的最后面
		/*
		int lcount=0,ucount=0,ocount=0;
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			//System.out.println(c);
			if(c>='a'&&c<='z'){
				lcount++;
			}
			else if(c>='A'&&c<='Z'){
				ucount++;
			}
			else ocount++;
		}
		System.out.println(lcount+" "+ucount+" "+ocount+" "+s1.length());
		*/
	}
}
