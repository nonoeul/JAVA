import java.util.Arrays;

public class 문제4_배열선언 {
	public static void main(String[] args) {
		int[] c=new int[10];
		System.out.println(Arrays.toString(c));
		
		int[] arr= {1,2,3,4,5};
		for (int i:arr)
		{
			System.out.print("i="+i+" ");
		}
		
		System.out.println();
		
		char[] day = {'일','월','화','수','목','금','토'};		
		for(char i:day)
		{
			System.out.print("day="+i+" ");
		}
		
		System.out.println();
		
	
		
	}
}
