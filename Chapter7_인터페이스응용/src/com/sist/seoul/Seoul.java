package com.sist.seoul;

public interface Seoul { 
	public SeoulVO[] seoulList(int page);
	public SeoulVO[] seoulFind(String fd);
	public SeoulVO seoulDetailData(int index);
	 // 인터페이스는 공통적으로 쓰이는 메소드가 있다. 
	 // 공통적인 용도로 쓰이는 변수가 존재해야 한다. 
}
