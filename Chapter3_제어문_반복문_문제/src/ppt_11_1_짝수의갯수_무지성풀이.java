import java.util.Scanner;
public class ppt_11_1_짝수의갯수_무지성풀이 {
	public static void main(String[] args) 
	{
	int even = 0;
	Scanner scan=new Scanner(System.in);
	System.out.println("10개의 정수를 입력하세요");
	int A=scan.nextInt();
	int B=scan.nextInt();
	int C=scan.nextInt();
	int D=scan.nextInt();
	int E=scan.nextInt();
	int F=scan.nextInt();
	int G=scan.nextInt();
	int H=scan.nextInt();
	int I=scan.nextInt();
	int J=scan.nextInt();
	
	if (A%2==0) 
	{
		even+=1;
	}
	if (B%2==0) 
	{
		even+=1;
	}
	if (C%2==0) 
	{
		even+=1;
	}
	if (D%2==0) 
	{
		even+=1;
	}
	if (E%2==0) 
	{
		even+=1;
	}
	if (F%2==0) 
	{
		even+=1;
	}
	if (G%2==0) 
	{
		even+=1;
	}
	if (H%2==0) 
	{
		even+=1;
	}
	if (I%2==0) 
	{
		even+=1;
	}
	if (J%2==0) 
	{
		even+=1;
	}
		
	System.out.println("입력받은 짝수의 갯수는"+even);
	}

}
