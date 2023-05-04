package com.sist.temp;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.sist.common.ImageChange;
public class NetworkMain extends JFrame implements ActionListener{
	
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5;
	JLabel logo;
	Login login = new Login();
	
	public NetworkMain()
	{
		setTitle("네트워크 뮤직 프로그램");
		
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); // 사용자 정의 레이아웃
		
		logo = new JLabel();
		Image img = ImageChange.getimage(new ImageIcon("c:\\javaDev\\genie.png"), 20, 20);
		logo.setIcon(new ImageIcon(img));
		
		mp.setBounds(15, 150, 80, 200);
		cp.setBounds(110, 15, 850, 730);
		tp.setBounds(980, 15, 200, 730);
		
		b1 = new JButton("홈");
		b2 = new JButton("음악 검색");
		b3 = new JButton("채팅");
		b4 = new JButton("뉴스 검색");
		b5 = new JButton("음악 추천");
		mp.setLayout(new GridLayout(5,1,10,10));
		mp.add(b1); mp.add(b2); mp.add(b3); mp.add(b4); mp.add(b5);
		
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		setSize(1200,800);
//		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		b5.addActionListener(this);
		
		//로그인 처리
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new NetworkMain();
	}
	
	//버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		//메뉴 버튼
		if(e.getSource()==b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp, "recom");
		}
		else if(e.getSource()==login.b1)
		{
			login.setVisible(false);
			setVisible(true);
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cp.cp.tf)
		{
			cp.cp.initStyle();
			String msg = cp.cp.tf.getText();
			String color = cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			cp.cp.append(msg, color);
			cp.cp.tf.setText("");
		}
		
	}

}
