package 입출력1;
// BufferedReader / BufferedWriter => 필터스트링 

import java.io.*;
public class 입출력_4_c드라이브에생성 {
	public static void main(String[] args) throws Exception {
	// Java.io는 예외처리를 하지 않으면 오류가 발생한다. 하지만 throws을 통해 예외처리를 해주면
	// Exception에 해당하는 오류가 발생시 오류가 발생한 것을 Object(최상위 객체한테 전부 던져준다는 개념이다
	// 그래서 일일이 예외처리를 해줄 필요가 없다.
		FileWriter out=new FileWriter("c:\\java_datas\\movie_1.txt");
		// 파일 출력 c드라이브 java_datas파일에다가 movie_1.txt 파일을 출력해준다.
		// 추가 기능 new FileWriter("c:\\java_datas\\movie_1.txt",true)
		// 문자열 결합을 할거냐 문자열 결합을 안할 거냐에 대한 문제이다. 
		FileReader in=new FileReader("c:\\javaDev\\movie.txt");
		// 파일 입력 c드라이브 javaDev에 movie.txt파일을 입력해준다.
		BufferedReader br=new BufferedReader(in);
		// BufferedReader 파일을 읽어준다 // BufferedReader은 뭉탱이로 읽어주고 파일이 변경될때마다 새로운 객체를 만드는 것이 아니라
		// 덮혀쓰여주는 형태로 그 전 파일 형태를 버려버린다. 그래ㅔ서 파일 메모리 절약하고 속독 ㅏ빠르다 .
		BufferedWriter bw=new BufferedWriter(out); 	
		
		while(true)
		{
			String data=br.readLine();
			// 한줄단위로 파일을 읽는다.
			if(data==null) break;
			// 더 이상 읽을 파일이 없으면 그만 
			bw.write(data+"\n");
			// 파일 출력 한 줄씩 
		}
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
	}
}
