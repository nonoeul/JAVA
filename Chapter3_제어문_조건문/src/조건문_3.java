// 세개의 정수를 입력을 받아서 총점 / 평균 / 학점
import java.util.Scanner;
public class 조건문_3 {	
	public static void main(String[] args) {
		int kor,eng,math;
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력(80 90 80):");
				kor=scan.nextInt();
				eng=scan.nextInt();
				math=scan.nextInt();
		
		//결과값 출력
		int total=kor+eng+math;
		double avg=total/3.0;
		
		int temp=(int)avg;
		char score='A'; // 독립문장
		if(temp>=90 && temp<=100)
			score='A';
		if(temp>=80 && temp<90)
			score='B';
		if(temp>=70 && temp<80)
			score='C';
		if(temp>=60 && temp<70)
			score='D';
		if(temp<60)
			score='F';
		// 단일 if문은 각 ifㄹ문마다 모두 수행되기 때문에 정확한 값을 위해서는
		// if문이 끝날 수 있도록 범위를 설정해준다.
		// 독립문장이기 떄문에 모든 if문을 수행한다.!!(속도가 느리다) 단점
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg); // %2.f 소수점 둘째자리까지 나타나도록 표시한다.
		System.out.printf("당신의 평균은:%.2f이므로 당신의 학점은 %s입니다",avg,score);
		
		
	}
}
