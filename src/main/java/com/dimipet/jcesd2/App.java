package com.dimipet.jcesd2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class App extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel view;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 900);
		view = new View();
		view.setBorder(new EmptyBorder(5, 5, 5, 5));
		view.setLayout(new BorderLayout(0, 0));
		setContentPane(view);
	}

}
