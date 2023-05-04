package com.sist.temp;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JPanel;

public class HomePanel extends JPanel {
	public HomePanel() {
		setBackground(Color.orange);
		 TextField text = new TextField(20);
		 text.setEchoChar('A');
	        add(text);
	}
}
