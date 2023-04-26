/*
 * 
 * 	i=2 , j=1
 * 	i=2 , j=2
 * 	i=2 , j=3
 * 	i=2 , j=4
 * 	i=2 , j=5
 * 
 * 	for문을 여러개 합쳐 놓은 것을 간단하게 2차 for문이라고 생각하면 됀다.!!
 */
public class 중첩반복문_1_1_for구구단 {
	public static void main(String[] args) {
		for (int i =1 ; i <= 10; i++) 
		{
			System.out.println(" ");
			System.out.println(i+"단 구구단");
			for (int j = 1; j < 10; j++) 
			{
				System.out.printf("%d*%d=%d",i,j,i*j);
				System.out.println(" ");
			}	
				System.out.println();
	
		}
			
	}
}
