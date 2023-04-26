import java.util.Arrays;

public class 배열_6_배열값변경 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		// arr[0] arr[1] arr[2] arr[3] arr[4]
		// arr[0] 첫번째 => 값읽기/값변경 가능 => 변수와 동일
		//1. 배열의 크기를 출력
		System.out.println("배열의 크기:"+arr.length);
		//2. 3번째값을 300
		arr[2]=300;
		//3. 5번째을 출력
		System.out.println(Arrays.toString(arr));
		System.out.println("5번쨰의 값은 "+arr[4]);
	}
}
