import java.util.Scanner;

public class ppt_12_10개의정수를입력받아 {
	public static void main(String[] args) 
	{
	int a3 = 0;
	int a5 = 0;
	 //1~100
	for (int i = 1; i <= 10; i++) {
		int com=(int)(Math.random()*100);
		System.out.print(com + " ");
		if (com==com) {
			if(com%3==0)
			a3+=1;
			if(com%5==0)
			a5+=1;
		}	
		}
	System.out.println("");
	System.out.println("==========결과값=========");
	System.out.println("3의 배수의 갯수는"+a3);
	System.out.println("5의 배수의 갯수는"+a5);
	}
}
