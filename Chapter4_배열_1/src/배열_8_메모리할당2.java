import java.util.Arrays;

public class 배열_8_메모리할당2 {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2=arr1.clone(); // clone을 만들게 되면 다른 메모리에 할당하게 된다.
		// 만약 clone이 없다면 두 개가 같은 메모리에 할당돼어 두 개의 메모리가 공유된다.
		// clone은 찌으면 두 개가 서로 공유한다.
		System.out.println(arr1);
		System.out.println(arr2);
		// == 별칭(참조데이터), arr1, arr2 두개가 같은 메모리를 할당하고 있다.
		System.out.println("arr1="+Arrays.toString(arr1));
		System.out.println("arr2="+Arrays.toString(arr2));
		// 새로운 메모리의 생성해서 메모리는 다르지만 값은 동일하다.
		
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
		
		System.out.println("=======새로운 값=======");
		int[] arr3=new int[5];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=arr1[i];
			// arr1의 데이터를 arr3이 데이터를 받는데 데이터를 받은 배열
			// arr3의 데이터가 더 커버리면 값이 안 들어간다.
			// arr3의 데이터가 더 작으면 짤려서 출력
		}
		System.out.println(Arrays.toString(arr3));
	}
}
