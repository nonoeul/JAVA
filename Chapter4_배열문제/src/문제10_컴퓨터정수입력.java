import java.util.Arrays;
import java.util.Iterator;

public class 문제10_컴퓨터정수입력 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		
		for (int i = 0; i < arr.length; i++) {
		arr[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		int total=0;
		
		for(int i:arr)
		{
			total+=i;
		}
		
		System.out.println("총점은"+total);
		System.out.printf("평균운 %.1f입니다",(total/10.0));
		System.out.println();
		System.out.printf("%.2f",89.398);
		
		
	}
}
