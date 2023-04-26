import java.util.Arrays;

/*
 * 
 *	정렬 : ASC(오름차순)/DESC(내림차순)
 *	-----------------------------
 *	선택정렬 / 버블정렬
 *	선택정렬 (select sort)
 *	
 *	10 30 50 20 40 => [정렬] 10 20 30 40 50 , 50 40 30 20 10
 * 	-- -- -- -- --			
 * 	30 10 
 *  --
 *  50    30 
 * 	--	  --
 * 	50    	 20 
 *  --		    --
 *  50 		    40 ---------- 1round // 0번이 선택되면 4바퀴
 *  -------------
 *  50 10 30 20 40 
 *     -- --
 * 	   30 10  
 * 	   30    20	
 * 	   40       30 ---------- 2round // 1번이 선택되면 3바퀴
 * --------------
 *  50 40 10 20 30
 *        20 10
 *        30    20 ---------- 3round // 2번이 선택되면 2바퀴
 *  -------------
 *  50 40 30 10 20 
 *           20 10 ---------- 4round // 3번이 선택되면 1바퀴 
 * 	-------------
 * 	50 40 30 20 10 
 * 
 *    i	     j 	
 * 	start	횟수
 * 	  0		 4
 * 	  1		 3
 * 	  2		 2
 * 	  3		 1
 * 	------------ i+j=4 ==> j=4-i
 * 							 -length-1	  
 * 
 */
public class 배열응용_7_알고리즘_숫자정렬_1 {
	public static void main(String[] args) 
	{
		/*
		 * 	int a=10;
		 * 	int b=20;
		 * 
		 * 	a=b; a=20
		 * 	b=a; b=20
		 * 
		 * 	int temp=a; temp=10;
		 * 	a=b; // a=20
		 * 	b=temp;	// b=10
		 * 
		 * 
		 */
		int[] arr=new int[5];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("==== 정렬 전 ====");
		System.out.println(Arrays.toString(arr));
		


		
		
		
		System.out.println("==== 정렬 후 (ASC) ====");
		for (int i = 0; i < arr.length-1; i++) // 맨 마지막꺼는 정렬할 필요가 없다. 맨 마지막꺼는
			// 정렬할 필요가 없으므로 length-1을 해준다.
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("===for"+(i+1)+"회차 ====");
			System.out.println(Arrays.toString(arr));
		}
	
		
		
		
		System.out.println("==== 정렬 후 (DESC) ====");
		for (int i = 0; i < arr.length-1; i++) // 맨 마지막꺼는 정렬할 필요가 없다. 맨 마지막꺼는
			// 정렬할 필요가 없으므로 length-1을 해준다.
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("===for"+(i+1)+"회차 ====");
			 System.out.println(Arrays.toString(arr));
		}
	
	}
}























