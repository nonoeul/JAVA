package com_sist_exception_예외복구;
/*
 * 	예외처리 방법
 * 	----------
 * 	1. 예외 복구 	: try-catch-finally 
 * 	--------------------------가장 많이 사용되는 예외처리
 * 	2. 예외 회피 	: throws
 * 	--------------------------라이브러리에 주로 있디. 
 * 	3. 임의로 발생 : throw
 * 	4. 사용자정의	: 지원하지 않는 것은 무조권 스스로 만들어야 한다.
 * 			// 직접제작 , 사용빈도는 거의 없다. 
 * 	--------------------------if문을 주로 사용하는 것이 편리하다. 
 * 
 * 
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 예외처리_예외복구_7_예외처리게임만들기 extends JFrame implements ActionListener{
	// JFrame은 버튼같이 여러 기능을 만들 수 있다. 
	
	private JTextField tf;
	private JButton b1,b2;
	private int com;
	
	public 예외처리_예외복구_7_예외처리게임만들기()
	{
		tf=new JTextField(20); // tf라는 JTextField전체크기 
		b1=new JButton("시작");	// 버튼만들기1
		b2=new JButton("종료");	// 버튼만들기2
		
		JPanel p=new JPanel();
		p.add(tf);p.add(b1);p.add(b2); //프레임 추가하기 
		
		add("Center",p);	// 프레임 추가하기 
		
		
		setSize(450,150); // 창크기 지엉 
		setVisible(true); // 매개변수의 값에 따라서 창을 표시하거나 숨김 
		// setVisivle(boolean) boolean값에 따라서 창을 열고 닫고 값이 달라짐
		// true = 열기 / false =닫기
		
		b1.addActionListener(this);
		// b1을 클릭하면 => actionPerformed 호출한다. (이벤트등록)
		b2.addActionListener(this);
		// tf에서 엔터르룬르면 => actionPerformed 호출한다. (이벤트 등록)
		tf.addActionListener(this);
		// tf에서 엔터르룬르면 => actionPerformed 호출한다. (이벤트 등록)
	}
	
	public static void main(String[] args) {
		new 예외처리_예외복구_7_예외처리게임만들기();
	}

	// 버튼처리하는 위치이다. : 버튼을 처리하는 메소드 : 용도가 여러개이기 때문에
	// 구현을 못해주는 것이다. 선언만 해주고 집어넣기, 프로그래머가 프로그램에 맞는 것을 사용 
	// 호출은 해준다(자동 호출) ==> 구현은 사용자에게 맡긴다. (인터페이스)
	// 이런 기능이 있다라고 선언만해주는 것 인터페이스 
	// 무슨 기능을 쓸 지 모르니깐 우리에게 맞기는 것 actionPerformed 선언만 해준다. 나머지는 우리가알아서
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) // b2버 버튼을 클릭했다면 
		// e.getSource 그 이벤트가 실행되는 특정 컨테이너의 속성을 가지고 올 수 있다. 
		{
			System.exit(0); // 프로그램 종료 
		}
		else if(e.getSource()==b1)
		{
			com=(int)(Math.random()*100)+1;
			JOptionPane.showMessageDialog(this, "게임을 시작합니다.");
			// JOptionPane.showMessageDialog(null, 내용)
			// 값을 지정해준 뒤 내용을 입력해주면 알림창을 띄어준다.알림창을 띄어주는 함수 
			tf.setEnabled(true); // setEnabled 버튼비활성화 , 버튼이 두번 클릭되지 않게한다.
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(e.getSource()==tf)
		{
			String strNum=tf.getText(); // 사용자가 입력한 값을 읽어준다. 
			if(strNum.trim().length()<1)// 좌우의 공백을 제거 
			{
				// 입력이 안된 경우 
				JOptionPane.showConfirmDialog(this, "1~100까지 사이의 정수 입력");
				// 값을 지정해준 뒤 입력을 창을 뛰어주는것 
				// tf라면 1~100까지의 값을 입력할 수 있게 해준 것., 
				tf.requestFocus();
				return; // 메소드 종료 
			}
			// 입력된 상태
			int num=0;
			try
			{
				num=Integer.parseInt(strNum); 
				// 문자열 => 정수형으로 변경
				// 정수 =>문자열 (valueOf()_
			}catch(NumberFormatException ex) // 메서지가 잘못되었으니깐 처음부터 다시 입력해라 
			{
				// 잘못된 입력인 경우에 복구를해서 처리해준다. 
				JOptionPane.showConfirmDialog(this, "정수만 입력이 가능ㅎ바니다.");
				tf.setText("");
				tf.requestFocus();
				return;
			}
		//비교
			if(com>num)
			{
				JOptionPane.showConfirmDialog(this, "입력한 정수보다 큰 정수를 입력하세요");
				tf.setText(""); // 지워주고 , 값을 다 입력한다음 값을 입력한 창에 값을 지워주고 
				tf.requestFocus(); // 다시 포커스 , 값 창에 다시 포커스를 맟춰준다.
				
			}
			else if(com<num)
			{
				JOptionPane.showConfirmDialog(this, "입력한 정수보다 작은 값을 입력하세요");
				tf.setText(""); // 지워주고 , 값을 다 입력한다음 값을 입력한 창에 값을 지워주고 
				tf.requestFocus(); // 다시 포커스 , 값 창에 다시 포커스를 맟춰준다.
			
			}
			else
			{
				JOptionPane.showConfirmDialog(this, "Game Over!!");
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true);
				
			}
		}
		
	}
}
































