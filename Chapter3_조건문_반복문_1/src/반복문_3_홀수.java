
public class 반복문_3_홀수 {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i < 100; i+=2) {
			sum+=i;
			System.out.println("sum="+sum+",i="+i);
		}
			System.out.println("1~100까지의 홀수의 합은:"+sum);
	}
}
