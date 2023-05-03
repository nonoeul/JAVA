package 입출력1;
import java.io.*;
import java.net.*;
/*
  	자바네트워크란 Java.net패키지는 사용자가 네트워크 세부 구조를 모르더라도 네트워크의
  	기능을 편리하게 사용할 수 있는 기능들을 java.net 패키지로 제공하고 있다. 
  	java.net 패키지에서 제공되는 클래스들을 이용하여 네트워킹 관련프로그램을 손쉽게 작성이 가능 
  	
 		URLConnection => url.openConnection
 			  |
 		-------------
 		|			|
 	
 			 
  
  
 */
public class 입출력_5 {
	public static void main(String[] args) throws Exception 
	{
		
		URL url=new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn=
				(HttpURLConnection)url.openConnection();
		// 연결이 되었다면 
		if(conn!=null)
		{
			// 브라우저 => 1byte씩 전송 
			// 1byte => 2byte로 변환 => InputStreamReader
//		??InputStreamReader??
//		InputStreamReader 입력한 정보를 Reader로 바꿔라
//		입력한 정보를 Reader 1byte로 바꿔라
			BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			// 브라우저에는 byte코드로 보내야지 정상적으로 작동 UTF-8코드사용 
		while (true)
		{
			String data=in.readLine();
			//자바파일 한줄씩 읽어오기 readLine!! 
			if(data==null) break;
			System.out.println(data+"\n");
		}
		in.close();
		conn.disconnect();
		
		}
	}
}































