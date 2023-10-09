package com.swingdemo;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListnerDemo {
	public static void main(String[] args) {
		PointerPosition pp = new PointerPosition();
	}
}

class PointerPosition extends JFrame{
	
	public PointerPosition(){
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				
				System.out.println("(" + x + "," + y + ")");
			}
		});
		
		setVisible(true);
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
