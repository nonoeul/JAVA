// 가위바위보 게임 
/*
 * 
 * 		컴퓨터	사용자	
 * 		가위0		가위0		0	비김
 * 				바위1		-1	사용자
 * 				보보2		-2	컴퓨터
 * 
 * 		바위1		가위0		1	컴퓨터
 * 				바위1		0	same
 * 				보보2		-1	사용자
 * 
 * 		보보2		가위0		2	사용자
 * 				바위1		1	컴퓨터
 * 				보보2		0	비김
 * 	비기는 경우 : 0
 * 	사용자	 : -1, 2 
 * 	컴퓨터	 : -2, 1
 * 
 */
import java.util.Scanner;
public class 반복문_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("값을 입력하세요");
		
		int win=0,lose=0,same=0;
		while(true)// while문 무한루프 // for(;;)문 무한루프
		{
			System.out.print("가위(0),바위(1),보(2),종료(9)");
			// 컴퓨터 난수 발생
			int com=(int)(Math.random()*3);//0,1,2
			int user=scan.nextInt();
			
			if(user==9)
			{
				System.out.println("게임 종료!!");
				System.exit(0);
				break;
			}
		
			if(com==0) {// 컴퓨터는 한 번만 출력 중복x 다중if문이 적합
				System.out.println("컴퓨터:가위");
			} else if(com==1) {
				System.out.println("컴퓨터:바위");
			} else if(com==2) {
				System.out.println("컴퓨터:보");
			}
			
			if(user==0) { // 
				System.out.println("유저:가위");
			} else if(user==1) {
				System.out.println("유저:바위");
			} else if(user==2) {
				System.out.println("유저:보");
			}
			
			switch(com-user) {
			case -1: case 2:
				System.out.println("사용자 win");
				win++;
				break;
			case 0:
				System.out.println("비겼다.");
				same++;
				break;
			case 1: case -2:
				System.out.println("컴퓨터 윈.");
				lose++;
				break;
				
			}			
		}
			//while문 종료
			System.out.println("결과값 출력");
			int total=win+lose+same;
			System.out.printf("%d전 %d승 %d패 %d무\n",total,win,lose,same);

		}
	}