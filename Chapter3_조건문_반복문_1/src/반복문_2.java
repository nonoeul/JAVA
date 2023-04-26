//1~!00까지의 합
public class 반복문_2 {
	public static void main(String[] args) {
		
		int sum=0; 
		//값을 변경 => 다시 시작은 무조권 0부터 시작(초기값 0)
		// 초기값에 따라서 결과값이 달라진다.
		for (int i = 1; i <= 100; i++) {
			sum=sum+i;// sum+=i
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("1~100까지의 합:"+sum);
		
			
	}
}
