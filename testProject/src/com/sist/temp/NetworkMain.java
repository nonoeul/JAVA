package com.sist.temp;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import com.sist.common.ImageChange;

//메뉴 왼쪽 배치
public class NetworkMain extends JFrame implements ActionListener {
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JLabel logo;
	JButton b1,b2,b3,b4,b5;
	Login login= new Login();
	
	public NetworkMain() {
		logo = new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("c:\\java_datas\\label.jpg"), 80, 80);
		logo.setIcon(new ImageIcon(img));
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		
		
		 
		
		 
		
		
		setLayout(null); // Layout없이 직접 배치
		logo.setBounds(10, 15, 80, 80);
		mp.setBounds(10,100,80,200);
		cp.setBounds(100, 15, 850, 730);
		tp.setBounds(980, 15, 200, 730);
		
		b1=new JButton("홈");
		b2=new JButton("뮤직검색");
		b3=new JButton("채팅");
		b4=new JButton("뉴스검색");
		b5=new JButton("뮤직추천");
		mp.setLayout(new GridLayout(5,1,10,10));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		setSize(1200, 800);
//		setVisible(true);
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("네트워크 뮤직 프로그램");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		//채팅
		cp.cp.tf.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			
		}
		
		new NetworkMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			cp.card.show(cp, "home");
		} else if(e.getSource() == b2) {
			cp.card.show(cp, "find");
		} else if(e.getSource() == b3) {
			cp.card.show(cp, "chat");
		} else if(e.getSource() == b4) {
			cp.card.show(cp, "news");
			
		} else if(e.getSource() == b5) {
			cp.card.show(cp, "recomm");
		} else if(e.getSource() == login.b1) {
			login.setVisible(false);
			setVisible(true);
		} else if(e.getSource() == login.b2) {
			System.exit(0);
		} else if(e.getSource() == cp.cp.tf) {
			cp.cp.initStyle();
			String msg = cp.cp.tf.getText();
			String color = cp.cp.box.getSelectedItem().toString();
			
			if(msg.length() <1) return;
			
			cp.cp.append(msg, color);
			
			cp.cp.tf.setText("");
		}
		
	}
}
