import java.util.Scanner;

class Sawon
	{
	// 인스턴스 변수 { // 클래스 메모리에 저장된다. 
	int sabun;
	String name;	// 이름
	String dept;	// 부서
	String job; 	// 직위
	String loc; 	// 근무지
	long pay; 		// 연봉
	// 인스턴스 변수 }
	/////////////////////
	static String compony; // 회사, 공유하는 변수이다. static
	////// 메모리 공간이 1개만 설정 => 컴파일러에 의해 자동 생성
	////// new없이 사용이 가능
	}



public class 사용자정의_데이터형_5 {
	public static void main(String[] args) 
	{
		
		Sawon.compony="kkk"; // 공유변수, 클래스 변수
		//static 변수는 메모리에 저장되어 있기 때문에
		//따로 new 연산자로 생성하지 않고 바로 사용 가능하다.
		//공유변수, 클래스변수 (클래스명으로 접근이 가능)
		
		
		Sawon hong=new Sawon();
		hong.sabun=1;
		hong.name="홍길동";
		hong.dept="개발부";
		hong.job="대리";
		hong.loc="서울";
		hong.pay=4500;
		hong.compony="ABC";
		Sawon shim=new Sawon();
		shim.sabun=1;
		shim.name="심";
		shim.dept="니발부";
		shim.job="래리";
		shim.loc="어울";
		shim.pay=5500;
		shim.compony="ABC";
		Sawon park=new Sawon();
		park.sabun=1;
		park.name="망맹이";
		park.dept="다발부";
		park.job="미리";
		park.loc="지울";
		park.pay=7500;
		park.compony="ABC";
		
// 1. 만약 ABC회사가 망했다. => 회사명 변경
		hong.compony="BCD"; // 저장공간이 바뀐다.
		System.out.println("회사명?:"+hong.compony);
		System.out.println("회사명?:"+shim.compony);
		System.out.println("회사명?:"+park.compony);
	// static은 공동변수이므로 한 개라고 바꾸면 동일한 값을 가지고 있는
	// 모든 값이 변한다. 
	
// 2. 모든 회사가 바뀌었다면?
		shim.compony="CDE";
		park.compony="GHJ";
		System.out.println("회사명?:"+hong.compony);
		System.out.println("회사명?:"+shim.compony);
		System.out.println("회사명?:"+park.compony);
		
// 3. 지역 변경 
		hong.loc = "부산";
		System.out.println("회사명?:"+hong.loc);
		System.out.println("회사명?:"+shim.loc);
		System.out.println("회사명?:"+park.loc);
		// loc 지역은 공통변수 static가 아니므로 변화하지 않는다. 
		
		
		
	}
	
}
