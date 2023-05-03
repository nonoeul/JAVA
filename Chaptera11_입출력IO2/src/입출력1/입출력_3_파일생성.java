package 입출력1;

// 파일쓰기 
import java.io.*;

public class 입출력_3_파일생성 {
	public static void main(String[] args) {
		
		FileWriter out=null; // 파일 출력하기 
		// BufferedWritter
		FileReader in=null; // 파일읽기 
		// BufferedReader 
		try 
		{
			// 1. 파일 만들기 
			File file=new File("c:\\java_datas\\movie.txt");
			// file이라는 이름으로 c드라이브에 java_datas라는 파일을 만든다.
			if(!file.exists())
			{
				//파일을 생성
				file.createNewFile();
			//만약 java_datas라는 파일이 없다면 c드라이브에java_datas파일을 만들어라 
			}
			// 파일 읽기
			in=new FileReader("c:\\javaDev\\movie.txt");
			out=new FileWriter(file);
			out=new FileWriter("c:\\java_datas\\movie.txt");
			// 생성된 파일쓰기 
			int i=0;
			while((i=in.read())!=-1)
			{
				out.write(i);
			}
			System.out.println("파일 읽기/쓰기 완료");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
				out.close();
			}catch(Exception ex) {}
		}
		
		
		
	}
}






















