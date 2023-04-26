/*
 * 	1. 	같은 자바파일에 클래스를 여러개 만들 수 있다.
 * 	   	----------------
 * 	   	public은 한 개의 class에서만 사용이 가능 
 * 	
 * 	2. 	권장 사항 =>파일을 따로 만든다.
 * 		
 * 
 */
	class Category
	{
		int no;
		String poster;
		String title;
		String subject;
	}
	
/*
 * 	멤버변수 (인스턴스변수)
 * 	-----------------
 * 	1. 기본형
 * 	2. 배열
 * 	3. 클래스 
 * 
 * 
 */
class FoodHoust
{
	int no; // 중복이 안된 숫자 => primary key => 상세보기
	int cno; // 카테고리 번호 // 참조키 => foreign key  
		
	String[] poster=new String[5]; // 이미지는 5개로 동일하다
	// 배열은 고정적으로 갯수를 변화시키지 못한다
	// 이미지가 고정이라면 배열로 잡고 아니라면 일반 문자열로 잡아라 
	String name;
	double score;
	
	String address1,address2;
	int phonenumeber;
	String food;
	int price;
	boolean car;
	int stime,etime;
	int lasttime;
	String holly;
	
	String menu;
	
}
	
	
public class 사용자정의_데이터형_3 {
	public static void main(String[] args) {
		
	}

}

 






















