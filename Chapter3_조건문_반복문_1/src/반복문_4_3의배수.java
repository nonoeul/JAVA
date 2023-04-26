// 3의 배수의 합, 갯수 확인
public class 반복문_4_3의배수 {
	public static void main(String[] args) {
		int sum=0,count=0;
		
		for (int i = 1; i < 100; i++) {
			if(i%3==0)
			{
				sum+=i; // 합계
				count++; // 갯수확인
			}
		}
		System.out.println("총합계는"+sum+" 총갯수는"+count);
	}
}
