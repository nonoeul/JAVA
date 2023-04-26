package 라이브러리_유틸_util;

import java.util.*;
public class 라이브러리_Random2 {
	public static void main(String[] args) {
		
		char[] alpha=new char[10];
		Random r=new Random();
		
		for (int i = 0; i < alpha.length; i++) 
		{
			alpha[i]=(char)(r.nextInt(5)+65); 
			if(alpha[i]=='E')
				alpha[i]='F';
			System.out.println((i+1)+"번 학생 성적:"+alpha[i]);
			// nextint는 안에 들어갈 수 있는 갯수이다. 알파벳이 26개이므로 nextint(26)이고
			// 65~97까지가 대문자를 가지고 잇는 char의 번호이다. 
		}
//		System.out.println(Arrays.toString(alpha));
//		Arrays.sort(alpha);
//		System.out.println(Arrays.toString(alpha));/		
	}
}
