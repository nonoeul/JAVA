// ID/PWD를 받아서 로그인 처리
import java.util.Scanner;
/*
 * 	리턴형은 경우의 수이다.
 * 	경우의 수 두 개. =>	boolean 처리
 * 	경우의 수 세 개. =>	int, String 
 * 				1.	ID가 없는 경우 
 * 				2.	ID는 존재 / Password가 틀린 경우
 * 				3.	ID, PWD 
 * 				-------------------------------
 * 프로그램 개발할때	1. 재사용
 * 				2. 견고해야한다.
 * 				3. 가독성이 좋아야 한다. 
 * 
 * 
 * 
 */
public class 메소드_2 {
	static String isLogin(String id,String pwd)
    {
    	String[] ids={"hong","park","shim","lee","kang"};
    	String[] pwds={"1234","3456","4567","5678","6789"};
    	String[] names={"홍길동","박문수","심청이","이순신","강감찬"};
    	// 파일 , 오라클 , 메모리에 저장 (휘발성)
    	
    	//id검색
    	int index=0;
    	boolean bCheck=false;
    	for(int i=0;i<ids.length;i++)
    	{
    		if(id.equals(ids[i]))
    		{
    			bCheck=true; //ID가 존재한다 
    			index=i;
    			break;
    		}
    	}
    	
    	
    	String result="";
    	if(bCheck==true)
    	{
    		//ID가 존재
    		//비밀번호 검색
    		if(pwd.equals(pwds[index]))
    		{
    			result=names[index]; // 로그인된 상태 
    		}
    		else
    		{
    			result="NOPWD"; // 비밀번호가 틀리다 
    		}
    	}
    	else
    	{
    		//ID가 없는 상태
    		result="NOID";
    	}
    	
    	return result;
		
				
	}
	
	// 조건이 3개 이상이면 string을 통해 비교한다.
	// boolean은 true false 한 개의 조건 밖에 비교하지 못한다.
	// 그러다보니 여러 조건들이 생겨버리면 조건과 결과값을 출력하지 못한다
	// 그러므로 string을 통해서 처리하자. 
	
	
	
	static void process()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("ID 입력:");
    	String id=scan.next();
    	
    	System.out.print("Password 입력:");
    	String pwd=scan.next();
    	
    	// 검증 (로그인 처리)
    	String result=isLogin(id, pwd);
    	
    	if(result.equals("NOID")) // 아이디가 없는 상태
    	{
    		System.out.println("아이디가 존재하지 않습니다!!");
    	}
    	else if(result.equals("NOPWD")) // 비밀번호가 틀린 상태
    	{
    		System.out.println("비밀번호가 틀립니다");
    	}
    	else //로그인된 상태
    	{
    		System.out.println(result+"님 로그인되었습니다");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}
}
















