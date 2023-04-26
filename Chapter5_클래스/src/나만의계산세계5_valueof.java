
public class 나만의계산세계5_valueof {
	public static void main(String[] args) {
		//valueof는 값을 입력하면 전부 string 형태로 변환해준다. 
		   String a = "1234";

           String b = String.valueOf(10);

           String c = String.valueOf(a);

           String d = String.valueOf(true);

           String e = String.valueOf(false);

           //String.valueOf는 int형이든 double형이든 boolean형이든 String객체로 만든다.

          

           System.out.println(a);

           System.out.println(b);

           System.out.println(c);

           System.out.println(d);

           System.out.println(e);



          

           System.out.println(a + b);

           System.out.println(a + b + c);

           System.out.println(c + d);

           System.out.println(c + d + e);

           //a,b,c,d,e 모두 String 객체이므로 +연산자로 합치면 글자를 합친 결과와 같다.

    	}
	}
