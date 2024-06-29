package techgeek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Welcomepage extends JFrame{
	JPanel welcmpnl,coverwhitepnl,logo,logo1;
	JLabel coverwhitepiclbl,logolbl,text,motto,logoimg,textinicon;
	JButton start;

	Welcomepage(){
		ImageIcon topimg=new ImageIcon("400443685_1548923645856477_1374702581536554128_n.jpg");
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(350,60,1200,800);
		this.setTitle("Tech Geek");
		this.getContentPane().setBackground(new Color(0,0,50));
		this.setIconImage(topimg.getImage());
		
		
		logo1=new JPanel();
		logo1.setBounds(20,20,80,80);
		logo1.setBackground(new Color(0,0,20));
		this.add(logo1);
		

		ImageIcon img2=new ImageIcon("techgeek photo.jpg");
		img2.getImage();
		img2.setImage(img2.getImage().getScaledInstance(80, 80, Image.SCALE_AREA_AVERAGING));
		logoimg=new JLabel(img2);
		logo1.add(logoimg);
		
		textinicon=new JLabel();
		textinicon.setText("TECH GEEK");
		textinicon.setFont(new Font("Times New Roman",Font.ITALIC,40));
		textinicon.setForeground(Color.RED);
		//new Color(220,20,60);
		textinicon.setBounds(120,-140,400,400);
		this.add(textinicon);
		
		/*welcmpnl=new JPanel();
		welcmpnl.setBounds(0,0,600,800);
		welcmpnl.setLayout(null);
		welcmpnl.setBackground(Color.WHITE);
		this.add(welcmpnl);*/
		
		
		/*coverwhitepnl=new JPanel();
		coverwhitepnl.setBounds(140,180,300,300);
		coverwhitepnl.setBackground(new Color(0,0,0,1));
		welcmpnl.add(coverwhitepnl);
		
		ImageIcon img1=new ImageIcon("—Pngtree—illustration of a programmer business_6564411.png");
		img1.getImage();
		img1.setImage(img1.getImage().getScaledInstance(310, 310, Image.SCALE_SMOOTH));
		coverwhitepiclbl=new JLabel(img1);
		coverwhitepnl.add(coverwhitepiclbl);*/
		
		start=new JButton();
		start.setBounds(500,500,150,50);
		start.setForeground(Color.WHITE);
		start.setFont(new Font("Times New Roman",Font.BOLD,20));
		start.setFocusable(false);
		start.setBackground(new Color(220,20,60));
		start.setText("Let's Start");
		this.add(start);
		
		
		logo=new JPanel();
		logo.setBounds(495,200,170,170);
		logo.setBackground(new Color(0,0,20));
		this.add(logo);
		
		
		
		ImageIcon img3=new ImageIcon("techgeek photo.jpg");
		img3.getImage();
		img3.setImage(img3.getImage().getScaledInstance(170, 170, Image.SCALE_AREA_AVERAGING));
		logolbl=new JLabel(img3);
		logo.add(logolbl);
		
		
		text=new JLabel();
		text.setText("''TECH GEEK''");
		text.setFont(new Font("Times new Roman",Font.ITALIC,26));
		text.setForeground(new Color(255,204,51));
		text.setBounds(500,250,300,300);
		this.add(text);
		
		motto=new JLabel();
		motto.setText("-----Journey Of New Evolution-----");
		motto.setBounds(440,350,300,200);
		motto.setForeground(new Color(255,204,51));
		motto.setFont(new Font("Times New Roman",Font.ITALIC,20));
		this.add(motto);
		
		
		start.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				FrameWork fr=new FrameWork();
				dispose();
				fr.setVisible(true);
				
				
			}
			
		});
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		Welcomepage welcome=new Welcomepage();
		welcome.setVisible(true);

	}

}
