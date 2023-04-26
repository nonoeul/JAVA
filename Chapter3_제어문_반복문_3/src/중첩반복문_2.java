import java.util.Iterator;

/*
 * 
 * 	i<=j i = 줄의 갯수 만큼 / j의 별의 갯수가 증가한다.
 * 	★
 * 	★★
 * 	★★★
 * 	★★★★
 * 	★★★★★
 * 
 * 	j=5i i = 줄의 갯수 만큼 j 별의 갯수를 빼준다. 
 * 	★★★★★
 * 	★★★★
 * 	★★★
 * 	★★
 * 	★
 * 
 */	

public class 중첩반복문_2 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("★");
			}
				System.out.println(" ");
		}
		
		System.out.println("========별표 출력========");
		
			
		for (int i = 0; i <= 5; i++) 
		{
			for (int j = 0; j <= 5-i ; j++) 
			{
				System.out.printf("*");
			}
				System.out.println(" ");
		}
		
		System.out.println("============영어출력1============");
			
		char c = 'A';
		for (int i = 0; i <=4; i++) 
		{
			for (int j = 1; j < i; j++) {
				System.out.println(c++);
			}
		}
		
		System.out.println("============영어출력1============");
	
		for (int i = 0; i <=4; i++) 
		{
			char b = 'A';
			System.out.println();
			for (int j = 1; j < i; j++) {
				System.out.print(b++);
			}
		}
		
		System.out.println();
		System.out.println("============다음문============");
		
		for (int i = 1; i < 5; i++) 
		{ 
			System.out.println("");
			
			for (int j = 1; j < 5; j++) 
			{
				if(i==j)
					System.out.print("#");
				else
					System.out.print(j);
			}
		
		}
		
		System.out.println("============다음문============");	
		
	}
}

		