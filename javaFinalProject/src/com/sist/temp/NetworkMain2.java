package com.sist.temp;
import java.awt.*;
import javax.swing.*;
public class NetworkMain2 extends JFrame{
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5;
	
	public NetworkMain2()
	{
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); // 사용자 정의 레이아웃
		mp.setBounds(50, 15, 850, 50);
		cp.setBounds(50, 75, 850, 800);
		tp.setBounds(1030, 15, 200, 870);
		
		b1 = new JButton("홈");
		b2 = new JButton("음악 검색");
		b3 = new JButton("채팅");
		b4 = new JButton("뉴스 검색");
		b5 = new JButton("음악 추천");
		mp.setLayout(new GridLayout(1,5,10,10));
		mp.add(b1); mp.add(b2); mp.add(b3); mp.add(b4); mp.add(b5);
		
		add(mp);
		add(cp);
		add(tp);
		
		setSize(1280,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new NetworkMain2();
	}

}
