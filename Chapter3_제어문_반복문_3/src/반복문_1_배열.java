/*
 * 
 * 	반복문 : 유사한 내용이 여러번 반복할떼 주로 사용
 * 	영화목록 , 맛집목록 , 메인 화면	
 * 
 * 
 * 	종류 : 반복횟수가 정해져 있는 경우 : for문을 쓴다.
 * 		  반복횟수가 정해지지 않은 경우 : while
 * 		  한 번 이상 수행이 가능 : do~while
 * 		  == 자바에서는 출력, 제어할떄 for (2차 중첩)
 * 		  == 데이터베이스, 네트워크 ==> while문 (1차) 
 * 	형식 :
 *		  for문	 (1)  (2)  (4)     
 *			for(초기값;조건식;증가식)
 *			{	    (3)
 *				반복 수행문장
 *			}
 *
 * 		  while문
 * 		  do~while
 * 		  for => 2차
 * 
 * 	while문 // false이면 바로 종료, 출력조차 하지 않는다. 
 * ----------------------
 * 초기값-----------------1
 * while(조건문)----------2
 * 	{
 * 		반복문장 수행문장----3
 * 		증가식 -----------4 => [true 수행(2번이동),false 종료]
 * 	}
 * 
 * 	do~while문 // false여도 무조권 한 번은 수행한다.
 * ----------------------
 * 	초기값----------------(1)
 * 	do{
 * 		반복 수행문장-------(2)
 * 		증가식------------(3)
 * 	}while(조건문)--------(4)
 * 
 * 	for => 2차
 * 
 * 
 * 
 */
public class 반복문_1_배열 {
	public static void main(String[] args) {
		String[] food= {
				"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기 ",
				"아삭아삭한 고추된장박이",
				"누텔라 견과류 토스트 만들기",
				"시래기갈치조림 고추장 양념장 저녁메인반찬 추천 ",
				"중국식 만능소스 마늘소스 ",
				"새송이버섯버터굴소스볶음 간단반찬 ",
		};			
		
		String[] chef= {
				"A",
				"B",
				"C",
				"D",
				"E",
		};			
		
		for(int i=0;i<5;i++)
		{
			System.out.println(food[i]+"("+chef[i]+")");
		}
		
		
		
		
		
		
		
		
	}
}
