package io1;
/*
  FileInputStream : 단위 byte(1byte씩 읽어온다)
  	=> 한글포함된 데이터는 읽을 수 있는데 한글이 깨진다.
  		----------FileReader
  		.zip, .ppt, .png => 업로드/다운로드
  		----------
  	=> 주요메소드 
  		read() => 1byte => 리턴형 => int 
  		close() 닫기
  	=> 생성자
  		new FileInputStream(File file)
  		new FileInputStream(String path)

 */



public class FileInputStream {
	public static void main(String[] args) {
		
	}
}
