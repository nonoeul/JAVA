import java.util.Arrays;

public class 배열_7_문자열 {
	public static void main(String[] args) {
		
		int[] arr1= {10,'A','B',100,15};
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(arr1); // arr1의 배열 주소이다. 
		
		double[] arr2={10,'A','B',100,15}; // 자동형변환
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3={68,'A','B',66,97}; // int를 포함 할 수 있다.
		// ASC코드에 있는 값에 맞게 써야한다. 소문자 67~ 대문자 97~
		System.out.println(Arrays.toString(arr3));
		
		boolean[] arr4=new boolean[5]; // boolean의 초기값은 false이다.
		System.out.println(Arrays.toString(arr4));
		//초기값은 0이기 때문에 계속해서 0으로 간다.
		
		byte[] arr5=new byte[5]; // byte의 초기값은 0이다.
		System.out.println(Arrays.toString(arr5));
		// int[] arr; ==> null (주소가 없는 경우)
		
	}
}
