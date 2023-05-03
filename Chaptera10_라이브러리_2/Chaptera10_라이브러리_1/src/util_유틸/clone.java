package util_유틸;
/*
  Java의 최상위클래스인 Object에는 객체를복제하는 clone() 메서드가 존재한다.
  모든 클래스의 인스턴스는 clone()메서드 사용 가능 
  
 */
class 클론{
protected native Object clone() throws CloneNotSupportedException;
// native는 자바가 아닌 다른 언어에 작성딘 코드를 구현할 수 있게 만들어 준것이다.
/*	1. protected로 보호하고
  	2. Object객체를 상속받은 clone()을
  	3. throws 예외처리를 해준다 CloneNotSupportedException
  	?? CloneNotSupportedException??
  		=clone 인터페이스를 구현하지 않으면 발생
  		
  	??Clone을 사용하는 이유는??
  		1. 기존 객체의 데이터를 보존하기 위해서 사용된다.
  		2. 기존 객체의 데이터가 변경되거나 손실되면안되므로 객체를 복제후 복제본의 데이터 변경 사용
  		3. clone 메서드를 사용하지 않고 = 연산자를 사용해서 객체를 다른 ㅐㄱ체에 할당 후 다른 개체
  		를 변경하면 기존 객체의 데ㅣ터의 문제가발생
  		
 */

}

public class clone implements Cloneable {
	  // Cloneable을 상속 받는다.
	  private String Name;
	  private Integer Age;
	  // private 캡슐화해준다.
	  public clone(String name, Integer age) {
	    Name = name;
	    Age = age;
	  }
	  // clone의 생성자를 만들어준다.

	  public String getName() {
	    return Name;
	  }

	  public void setName(String name) {
	    Name = name;
	  }

	  public Integer getAge() {
	    return Age;
	  }

	  public void setAge(Integer age) {
	    Age = age;
	  }

	  @Override
	  public String toString() {
	    return "Person{" +
	            "Name='" + Name + '\'' +
	            ", Age=" + Age +
	            '}';
	  }

	  @Override
	  public clone clone() throws CloneNotSupportedException {
	    return (clone) super.clone();
	  }

public static void main(String args[]) {
	  try {
		  clone person1 = new clone("둘리", 20);
		  clone person2 = person1.clone();

	    System.out.println("[변경 전]");
	    System.out.println(person1.toString());
	    System.out.println(person2.toString());

	    // person2의 Age 필드의 값 변경
	    person2.setAge(100);

	    System.out.println("\n[person2의 Age 필드의 값을 100으로 변경 후]");
	    System.out.println(person1.toString());
	    System.out.println(person2.toString());

	    // person1의 Name 필드의 값 변경
	    person1.setName("또치");

	    System.out.println("\n[person1의 Name 필드의 값을 100으로 변경 후]");
	    System.out.println(person1.toString());
	    System.out.println(person2.toString());
	  } catch (Exception ex) {
	    System.out.println("예외 발생");
	  }
	}
}