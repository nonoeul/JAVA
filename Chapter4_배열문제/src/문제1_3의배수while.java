


public class 문제1_3의배수while {
	public static void main(String[] args) {
		
		int sum=0,i=1;
		while(i<100) {
			if(i%3!=0) {
				i++;
				continue;
			}
			else sum+=i;
					i++;
		}
		System.out.println("3의배수의값은"+sum);
		
		
	}
}
