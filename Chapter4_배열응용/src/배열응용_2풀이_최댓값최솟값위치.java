import java.util.Arrays;
import java.util.Iterator;

// 정수 10개 저장 공간 => 임의로 초기화 (1~100)
// 최대값/최솟값 ==> 위치 
/*
 *	1 2 3 4 6 5 7 8 10 9 
 * ----------------------
 * 	max=10 ==> 8
 * 	min=1  ==> 0
 * 	최대값 , 최솟값 위치 
 *
 *	System.arraycopy() // 부분 배열 복사
 *	배열자체.clone // 전체 배열 복사 
 *	=> clone은 object형태로 반환돼서 int로 다시 변환해줘야 한다.
 * 	
 */


public class 배열응용_2풀이_최댓값최솟값위치 {
	public static void main(String[] args) {
		
		int[] arr=new int[10];
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
			System.out.println(Arrays.toString(arr));
			;
			
		int max=arr[0];
		int min=arr[0];
		
		for(int i:arr)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
			System.out.println(max);
			System.out.println(min);
			
		int index1=0, index2=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==max)
			{
				index1=1; // i가 index번호이다. 
			}
			else if(arr[i]==min)
			{
				index2=i;
			}
		}
			System.out.println("최대값위치"+index1+","+(index1+1)+"번쨰의 위치");
			System.out.println("최소값위치"+index2+","+(index2+1)+"번쨰의 위치");
			
	}
}


























