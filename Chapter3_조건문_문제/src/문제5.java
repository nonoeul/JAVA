import java.util.Scanner;
public class 문제5 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("값을 입력해주세요");
	int a=scan.nextInt();
	
	if(a>=90 && a<=100) 
		System.out.println("당신의 등급은 A입니다");
	if(a>=80 && a<90) 
		System.out.println("당신의 등급은 B입니다");
	if(a>=70 && a<80) 
		System.out.println("당신의 등급은 C입니다");	
	if(a>=60 && a<70) 
		System.out.println("당신의 등급은 D입니다");		
	if(a<60) 
		System.out.println("당신의 등급은 F입니다");
	}
}
