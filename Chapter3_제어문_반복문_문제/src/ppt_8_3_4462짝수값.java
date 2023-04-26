import java.util.Iterator;

public class ppt_8_3_4462짝수값 {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 3; i <= 4426; i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.println("3이상 4462이하 짝수 값은"+sum);
	}
}
