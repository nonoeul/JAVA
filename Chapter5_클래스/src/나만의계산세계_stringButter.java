import java.util.ArrayList;

public class 나만의계산세계_stringButter {
	public static void main(String[] args) {
		String result2 = "프로그래밍";
		 String java = "자바";
	     String android = "안드로이드";
	        String result = java + android;
	        result2 += java += android;
	        System.out.println(result);
	        System.out.println(result2);
	        // string은 메모리를 할당해서 덧셈과 연산을 통해서 조합이 가능하다. 효율이 좋지 않다. 
	        // string은 객체 변경이 불가능하다. 한 번 생성되면 내용을 바꿀 수 없다. 
	        // 문자열 + 문자열이 더해지면 새 문자열이 생기고 가비지컬렉션에 저장된다. 
	        // 문자열을 더하고 메모리 할당하고 문자열을 더하고 메모리할당하고 효과가 좋지 않다.
	        
	        StringBuilder stringBuilder = new StringBuilder();
	       ArrayList<String> list = new ArrayList<>();
	        list.add("첫 번째, ");
	        list.add("두 번째, ");
	        list.add("세 번째, ");
	        list.add("네 번째, ");
	        list.add("다섯 번째");
	        for (int i = 0; i < list.size(); i++)
	        {
	            stringBuilder.append(list.get(i));
	        }
	        System.out.println(stringBuilder);
	        
	 //stringBuilder은 새로운 객체를 생성하는게 아니라 기존 데이터를 이용하기 때문에 상대적으로 부하가 적다.;
	 // 긴 문자열을 더하는 경우에는 stringBuilder을 적극 사용해라.
	}
}
