import java.text.ChoiceFormat;

import java.util.Scanner;
public class 문제7 {
	public static void main(String[] args) {
	
//		char[] limit = {'F','D','C','B','A'};
//		int[] score={100,95,88,69,52,78};
//		ChoiceFormat form=new ChoiceFormat(limit,)
		
//		int kor=0,eng=0,math=0;
//		double avg=0.0;
//		int total=0;
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("세개의 점수를 입력해주세요");
//		
//		 kor=scan.nextInt();
//		 eng=scan.nextInt();
//		 math=scan.nextInt();
//		 
//		 total=kor+eng+math;
//		 avg=total/3.0;
//		 
//		 if(avg>=90 && avg<100)
//			 System.out.printf("평균은: %.2f입니다 학점은 %s입니다",avg,'A');
//		 
//		 if(avg>=80 && avg<90)
//			 System.out.printf("평균은: %.2f입니다 학점은 %s입니다",avg,'B');
//		 
//		 if(avg>=70 && avg<80)
//			 System.out.printf("평균은: %.2f입니다 학점은 %s입니다",avg,'C');
//
//		 if(avg>=60 && avg<70)
//			 System.out.printf("평균은: %.2f입니다 학점은 %s입니다",avg,'D');
//				 
//		 if(avg<60)
//			 System.out.printf("평균은: %.2f입니다 학점은 %s입니다",avg,'F');
				 
				
		int kor=(int)(Math.random()*101);		
		int eng=(int)(Math.random()*101);		
		int math=(int)(Math.random()*101);		
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		
		System.out.println("총점: "+(kor+eng+math));
		System.out.printf("평균:%.2f\n , ",(kor+eng+math)/3.0);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
