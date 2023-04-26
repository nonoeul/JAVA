
// char는 연산시에 자동으로 정수형으로 변환해준다. (for 사용)
// 잘 기억하자.!!! 패턴을 보면 B (C) D (E) F 으로 식으로 올라가고 있다.
// 정수형으로 전환시 2씩 증가하는거다. c는 = 0,1,[2] 이므로 2씩 더해지는거다
public class 문제a10_문자출력 {
	public static void main(String[] args) {
	
	for (char c ='B'; c < 'N'; c++) 
	{
		System.out.println(c+" ");
	}
	
	}
}
