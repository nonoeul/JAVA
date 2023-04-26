//package 프로그램_만들기;
///*	프로그래밍 순서
// * 	1. VO  
// * 	2. DAO
// * 	3. 전송 (관련된 데이터를 묶어서 전송한다 VO)
// * 
// * 	VO => JSP => Bean (핵심 기능) 
// * 	
// * 
// */
//import java.util.*;
//import java.io.*;
//public class SeoulSystem_데이터분리출력 {
//	private static SeoulLocationVO[] datas=new SeoulLocationVO[273];
//	//모든 사용자가 데이터를 공통으로 사용 
//	//들어가는 데이터가 모두 동일해야하기 때문에 static을 붙였다. 
//	static 
//	{
//		//데이터를 읽어서 메모리에 저장해준다. => 초기화 
//		try
//		{
//			StringBuffer sb=new StringBuffer();
//			// StringBuffer sb=new StringBuffer()
//			// sb에다가 StringButter로 객체를 만들고 StringBuffer()로 생성자까지 생성ㄹ해준것이다.
//			int i=0; 
//			// int i=0을 저장해준다. i값은 VO에 저장된 값의 순서를 -0으로 지정해준것이다. 
//			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
//			//location 텍스트 파일을 읽어오는것이다.
//			while((i=fr.read())!=-1)
//			//fr.read는 이게 순서대로 쭉 읽다가 더이상 읽을게 업으면 i 값은 -1이 됀다
//			// 즉 읽을 값이 없는 마지막 값까지전부다 읽었으면 끝내라 
//			{
//				sb.append(String.valueOf((char)i));
//				// sb파일은 읽어온 파일인데 거기다가 value = 값은 문자열로 바꿔주는 것이다 .
//				// 
//			}
//			fr.close();
//			String[] locations=sb.toString().split("\n");
//			int k=0;
//			for (String s : locations) 
//			{
//				StringTokenizer st=new StringTokenizer(s,"|");
//				datas[k]=new SeoulLocationVO();
//				datas[k].setNo(Integer.parseInt(st.nextToken()));
//				datas[k].setName(st.nextToken());
//				datas[k].setContent(st.nextToken());
//				datas[k].setAddress(st.nextToken());
//				k++;
//
//			}
//			
//		}catch(Exception ex) {}
//	}
//	
//	public static void main(String[] args) {
//		SeoulSystem_데이터분리출력 ss=new SeoulSystem_데이터분리출력();
//		for (SeoulLocationVO vo : datas) 
//		{
//			System.out.println(vo.getNo());	
//			System.out.println(vo.getName());	
//			System.out.println(vo.getAddress());	
//			System.out.println("=============");
//		}
//	}
//}
//
//












