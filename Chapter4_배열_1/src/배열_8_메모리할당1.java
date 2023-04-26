import java.util.Arrays;

public class 배열_8_메모리할당1 {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2=arr1; // arr2에 arr1이 저장된다.
		System.out.println(arr1);
		System.out.println(arr2);
		// == 별칭(참조데이터), arr1, arr2 두개가 같은 메모리를 할당하고 있다.
		System.out.println("arr1="+Arrays.toString(arr1));
		System.out.println("arr2="+Arrays.toString(arr2));
		
		System.out.println("=====배열값 변경=====");
		arr2[0]=100;
		arr2[1]=200;
		arr2[2]=300;
		arr2[3]=400;
		arr2[4]=500;
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr1="+Arrays.toString(arr1));
		// 배열2를 바꾸면 배열1도 바뀐다.
		// arr1에 주소값이 arr2에 주소값에 들어가는 순간 두 배열은 같은 메모리가 된다.
		// 같은 메모리를 쓰냐 안쓰냐에 따라서 달라진다. 
	}
}
