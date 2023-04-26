import java.util.Scanner;
public class 문제6_switch_case {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a=scan.nextInt();
		
		switch (a/10) {
		case 10: 
			System.out.println("당신의 등급은 A입니다.");
			break;
		case 9: 
			System.out.println("당신의 등급은 A입니다.");
			break;
		case 8: 
			System.out.println("당신의 등급은 B입니다.");
			break;
		case 7: 
			System.out.println("당신의 등급은 C입니다.");
			break;
		case 6: 
			System.out.println("당신의 등급은 D입니다.");
			break;
		default:
			System.out.println("당신의 등급은 F입니다.");
		}
		
		
		
		
		
		
		
		
	}
}
