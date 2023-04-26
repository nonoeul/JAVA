package 라이브러리_String;
/*	concat : 문자열 결합(+)
 * 	
 * 	String s1="Hello";
 * 	String s2="Java";
 * 	s1.concat(s2) ==> "Hello Java";
 * 
 * 	====> concat ====> MySQL 
 * 
 * 	endsWith : 끝나는 문자열이 같은 경우에 사용
 *  
 * 	boolean endsWith(String s) // 리턴형은 boolean일때 이 문자열로 끝나냐라는 질문
 * 	문자열로 끝나면 true 끝나지 않으면 false 
 * 
 *	String concat(String s)	
 *	-----------------------
 *	charAt()
 *	equals() : 대소문자 구분한다. 	equalsIgnorecase() : 대소문자 구분없이 비교한다.
 *	----------	ID.Password냐 	-----------영어검색, 영문이름 
 *	indexOf(), 					lastIndexOf() 
 *	------ 위치확인 (문자/문자열)    ------ 뒤에서부터 찾는다.
 *	------ 앞에서부터 찾는다.
 *	length() : 문자의 갯수 
 *	startWith() : 시작하는 문자열이 같은 경우 => suggest 
 *	substring() : 원하는 문자열을 자르는 경우 
 *	trim()		: 공백 제거할때 사용한다.
 *	split()		: 특정문자를 자를떄 사용한다.
 *	contains()	: 포함문자를 확인할 때  
 *	valueOf()	: 모든 데이터형을 문자열로 변환할때 ㅋ
 *
 */

