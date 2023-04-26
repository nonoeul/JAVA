/*
 *		if()
 *		{
 *			int a=10
 *			if()
 *			{
 *			int b=10 
 * 			}
 * 			// int b가 사라진다.
 * 		}
 * 		// int a가 사리잔다.
 * 		블록 안에서만 사용하는 것을 "지역변수"라고 한다. => 스택 (메모리에 의해서 자동 삭제)
 * 		지역변수(블록변수_ ==> 스택 (메모리에 의해서 자동 삭제)
 */

/*
*	while => 형식 
* 	초기값 ---------1
* 	while(조건식)---2
* 	{
* 		반복 수행문장-3
* 		증가식------4
* 	}
* 	=> 무한루프를 걸떄 많이 사용(네트워크 서버, 데이터베이스 값 읽기, 파일읽기)
* 	=> 파일읽기 => -1(EOF)
*/
public class 반복문_1_1while_dowhile {
	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 10; i++)
		{
			System.out.print(i+" ");	
		}
		
		System.out.println("\n====================");

		for (char c='A'; c<= 'Z'; c++)
		{
			System.out.print(c+ " ");			
		}
		
		System.out.println("\n====================");

		for (char c='A'; c<= 'Z'; c++)
		{
 			System.out.print(c++ + " ");			
		} // c는 삭제 c=A는 삭제 다시 위로 올라가서 c=B를 할당한다. 무한반복
		
		System.out.println("\n======While=========");
		
		int i=1;
		while (i<10) // 조건식(종료점) => 1이 10이되면 종료 
		{  
			System.out.print(i+" ");
			i++; // 제어 1~10이 될 때까지만 증가 // 1이 될 때 빠져나간다. (종료시까지 제어)
		}
		
		System.out.println("\n=================");
		
		char B='A'; // 출력용
		i=0;
		while(i<26)
		{
			System.out.print(B++ + " ");
			i++;
		}
		
		// do-while : 흐조건 => 무조권 1번은 수행한다.
/*
 * 		do~while : 후조건 => 무조건 1번은 수행한다.
 * 		형식)
 * 			초기값 ==-> 1
 * 			do
 * 			{
 * 				반복실행문장 ==> 2
 * 				증가식 ===> 3
 * 			}	while(조건식) ===> 4 ===> true => 2번이동
 * 								   ===> false => 종료
 * 			
 * 		int i=1;
 * 		do
 * 		{
 * 			system.out.print(i+" ");
 * 			=> i=1 i=2
 * 			i++;
 * 			=> i=2 i=3 i=4 .... i = 11
 * 		}	while(i<10);
 * 
 * 		WHY while vs dowhile
 * 		while문은 조건을 먼저 따지고 출력 // 한번도 출력 안될 수도 있음
 * 		do-while문은 증가를 먼저하고 조건을 검색 // 무조건 한번은 출력 	
 */
		System.out.println("\n=======do-while=========");
			
		i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		System.out.println("\n========================");
		
		i=1;
		char C='A';
		do {
			System.out.print(C++ + " ");
			i++;
		}while(i<=26);
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
