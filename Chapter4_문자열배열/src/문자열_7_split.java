
public class 문자열_7_split {
	public static void main(String[] args) {
		
		String menu="원조김밥"
				+" 2,500원"
				+" 쌀떡볶이"
				+" 3,500원"
				+" 찹쌀순대"
				+" 3,500원"
				+" 라면"
				+" 3,500원"
				+" 쫄면"
				+" 5,500원";
		
		System.out.println(menu);
		String[] menus=menu.split("원"); // 원자 앞에서 분리를 해라 
		
		for(String m:menus)
		{
			System.out.println(m+"원"); // 출력할 떄 split로 짤라준다.  
		}
		
	}
}
