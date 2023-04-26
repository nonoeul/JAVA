
public class 문제2_1_50까지의합 {
	public static void main(String[] args) {
		int sum=0,i=1;
		while(true) {
			if(i==51)
				break;
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
