package 창만들기;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JPanel;

public class HomePanel extends JPanel {
	public HomePanel()
	{
		setBackground(Color.white);
			TextField text=new TextField(20);
			text.setEchoChar('A');
			add(text);
	}
}
