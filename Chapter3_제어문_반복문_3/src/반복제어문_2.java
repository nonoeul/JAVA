import java.util.Scanner; 
public class 반복제어문_2 {
	public static void main(String[] args) {
		// 세자리 정수를 입력
		// 조건 : 0을 포함 할 수 없다.
		// 조건 : 같은 수를 입력할 수 없다.
		// continue은 break처럼 수행문을 중단시키지 않는다.
	Scanner scan=new Scanner(System.in);
	while(true)
	{
		System.out.println("세자리 정수를 입력");
		int input=scan.nextInt();
		if(input<100 || input>999)
		{
			System.out.println("잘못된 입력입니다");
			continue; // while문을 처음부터 다시 수행하게 만든다.
		}
		int a=input/100;
		int b=(input%100)/10; // (369%100)/10 ==> 69/10 ==> 6
		int c=input%10;
		System.out.println("input="+input);
		System.out.println("a="+a+",b="+b+",c="+c);
			// 0을 포함 할  수 없다.
		if(a==0 || b==0 || c==0)
		{
			System.out.println("0을 사용 할 수 없다.");
			continue;
		}
			// 같은 숫자가 있어서는 안된다. 
		if(a==b || b==c || a==c)
		{
			System.out.println("같은 숫자는 사용 할 수 없습니다.");
			continue;
		}
			//정상 수행시에는 
		System.out.println("입력값:"+input);
		break; // 종료하고 빠져나간다
			}
		}
	
	// for => 제외 (증가식) for문은 증가해서 올라가기 떄문에 continue를 쓰면 제외
	// while => 처음부터 다시 수행 (조건식) 처음부터 시작한다고 보면 된다.
		
	}
