package techgeek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class addremove extends JFrame {

	JPanel logo2,pnl1,pnl2;
	JLabel logoimg2,textinicon2,comingsoon,textup1,img1,pcname,price1,pcname2,price2,search,btncheck;
	JTextField srch;
	JButton ok,refresh,purchase1,purchase2,back,ok2,remove1,remove2;
	JRadioButton asus1,imac1;
	addremove(){
		ImageIcon topimg=new ImageIcon("400443685_1548923645856477_1374702581536554128_n.jpg");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(350,60,1200,800);
		this.setTitle("Tech Geek");
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0,0,50));
		this.setIconImage(topimg.getImage());

		textup1=new JLabel();
		textup1.setText("New Availabel Items: ");
		textup1.setBounds(40,-40,400,400);
		textup1.setForeground(Color.WHITE);
		textup1.setFont(new Font("Times New Roman",Font.ITALIC,20));
		this.add(textup1);
		
		logo2=new JPanel();
		logo2.setBounds(20,20,80,80);
		logo2.setBackground(new Color(0,0,20));
		this.add(logo2);
		

		ImageIcon img2=new ImageIcon("techgeek photo.jpg");
		img2.getImage();
		img2.setImage(img2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));
		logoimg2=new JLabel(img2);
		logo2.add(logoimg2);
		
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
		
		ImageIcon pnl1img=new ImageIcon("macbook.png");
		pnl1img.getImage();
		pnl1img.setImage(pnl1img.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		img1=new JLabel(pnl1img);
		pnl1.add(img1);
		
		
		
		
		pnl2=new JPanel();
		pnl2.setBounds(440,190,300,300);
		pnl2.setBackground(new Color(0,0,0,50));
		this.add(pnl2);
		
		ImageIcon pnl2img=new ImageIcon("hp.png");
		pnl2img.getImage();
		pnl2img.setImage(pnl2img.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		img1=new JLabel(pnl2img);
		pnl2.add(img1);
		
		
		comingsoon=new JLabel();
		comingsoon.setText("Coming Soon......");
		comingsoon.setFont(new Font("Times New Roman",Font.ITALIC,40));
		comingsoon.setForeground(new Color(255,204,51));
		comingsoon.setBounds(830,150,400,400);
		this.add(comingsoon);
		
		pcname=new JLabel();
		pcname.setText("Name: MACBOOK");
		pcname.setFont(new Font("times New Roman",Font.ITALIC,24));
		pcname.setForeground(Color.WHITE);
		pcname.setBounds(40,360,300,300);
		this.add(pcname);
		
		price1=new JLabel();
		price1.setText("Price: $1,199");
		price1.setFont(new Font("times New Roman",Font.ITALIC,24));
		price1.setForeground(Color.WHITE);
		price1.setBounds(40,400,300,300);
		this.add(price1);
		
		pcname2=new JLabel();
		pcname2.setText("Name: hp");
		pcname2.setFont(new Font("times New Roman",Font.ITALIC,24));
		pcname2.setForeground(Color.WHITE);
		pcname2.setBounds(450,360,300,300);
		this.add(pcname2);
		
		price2=new JLabel();
		price2.setText("Price: $499");
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
		purchase1.setBounds(40,570,100,50);
		purchase1.setText("ADD");
		purchase1.setFont(new Font("Times New Roman",Font.BOLD,18));
		purchase1.setForeground(Color.WHITE);
		purchase1.setBackground(new Color(220,20,60));
		purchase1.setFocusable(false);
		this.add(purchase1);
		
		remove1=new JButton();
		remove1.setBounds(180,570,130,50);
		remove1.setText("REMOVE");
		remove1.setFont(new Font("Times New Roman",Font.BOLD,18));
		remove1.setForeground(Color.WHITE);
		remove1.setBackground(new Color(220,20,60));
		remove1.setFocusable(false);
		this.add(remove1);
		
		purchase2=new JButton();
		purchase2.setBounds(440,570,100,50);
		purchase2.setText("ADD");
		purchase2.setFont(new Font("Times New Roman",Font.BOLD,18));
		purchase2.setForeground(Color.WHITE);
		purchase2.setBackground(new Color(220,20,60));
		purchase2.setFocusable(false);
		this.add(purchase2);
		
		remove2=new JButton();
		remove2.setBounds(580,570,130,50);
		remove2.setText("REMOVE");
		remove2.setFont(new Font("Times New Roman",Font.BOLD,18));
		remove2.setForeground(Color.WHITE);
		remove2.setBackground(new Color(220,20,60));
		remove2.setFocusable(false);
		this.add(remove2);
		
		
		
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
		
		
		
		
		
		asus1=new JRadioButton("MACBOOK");
		asus1.setBackground(new Color(0,0,50));
		asus1.setFocusable(false);
		asus1.setForeground(Color.WHITE);
		asus1.setFont(new Font("Times New Roman",Font.BOLD,14));
		asus1.setBounds(530,20,100,50);
		this.add(asus1);
		
		imac1=new JRadioButton("hp");
		imac1.setBackground(new Color(0,0,50));
		imac1.setFocusable(false);
		imac1.setForeground(Color.WHITE);
		imac1.setFont(new Font("Times New Roman",Font.BOLD,16));
		imac1.setBounds(530,60,100,50);
		this.add(imac1);
	
		
	
		ButtonGroup grp=new ButtonGroup();
		grp.add(asus1);
		grp.add(imac1);
		
		
		
		
		ok2=new JButton();
		ok2.setBounds(640,45,80,40);
		ok2.setBackground(new Color(220,20,60));
		ok2.setText("OK");
		ok2.setForeground(Color.white);
		ok2.setFocusable(false);
		ok2.setFont(new Font("Times New Roman",Font.BOLD,18));
		this.add(ok2);
		
		
		ok2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				if(asus1.isSelected()==true) {
					
					pnl2.setVisible(false);
					pcname2.setVisible(false);
					purchase2.setVisible(false);
					price2.setVisible(false);
					comingsoon.setVisible(false);
					remove2.setVisible(false);
					
					srch.setText("");
					
				}
				else if(imac1.isSelected()==true) {
					pnl1.setVisible(false);
					remove1.setVisible(false);
					pcname.setVisible(false);
					purchase1.setVisible(false);
					price1.setVisible(false);
					comingsoon.setVisible(false);
					srch.setText("");
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Select Your Iteam! ");
				}
			
					
				}
			
			
			
			
		});

		
		
		
		ok.addActionListener( new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				String search=srch.getText();
				
				if(search.equals("macbook")||search.equals("Macbook")||search.equals("MACBOOK")) {
					pnl2.setVisible(false);
					pcname2.setVisible(false);
					purchase2.setVisible(false);
					remove1.setVisible(false);
					price2.setVisible(false);
					comingsoon.setVisible(false);
					
					srch.setText("");
					
				}
				else if(search.equals("HP")||search.equals("hp")||search.equals("Hp")||search.equals("hP")) {
					
					pnl1.setVisible(false);
					pcname.setVisible(false);
					purchase1.setVisible(false);
					remove1.setVisible(false);
					price1.setVisible(false);
					comingsoon.setVisible(false);
					srch.setText("");
					
					
				}
				else if(search.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter The Name!");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Name!");
				}
				
				
				
			}
			
		});
		
		refresh.addActionListener(new ActionListener() {

	
			public void actionPerformed(ActionEvent e) {
			
				pnl1.setVisible(true);
				pcname.setVisible(true);
				purchase1.setVisible(true);
				price1.setVisible(true);
				comingsoon.setVisible(true);
				remove1.setVisible(true);
				srch.setText("");
				
				
				pnl2.setVisible(true);
				pcname2.setVisible(true);
				purchase2.setVisible(true);
				price2.setVisible(true);
				remove2.setVisible(true);
				comingsoon.setVisible(true);
				
				srch.setText("");
			}
			
		});
	back.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				addremove ar=new addremove();
				dispose();
				ar.setVisible(true);
			}
			
		});
	
	
	purchase2.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Item Added!");
			hpadd hp=new hpadd();
			dispose();
			hp.setVisible(true);

			
		}
		
	});
		

	purchase1.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Item Added!");
			macbookadd mac=new macbookadd();
			dispose();
			mac.setVisible(true);

			
		}
		
	});
	
	remove1.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Item has been Removed!");
			laptoppc laptop=new laptoppc();
			dispose();
			laptop.setVisible(true);
			
		}
		
		
		
		
	});
	
remove2.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Item has been Removed!");
			laptoppc laptop=new laptoppc();
			dispose();
			laptop.setVisible(true);
			
		}
		
		
		
		
	});
		
		
		
		
	}

		
		
		
	
	public static void main(String[] args) {
		addremove ar=new addremove();
		ar.setVisible(true);
		
		
	}

}
