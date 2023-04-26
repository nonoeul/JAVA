// 1~100까지 사이의 수를 입력하세요 
// 11 , 22, 33, 44, 55... 같은 숫자가 나올 때
// 두개는 같은 정수 입니다. // 틀린 경우 다른 정수입니다.
import java.util.Scanner;
public class 반복문_7_같은숫자찾기 {
	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			if(i%11==0)
				System.out.println(i+"의 두개는 같은 정수이다.");
				
			else 
				System.out.println(i+"의 두개는 다른 정수이다.");		
		}
	}
}