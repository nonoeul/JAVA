
public class 문제5_1_1000까지7의배수9의배수 {
	public static void main(String[] args) {
	
		int sum7=0;
		int sum9=0;
		int total=0;
		
		for (int i = 1; i < 1000; i++) 
		{
			if ((i%7)==0) 
				sum7+=i;
			if ((i%9)==0)
				sum9+=i;
		}
			System.out.println("7의배수는"+sum7);
			System.out.println("9의배수는"+sum9);
			total=sum9+sum7;
			System.out.println("7과9의배수의 합은"+total);
		
		
	}
}
