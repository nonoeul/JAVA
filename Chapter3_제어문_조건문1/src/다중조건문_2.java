// 성적 계산 => Rank, 정렬
// 세개의 정수를 받아서 평균을 구해서 => 등급 출력
// 다중 조건문 사용
/*
 * 	>= 90
 * 	>= 80
 * 	>= 70
 * 	>= 60
 * 	---------- else
 * 	 * Web개발 / 호스팅(AWS) => 운영체제와 고정 ip를 빌려서 Paas
 * 	Java / Oracle / HTML / CSS/ JavaScript 
 * 	Java : 데이터관리 
 * 	Oracle : 데이터 저장(공유)
 * 	HTML / CSS : 브라우저에서 인식하는 언어
 * 	JavaScript : 동적 (클라이언트) 
 */

import java.util.Scanner;
public class 다중조건문_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
// 		클래스에다가 마우스를 갖다대었을때 f가 나온다면 그것은 자체적인 class이다 알고있자.
		
// 		System.in 키보드 입력값 => 입력값을 받아서 메모리에 저장해주는 역할
// 		정수:nextInt(), 실수:nextDouble(), nextBoolean()
// 		next() : 문자열 => char는 존재하지 않는다. 
// 		Scanner는 도스에만 사용이 가능
//		next(), nextLine()은 Scanner 클래스의 메소드이다.
//		공통점은 둘 다 문자열로 반환시켜주고 차이점은
//		nextLine()메소드는 Enter를 치기 전까지 쓴 문자열 모두 반환한다는 것이고
//		next()메소드는 공백(space) 전까지 입력받은 문자열을 반환한다는 것이다.
		
		/*
		 * Web개발 / 호스팅(AWS) => 운영체제와 고정 ip를 빌려서 Paas
		 * Java / Oracle / HTML / CSS/ JavaScript
		 * Java : 데이터관리
		 * Oracle : 데이터 저장(공유)
		 * HTML / CSS : 브라우저에서 인식하는 언어
		 * JavaScript : 동적 (클라이언트) 
		 */
	System.out.println("세개의 정수 입력(10.20.30)");
	int kor=scan.nextInt();
	int math=scan.nextInt();
	int eng=scan.nextInt();
	double avg=(kor+math+eng)/3.0;
	System.out.println("국어점수:"+kor);
	System.out.println("수학점수:"+math);
	System.out.println("영어점수:"+eng);
	System.out.printf("평균점수:%.2f\n",avg);
	System.out.println("총점"+(kor+eng+math));

	//학점계산
	char score='F'; // 값의 변경이 없을 경우 처리디는 값(default)
	
	if(avg>=90)
		score='A'; // 종료
	else if(avg>=80)
		score='B';
	else if(avg>=70)
		score='C';
	else if(avg>=60)
		score='D';
	/*
	 * else // 생략할 수 도 있다. score='F';
	 */
	System.out.println("학점:"+score);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
