/*
 *		1. 조건문 / 선택문
 *		   ------------ 상세보기 , 검색 , 로그인 , 아이디체크 , 우편번호 검색
 *		   ------------ 댓글 , 수정 , 삭제...
 *		   형식)
 *				if(조건문) => 조건문 (부정 연산자 , 비교연산자 , 논리연산자)
 *				{
 *					출력내용 => true일떄만 수행하는 문장
 *				}
 *	 			예) => 번호 3번인 내용을 출력해라 => 상세보기
 *				------------------------------------
 *				단일 : 속도가 늦다 (독립적인 문장)
 *				
 *				if(조건문)
 *				{
 *					조건이 false일떄 처리
 *				}
 *				예)
 *					if(로그인이 되었다면)
 *					{
 *						main으로 이동해라
 *					}
 *					else
 *					{
 *						회원가입으로 이동 
 *					}
 *
 *					if(아이디중복체크 => 중복이 되냐 안되냐)
 *					{
 *						이미사용중인 아이디입니다.
 *					}
 *					else
 *					{
 *						사용이 가능한 경우
 *					}
 *					
 *					if(검색할 떼)
 *					{
 *						검색된 내용 출력.
 *					}
 *					else
 *					{
 *						검색한 내용이 없습닌다.
 *					}
 *
 *					if(조건문)
 *					{
 *						조건문 true일떄 수행되는 문장 ==> 종료
 *						조건문 true일떄 .
 *					}
 *					else if{}
 *					{
 *						조건문 true일떄 수행되는 문장 ==> 종료
 *						조건문 true일떄 
 *					}
 *					else if{}
 *					{
 *						조건문 true일떄 수행되는 문장 ==> 종료
 *						조건문 true일떄 
 *					} 
 *					else 
 *					{
 *						해당 조건이 없을 떄 ==> 생략이 가능 
 *					}
 *
 *		조건이 두 개 인 경우	==> &&
 *		if( id.equals("") && pwd.equals("")))		
 *		{
 *		}
 *		=====================================
 *		if( id.equals())
 *		{
 *			if(pwd.equals("")
 *			{
 *				로그인
 *			}
 *			else
 *			{
 *				비밃번호 틀립니다.
 *			}
 *		}
 *		=====================================
 *
 *		선택문 : 네트워크 , 게임 (키값을 가지고 처리)
 *		switch(정수, 문자. 문자열)
 *		
 *		{
 *			case "Find"
 *			case "Login";
 *				처리
 *				break;			
 *			case "Login";
 *				처리
 *				break;
 *			...
 *			default;
 *		}
 *		
 *		case 1:
 *			문장1
 *			break
 *		case 2:
 *			문장2
 *			break		
 *		case 3:
 *			문장3
 *			break
 *		case 4:
 *			문장4
 *			break		
 *		case 5:
 *			문장5
 *			break
 *		
 *		switch()
 *		{
 *			case 1:
 *				int a=10;
 *				system.out.println(a);
 *				break;
 *			case 2:
 *				int a=20;
 *				system.out.println(a);
 *				break;
 *			case 3:
 *				int a=30;
 *				system.out.println(a);
 *				break;
 *			// 오류나는 코드이다. 같은 switchcase 문 안에 같은 변수(a)값을 쓰면 안된다.
 *		
 *
 *
 * 		2. 반복문
 * 		   ------------ 목록 , 페이징 (화면 출력)
 * 			1) for      : 반복횟수가 지정된 경우
 * 			2) while    : 반복횟수가 지정된 경우
 * 				=> 파일읽기, 데이터베이스 
 * 			3) do-while : 반복횟수가 지정된 경우
 * 
 * 		3. 반복 제어문
 * 		   ------------ 페이징 10개 반복하고 빠져나가야하기 떄문이다.
 * 		4. 
 * 
 */
public class 제어문_1 {
	public static void main(String[] args) {
		
		
					
					int i=1;	
					switch(i)
					{
		 			case 1:
		 			{
		 				int a=10;
		 				System.out.println(a);
		 				break;
		 			}
		 			case 2:
		 			{
						int a=20;
		 				System.out.println(a);
		 				break;
		 			}
					case 3:
					{
		 				int a=30;
		 				System.out.println(a);
		 				break;
					}
		 			}
					// 같은 switch문 블록안에서는 같은 변수를 사용 할 수 없다.
					// a를 사용할 수 없다.
		
		
		
	}
}

















