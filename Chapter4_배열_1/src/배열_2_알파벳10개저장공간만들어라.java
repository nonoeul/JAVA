/*
 * 
 *		알파벳 10개 저장하는 공간을 만든다.
 * 		char c1~c10
 * 		char[] a1pha=new char[10]
 * 		알파벳 1000개 저장하는 공간을 만든다.
 * 		char c1~c1000; => 가장 큰 알파벳 출력
 *	//너무 복잡하다. 
 *		===> if(max<c2) ==> 99999
 *		char[] alpha=new char[1000]
 * 		
 * 		*** 배열 변수가 3개 이상이면 잡아라
 * 		
 * 
 */

public class 배열_2_알파벳10개저장공간만들어라 {
	public static void main(String[] args) {
		//1.선언
		int[] arr=new int[5]; // new => 동적메모리할당 = 값이 들어올때마다 그때그때 할당
		//2.초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//3.출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		//4.제어(정렬)
		
		//5.결과값 출력
		
		
		
		
	}
}
