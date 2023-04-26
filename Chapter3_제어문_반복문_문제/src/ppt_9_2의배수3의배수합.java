
public class ppt_9_2의배수3의배수합 {
	public static void main(String[] args) {
		
		int a2 = 0;
		int a3 = 0;
		int sum = 0;
		for (int i = 0; i <= 12; i++) {
			if(i%2==0)
				a2+=i;
			if(i%3==0)
				a3+=i;
			}
		sum=a2+a3;
		System.out.println("2와 3의 배수의 합은"+sum);
		
			//if(i%2==0 || i%3==0)
			// 이렇게 계산할 경우 6같은 공동배수는 제외되서 합해진다. 조심!!
	}
}
