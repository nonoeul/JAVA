import java.util.Iterator;

public class 문제2_4의배수가아닌값 {
	public static void main(String[] args) {
		
		int sum=0;
		int score=0;
		
		for (int i = 100; i <= 999; i++) 
		{
			if(i%4!=0) // 단일if문만 쓸 경우 아래에 딱 한문장
			{
				sum+=i; // {}괄호를 만들어주지 않으면 이것만!! 인식된다.
				score++; // {}괄호로 묶어줘야지 이것까지 인식된다.
			}
		}
			System.out.println("4의 배수가 아닌 총합은 "+sum);
			System.out.println("4의 배수가 아닌 총 갯수는 "+score);
		
			
		
		
		
	}

}
