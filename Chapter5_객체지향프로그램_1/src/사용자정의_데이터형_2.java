// 데이터 / 기능
// 명사형 / 동사형 

/*
 *	
 * 
 * 	---------- 모든것 단순화 => 객체 지향 프로그램 
 * 	시계 초짐, 분침, 시침
 * 
 *	클래스
 * 	***= 변수 여러개 저장하는 공간 => 사용자형 데이터형 (데이터형 클래스)
 * 	  	~VO(Spring) , DTO(MyBatis) , ~Bean(JSP)
 * 		value object
 * 	***= 기능만 설정하는 클래스 : ~DAO , ~Service , ~Manager
 * 	  데이터베이스 연결, 브라우저 전송 ... , Jsoup
 * 	= 변수 + 메소드 혼합 => 극히 드물다.
 * 
 * 
 *		= 변수 + 메소드 혼합 
 */
// ---- 커뮤니티 CURD(IUSD)
/*
 * 	배열로 잡으면
 * 	int[] no
 * 	String[] name
 * 	배열로 클래스를 만들면 매우 어렵다.
 * 	
 */
class Board{
	int no;			//0
	String name;	//null
	String subject;	//null
	String content;	//null
	String pwd;		//본인여부
	String regdate;	//null
	String nome;
	int hit;
}

public class 사용자정의_데이터형_2 {
	public static void main(String[] args) {
		Board b1=new Board();
		System.out.println("b1="+b1);
		//b1안에 데이터가 총 7개가 들어 있따. no,name,subject,content,pwd,regdate,hit
		b1.no=1;
		b1.name="홍길동";
		b1.subject="메모리 공간 만들기 (사용자 정의)";
		b1.content="class 이용해서 데이터를 모아서 관리";
		// b1.content = class를 이용해서 데이터를 모아서 관리
		b1.regdate="2023-04-12";
		b1.pwd="1234";
		b1.hit=0;
		
		
		System.out.println("게시물 번호: "+b1.no);
		System.out.println("작성자: "+b1.subject);
		System.out.println("제목: "+b1.content);
		System.out.println("비밀번호: "+b1.pwd);
		System.out.println("내용: "+b1.regdate);
		System.out.println("값안주면: "+b1.nome);
		System.out.println("조회수: "+b1.hit);
		
		}
}











































