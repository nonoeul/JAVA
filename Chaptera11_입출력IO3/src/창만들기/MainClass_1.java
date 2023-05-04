package 창만들기;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class MainClass_1 extends JFrame{
	
	JButton b1,b2,b3,b4,b5;
	JMenuItem home,find,chat,news,board;
	JTabbedPane pane;
	
	
	public MainClass_1() {
		home = new JMenuItem("홈");
		find = new JMenuItem("검색");
		chat = new JMenuItem("채팅");
		news = new JMenuItem("뉴스");
		board = new JMenuItem("커뮤니티");
		JMenu menu1 = new JMenu("메뉴");
		menu1.add(home);
		menu1.add(find);
		menu1.add(chat);
		menu1.add(news);
		menu1.add(board);
		JMenuBar bar = new JMenuBar();
		bar.add(menu1);
		setJMenuBar(bar);
		
		pane = new JTabbedPane();
		pane.addTab("홈", new JPanel());
		pane.addTab("검색", new JPanel());
		pane.addTab("채팅", new JPanel());
		pane.addTab("뉴스", new JPanel());
		pane.addTab("커뮤니티", new JPanel());
		add("Center", pane);
		
		//윈도우 크기 결정
		b1=new JButton("홈");
		b2=new JButton("검색");
		b3=new JButton("채팅");
		b4=new JButton("뉴스");
		b5=new JButton("커뮤니티");
		
		JPanel p = new JPanel(); //일자 배치
		p.setLayout(new GridLayout(1,5,5,5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		//윈도우에 배치
		add("North", p); // North,South,East,West,Center
		
		JPanel p1 = new JPanel(); //일자 배치
		p1.setLayout(new GridLayout(5,1,50,50));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
		//윈도우에 배치
		add("West", p1); // North,South,East,West,Center
		
		//JFrame => BorderLayout
		//JPanel => FlowLayout
		
		setSize(1200, 850);
		//윈도우 보여준다
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //x누르면 메모리 해제
	}
	
	public static void main(String[] args) {
		
		try {
			
		}catch(Exception e) {}
		new MainClass_1();
	}
}
