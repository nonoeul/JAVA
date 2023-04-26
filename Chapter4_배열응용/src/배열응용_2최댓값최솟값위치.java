import java.util.Arrays;

public class 배열응용_2최댓값최솟값위치 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(int)(Math.random()*10);
		}
			System.out.println(Arrays.toString(arr));
		
		int max=0;
		for (int i = 0; i < arr.length; i++) 
		{
		if(arr[i]>max)
			max=arr[i];
		}
		System.out.println(max);
		System.out.println(Arrays.toString(arr).indexOf(max));
	}
}
