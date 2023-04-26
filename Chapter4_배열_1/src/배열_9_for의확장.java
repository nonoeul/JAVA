import java.util.Arrays;

public class 배열_9_for의확장 {
	public static void main(String[] args) {
		
		int[] arr1= {10,20,30,40,50};
		int[] arr2=new int[10];
		System.arraycopy(arr1, 1, arr2, 0, 3);
		// arr1 의 첫번쨰(1)1번부터, arr2의 나머지값은0, 세번째(3)3번까지 값을 가져와서 넣어
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("=====절취선=====");
		
		//새로운 배열을 만들어서 확장할떄 쓰는 것이라고 생각하면 된다.
		//카피를 떠 놓으면 8번에 했던 것처럼 더 큰 값을 지정해둔 뒤 나머지 값을 0으로 넣어두고
		//빈 공간에다가 추가하고 싶은 값을 넣어준다. 단 너무불편 배열 많이 안씀
		//[배열확장할때 사용]
		
		System.arraycopy(arr1, 1, arr2, 0, arr1.length);
		// arr1 의 첫번쨰(1)1번부터, arr2의 나머지값은0, 세번째(3)3번까지 값을 가져와서 넣어
		System.out.println(Arrays.toString(arr2));
		
	}
}
