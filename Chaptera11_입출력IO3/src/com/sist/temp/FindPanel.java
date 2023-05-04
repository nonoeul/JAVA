package com.sist.temp;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.table.*;

import java.util.*;
import java.util.List;

import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.awt.event.*;

import 음악프로그램.GenieMusicVO;
import 음악프로그램.MusicSystem;

public class FindPanel extends JPanel implements ActionListener {
	JTextField tf;
	JButton b1;//일반
	JButton b2,b3,b4,b5,b6,b7;//장르
	JTable table;
	DefaultTableModel model;
	MusicSystem ms = new MusicSystem();
	
	public FindPanel() {
		//초기화
		tf = new JTextField();
		b1 = new JButton("검색");

		b2 = new JButton("가요");
		b3 = new JButton("POP");
		b4 = new JButton("OST");
		b5 = new JButton("트롯");
		b6 = new JButton("JAZZ");
		b7 = new JButton("CLASSIC");
		
		String[] col= {"","곡명","가수명","앨범"};
		Object[][] row = new Object[0][4];
		model = new DefaultTableModel(row,col) {

			@Override //수정 불가
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override//이미지 출력
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		table = new JTable(model);
		//출력위치 길이 설정
		table.setRowHeight(35);
		//타이틀바 고정
		table.getTableHeader().setReorderingAllowed(false); 
		JScrollPane js = new JScrollPane(table);
		
		//배치 //850 730
		setLayout(null);
		tf.setBounds(10, 15, 300, 30);
		b1.setBounds(315, 15, 100, 30);
		add(tf);
		add(b1);
		
		JPanel p = new JPanel();
//		p.setLayout(new GridLayout(1,6,5,5));
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.setBounds(10, 55, 720, 35);
		
		js.setBounds(10,100,700,600);
		add(p);
		add(js);
		
		try {
			List<GenieMusicVO> list = ms.musicCategoryData(1);
			System.out.println(list.get(0).getPoster().toString());
			for(GenieMusicVO vo:list) {
				URL url = new URL("http"+vo.getPoster());
				Image img = ImageChange.getImage(new ImageIcon(url), 30, 30);
				Object[] data = {
					new ImageIcon(img), vo.getTitle(), vo.getSinger(), vo.getAlbum()	
				};
				model.addRow(data);
			}
			
		} catch (Exception e) {}
		
		
		
		public void findPrint(int cno)
		{
			for (int i = model.getRowCount()-1; i>=0; i--)
			{
				model.removeRow(i);
			}
		}
		
		try {
			List<GenieMusicVO> list = ms.musicCategoryData(cno);
			System.out.println(list.get(0).getPoster().toString());
			for(GenieMusicVO vo:list) {
				URL url = new URL("http"+vo.getPoster());
				Image img = ImageChange.getImage(new ImageIcon(url), 30, 30);
				Object[] data = {
					new ImageIcon(img), vo.getTitle(), vo.getSinger(), vo.getAlbum()	
				};
				model.addRow(data);
			}
			
		} catch (Exception e) {}
		
	}
---}
