package 입출력_;

import java.io.*;
import java.util.*;

public class Object_InputOutput_1 {
	public static void main(String[] args) throws Exception{
		
		List<Sawon> list= new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","가","물",100));
		list.add(new Sawon(2,"박문수","나","불",200));
		list.add(new Sawon(3,"심청이","다","흙",300));
		list.add(new Sawon(4,"이순신","라","토",400));
		list.add(new Sawon(5,"강감찬","마","대지",500));
		
		FileInputStream fis=new FileInputStream("c:\\java_datas\\sawon.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
				
		
	}
}
