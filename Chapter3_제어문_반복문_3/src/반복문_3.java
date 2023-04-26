// 3의 배수, 5의 배수, 7의 배수의 합 => 갯수
public class 반복문_3 {
	public static void main(String[] args) {
		int a3=0,a5=0,a7=0;
		int c3=0,c5=0,c7=0;
		
		// 중복적으로 수행되는 것이 있다면 => 단일조건
		// 중복적으로 수행되는 것이 없다면 => 다중조건 
		// 3의 배수 5의배수 7의 배수 모두 겹치는 것이 있다.
		int i=1; // 초기값
		while(i<=100) // 조건
		{
			i++; // 증가식
			if(i%3==0) 
			{
				a3+=i;
				c3+=1;
			}	
			if(i%5==0) 
			{
				a5+=i;
				c5+=1;
			}			
			if(i%7==0) 
			{
				a7+=i;
				c7+=1;
			}		
		}
		System.out.println("=====결과값=====");
		System.out.println("1~100 사이의 3의 배수"+a3+"갯수는"+c3);
		System.out.println("1~100 사이의 3의 배수"+a5+"갯수는"+c5);
		System.out.println("1~100 사이의 3의 배수"+a7+"갯수는"+c7);
		}
}
