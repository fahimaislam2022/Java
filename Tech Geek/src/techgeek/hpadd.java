package techgeek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class hpadd extends JFrame {
	
	JLabel textup1,logoimg2,textinicon2,img1,comingsoon,laptopname,price1,laptopname2,laptopname3,price2,price3,search,btncheck,components;
	JPanel logo2,pnl1,pnl2,panel3;
	JTextField srch;
	JButton ok2,ok,refresh,purchase1,purchase2,purchase3,back;
	JRadioButton msi1,acer1,hp1;
	
	hpadd(){
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
		
		ImageIcon pnl1img=new ImageIcon("msi.png");
		pnl1img.getImage();
		pnl1img.setImage(pnl1img.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH));
		img1=new JLabel(pnl1img);
		pnl1.add(img1);
		
		
		
		
		pnl2=new JPanel();
		pnl2.setBounds(440,190,300,300);
		pnl2.setBackground(new Color(0,0,0,50));
		this.add(pnl2);
		
		ImageIcon pnl2img=new ImageIcon("acer.png");
		pnl2img.getImage();
		pnl2img.setImage(pnl2img.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img1=new JLabel(pnl2img);
		pnl2.add(img1);
		
		
		panel3=new JPanel();
		panel3.setBounds(850,190,300,300);
		panel3.setBackground(new Color(0,0,0,50));
		this.add(panel3);
		
		ImageIcon componentsimg=new ImageIcon("hp.png");
		componentsimg.getImage();
		componentsimg.setImage(componentsimg.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
		components=new JLabel(componentsimg);
		panel3.add(components);
		
		laptopname3=new JLabel();
		laptopname3.setText("Name: HP");
		laptopname3.setFont(new Font("times New Roman",Font.ITALIC,24));
		laptopname3.setForeground(Color.WHITE);
		laptopname3.setBounds(850,360,300,300);
		this.add(laptopname3);
		
		price3=new JLabel();
		price3.setText("Price: $499");
		price3.setFont(new Font("times New Roman",Font.ITALIC,24));
		price3.setForeground(Color.WHITE);
		price3.setBounds(850,400,300,300);
		this.add(price3);
		
		purchase3=new JButton();
		purchase3.setBounds(850,570,150,50);
		purchase3.setText("Purchase");
		purchase3.setFont(new Font("Times New Roman",Font.BOLD,18));
		purchase3.setForeground(Color.WHITE);
		purchase3.setBackground(new Color(220,20,60));
		purchase3.setFocusable(false);
		this.add(purchase3);
		
		
		laptopname=new JLabel();
		laptopname.setText("Name: MSI");
		laptopname.setFont(new Font("times New Roman",Font.ITALIC,24));
		laptopname.setForeground(Color.WHITE);
		laptopname.setBounds(40,360,300,300);
		this.add(laptopname);
		
		price1=new JLabel();
		price1.setText("Price: $1,299");
		price1.setFont(new Font("times New Roman",Font.ITALIC,24));
		price1.setForeground(Color.WHITE);
		price1.setBounds(40,400,300,300);
		this.add(price1);
		
		laptopname2=new JLabel();
		laptopname2.setText("Name:acer");
		laptopname2.setFont(new Font("Times New Roman",Font.ITALIC,24));
		laptopname2.setForeground(Color.WHITE);
		laptopname2.setBounds(450,360,300,300);
		this.add(laptopname2);
		
		price2=new JLabel();
		price2.setText("Price: $650");
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
		
		msi1=new JRadioButton("MSI");
		msi1.setBackground(new Color(0,0,50));
		msi1.setFocusable(false);
		msi1.setForeground(Color.WHITE);
		msi1.setFont(new Font("Times New Roman",Font.BOLD,16));
		msi1.setBounds(530,20,100,50);
		this.add(msi1);
		
		acer1=new JRadioButton("acer");
		acer1.setBackground(new Color(0,0,50));
		acer1.setFocusable(false);
		acer1.setForeground(Color.WHITE);
		acer1.setFont(new Font("Times New Roman",Font.BOLD,16));
		acer1.setBounds(530,60,100,50);
		this.add(acer1);
		
		hp1=new JRadioButton("HP");
		hp1.setBackground(new Color(0,0,50));
		hp1.setFocusable(false);
		hp1.setForeground(Color.WHITE);
		hp1.setFont(new Font("Times New Roman",Font.BOLD,16));
		hp1.setBounds(530,100,100,50);
		this.add(hp1);
		
		
		
		ButtonGroup grp=new ButtonGroup();
		grp.add(msi1);
		grp.add(acer1);
		grp.add(hp1);
		
		
		
		
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
				
				if(msi1.isSelected()==true) {
					
					pnl2.setVisible(false);
					laptopname2.setVisible(false);
					purchase2.setVisible(false);
					price2.setVisible(false);
					
					panel3.setVisible(false);
					laptopname3.setVisible(false);
					purchase3.setVisible(false);
					price3.setVisible(false);
					
					
					srch.setText("");
					
				}
				else if(acer1.isSelected()==true) {
					pnl1.setVisible(false);
					laptopname.setVisible(false);
					purchase1.setVisible(false);
					price1.setVisible(false);
					
					panel3.setVisible(false);
					laptopname3.setVisible(false);
					purchase3.setVisible(false);
					price3.setVisible(false);
					
					srch.setText("");
					
					
				}
				
				else if(hp1.isSelected()==true) {
					pnl1.setVisible(false);
					laptopname.setVisible(false);
					purchase1.setVisible(false);
					price1.setVisible(false);
					
					pnl2.setVisible(false);
					laptopname2.setVisible(false);
					purchase2.setVisible(false);
					price2.setVisible(false);
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Select Your Iteam! ");
				}
			
					
				}
			
			
			
			
		});


