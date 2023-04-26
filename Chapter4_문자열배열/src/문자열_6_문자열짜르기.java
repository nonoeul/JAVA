
public class 문자열_6_문자열짜르기 {
	public static void main(String[] args) {
		
		String addr="서울특별시 성북구 안암로 61-6"+"지번 서울시 성북구 안암동5가 134-94";
		String a2=addr.substring(0,addr.lastIndexOf("지번")); // 지번의 위치부터 짤라버린다. 
		// 지번 위치부터 짤라라 
		System.out.println(a2);
		
		String a3=addr.substring(0,addr.lastIndexOf("서울")); // substring 어디부터 짤라라 
		// 뒤에 서울부터 찾아서 짤라라
		System.out.println(a3);
		
		
		
//		인덱스가 있는 위치값		
//		lastIndexOf() // 뒤에서부터 찾는다. java, a=4, a에 위치에 따라 다르다.
//		indexOf() // 앞에서부터 찾는다. java, a=2
//		
		String str="Hello Java";
		String sss=str.replace("a", "b");
		System.out.println(sss);
		
		String ssss=str.replace("Java","oracler");
		System.out.println(ssss);
	}
}
