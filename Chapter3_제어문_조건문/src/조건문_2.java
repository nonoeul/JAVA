/*
 * 
 * 
 * 
 * 
 */
// 정수를 입력을 받아서 3의 배수,5의 배수,7의 배수인지 확인, 아닌 경우에는 배수가 아니다.

public class 조건문_2 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*100)+1;
		if(num%3==0)
			System.out.println(num+"는 3의 배수입니다");
		else if(num%5==0)
			System.out.println(num+"는 5의 배수입니다");
		else if(num%7==0)
			System.out.println(num+"는 7의 배수입니다");
//		if(!(num%3==0 || num%5==0 || num%7==0))		
		else
			System.out.println(num+"는 해당 배수가 아닌 수입니다.");
		
		//단일 조건문일때는 75는 3과 5의 배수로 두개가 출력됄 수 있다.
		System.out.println("---------------------------");
		//다중 조건문은 false가 나오면 넘기기 때문에 3과 5의배수라도 3의 배수만 출력되고 종료된다
		
		int Num=(int)(Math.random()*100)+1;
			if(Num%3==0)
			{
			System.out.println(Num+"는 3의 배수입니다");
			}
		
			if(Num%5==0)
			{
			System.out.println(Num+"는 5의 배수입니다");
			}
	 
			if(Num%7==0)
	 		{
			System.out.println(Num+"는 7의 배수입니다");
	 		}
			if(!(Num%3==0 || Num%5==0 || Num%7==0))		
			{
			System.out.println(Num+"는 해당 배수가 아닌 수입니다.");
			}
				
		}
}
