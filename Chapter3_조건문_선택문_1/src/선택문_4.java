// 중첩 switch
/*
 *	if문 중첩
 *		if()
 *		{
 *			if()
 *			{
 *			}
 *		}
 *		// 특별한 경우가 아니면 거의 사용빈도가 없다.
 *		
 *	switch()
 *		{
 *			case 값:
 *			switch()
 *			{
 *
 *			}
 *		}
 */
// 가위바위보 
/*
 * 	가위
 * 		가위
 * 		바위
 * 		보
 * 	바위
 * 		가위
 * 		바위
 * 		보
 * 	보
 * 		가위
 * 		바위
 * 		보
 * 			
 */
import java.util.Scanner;
public class 선택문_4 {
	public static void main(String[] args) {
		// 컴퓨터가 먼저 가위바위보를 설정
		// 사용자 입력
		// 비교(처리) => 결과값 출력
		// 변수 설정 => 변수에 대한 처리 => 결과값 출력
		
		int com=(int)(Math.random()*3);
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt();	
		
		switch (com)
		{
		case 0: 
			System.out.println("컴퓨터: 가위");
			break;
			// break 밑에 소스 코딩이 있는 경우 오류가 발생한다. 
		case 1:
			System.out.println("컴퓨터: 바위");
			break;
		case 2:
			System.out.println("컴퓨터: 보");
			break;
		}	
			
		switch (user)
			{
			case 0: 
				System.out.println("유저: 가위");
				break;
				// break 밑에 소스 코딩이 있는 경우 오류가 발생한다. 
			case 1:
				System.out.println("유저: 바위");
				break;
			case 2:
				System.out.println("유저: 보");
				break;
		}
		
		
		switch(com)
		{
		
		case 0: // 가위
			switch (user)
			{
			case 0: // 가위
				System.out.println("비겼다.");
			
			case 1: // 바위
				System.out.println("유저 윈.");
				
			case 2: // 보
				System.out.println("컴퓨터 윈.");	
			}
			break;
		
		case 1: // 바위
			switch (user)
			{
			case 0: // 가위
				System.out.println("컴퓨터 윈.");
				break;
			case 1: // 바위
				System.out.println("비겼다..");
				break;	
			case 2: // 보
				System.out.println("유저 윈.");
				break;
			}
			break;
		
		case 2: // 보
			switch (user)
			{
			case 0: // 가위
				System.out.println("사람 윈.");
				break;
				
			case 1: // 바위
				System.out.println("컴퓨터 윈");
				break;
				
			case 2: // 보
				System.out.println("비겼다..");
				break;
			}
			break;
			}
		}
	}		
		
		
		
		
		
		
		
	

