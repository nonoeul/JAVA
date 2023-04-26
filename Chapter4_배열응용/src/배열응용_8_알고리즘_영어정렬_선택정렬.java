import java.util.Arrays;
import java.util.Iterator;

// 선택정렬 => 문자
/*
 * 	B C A E D ==> ASC(ABCDE) / DESC(EDCBA)
 * 	- -
 *  B C
 *  - 	-
 *  A   B
 *  -     -
 *  A     E 
 *  -	    -
 *  A		D ----> 1ROUND
 *  --------- i=1
 *  A C B E D
 *    - -
 *    B C
 *    -   -
 *    B   E
 *    -		-
 *    B		D ----> 2ROUND
 * ---------- i=2
 *  A B C E D
 *      - - 
 *      C E
 *      -   -
 *      C   D ----> 3ROUND
 * ---------- i=3
 *  A B C E D   
 *        - -
 *        D E ----> 4RODUN
 * ---------- i=4
 *  A B C D E   
 *  다섯번째는 비교할게 없기때문에 5바퀴를 제외하기 위해서
 *  length-1을 뺴주는 것이다. 
 *   
 */
public class 배열응용_8_알고리즘_영어정렬_선택정렬 {
	public static void main(String[] args) 
	{
		char[] arr=new char[10];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(char)((int)(Math.random()*26)+65);
		}
		System.out.println("==== 정렬전 ====");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==== 정렬 후(ASC) ====");
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i]<arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}		
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==== 정렬 후(DESC) ====");
		for (int i = 0; i < arr.length; i++) 
		{
		arr[i]=(char)((int)(Math.random()*26)+65);
			for (int j = 0; j < arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}



























