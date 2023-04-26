import java.util.Arrays;

/*
 *		버블 정렬 : 인접한 데이터끼리 비교
 *		=> 선택정렬 : 앞에서부터 정렬
 * 		=> 버블정렬 : 뒤에서부터 정렬
 * 
 * 	40 30 10 50 20 = ASC정렬 10 20 30 40 50
 * 	-- --
 * 	30 40
 *        -- --
          10 40
 * 	         -- --
 * 	         40 50
 * 	         -- --
 * 	         20 50(고정) --------- 1ROUND 
 * 	--------------
 * 	30 10 40 20 50
 * 	   -- --
 * 	   10 40
 * 	      -- --
 * 	      20 40(고정)  	--------- 2ROUND
 * 	--------------          
 *	30 10 20 40 50
 *	-- --
 *  10 30
 *     -- --			--------- 3ROUND
 *     20 30 40 50 	
 *  -------------- i+j=4 ==> j=4(length-1)-i  
 *	     
 *      					 
 */
public class 배열응용_9_알고리즘_버블정렬 {
	public static void main(String[] args) 
	{
	int[] arr = new int[5];
	for (int i = 0; i < arr.length-1; i++) 
		{
		arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===정렬전===");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("===정렬후===");
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr.length-1-i; j++) 
			{
					// i=0 j=4 바퀴 수 첫번째는 4번
					// i=1 j=3 두번쨰는 3번
					// i=2 j=2 세번쨰는 2번
					// i=3 j=1 네번쨰는 1번 
					// 최대한 바퀴수를 줄이는 것이 목표이다.
					// 총 10바퀴 도는 것을 코딩하면 10줄인데 이것을 4줄로 줄일 수 있다/
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}





























