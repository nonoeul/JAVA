// 임의의 정수 10개를 받아서 최대값/최소값구하기

import java.util.Arrays;
import java.util.Scanner;
public class 배열_4_매우중요_임의의정수10개를받아서최댓값최솟값 {
	public static void main(String[] args) {
	
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		// 1.일반 for문
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr)); // arrays.tostring으로하면
		// 배열에 해당하는 값만 출력 가능 // 배열 안에 있는 내용을 문자열로 출력할 수 있다.
		// 2. for-each => 배열,컬렉션 => 데이터 여러개 모아서 관리할때 사용 
		/*
		 * 	for(int a:arr) // a안에 실제 데이터를 하나 씪 받아온다. 
		 */
		
		//출력 할때만 사용
		for(int a:arr) // a 값을 for문 없이 출력할 수 있다
		//출력용으로 사용 ==> 웹(브라우저) ==> point구문
		{
			System.out.print(a+" ");
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int a:arr)
		{
			if(max<a)
				max=a;
			if(min>a)
				min=a;
		}
		System.out.println();
		System.out.println("최대값은"+max);
		System.out.println("최솟값은"+min);
		
		
	}
}

























