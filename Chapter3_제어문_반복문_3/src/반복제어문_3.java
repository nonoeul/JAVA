// 세 개의 정수를 받아서 총점 / 평균 

import java.util.Scanner;
public class 반복제어문_3 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int kor=0,eng=0,math=0;
		while(true)
		{
			System.out.println("국어 점수 입력(0~100):");
			kor=scan.nextInt();
			if(kor<0 || kor>100)
			{
				System.out.println("잘못된 점수입니다.");
				continue;
			}
				break;
		}
				
		while(true)
		{
			System.out.println("영어 점수 입력(0~100):");
			eng=scan.nextInt();
			if(eng<0 || eng>100)
			{
				System.out.println("잘못된 점수입니다.");
				continue;
			}
				break;
				
				
		}
		while(true)
		{
			System.out.println("수학 점수 입력(0~100):");
			math=scan.nextInt();
			if(math<0 || math>100)
			{
				System.out.println("잘못된 점수입니다.");
				continue;
			}
				break;
		}
				
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.printf("당신의 평균은:%.2f입니다",avg);
		System.out.println("당신의 총점은:"+total+"점 입니다");
				
		
			
	}
}				

		
				
			
			
			
			
			
		
			
		
		
		
		
		
		
	