ok.addActionListener( new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		String search=srch.getText();
		
		if(search.equals("MSI")||search.equals("msi")||search.equals("Msi")) {
			pnl2.setVisible(false);
			laptopname2.setVisible(false);
			purchase2.setVisible(false);
			price2.setVisible(false);
			
			panel3.setVisible(false);
			laptopname3.setVisible(false);
			purchase3.setVisible(false);
			price3.setVisible(false);
			
			srch.setText("");
			
		}
		else if(search.equals("acer")||search.equals("ACER")||search.equals("Acer")) {
			
			pnl1.setVisible(false);
			laptopname.setVisible(false);
			purchase1.setVisible(false);
			price1.setVisible(false);
			
			panel3.setVisible(false);
			laptopname3.setVisible(false);
			purchase3.setVisible(false);
			price3.setVisible(false);
			
			srch.setText("");
			
			
		}
		else if(search.equals("HP")||search.equals("hp")||search.equals("Hp")||search.equals("hP")) {
			pnl1.setVisible(false);
			laptopname.setVisible(false);
			purchase1.setVisible(false);
			price1.setVisible(false);
			
			pnl2.setVisible(false);
			laptopname2.setVisible(false);
			purchase2.setVisible(false);
			price2.setVisible(false);
			
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
		laptopname.setVisible(true);
		purchase1.setVisible(true);
		price1.setVisible(true);
		
		srch.setText("");
		
		
		pnl2.setVisible(true);
		laptopname2.setVisible(true);
		purchase2.setVisible(true);
		price2.setVisible(true);
		
		panel3.setVisible(true);
		laptopname3.setVisible(true);
		purchase3.setVisible(true);
		price3.setVisible(true);
		
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


purchase1.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		msiframe msi=new msiframe();
		dispose();
		msi.setVisible(true);
	}
	
	
	
});

purchase2.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		acerframe acer=new acerframe();
		dispose();
		acer.setVisible(true);
	}
	
	
	
});

purchase3.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		buyhp hp=new buyhp();
		dispose();
		hp.setVisible(true);
	}
	
	
	
});


		
		
		
	}

	public static void main(String[] args) {
		hpadd hp=new hpadd();
		hp.setVisible(true);

	}

}
