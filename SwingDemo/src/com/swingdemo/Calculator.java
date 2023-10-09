package com.swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		AddSub obj = new AddSub();
	}
}

class AddSub extends JFrame{
	
	JTextField t1, t2;
	JButton b1, b2;
	JLabel l;
	
	public AddSub(){
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b1 = new JButton("Add");
		b2 = new JButton("Subtract");
		l = new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(l);
		ActionListener alAdd = (ActionEvent)-> {
			int num1 = Integer.parseInt(t1.getText());
			int num2 = Integer.parseInt(t2.getText());
			int res = num1 + num2;
			
			l.setText(res + "");
		};
		
		ActionListener alSub = (ActionEvent)-> {
			int num1 = Integer.parseInt(t1.getText());
			int num2 = Integer.parseInt(t2.getText());
			int res = num1 - num2;
			
			l.setText(res + "");
		};
		b1.addActionListener(alAdd);
		
		b2.addActionListener(alSub);
		
		setVisible(true);
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
