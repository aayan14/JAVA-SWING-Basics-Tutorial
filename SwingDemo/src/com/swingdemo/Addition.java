package com.swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Addition {

	public static void main(String[] args) {
		
		Add obj = new Add();
		
	}

}

class Add extends JFrame {
	
	JTextField t1,t2;
	JButton b;
	JLabel l;
	public Add(){
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b = new JButton("Add");
		l = new JLabel("Results");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		setVisible(true);
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ActionListener al = (ActionEvent) -> {
			int num1 = Integer.parseInt(t1.getText());
			int num2 = Integer.parseInt(t2.getText());
			
			int value = num1 + num2;
			l.setText(value + "");
		};
		
		b.addActionListener(al);
	}

	
}
