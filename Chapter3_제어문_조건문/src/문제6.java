
public class 문제6 {
	public static void main(String[] args) {
	
		int no=(int)(Math.random()*2);
		char ch;
		
		if(no==0)
		ch=(char)((Math.random()*26)+65);
		else
		ch=(char)((Math.random()*26)+97);
		
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는 대문자입니다!!");
		else	
			System.out.println(ch+"는 소문자입니다!!");
		
		
		
		
		
		
		
	}
}
