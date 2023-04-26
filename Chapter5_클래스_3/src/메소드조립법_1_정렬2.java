import java.util.Arrays;

//	1. 달력 만들기
/* 		기능
 * 		1. 년도 / 월 입력
 * 		2. 1일자의 요일 확인 ==> 세분화
 * 		3. 달력 출력
 * 		----------------
 * 		===> 재사용할 수 있는 메소드(윤년)
 * 
 * 	2. 숫자야구게임
 * 	   난수 발생
 * 	   사용자 입력
 * 	   비교
 * 	   힌트
 * 	   종료 여부 확인
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 메소드조립법_1_정렬2 {
	/*
	 *	int a=10;
	 * 	int b=20;
	 * 	a=b;
	 * 		
	 * 
	 */
	static void sort(int[] arr,int n) // n=1 ASC , n=2 DESC
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
			boolean bCheak=false;
			if(n==1)
					bCheak=arr[i]>arr[j];
			else
					bCheak=arr[i]<arr[j];	
				
				if(bCheak)
				{
					int temp=arr[i];	// arr[i]=50
					arr[i]=arr[j];		// arr[j]=40
					arr[j]=temp;		// arr[i]=50
				}
			}
		}	
	}	
	
	static void rand(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr=new int[5];
		rand(arr);
		System.out.println("정렬 전:"+Arrays.toString(arr));
		sort(arr,1);
		System.out.println("내림차순 정렬 후:"+Arrays.toString(arr));
		
		sort(arr,2);
		System.out.println("오름차순 정렬 후:"+Arrays.toString(arr));
		
	
	}
}






























