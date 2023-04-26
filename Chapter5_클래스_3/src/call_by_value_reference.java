
/* 1. call by value (값에 의한 호출)
함수가 호출될 때 메모리 공간 안에서는 임시의 공간이 생성된다. 그리고 함수가 종료되면 해당공간은 사라진다. 

함수 호출시 전달되는 변수의 값을 복사하여 함수의 인자로 전달한다.

복사된 인자는 함수 안에서 지역적으로 사용하는 변수이다.

JAVA의 경우 함수에 전달되는 인자의 데이터 타입에 따라서 (기본자료형 / 참조자료형 ) 함수 호출 방식이 달라짐

기본 자료형 : call by value 로 동작 (int, short, long, float, double, char, boolean)
참조 자료형 : call by reference 로 동작 (Array, Class Instance) 


2. call by reference (참조에 의한 호출)
함수가 호출될 때, 메모리 공간 안에서는 함수를 위한 별도의 임시 공간이 생성된다. (함수 종료시 사라짐)

call by reference 참조에 의한 호출방식은 함수 호출시 인자로 전달되는 변수의 레퍼런스를 전달한다. (해당 변수를 가르킨다.) 
함수 안에서 인자의 값이 변경되면, 함수 호출시에 있던 변수들도 값이 바뀐다. */



public class call_by_value_reference {

}
