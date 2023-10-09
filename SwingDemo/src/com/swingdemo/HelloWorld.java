package com.swingdemo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		Abc obj = new Abc();
		
	}
	
}

class Abc extends JFrame{
	
	public Abc(){
		
		setLayout(new FlowLayout());
		JLabel label1 = new JLabel("Hello World");
		
		JLabel label2 = new JLabel("Welcome Aayan");
		
		add(label1);
		add(label2);
		setVisible(true);
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
	}
}