public class 라이브러리_String_5 {
	public static void main(String[] args) {
		
//		String s1="Hello "; // 공백도 문자이다. 
//		String s2="Java";
//		
//		System.out.println(s1.concat(s2));
//		System.out.println(s1+s2);
//		
//		if(s1.endsWith("o"))
//			System.out.println("o자로 끝났다.");
//		else
//			System.out.println("o자로 안 끝났다.");
		
	String[] data= {"JAVA","java","Java","JAva","JAVa","JavA"};
	for (String s : data) 
	{
		if (s.equals("java")) 
		{
			System.out.println(s);
		}
	}
	// equals는 대소문자를 구분해서 비교
	// 원형 : boolean equals(String s)
	// 라이브러리 => 1)기능 2)리턴형 3)매개변수 4)사용처 => 로그인, 상세보기
	System.out.println("==== equalsIgnorecase() ====");
	for (String s : data) 
	{
		if (s.equalsIgnoreCase("java")) 
		{
			System.out.println(s);
		}
	}
	// equalsIgnoreCase : 대소문자를 구분하지 않고 비교 
	// 원형 	: boolean, equlasIgnoreCase(String s)
	// 사용처	: 검색, 영문이름, 영문으로 된 데이터를 찾는 경우
	// 한글	: equals
	
	System.out.println("=========length()=========");
	String[] data2= { "apple",
	  "avocado",
	  "banana",
	  "blackberry",
	  "blueberry",
	  "cherry ",
	  "vcherry",
	  "coconut",
	  "grape",
	  "kiwi",
	  "lemon",
	  "lime ",
	  "mango",
	  "melon",
	  "orange",
	  "papaya",
	  "peac",
	  "pear",
	  "persimmon",
	  "pineapple",
	  "plum",
	  "strawberry",
	  "tangerine",
	  "tomato",
	 "watermelon"
	  };
	
	
	for (String s : data2)
	{
		System.out.println(s+":"+s.length());
	}
	  System.out.println("==================");
	  System.out.println("가장 긴 이름의 과일명을 출력하세요");
	
	  int max=0;
	  
	  
	  for (String s:data2)
	  {
		if(max<s.length())
			max=s.length();
	  }
	  for (String s : data2) 
	  {
		if(s.length()==max)
		{
			System.out.println(s);
		}
	}
	  // length() : 문자갯수
	  // 원형	 	  : int length()
	  // 사용처 => 문자 제한이 이는 경우 
	
	  System.out.println("========= startWith =========");
	  // startsWith => 시작문자열이 같은 경우
	  // 원형 	: boolean startsWith(String s)
	  // 사용처	: 쿠키검색할때 이ㅛㅇ 
	  
	  for (String ss : data2) 
	  {
		 if(ss.startsWith("w"))
		 {
			 System.out.println(ss);
			 try
			 {
				 Thread.sleep(1000);
			 }catch(Exception ex) {}
		 }
	  }
	  System.out.println("======= trim() =======");
	  // trim() : 좌우 공백 제거
	  // 원형		: String trim()
	  // 사용처 	: 로그인,ㅎ ㅚ원가입 ,검색 
	  
	  String id="admin";
	  if(id.equals("admin"))
	  {
		  System.out.println("같은 ID입니다");
	  }
	  else
	  {
		  System.out.println("다른 ID입니다");
	  }
	  // trim은 좌우만 지울 수 있다 .중간에 들어간 trim은 지울 수 없다. 
	  
	  System.out.println("==========contains==========");
	  
	  for (String s : data2) 
	  {
		if(s.contains("a"));
		{
			System.out.println(s);
		}
	  }
/*		contains : 포함문자열을 찾을 경우
		원형		 : boolean contains(String s)
	  	사용처	 : 검색,추천	
*/
	  
	  System.out.println("==========valueOf()==========");
/*
 		valueof는 string에서 유일한 static 메소드
 		모든 데이터형을 문자열로 변환
 		원형 : static String valueOf
 		사용처 : 자바에서 윈도우 전송, 네트워크 전송 
 */
	  System.out.println(String.valueOf(10)+String.valueOf(30));
	  
	  System.out.println("======= substring =======s");
	  String ss="http://localhost:8080/JSPProject/main/main.do";
	  String res=ss.substring(ss.lastIndexOf("/")+1);
	  System.out.println(res);
	  
//	??두번 자르기??
	  ss=ss.substring(ss.indexOf("//")+2);
	  System.out.println(ss);
	  res=ss.substring(0,ss.indexOf("/"));
	  System.out.println(res);
	  
// ??지번 앞에 것들 가져오기??
	  ss="서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
	  
	  res=ss.substring(0,ss.indexOf("지")); // 매개변수가 두개 이므로!! 0부터 지-1까지 검색한다 .
	  System.out.println(res.trim());
	  res=ss.substring(ss.indexOf("지")+2);
	  System.out.println(res.trim());
			 
			 
	  
	  
/*	??substring?? == 범위를 정해서 범위내ㅇ 이는 것을 자른다. 범위를 설정하는 것은 indexof, lastindexof를 통햇 ㅓ범위를 지정한다.	  
 *	앞에서 자르고 싶으면 indexof
 * 	뒤에서 자르고 싶으면 lastindexof 
 */
	  
	  
//	 ??substring() : 문자열을 자르는 경우??	  // 오버로딩
	  // substring(int s) => s번째부터 마지막까지 잘라온다. 
	  // substring(int s,int e) s부터 e-1까지 잘라온다. 두 
/*
 	??substring은 두 가지의 종류가 있다??
 	1. 매개변수가 한 개 인 것
 		매개변수가 한 개 일때는 s번째부터 마지막까지 잘라오고
 	2. 매개변수가 두 개 인 것
  		매개변수1, 매개변수2 일때는 매개변수1부터 매겨변수2 -1까지 잘라온다
  	
  	3. 원형 : String Substring(int s)
  	 	   : String Substring(int s, int e)
  	//사용처 : URL주소 제어, 주소 제어, 
 */
	  
	  
	  System.out.println("===========split===========");
	  
	  ss="홍길동, 이순신, 강감찬, 박문순, 을지문덕, 심청이, 춘향이";
	  String[] names=ss.split(","); // split는 짤라서 배열에 저장해주는 것이다. 
/*	??split??
 * 	split은 문자열을 잘라주는 것으로 String[] 배열에다가
 * 	,단위로 문자열을 잘라서 배열로써 저장해주는 것이다.
 * 	원형 : String[] split(String regexp)
 * 	구부니 되어 있는 문자열이 있는 경우 분리한다. 
 */
	for (String sss : names) 
	{
		System.out.println(sss);
	}
	
	
	System.out.println("===========은평구 맛집 ^^ ><><>< 힘내자!!");
	ss="특상흑목살 (180g)"
			+ "18,000원"
			+ "특상흑삼겹살 (180g)"
			+ "18,000원"
			+ "특상목살 (180g)"
			+ "16,000원"
			+ "특상삼겹살 (180g)"
			+ "16,000원"
			+ "가브리살 (180g)"
			+ "16,000원";
	String[] menu=ss.split("원");
	
	for (String ssss : menu) {
		System.out.println(ssss+"원");
	}
	
	System.out.println("===========색깔");
	
	ss="red?blue?green?black?white?yellow";
	
	String[] color=ss.split("\\?"); // |는 정규식에서 사용하는 문자이다
	// | ? .+ * ^ 정규식이다. 정규식은 split으로 짜르지 못한다. ㅠㅠㅠ
	// 기호를 가져오기 위해서는 역슬레시 두개를 붙여야 한다. \\
	
	for (String ss1 : color) {
		System.out.println(ss1);
	}
	
	System.out.println("========== replace() ==========");
//	??replace() : 문자/문자열 변경??
//	앞에 있는 것을 뒤에 것을 바꿔주는 것 old->new로 바꿔주는 것이다 .
//	문자열을 바꿀 수도 있다구요~~~
	// 원형 : String replace(Char old,char new)
	// 원형 : String replace(String old,String new)
	ss="https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/532640_1471097953708316.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
	res=ss.replace("&", "#");
	System.out.println(res);
	System.out.println(res.replace("#", "&")); // #이 전부다 &로 바뀌었다. ^^ 너무 좋다 . replace 모두 다 바꿔버려!!!!!  
	// 데이터를 수집을 하게 되면 장점이 있다. html을 제거할때 사용된다. 
	
	  
	}
}




































































