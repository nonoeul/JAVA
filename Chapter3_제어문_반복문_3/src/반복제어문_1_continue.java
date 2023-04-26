/*
 * 
 * 		반복제어문
 * 		=break
 * 			=> 반복문을 종료
 * 			=> 반복문(for, do~while, while) 선택문(switch~case)
 * 			=> break문 밑에는 소스 코딩이 불가능
 * 			for()
 * 			{
 * 				if()
 * 				{
 * 					break;;
 * 					// 코딩이 불가능하다.
 * 				}
 * 			}
 * 		=continue
 *			=> 특정 부분을 제외할 떄 사용된다.(반복문을 계쏙 수행) 
 *			=> 반복문(for,while,do~while)에서만 사용 가능 
 *			=> 웹에서는 특별한 경우에만 사용 
 *			
 */
public class 반복제어문_1_continue {
	public static void main(String[] args) {
		System.out.println("====break====");
		for (int i = 1; i <= 10; i++) 
		{
			if(i==5)
				break; // 5가 되면 바로 반복문 중단, 5는 출력할 수 업다.
			System.out.println(i+" "); // break가 중단되고 그 아래는 더 이상 작동X
		}
		
		/*
		 * 	for => break 종료 . continue => 증가식으로 이동
		 * 	while => break 종료 , continue => 조건식으로 이동 
		 * 					---------------while문의 continue는 처음부터 다시 실행할게
		 * 				    잘못하면 무한루프에 걸릴 수 있다.
		 * 
		 * 	int i=1;
		 * 	while(i<=10)
		 * 	{
		 * 		if(i==5)
		 * 			continue;
		 * 		system.out.print(i+" "); 1,2,3,4
		 * 		i++;
		 *	}
		 *
		 */
		
			System.out.println("\n=====continue=====");
			for (int i = 1; i <= 10; i++) {
				if(i==5) {
					continue; // continue는 특정 부분을 제외할 떄 사용이 된다.
				}
				System.out.print(i+" ");
			}
			
		
		//이렇게 하면 무한루프가 걸린다. 5에세 계속 멈춰버린다. 
		//continue을 잘못쓰면 무한리프에 걸릴 수 있다. 잘봐줘야 한다.
		System.out.println("\n================");
		int i=1;
		while(i<=10)
		{
			if(i==5)
			continue; // 5에서 더하지지 않고 계속해서 5에서 더 더해지지 못하고 조건식만
			// 비교한다 5 -> 5 -> 5 // 10까지 달성해야 멈추는데 멈추지 못한다.
			// 게임 : 잘못된 입력이 있는 경우 처음으로 돌아갈 떄 많이 사용된다
				System.out.println(i+" ");
				i++;
		}
		System.out.println("프로그램 종료");
		
/*		WHY continue 와 break
		continue = 부분만 제외하고 내려간다.
		break = 완전 멈춰버린다..		
*/		
	}
}
