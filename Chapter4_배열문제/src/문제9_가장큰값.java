import java.util.Arrays;

public class 문제9_가장큰값 {
	public static void main(String[] args) {
		
		int[] arr=new int[10];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=====================");
		
	/*
	 * 	int a=10, b=30, c=40
	 * 	int max=a;
	 * 	if(max<b) max=b;
	 * 	if(max<c) max=c;
	 */
		
		int max=arr[0];
		for(int i:arr)
		{
			if(max<i)
				max=i;
		}
		System.out.println("최대값"+max);
		
	}
}
