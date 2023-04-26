
public class 반복문_4_3의배수_5의배수 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		int sum7=0;
		int count7=0;
		
		for (int i = 1; i < 100; i++) {
			if(i%3==0)
			{
			sum+=i;
			count++;
			}
			{
			if(i%7==0)
				sum7+=i;
				count7++;
			}
	}
		System.out.println("3의 배수의 합계는"+sum+" 3의 배수의 갯수는"+count);
		System.out.println("7의 배수의 합계는"+sum7+" 7의 배수의 갯수는"+count7);
}
}
