import java.util.Scanner;
public class 자바연산자문제_13 {

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
//		int rhq = B%A;
//	
//		System.out.println("B에서 A를 나눈 나머지는");
//		System.out.printf("%d %% %d: %d",B,A,rhq);
		
	public static void main(String[] args) {
	
	int a,b;
	a=(int)((Math.random()*100)+1);
	b=(int)((Math.random()*100)+1);
	System.out.printf("a=%d.b=%d,a%%b=%d",a,b,a%b);
	}
}

