package com.swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RadioButtonDemo {
	public static void main(String[] args) {
		Form obj = new Form();
	}
}

class Form extends JFrame {

	JTextField t1;
	JButton b;
	JRadioButton m, f;
	JLabel l1, l2;
	JCheckBox c1, c2, c3, c4;

	public Form() {

		t1 = new JTextField(10);
		b = new JButton("Greet");
		m = new JRadioButton("Male");
		f = new JRadioButton("Female");
		l1 = new JLabel("");
		l2 = new JLabel("");
		c1 = new JCheckBox("Dancing");
		c2 = new JCheckBox("Reading");
		c3 = new JCheckBox("Cycling");
		c4 = new JCheckBox("Coding");

		ButtonGroup bg = new ButtonGroup();
		bg.add(m);
		bg.add(f);

		add(t1);
		add(m);
		add(f);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(b);
		add(l1);
		add(l2);

		ActionListener al = (ActionEvent) -> {
			String name = t1.getText();
			if (m.isSelected()) {
				l1.setText("Hello Mr. " + name + "!");
			} else if (f.isSelected()) {
				l1.setText("Hello Mrs. " + name + "!");
			} else {
				l1.setText("Please select the gender.");
			}
			String hobbies = "";
			if(c1.isSelected()){
				hobbies = hobbies + "Dancing ";
			}
			if(c2.isSelected()){
				hobbies = hobbies + "Reading ";
			}
			if(c3.isSelected()){
				hobbies = hobbies + "Cycling ";
			}
			if(c4.isSelected()){
				hobbies = hobbies + "Coding ";
			}
			l2.setText("Your hobbies are " + hobbies);
		};

		b.addActionListener(al);

		setVisible(true);
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
