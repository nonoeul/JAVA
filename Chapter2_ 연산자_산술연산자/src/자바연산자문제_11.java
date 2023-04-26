import java.util.Scanner;
public class 자바연산자문제_11 {
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력해주세요:");
//		int A=scan.nextInt();
//		System.out.println("첫번째 정수를 값은="+A);
//		
//	
//		System.out.println("두번째 정수를 입력해주세요:");
//		int B=scan.nextInt();
//		System.out.println("두번째 정수를 값은="+B);
//		
//		int rhq = A*B;
//		int qoa = A-B;
//		
//		System.out.println("두 개 값의 곱은");
//		System.out.println(rhq);
//		System.out.println("두 개 값의 뺄셈은");
//		System.out.println(qoa);
//		
//	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 두개를 입력하세요(20.30):");
		int A=scan.nextInt();
		int B=scan.nextInt();
		System.out.println(A-B);
		System.out.println(A*B);
	}
}
