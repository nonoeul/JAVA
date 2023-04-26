import java.util.Iterator;

public class ppt_10_4의배수 {
	public static void main(String[] args) {
	
		int sum=0;
		
		for (int i = 1; i <= 100; i++) 
		{
		if(i%4!=0)
			sum+=i;
		}
		System.out.println("4의 배수의 합계는"+sum);
	}
}
