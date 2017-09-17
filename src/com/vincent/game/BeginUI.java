package com.vincent.game;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BeginUI extends JFrame
{
	private JPanel beginPane = new JPanel();
	private JButton beginButton = new JButton("开始游戏");
	private JButton endButton = new JButton("退出游戏");
	private JLabel label = new JLabel("2048");
	public void Init()
	{
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400,200,400,300);
		this.setResizable(false);
		
		this.add(beginPane);
		beginPane.setLayout(null);
		Color backgroundColor = new Color(173,225,231);
		beginPane.setBackground(backgroundColor);
		beginPane.add(label);
		label.setBounds(100, 20, 300, 100);
		//label.setBackground(bg);
		label.setFont(new Font("",Font.BOLD+Font.ITALIC,90));
		beginPane.add(beginButton);
		beginButton.setBorder(BorderFactory.createRaisedBevelBorder());
		beginButton.setFont(new java.awt.Font("黑体",1,20));
		beginButton.setBounds(145, 140, 90, 40);		
		beginButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				EventQueue.invokeLater(new Runnable(){
					public void run(){
						try{
							Ga2048 frame = new Ga2048();
							frame.setVisible(true);
						//	Thread thread = new Thread(frame);
						//	thread.start();
						}
						catch(Exception e1){
							e1.printStackTrace();
						}
					}
				});
			}
		});
		
		beginPane.add(endButton);
		endButton.setBorder(BorderFactory.createRaisedBevelBorder());
		endButton.setFont(new java.awt.Font("黑体",1,20));
		endButton.setBounds(145, 190, 90, 40);		
		endButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		});
	}
	

}