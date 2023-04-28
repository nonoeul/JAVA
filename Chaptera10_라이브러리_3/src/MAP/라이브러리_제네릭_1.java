package MAP;
import java.util.*;


//	A => a	
//	Object => object , Sawon sawon Object


public class 라이브러리_제네릭_1 {
	public static void main(String[] args) {
//		Object o=new Sawon(); 
	//Object로 만들어 버리면 Object위에 것들만 사용이 가능하다
	//즉 Object가 기존에 가지고 있는 것만 사용이 가능해진다.
	//그러다보니 Sawon에 추가한 객체들을 Object로 받아버렸기 떄문에 사용하지 못한다.
/*상위클래스를 받아서 새로운 객체를 생성해버리면 아래에 만든 값들을 사용하지 못하기 때문에
매우 비효율적이다. 그래서 새로운 객체를 만들때는 형변환을 통해 하위클래스를 상속받아서 
Object를 포함한 여러 클래스를 상속받아서 여러 가지 기능을 사용할 수 있게 만들어줘야 한다. 
	
??상위클래스를 잡을 경우??
	interface 인터페이스 같은 경우는 여러가지클래스를 묶어서 처리하기 때문에
	상위클래슬르 잡지만 interface를 제외하고는 나머지는 전부 하위클래스를 잡아서
	다양한 기능을 사용할 수 있도록 만들어줘야 한다.
	interface(인터페이스) = 상위클래스 / 나머지 = 하위클래스
*/	
		
	}
}










