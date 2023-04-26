import java.util.Scanner;
public class 메소드_2_사칙연산 {
	
// +
	static int plus(int a,int b)
	{
		return a+b;
	}
	
// -
	static int minus(int a,int b)
	{
		return a-b;
	}
	
// *
	static int gop(int a, int b)
	{
		return a*b;
	}
	
// /
	static String div(int a, int b)
	{
		String res="";
		if(b==0)
			res="0으로 나눌 수 없습니다.";
			else
				res=a+"/"+b+"="+(a/(double)b);
		return res;
	}
	// 문자형으로 만들 수 밖에 없다. 왜냐하면??
	// 0으로 나눌 수 없다는 조건식이 들어가야 하기 떄문에
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력해라");
		int a=scan.nextInt();
		
		System.out.println("두 번쨰 정수를 입력해라");
		int b=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		
		String op=scan.next();
		int res=0; // switch블록 안에 case에서 계속해서 res를 사용하기 떄문에
		// 안에서 int res를 결정해버리면 추후 사용이 힘들다.
		// int를 붙여버리면 고정적인 값이 되기 때문에 블록내에서 변경 불가.
		
		switch(op)
		{
		case "+":
			res=plus(a,b);
			System.out.printf("%d+%d=%d\n",a,b,res);
			break;
		case "-":
			res=minus(a,b);
			System.out.printf("%d-%d=%d\n",a,b,res);
			break;
		case "*":
			res=gop(a,b);
			System.out.printf("%d*%d=%d\n",a,b,res);
			break;
		case "/":
			String s=div(a,b);
			System.out.println(s);
		
		}
		
		
	}
	public static void main(String[] args) {
		process();
	}
}

















