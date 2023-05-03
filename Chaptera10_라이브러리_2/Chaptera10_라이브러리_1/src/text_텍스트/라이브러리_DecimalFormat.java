package text_텍스트;
import java.text.*;
import java.util.*;
public class 라이브러리_DecimalFormat 
{
	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("##,###,###");
		/*	DecimalFormat 클래스
	 	1. java.text 내에 존재한다.
	 	2. DeciamlFormat 매개변수=new DeciamlFormat(형식) 생성자안에 형식을 지정해준다.
	  	3. DeciamlFormat는 내가 원하는 글자형태로 만들어줄 수 있다,
		 */
		int won=12345678;
		System.out.println(won+"원");
		System.out.println(df.format(won)+"원");
		// won을 df형태로 바꿔주는 것이다. 
		
		System.out.println("=========ChoiceFormat==========");
		double[] limit = {59,60,70,80,90};
		// 범위를 정해주는 것이다. 0~59, 60~69, 70~79, 80~89, 90~100
		String[] grade={"F","D","C","B","A"};
		int[] score= {100,90,80,70,60,50};
		ChoiceFormat cf=new ChoiceFormat(limit,grade);
		/*	ChoiceFormat
		 * 	특정범위에 속하는 값을 문자열로 변환하기 위해 ChoiceFormat을 사용한다.
		 * 	연속적이나 불연속적인 범위의 값들을 처리하는 if문이나 switch문으로 처리하기 힘들 떄 사용하면 좋다
		 */
		
		for (int i = 0; i < score.length; i++) 
		{
			System.out.println(score[i]+":"+cf.format(score[i]));
		}
	}	
}

