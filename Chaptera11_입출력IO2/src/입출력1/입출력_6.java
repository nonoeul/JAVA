package 입출력1;
//한글 깨짐 방지 => UTF-8 => AWS(리눅스)
import java.io.*;
import java.util.*;
// Properties => Spring / Spring-Boot 
// 형식 => Map
// 키=값 ==> 데이터베이스 정보 저장 ==> 사용자 계정 / 비밀번호 ==> 데이터베이스는 사라진다. 
public class 입출력_6 {
	public static void main(String[] args) throws Exception {
		
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\javaDev\\javastudy\\Chaptera11_입출력IO2\\src\\입출력1\\db.properties"));
		String driver=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		//시스템 정보 
		Properties prop2=System.getProperties();
		System.out.println(prop2.getProperty("java.version"));
		System.out.println(prop2.getProperty("user.language"));
		
		Properties prop3=new Properties();
		prop2.setProperty("name", "홍길동");
		prop2.setProperty("sex", "남자");
		prop2.setProperty("age", "25");
		//전부 다 문자열이다. 문자열이란느 사실을 알자. 만약 숫자가 필요하면 숫자로 형변환을 한 뒤 값을 처리해야한다.
		//이제 부터는 전부 문자열!! Wrapper클래스로 형변환을 해줘여 한다 .
		prop2.store(new FileOutputStream("info.properties"), "회원정보");
		
		Properties prop4=new Properties();
		prop4.load(new FileInputStream(""));
		prop4.load(new FileInputStream("C:\\javaDev\\javastudy\\Chaptera11_입출력IO2\\info.properties"));
		String name=prop4.getProperty("name");
		String sex=prop4.getProperty("sex");
		String age=prop4.getProperty("age");
		System.out.println(name);
		System.out.println(sex);
		System.out.println(age);
		// 키가 중복되면 안된다. (Map)
		// 이동 화면 board.list=http://localhost~
		// properties => xml => json
		
	}
}














