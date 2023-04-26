// 국어, 영어, 수학 점수를 3개 씩 받는 성저표 완성
import java.util.Scanner;
public class 나만의배열세계 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] scroe=new char[3];
		int[] rank=new int[3];
		char[] score=new char[3];
		
		for (int i = 0; i < kor.length; i++) {
			System.out.println((i+1)+"번째 국어점수 입력");
			kor[i]=scan.nextInt();
			System.out.println((i+1)+"번째 영어점수 입력");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 수학점수 입력");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		for (int i = 0; i < kor.length; i++) 
		{
			switch((int)avg[i]/10)
			{
			case 10:
			
			case 9:
			score[i]='A';
					break;
			case 8:
			score[i]='B';
					break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';		
			}
		}	
		
		System.out.println("==========성적표==========");
		for(int i=0;i<kor.length;i++)
		{
		System.out.printf("%5d%5d%5d%7d%2f\n%2c",kor[i],eng[i],math[i],total[i],avg[i],score[i]);
		}
		
	}
}
