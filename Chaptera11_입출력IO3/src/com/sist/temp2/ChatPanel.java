package com.sist.temp2;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.StyleConstants;

public class ChatPanel extends JPanel {
	JTextPane pane;
	JTextField tf;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model; // 데이터 관리;
	JComboBox<String>box;
	
	public ChatPanel()
	{
		pane=new JTextPane();
		pane.setEditable(false);
		JScrollPane js1=new JScrollPane(pane);// 스크롤 띄우기 
		tf=new JTextField();
		box=new JComboBox<String>();
		
		//red=>알림
				box.addItem("black");
				box.addItem("blue");
				box.addItem("yellow");
				box.addItem("green");
				box.addItem("pink");
				box.addItem("orange");
				box.addItem("cyan");
				
		//테이블
				String [] col= {"아이디","이름","성별"};
				String[][] row=new String[0][3];
				model=new DefaultTableModel(row,col);
				table=new JTable(model);
				JScrollPane js2=new JScrollPane(table);
				b1=new JButton("쪽지보내기");
				b2=new JButton("정보보기");
				JPanel p=new JPanel();
				p.add(b1);
				p.add(b2);
				
		// 배치
				setLayout(null);
				js1.setBounds(10,15,500,600);
				tf.setBounds(19,620,380,30);
				box.setBounds(390,620,115,30);
				js2.setBounds(520,15,230,250);
				p.setBounds(520,270,230, 35);
				add(js1);
				add(tf);add(box);
				add(js2);
				add(p);
				String[] data= {"hong","홍길동","남자"};
				model.addRow(data);
		
/*	
				//이벤트
	public void initStyle()
	{
		Style green=pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
		
		Style red=pane.addStyle("red", null);
		StyleConstants.setForeground(green, Color.red);
		
		Style blue=pane.addStyle("blue", null);
		StyleConstants.setForeground(green, Color.blue);
		
		Style orange=pane.addStyle("orange", null);
		StyleConstants.setForeground(green, Color.orange);
		
		Style pink=pane.addStyle("pink", null);
		StyleConstants.setForeground(green, Color.pink);
		
		Style pink=pane.addStyle("cyan", null);
		StyleConstants.setForeground(green, Color.cyan);
		
	}
*/				
				
	}
	public void append(String msg,String color)
	{
		try {
			Document doc=pane.getDocument();
			doc.insertString(doc.getLength(), msg+"\n", pane.getStyle(color));
		} catch (Exception e) {}
	}
}







































