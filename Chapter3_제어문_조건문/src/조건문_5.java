
// 중첩 조건문 => 3개의 정수를 받아서 총점 / 평균 / 학점 (A+,A0,A-)
// 97 A+ 94 A0~A-
import java.util.Scanner;

	public class 조건문_5 {
		public static void main(String[] args) {
			int kor=0,eng=0,math=0,total=0;
			double avg=0.0;
			char score='F',opt='-';
			Scanner scan=new Scanner(System.in);
			System.out.println("국어 수학 영어 값을 입력하세요");
					kor=scan.nextInt();
					eng=scan.nextInt();
					math=scan.nextInt();

				 total=kor+eng+math;
				 avg=(kor+eng+math)/3.0;
				 int temp=(int)avg;
				 
				 
					if(temp>=90 && temp<=100)
					{
						if(temp>=97 && temp<=100)
						opt='+';
						if(temp>=94 && temp<97)
							opt='0';
					}
					if(temp>=80 && temp<90)
						score='B';
					if(temp>=70 && temp<80)
						score='C';
					if(temp>=60 && temp<70)
						score='D';
					if(temp<60)
						score='F';
						opt=' ';
					 System.out.println("국어점수는:"+kor);
					 System.out.println("수학점수는:"+math);
					 System.out.println("영어는:"+eng);
					 System.out.println("총점점수는:"+total);
					 System.out.printf("평균점수는:%.2f\n",avg);
					 System.out.printf("평균점수는:%.2f로써 당신의 학점은 %s%s입니다",avg,score,opt);
		}
}
