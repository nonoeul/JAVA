package com.sist.temp2;

import java.awt.*;


import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.util.List;

import 음악프로그램.GenieMusicVO;
import 음악프로그램.MusicSystem;

public class FindPanel extends JPanel { //JPanel=화면
	JTextField tf;
	JButton b1;
	JButton b2,b3,b4,b5,b6,b7;
	JTable table;
	DefaultTableModel model;
	MusicSystem ms=new MusicSystem();
	
	public FindPanel()
	{
		// 초기화
		tf=new JTextField();
		b1=new JButton("검색");
		b2=new JButton("가요");
		b3=new JButton("POP");
		b4=new JButton("OST");
		b5=new JButton("트롯");
		b6=new JButton("JAZZ");
		b7=new JButton("CLASSIC");
		
		String[] col= {"","곡명","가수명","앨범"};
		Object[][] row=new Object[0][4];
		model=new DefaultTableModel(row,col);
		
		
		
		
		table=new JTable(model);
		//출력 위치 길이 설정 
		table.setRowHeight(35);
		//타이틀바 고정
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane js=new JScrollPane(table);
		
		//배치 750 730
		setLayout(null);
		tf.setBounds(10, 15, 300, 30);
		b1.setBounds(315, 15, 100, 30);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,6,5,5));
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.setBounds(10, 55, 720, 35);
		
		js.setBounds(10, 100, 700, 600);
		add(tf);
		add(b1);
		add(p);
		add(js);
		
	try
	{
		List<GenieMusicVO> list=ms.musicCategoryData(1);
		for(GenieMusicVO vo:list)
		{
			
		}
	}catch(Exception ex) {}
	
	}

}



























