import java.util.Scanner;
public class 문제3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int a=scan.nextInt();
		
	if(a<0) {
		System.out.println(-a);
	} else {
		System.out.println(a);
	}

	
	}
}
