package com.sist.main2;
//상속 
import javax.swing.*;
import java.awt.*;
// 생성자 , 초기블록 , static => 제외 
/*
 * 
 * 	class A
 * 	class B
 * 
 * 	class B extends A
 * 	class B
 * 	{
 * 		A a;
 * 	{
 * 		B => A
 * 
 */
public class MyWindow extends JFrame {
	JLabel la1,la2;
	JTextField tf; 
	JPasswordField pf;
	JButton b1,b2;
	public MyWindow() // 생성자는 초기값을 줄때 사용
	{
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
		add(p);
		add(la1);add(tf);
		add(la2);add(pf);
		setLayout(null);
		setSize(640,480);
		setVisible(true); // 자동로그인 
	}
	
	public static void main(String[] args) {
		MyWindow m=new MyWindow();
	}
}
