package 유틸_util;

import java.io.*;
import java.util.*;
public class Vectoer {
	public static void main(String[] args) {
/*
	동적 배열을 제공하고, 표준배열보다 느리지만 많은 움직임이 필요한 프로그램에 유리하다.
 	ArrayList유사
*/	
		//Vector 선언
		Vector<Integer> v=new Vector<Integer>();
		
		//데이터입력
		for (int i = 1; i <= 5; i++) {
			v.add(i);
		}	// 배열로 저장된다 1,2,3,4,5
		
		//결과 출력
		System.out.println(v);
		
		//3번 데이터 삭제
		v.remove(3);
		// 3번째 배열 인덱스 제거 
		/*	숫자	1	2	3	4	5
		 * 	배열	0	1	2	3	4
		 * 3번째 4를 제거한다. 
		 */
		
		//출력
		System.out.println(v);
		
		//하나씩 결과 출력
		
	}
}
