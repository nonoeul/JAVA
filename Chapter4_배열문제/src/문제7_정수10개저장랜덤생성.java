import java.util.Arrays;
import java.util.Iterator;

public class 문제7_정수10개저장랜덤생성 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		
		for (int i = 0; i < arr.length; i++) 
			{
			arr[i]=(int)(Math.random()*10)+1;
			}
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		
		System.out.printf("평균:%.2f",(total/10.0));
		
		}		
	}

