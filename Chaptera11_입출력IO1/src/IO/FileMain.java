package IO;

import java.io.File;

public class FileMain {
	public static void main(String[] args) {
		
	try
	{
/*
	file설정
		File file=new File("c:\\javaDev\\school.txt");
		// File 존재여부 확인
		if(!file.exists()) // 파일이 존재하지 않은 경우
		{
			file.createNewFile();
		}
		System.out.println("파일 만들기 성공...");
			 
*/
		File dir=new File("c:\\javaDev");
		//stream 인스턴스 생성 dir이라는 이름의 인스턴스를 생성하는 것이다
		File[] files=dir.listFiles();
		//파일 인스턴스 생성 
		for (File f : files) 
		{
			if (f.isFile()) 
			{
				System.out.println(f.getName()+" "+f.length());
			}
			else if(f.isDirectory())
				//Directory, boolean형태로 디렉토리인지 확인한다. 
			{
				System.out.println(f.getName()+" DIR");
			}
		}
	}catch(Exception ex) {}

	}
}
