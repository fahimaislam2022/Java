package techgeek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Items extends JFrame {
	JPanel logo1,panel1,panel2,panel3;
	JLabel logoimg,textinicon,textup,desktop,laptop,components,search,cb,btncheck;
	JButton Desktop,Laptop,Components,ok,refresh,back,ok2;
	JTextField srch;
	JRadioButton desktop1,laptop1,components1;
	JComboBox combobox;

	
	Items(){
		ImageIcon topimg=new ImageIcon("400443685_1548923645856477_1374702581536554128_n.jpg");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(350,60,1200,800);
		this.setTitle("Tech Geek");
		this.setIconImage(topimg.getImage());
		this.getContentPane().setBackground(new Color(0,0,50));
		
		textup=new JLabel();
		textup.setText("Select Your Category: ");
		textup.setBounds(40,-40,400,400);
		textup.setForeground(Color.WHITE);
		textup.setFont(new Font("Times New Roman",Font.ITALIC,20));
		this.add(textup);
		
		
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
		
		panel1=new JPanel();
		panel1.setBounds(30,190,300,300);
		panel1.setBackground(new Color(0,0,0,50));
		this.add(panel1);
		
		ImageIcon pcimg=new ImageIcon("32745-9-gaming-computer-transparent_400x400.png");
		pcimg.getImage();
		pcimg.setImage(pcimg.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		desktop=new JLabel(pcimg);
		panel1.add(desktop);
		
		
		
		
		
		
		panel2=new JPanel();
		panel2.setBounds(440,190,300,300);
		panel2.setBackground(new Color(0,0,0,50));
		this.add(panel2);
		
		ImageIcon laptopimg=new ImageIcon("dlf.pt-laptop-in-png-1247883.png");
		laptopimg.getImage();
		laptopimg.setImage(laptopimg.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		laptop=new JLabel(laptopimg);
		panel2.add(laptop);
		
		
		panel3=new JPanel();
		panel3.setBounds(850,190,300,300);
		panel3.setBackground(new Color(0,0,0,50));
		this.add(panel3);
		
		ImageIcon componentsimg=new ImageIcon("laptop-computer-repair-technician-personal-computer-mobile-repair-93636635aac84dc8f8baa986ce7ceda2.png");
		componentsimg.getImage();
		componentsimg.setImage(componentsimg.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
		components=new JLabel(componentsimg);
		panel3.add(components);
		
		
		Desktop=new JButton();
		Desktop.setBounds(110,520,150,50);
		Desktop.setBackground(new Color(220,20,60));
		Desktop.setText("DesktTop");
		Desktop.setForeground(Color.WHITE);
		Desktop.setFont(new Font("Times New Roman",Font.BOLD,18));
		Desktop.setFocusable(false);
		this.add(Desktop);
		
		Laptop=new JButton();
		Laptop.setBounds(520,520,150,50);
		Laptop.setBackground(new Color(220,20,60));
		Laptop.setText("LapTop");
		Laptop.setForeground(Color.WHITE);
		Laptop.setFont(new Font("Times New Roman",Font.BOLD,18));
		Laptop.setFocusable(false);
		this.add(Laptop);
		
		Components=new JButton();
		Components.setBounds(930,520,150,50);
		Components.setBackground(new Color(220,20,60));
		Components.setText("Components");
		Components.setForeground(Color.WHITE);
		Components.setFont(new Font("Times New Roman",Font.BOLD,18));
		Components.setFocusable(false);
		this.add(Components);
		
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
		btncheck.setBounds(420,-120,400,400);
		this.add(btncheck);
		
		
		
		
		
		desktop1=new JRadioButton("Desktop");
		desktop1.setBackground(new Color(0,0,50));
		desktop1.setFocusable(false);
		desktop1.setForeground(Color.WHITE);
		desktop1.setFont(new Font("Times New Roman",Font.BOLD,16));
		desktop1.setBounds(530,20,100,50);
		this.add(desktop1);
		
		laptop1=new JRadioButton("Laptop");
		laptop1.setBackground(new Color(0,0,50));
		laptop1.setFocusable(false);
		laptop1.setForeground(Color.WHITE);
		laptop1.setFont(new Font("Times New Roman",Font.BOLD,16));
		laptop1.setBounds(530,60,100,50);
		this.add(laptop1);
	
		components1=new JRadioButton("Components");
		components1.setBackground(new Color(0,0,50));
		components1.setFocusable(false);
		components1.setForeground(Color.WHITE);
		components1.setFont(new Font("Times New Roman",Font.BOLD,16));
		components1.setBounds(530,100,130,50);
		this.add(components1);
	
		ButtonGroup grp=new ButtonGroup();
		grp.add(components1);
		grp.add(desktop1);
		grp.add(laptop1);
		
		
		
		ok2=new JButton();
		ok2.setBounds(640,60,80,40);
		ok2.setBackground(new Color(220,20,60));
		ok2.setText("OK");
		ok2.setForeground(Color.white);
		ok2.setFocusable(false);
		ok2.setFont(new Font("Times New Roman",Font.BOLD,18));
		this.add(ok2);
		
		
		ok2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				if(desktop1.isSelected()==true) {
					
					panel2.setVisible(false);
					Laptop.setVisible(false);
					
					panel3.setVisible(false);
					Components.setVisible(false);
					
				}
				else if(laptop1.isSelected()==true) {
					panel1.setVisible(false);
					Desktop.setVisible(false);
					
					panel3.setVisible(false);
					Components.setVisible(false);
					
				}
				else if(components1.isSelected()==true) {
					panel1.setVisible(false);
					Desktop.setVisible(false);
					
					panel2.setVisible(false);
					Laptop.setVisible(false);
					
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Select Your Iteam! ");
				}
			}
			
			
			
		});

		
		
	
		
		back.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				FrameWork fr=new FrameWork();
				dispose();
				fr.setVisible(true);
			}
			
		});
	
		
		
		
		ok.addActionListener( new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				String search=srch.getText();
				
				if(search.equals("Desktop") || search.equals("desktop") || search.equals("DeskTop") ||search.equals("DESKTOP")) {
					
					panel2.setVisible(false);
					Laptop.setVisible(false);
					
					panel3.setVisible(false);
					Components.setVisible(false);
					
					
				}
				else if(search.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter The Name!");
					
				}
				else if(search.equals("Laptop") || search.equals("laptop") || search.equals("LapTop") ||search.equals("LAPTOP")) {
					
					panel1.setVisible(false);
					Desktop.setVisible(false);
					
					panel3.setVisible(false);
					Components.setVisible(false);
				}
	else if(search.equals("Components") || search.equals("components") || search.equals("COMPONENTS") ) {
					
					panel1.setVisible(false);
					Desktop.setVisible(false);
					
					panel2.setVisible(false);
					Laptop.setVisible(false);
				}
	else {
		JOptionPane.showMessageDialog(null, "Invalid Name.");
		srch.setText("");
	}
				
				
				
			}
			
		});
		
		refresh.addActionListener(new ActionListener() {

		
			public void actionPerformed(ActionEvent e) {
				
				panel1.setVisible(true);
				Desktop.setVisible(true);
				
				panel2.setVisible(true);
				Laptop.setVisible(true);
				
				panel3.setVisible(true);
				Components.setVisible(true);
				
				srch.setText("");
				
			}
			
			
		});
		
		
		Desktop.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				desktoppc pc=new desktoppc();
				dispose();
				pc.setVisible(true);
				
				
			}
			
		});
		
		
		Laptop.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				laptoppc laptop=new laptoppc();
				dispose();
				laptop.setVisible(true);
				
				
			}
			
		});
		
		Components.addActionListener(new ActionListener() {

	
			public void actionPerformed(ActionEvent e) {
			
				componentsframe components=new componentsframe();
				dispose();
				components.setVisible(true);
				
				
			}
			
			
			
			
		});
		
	}

	public static void main(String[] args) {
		Items item=new Items();
		item.setVisible(true);

	}

}
