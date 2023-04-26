import java.util.Scanner;
public class 선택문_2 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("세 개의 정수 입력:");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		
		// 성적 계산
// 		case 3: case 4: case5:
//		System.out.println("봄")
//		break
//		case는 중복될 수 없다. 동일한 case는 쓸 수 없다.!!
		
		// 학점 출력
		char score='A';
		switch(avg/10)
		{
		case 10:
			score='A';
			break;
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		System.out.println("당신의 평균은"+avg+"입니다");
		System.out.println("당신의 학점은"+score+"입니다");
		// break는 순서가 없다. default가 맨 위로 쓸 수도 있고, 중간에 들어갈 수도 있다. 또한 10,9,8
		// 순차적으로 내려가는 것이 아니라 5,10,7 이런 식으로도 내려갈 수 있다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
	}
