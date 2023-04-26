import java.util.Scanner;
/*
 *		같은 문자열인지 확인
 *		=> 기본형 (==,!=)
 * 		=> 문자열 비교 (equals()//같다 , !equals()//같지않다)
 * 		=> login => id , password 
 * 
 */
public class 문자열_3_목록_가수_노래_종료 
{
	public static void main(String[] args) 
	{
		final String ID="hong"; // 절대 변하지 않는 값, 다른 값이 들어갈 수 없다.
		final String PWD="H1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next(); // 대소문자를 구분하기 떼문에 id,ID는 다르다.
		System.out.print("비밀번호 입력:");
		String pwd=scan.next();
		
		//로그인
		if(id.equalsIgnoreCase(ID) && pwd.equalsIgnoreCase(PWD)) // false가 나온다. 문자열은 == 가지고 비교될 수 없다
		// string 안에는 문자열이 존재하는데 
		// [==]은 주소값으로 비교를 한다.
		// [equals]은 내용을 가지고 비교한다. => 메모리에 저장된 실제 문자열 비교, 대소문자 구분
		// [equalsIgnoreCase]는 대소문자를 구분하지 않고 비교한다. // [equals]는 대소문자를 구분한다.
		{
			System.out.println(id+"님 로그인 되었습니다.");
		}
		else
		{
			System.out.println("아이디나 비밀번호가 틀립니다.");
		}
		
		
		
		
		
	}
}
