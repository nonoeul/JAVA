
public class 복습_문제a13_플러스마이너스반복 {
	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i%2==0) {
				sum-=i;
				System.out.print(-i);
			}else {
				sum+=i;
				System.out.print("+"+i);
			}
		}
		System.out.println("의 총합계는 "+sum);
	}
}
