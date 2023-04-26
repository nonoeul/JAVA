import java.util.Arrays;

public class 배열응용_2gpt {
    public static void main(String[] args) {

        int[] arr=new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(arr));

        int max=arr[0];
        int min=arr[0];

        for(int c:arr) {
            if(max<c)
                max=c;
            if(min>c)
                min=c;
        }
        System.out.println(max);
        System.out.println(min);

        int index1=0, index2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max) {
                index1=i;
            }
            else if(arr[i]==min) {
                index2=i;
            }
        }
        System.out.println("최대값위치 "+(index1+1)+"번째의 위치");
        System.out.println("최소값위치 "+(index2+1)+"번째의 위치");
    }
}