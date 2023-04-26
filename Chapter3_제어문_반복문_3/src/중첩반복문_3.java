import java.util.Iterator;

/*
 * 
 *		i	k	j	i/k		i/j
 * 		홀수	공백	별표
 * 		1	3	1
 * 		2	2	2
 * 		3	1	3
 * 		4	0	4	
 * 
 */
public class 중첩반복문_3 {
	public static void main(String[] args) {
		char c='A';
		for (int i = 1; i <= 6; i++) 
		{
			for (int j = 1; j <= 7-i; j++) 
			{
				System.out.println(" ");
			}
			for (int k=1; k<=i*2-1; k++) 
			{
				System.out.print("*");
			}
		}
		
		
		
		
	}
}
