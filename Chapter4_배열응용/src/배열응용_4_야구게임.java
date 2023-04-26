

	import java.util.Arrays;
	import java.util.Scanner;
	/*
	 *		숫자 야구게임
	 * 		1. 컴퓨터 => 임의의 숫자 3개 발생 (1~9까지 중복 없는 난수)
	 * 	       [3 6 9]
	 * 		2. 사용자가 숫자를 입력해서 발생된 난수를 맞추는 게임
	 * 		3. 힌트 
	 * 		   [2 9 6]
	 * 		   ----->0S-2B // 2B가 나오면 같은 숫자가 두 개가 있는데
	 * 			OS = 다른 위치에 존재한다는 의미
	 * 	       [3 7 8] 이 나왔는데 3을 맞쳤으면
	 * 			1S-0B // 1은 맞혔는데 2개는 다른 자리에 다른 숫자이다.
	 * `	   [3 9 8]
	 * 			1S-1B // 3은 맞고 자리도 맞는데 9는 숫자는 맞는데 자리가 틀리다. 
	 * 			
	 */
	public class 배열응용_4_야구게임 {
		public static void main(String[] args) {
			int com[]=new int[3];	// 컴퓨터 난수
			int user[]=new int[3];	// 유저 난수
			
			
			for (int i = 0; i < com.length; i++) 
			{   
				com[i]=(int)(Math.random()*9)+1;
			}
			System.out.println(Arrays.toString(com));
			
			Scanner scan=new Scanner(System.in);
			while(true)
			// while(true) true 사용 시 특정 조건 만족 시 무한루프 종료하기
			// while(false) 조건이 false이면 조건문이 실행되지 않을 수 도 있다.

			{
				System.out.println("세자리 정수를 입력:");
				int input=scan.nextInt();
				if(input<100 || input>999) // 세자리이기 때문에 
				{
					System.out.println("잘못된 입력입니다!!!");
					continue; // 처음부터 다시 시작해라!
				}
				// 세자리 정수를 입력했다면
				user[0]=input/100; // 100자리 짤렸다. ex '369'
				user[1]=(input%100)/10; // 369%100=69/10='6'
				user[2]=(input%10); // '9' 
				
				// 1. 같은 정수를 입력하면 안된다. 
				if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
				{
					System.out.println("중복된 수는 사용 할 수 없습니다.");
					continue;
				}
				// 2. 0을 포함 할 수 없다. 
				if(user[0]==0||user[1]==0||user[2]==0)
				{
					System.out.println("0은 사용할 수 없습니다.");
					continue;
				}
				// 힌트 준비를 해야 한다. 
				int s=0;
				int b=0;
				for (int i = 0; i < com.length; i++) 
				{
					for (int j = 0; j < user.length; j++) 
					
						if(com[i]==user[j])
						{
							if(i==j)
								s++;
							else
								b++;
						}
					}
				// 힌트 제공
				System.out.println("==============");
				
				System.out.print("S:");
				for (int i = 0; i < s; i++) 
				{
					System.out.print("●");
				}
				System.out.print("\nB:");
				
				for (int i = 0; i < b; i++) 
				{
					System.out.print("○");
				}
				
				System.out.println("\n==============");
				
				System.out.printf("Input:%d,Result:%dS-%dB\n",input,s,b);
				
				
				if(s==3)
				{
					System.out.println("Game Over!!");
					break;
				}
			
				
				// 종료시점을 정해야 한다. ==> S=3이 될 떄 종료 
				}	
			}
			
		}









