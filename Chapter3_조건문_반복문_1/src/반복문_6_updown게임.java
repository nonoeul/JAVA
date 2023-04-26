// updown 게임 
/*
 * 컴퓨터 난수 발생 (1~100 사이 난수)
 * => 사용자가 입력을 했을 때 맞추기 힘듬
 * => 사용자가 맞출 수 있게 힌트를 제공 업,다운 제공
 * => for문의 횟수?? 몇 개를???
 * 		=> 무한루프를 줘여한다. 맟출떄까지 계쏙 
 * => for문의 무한루프 (;;) 범위도 없고, 조건식, 증감식이 없는 식이 무한루프
 * 
 */

import java.util.Scanner;
public class 반복문_6_updown게임 {
	public static void main(String[] args) {
		int com=(int)(Math.random()*100)+1;
		int count=0;
		Scanner scan = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("1~100까지 사이의 정수를 넣어 맟춰보세요");
			int user=scan.nextInt();
	if(user>=1 && user<=100) {	
		count++; // 올바른 값을 입력했을때만 입력값을 출력할 수 있게 해준다. 잘못된 값을 입력하면 카운트 xx
		if(user>com)
		{
			System.out.println("입력한 수보다 작은 값을 입력하세요(UP)");

		} else if(user<com) {
			System.out.println("입력한 수보다 큰 값을 입력하세요(down)");
		
		} else if(user==com) {
			System.out.println("Game over!!");
			System.out.println("총 입력한 값은"+count+"입니다");
		 	System.exit(0);
			}
	} else {
		System.out.println("잘못된 입력입니다!!"); // 잘못된 값일떄 연산처리를 하면 안됀다.
	
		
		
		
			}
		}
	}
}