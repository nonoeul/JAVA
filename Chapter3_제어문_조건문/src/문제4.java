import java.util.Scanner;

public class 문제4 {
	public static void main(String[] args) {
//		int kor,eng,math;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("세개의 정수 입력을 입력하세요:");
//		kor=scan.nextInt();
//		eng=scan.nextInt();
//		math=scan.nextInt();
//		
//		int sum = kor+eng+math;
//		int arg = (sum)/3;
//		
//		if (kor>math && kor>eng)
//			System.out.println("최댓값은 국어입니다:"+kor);
//		if (eng>math && eng>kor)
//			System.out.println("최댓값은 영어입니다:"+eng);
//		if (math>kor && math>eng)
//			System.out.println("최댓값은 수학입니다:"+math);
//		
//		if (kor<math && kor<eng)
//			System.out.println("최소값은 국어입니다:"+kor);
//		if (eng<math && eng<kor)
//			System.out.println("최소값은 영어입니다:"+eng);
//		if (math<kor && math<eng)
//			System.out.println("최소값은 수학입니다:"+math);
//		
//		System.out.println("합계는:"+sum);
//		System.out.println("평균:"+arg);
		
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		int total=a+b+c;
		double avg=total/3.0;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("total="+total);
		System.out.printf("평균:%.2f\n",avg);
		
		//최댓값
		int max=a;
		if(max<b)
			max=b;
		
		if(max<c)
			max=c;
		
		System.out.println("최대값:"+max);
		
		//최댓값
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		System.out.println("최댓값은:"+min);
		
		
	
	}
}

