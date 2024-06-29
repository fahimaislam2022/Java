package techgeek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class componentsframe extends JFrame {
	
	JLabel logoimg2,textup1,textinicon2,img1,compname1,compname2,compname3,price1,price2,price3,search,btncheck;
	JPanel logo2,pnl1,pnl2,pnl3;
	JTextField srch;
	JButton ok,refresh,purchase1,purchase2,purchase3,back,ok2;
	JRadioButton keyboard,graphics,charger;
	
	componentsframe(){
		
		ImageIcon topimg=new ImageIcon("400443685_1548923645856477_1374702581536554128_n.jpg");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(350,60,1200,800);
		this.setTitle("Tech Geek");
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0,0,50));
		this.setIconImage(topimg.getImage());
		
		logo2=new JPanel();
		logo2.setBounds(20,20,80,80);
		logo2.setBackground(new Color(0,0,20));
		this.add(logo2);
		

		ImageIcon img2=new ImageIcon("techgeek photo.jpg");
		img2.getImage();
		img2.setImage(img2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));
		logoimg2=new JLabel(img2);
		logo2.add(logoimg2);
		
		textup1=new JLabel();
		textup1.setText("Availabel Items: ");
		textup1.setBounds(40,-40,400,400);
		textup1.setForeground(Color.WHITE);
		textup1.setFont(new Font("Times New Roman",Font.ITALIC,20));
		this.add(textup1);
		
		textinicon2=new JLabel();
		textinicon2.setText("TECH GEEK");
		textinicon2.setFont(new Font("Times New Roman",Font.ITALIC,40));
		textinicon2.setForeground(Color.RED);
		textinicon2.setBounds(120,-140,400,400);
		this.add(textinicon2);
		
		
		pnl1=new JPanel();
		pnl1.setBounds(30,190,300,300);
		pnl1.setBackground(new Color(0,0,0,50));
		this.add(pnl1);
		
		ImageIcon pnl1img=new ImageIcon("rgb keyboard.png");
		pnl1img.getImage();
		pnl1img.setImage(pnl1img.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img1=new JLabel(pnl1img);
		pnl1.add(img1);
		
		
		
		
		pnl2=new JPanel();
		pnl2.setBounds(440,190,300,300);
		pnl2.setBackground(new Color(0,0,0,50));
		this.add(pnl2);
		
		ImageIcon pnl2img=new ImageIcon("graphics card.png");
		pnl2img.getImage();
		pnl2img.setImage(pnl2img.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img1=new JLabel(pnl2img);
		pnl2.add(img1);
		
		pnl3=new JPanel();
		pnl3.setBounds(850,190,300,300);
		pnl3.setBackground(new Color(0,0,0,50));
		this.add(pnl3);
		
		ImageIcon pnl3img=new ImageIcon("laptop battery.png");
		pnl3img.getImage();
		pnl3img.setImage(pnl3img.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img1=new JLabel(pnl3img);
		pnl3.add(img1);
		
		
		compname3=new JLabel();
		compname3.setText("Name: Charger of Laptop");
		compname3.setFont(new Font("Times New Roman",Font.ITALIC,22));
		compname3.setForeground(Color.WHITE);
		compname3.setBounds(860,360,300,300);
		this.add(compname3);
		
		price3=new JLabel();
		price3.setText("Price: $26");
		price3.setFont(new Font("times New Roman",Font.ITALIC,24));
		price3.setForeground(Color.WHITE);
		price3.setBounds(860,400,300,300);
		this.add(price3);
		
		
		
		
		compname1=new JLabel();
		compname1.setText("Name: RGB KEYBOARD AND MOUSE");
		compname1.setFont(new Font("Times New Roman",Font.ITALIC,22));
		compname1.setForeground(Color.WHITE);
		compname1.setBounds(40,360,500,300);
		this.add(compname1);
		
		
		price1=new JLabel();
		price1.setText("Price: $92");
		price1.setFont(new Font("times New Roman",Font.ITALIC,24));
		price1.setForeground(Color.WHITE);
		price1.setBounds(40,400,300,300);
		this.add(price1);
		
		
		compname2=new JLabel();
		compname2.setText("Name:GTX 1080 Ti");
		compname2.setFont(new Font("Times New Roman",Font.ITALIC,22));
		compname2.setForeground(Color.WHITE);
		compname2.setBounds(450,360,300,300);
		this.add(compname2);
		
		
		price2=new JLabel();
		price2.setText("Price: $699");
		price2.setFont(new Font("times New Roman",Font.ITALIC,24));
		price2.setForeground(Color.WHITE);
		price2.setBounds(450,400,300,300);
		this.add(price2);
		
		
		search=new JLabel();
		search.setText("Search: ");
		search.setFont(new Font("Times New Roman",Font.ITALIC,24));
		search.setForeground(Color.white);
		//new Color(220,20,60);
		search.setBounds(810,-140,400,400);
		this.add(search);
		
		srch=new JTextField();
		srch.setBounds(900,35,250,40);
		srch.setFont(new Font("Times New Roman",Font.ITALIC,24));
		srch.setForeground(Color.WHITE);
		srch.setBackground(new Color(0,0,10));
		this.add(srch);
		
		ok=new JButton();
		ok.setBounds(1060,80,80,40);
		ok.setBackground(new Color(220,20,60));
		ok.setText("OK");
		ok.setForeground(Color.WHITE);
		ok.setFont(new Font("Times New Roman",Font.BOLD,18));
		ok.setFocusable(false);
		this.add(ok);
		
		refresh=new JButton();
		refresh.setBounds(900,80,120,40);
		refresh.setBackground(new Color(220,20,60));
		refresh.setText("REFRESH");
		refresh.setForeground(Color.WHITE);
		refresh.setFont(new Font("Times New Roman",Font.BOLD,18));
		refresh.setFocusable(false);
		this.add(refresh);
		
		purchase1=new JButton();
		purchase1.setBounds(40,570,150,50);
		purchase1.setText("Purchase");
		purchase1.setFont(new Font("Times New Roman",Font.BOLD,18));
		purchase1.setForeground(Color.WHITE);
		purchase1.setBackground(new Color(220,20,60));
		purchase1.setFocusable(false);
		this.add(purchase1);
		
		purchase2=new JButton();
		purchase2.setBounds(440,570,150,50);
		purchase2.setText("Purchase");
		purchase2.setFont(new Font("Times New Roman",Font.BOLD,18));
		purchase2.setForeground(Color.WHITE);
		purchase2.setBackground(new Color(220,20,60));
		purchase2.setFocusable(false);
		this.add(purchase2);
		
		purchase3=new JButton();
		purchase3.setBounds(850,570,150,50);
		purchase3.setText("Purchase");
		purchase3.setFont(new Font("Times New Roman",Font.BOLD,18));
		purchase3.setForeground(Color.WHITE);
		purchase3.setBackground(new Color(220,20,60));
		purchase3.setFocusable(false);
		this.add(purchase3);
		
		back=new JButton();
		back.setBounds(40,690,130,40);
		back.setBackground(new Color(220,20,60));
		back.setText("BACK");
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Times New Roman",Font.BOLD,18));
		back.setFocusable(false);
		this.add(back);
		
		
		btncheck=new JLabel();
		btncheck.setText("Option:");
		btncheck.setForeground(Color.white);
		btncheck.setFont(new Font("Times New Roman",Font.BOLD,24));
		btncheck.setBounds(420,-135,400,400);
		this.add(btncheck);
		
		keyboard=new JRadioButton("Keyboad");
		keyboard.setBackground(new Color(0,0,50));
		keyboard.setFocusable(false);
		keyboard.setForeground(Color.WHITE);
		keyboard.setFont(new Font("Times New Roman",Font.BOLD,16));
		keyboard.setBounds(530,20,100,50);
		this.add(keyboard);
		
		graphics=new JRadioButton("Graphics card");
		graphics.setBackground(new Color(0,0,50));
		graphics.setFocusable(false);
		graphics.setForeground(Color.WHITE);
		graphics.setFont(new Font("Times New Roman",Font.BOLD,16));
		graphics.setBounds(530,60,140,50);
		this.add(graphics);
		
		charger=new JRadioButton("Charger");
		charger.setBackground(new Color(0,0,50));
		charger.setFocusable(false);
		charger.setForeground(Color.WHITE);
		charger.setBounds(530,100,140,50);
		charger.setFont(new Font("Timmes New Roman",Font.BOLD,16));
		this.add(charger);
		
		ButtonGroup grp=new ButtonGroup();
		grp.add(keyboard);
		grp.add(graphics);
		grp.add(charger);
		
		ok2=new JButton();
		ok2.setBounds(670,65,80,40);
		ok2.setBackground(new Color(220,20,60));
		ok2.setText("OK");
		ok2.setForeground(Color.white);
		ok2.setFocusable(false);
		ok2.setFont(new Font("Times New Roman",Font.BOLD,18));
		this.add(ok2);
		
ok2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				if(keyboard.isSelected()==true) {
					
					pnl2.setVisible(false);
					pnl3.setVisible(false);
					compname2.setVisible(false);
					compname3.setVisible(false);
					purchase2.setVisible(false);
					purchase3.setVisible(false);
					price2.setVisible(false);
					price3.setVisible(false);
					
					
					srch.setText("");
					
				}
				else if(graphics.isSelected()==true) {
					pnl1.setVisible(false);
					compname1.setVisible(false);
					purchase1.setVisible(false);
					price1.setVisible(false);
				
					pnl3.setVisible(false);
					compname3.setVisible(false);
					purchase3.setVisible(false);
					price3.setVisible(false);
					
					srch.setText("");
					
					
				}
				else if(charger.isSelected()==true) {
					
					pnl1.setVisible(false);
					compname1.setVisible(false);
					purchase1.setVisible(false);
					price1.setVisible(false);
				
					pnl2.setVisible(false);
					compname2.setVisible(false);
					purchase2.setVisible(false);
					price2.setVisible(false);
					
					srch.setText("");
					
					
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Select Your Iteam! ");
				}
			
					
				}
			
			
			
			
		});


