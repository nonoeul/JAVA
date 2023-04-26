import java.util.Arrays;

public class 배열응용_5_result로난수구하기 {
	public static void main(String[] args) {
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10); // 0~9
		}
		System.out.println(Arrays.toString(arr));
		
		int[] result=new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			result[arr[i]]++; 
		}
		
		for (int i = 0; i < result.length; i++) 
		{
			System.out.println(i+":"+result[i]);
		}
		
		int max=result[0];
		int min=result[0];
		int index1=0;
		int index2=0;
		for (int i = 0; i < result.length; i++) 
		{
			if(max<result[i])
			{
				max=result[i];
				index1=i;
			}
			if(min>result[i])
			{
				min=result[i];
				index2=i;
			}
		}
		System.out.println("빈도수가 가장 많은 값:"+max);
		System.out.println("빈도수가 가장 적은 값:"+min);
		System.out.println("가장 많은 수는 뭐냐?:"+index1);
		System.out.println("가장 많은 수는 뭐냐?:"+index2);
	}
}
