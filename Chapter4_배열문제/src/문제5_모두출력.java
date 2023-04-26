import java.util.Iterator;

public class 문제5_모두출력 {
	public static void main(String[] args) {
		
		char[] alpha= {'a','b','c','d'};
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i]);
		}
			
		System.out.println();
		
		char[] appha= {'a','b','c','d'}; // 권장된 for문 더 빠르다.
		for(char c:appha)
		{
			System.out.print(c);
		}
		
		
	}
}
