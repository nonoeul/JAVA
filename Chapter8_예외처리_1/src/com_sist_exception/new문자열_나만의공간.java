package com_sist_exception;

public class new문자열_나만의공간 {
	public static void main(String[] args) {
		
			String s1="hello";
			String s2="hello";
			String s3=new String("hello");
			
			if(!(s2.equals(s3)));
				System.out.println("다른 메모리입니다.");
	}
}
