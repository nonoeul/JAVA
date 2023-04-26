package 라이브러리_StringBuffer;
/*
 *	StrngBuffer
 *	-----------
 *	[1. String은 고정형 => 변경이 되면 새로운 메모리 생성
 *		1. 원본은 그대로 유지한다. 원본은 변하지 않는다. (변하지 않는 프로그램이다)  
 *		2. 변경시에 리턴형은 전부 String이다.
 *	
 * 	[2. StringBuffer 
 * 		String은 고정적인 값으로 값을 바꿀때마다 새로운 메모리공간에 새로운 객체를 만들어야 한다.
 * 		값을 자주 바꿔야하는 경우 바꿀때마다 새 값이 만들어져야해서 속도가 느려지고 많은 메모리공간은 차지한다.
 * 		이런 단점을 보완해준 것이 StringBuffer이다. => 가변형 
 * 	??StringBuffer vs StringBuilder??
 * 		StringBuffer(비동기) 	= 프로그램이 한 개씩 수행된다.	멀티쓰레드 환경에서 안전한다.
 * 		StringBuilder(동기)	= 프로그램이 동시에 수행된다. 	단일쓰레드에서 성능이 안전하다. 
 * 
 * 	Stirng : 문자열 연산이 적고 멀티쓰레드 환경일 경우
 * 	StirngBuffer  : 문자열 연산이 많고 멀티쓰레드 환경일 경우
 * 	Stirngbuilder : 문자열 여산이 많고 단일쓰레드이거나 동기화가 고려하지 않ㅏ도 돼는 경우 
 * 
 * 	[3. 데이터가 많은 경우 => 문자열 결합 append
 * 	[4. 문자열 처리 속도가 매우 빠르다. => 사용하는 클래스 
 * 	[5. 처리 속도가 매우 빠르다 =>최적화
 * 	[6. 주요메소드
 * 		1. length() : 문자갯수
 * 		2. toString(): 객체를 문자열로 변환 string, stirng.valueof
 * 		3. delete 삭제 
 * 		4
 * 
 * 
 */
import java.io.*;
import java.net.*;
// java.net패키지 = 내트워킹 응용 프로그램을 구현하기 위한 클래스제공 
public class Buffer이론 {
	public static void main(String[] args) {
		try
		{
			StringBuffer sb=new StringBuffer();// StringBuffer라는 클래스 sb매개변수를 StringBuffer생성자르 생성 구현과 초기값지정 동시에
			// Buffer => 임시 기억장소
			URL url=new URL("https://www.10000recipe.com/recipe/list.html");
			// url이라는 매개변수에다가 url생성자를 만드는 것 
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			//서버연결
			
			if(conn!=null)
			{
				while(true)
				{
					BufferedReader br=
							new BufferedReader(
									new InputStreamReader(conn.getInputStream(),"UTF-8"));
											String msg=br.readLine();
											if(msg==null) break;
											sb.append(msg+"\n");
				}
				conn.disconnect();
			}
			System.out.print(sb.toString());
		}catch(Exception ex) {ex.printStackTrace();}
		
	}
}




















