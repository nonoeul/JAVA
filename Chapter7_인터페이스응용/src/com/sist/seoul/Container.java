package com.sist.seoul;

// Container 안에다가 interface를 통해서 전부 다 모아주는 것이다.
// Seoul과 관련된 데이터를 모아놓고 인터페이스를 통해서 관리해주는 것이다.
// 내가 딱 필요한 객체만 선언해서 가져다주는 것 
// 서로 다른 클래스를 하나로 묶어서 관리해주는 것이다. 

import java.util.*;
public class Container {
	private String[] clsArr={
			"com.sist.seoulLocation",
			"com.sist.seoulNature",
			"com.sist.seoulShopping",
			"com.sist.seoulHotel",
			"com.sist.seoulGuestHouse",
	};
	private String[] Key= {
		"loc","nat","shop","hotel","guest"	
	};
	private Map clsMap=new HashMap();
	// Map클래스는 key가 있고 값을 저장할 떄 사용한다.
	// interface로 사용딘다. 
	public Container() 
	{
		try
		{
			for (int i = 0; i < Key.length; i++) 
			{
				Class clsName=Class.forName(clsArr[i]);
				Object obj=clsName.getDeclaredConstructor().newInstance();
				System.out.println(obj);
				clsMap.put(Key[i], obj);
			}
		}catch(Exception e) {}
	}
	public Object getBean(String Key)
	{
		return clsMap.get(Key);
	}
	public static void main(String[] args) {
		Container c=new Container();
	}
}