refresh.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
	
		pnl1.setVisible(true);
		compname1.setVisible(true);
		purchase1.setVisible(true);
		price1.setVisible(true);
		
		srch.setText("");
		
		
		pnl2.setVisible(true);
		compname2.setVisible(true);
		purchase2.setVisible(true);
		price2.setVisible(true);
		
		pnl3.setVisible(true);
		compname3.setVisible(true);
		purchase3.setVisible(true);
		price3.setVisible(true);
		
		
		srch.setText("");
	}
	
});	

back.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		Items item=new Items();
		dispose();
		item.setVisible(true);
	}

	
    });

ok.addActionListener( new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		String search=srch.getText();
		
		if(search.equals("keyboard")||search.equals("Keyboard")||search.equals("KEYBOARD")||search.equals("mouse")||search.equals("Mouse")||search.equals("MOUSE")) {
			pnl2.setVisible(false);
			compname2.setVisible(false);
			purchase2.setVisible(false);
			price2.setVisible(false);
			

			pnl3.setVisible(false);
			compname3.setVisible(false);
			purchase3.setVisible(false);
			price3.setVisible(false);
			
			
			srch.setText("");
			
		}
		
		else if(search.equals("charger")||search.equals("Carger")||search.equals("CHARGER")) {
			
			pnl1.setVisible(false);
			compname1.setVisible(false);
			purchase1.setVisible(false);
			price1.setVisible(false);
			

			pnl2.setVisible(false);
			compname2.setVisible(false);
			purchase2.setVisible(false);
			price2.setVisible(false);
			
			
			srch.setText("");
			
		}
		else if(search.equals("graphics")||search.equals("graphics card")||search.equals("gtx")||search.equals("Graphics")||search.equals("Graphics Card")||search.equals("GTX")||search.equals("1080")) {
			
			pnl1.setVisible(false);
			compname1.setVisible(false);
			purchase1.setVisible(false);
			price1.setVisible(false);
			
			pnl3.setVisible(false);
			compname3.setVisible(false);
			purchase3.setVisible(false);
			price3.setVisible(false);
			
			
			srch.setText("");
			
			
		}
		else if(search.equals("RTX")||search.equals("rtx")) {
			JOptionPane.showMessageDialog(null, "This item is out of STOCK!");
			
			
		}
		else if(search.equals("")) {
			JOptionPane.showMessageDialog(null, "Enter The Name!");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid Name!");
		}
		
		
		
	}
	
});


		purchase1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				keyboardframe keyboard=new keyboardframe();
				dispose();
				keyboard.setVisible(true);
				
			}
			
			
			
		});
		
purchase2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				gtx g=new gtx();
				dispose();
				g.setVisible(true);

			}
			
			
			
		});
		
purchase3.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		charger charge=new charger();
		dispose();
		charge.setVisible(true);

	}
	
	
	
});
		
		
		
		
	}

	public static void main(String[] args) {


		componentsframe components=new componentsframe();
		components.setVisible(true);
		
	}

}
