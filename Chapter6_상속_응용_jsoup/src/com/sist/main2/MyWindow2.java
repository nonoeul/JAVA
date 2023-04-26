package com.sist.main2;

import javax.swing.*;
public class MyWindow2 {
	JFrame f=new JFrame();
	JLabel la1,la2;
	JTextField tf; 
	JPasswordField pf;
	JButton b1,b2;
	
	public MyWindow2()
	{
		f.setSize(640, 480);
		f.setVisible(true);
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		tf=new JTextField();
		pf=new JPasswordField();
		la1.setBounds(10, 15, 45, 30);
		la2.setBounds(10, 50, 45, 30);
		tf.setBounds(60, 15, 150, 30);
		pf.setBounds(60, 50, 150, 30);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10,90,210,35);
		f.add(p);
		f.add(la1);
		f.add(tf);
		f.add(la2);
		f.add(pf);
	}
	public static void main(String[] args) {
		new MyWindow2(); // 생성자 호출 -> 앞에 반드시 new를 붙여야 한다. 
	}
}
