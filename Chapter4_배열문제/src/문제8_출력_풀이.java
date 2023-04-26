import java.util.Arrays;
import java.util.Scanner;
public class 문제8_출력_풀이 {
	public static void main(String[] args) {
	
		int[] arr=new int[10];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("세번째 숫자:"+arr[2]);
		System.out.println("다섯번째 숫자:"+arr[4]);
		System.out.println("마지막 숫자:"+arr[9]);
	}
}
