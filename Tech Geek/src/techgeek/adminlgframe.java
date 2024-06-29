package techgeek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class adminlgframe extends JFrame {
	
	JLabel logoimg,textinicon,loginimg,textinup,user,pass;
	JTextField userfld;
	JPasswordField passfld;
	JPanel logo1,loginpnl,adminloginpic;
	JButton loginb,clearb,register;
	adminlgframe(){
		ImageIcon topimg=new ImageIcon("400443685_1548923645856477_1374702581536554128_n.jpg");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(350,60,1200,800);
		this.setTitle("Registration frame");
		this.setLayout(null);
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
		
		loginpnl=new JPanel();
		loginpnl.setBounds(600,0,600,800);
		loginpnl.setLayout(null);
		this.add(loginpnl);
		
		adminloginpic=new JPanel();
		adminloginpic.setBackground(new Color(0,0,0,10));
		adminloginpic.setBounds(130,200,300,300);
		this.add(adminloginpic);
		
		ImageIcon admimg=new ImageIcon("adminloginpic.png");
		admimg.getImage();
		admimg.setImage(admimg.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		loginimg=new JLabel(admimg);
		adminloginpic.add(loginimg);
		
		textinup=new JLabel();
		textinup.setText("ADMIN LOGIN");
		textinup.setFont(new Font("Times New Roman",Font.ITALIC,40));
		textinup.setForeground(Color.BLACK);
		textinup.setBounds(160,-200,500,500);
		loginpnl.add(textinup);
		
		
		user=new JLabel();
		user.setText("User ID: ");
		user.setBounds(40,-50,400,400);
		user.setFont(new Font("Times New Roman",Font.ITALIC,28));
		user.setForeground(Color.BLACK);
		user.setLayout(null);
		loginpnl.add(user);
		
		userfld=new JTextField();
		userfld.setBounds(150,125,300,50);
		userfld.setForeground(Color.black);
		userfld.setFont(new Font("Times New Roman",Font.BOLD,28));
		loginpnl.add(userfld);
		
		pass=new JLabel();
		pass.setText("Password: ");
		pass.setBounds(15,28,400,400);
		pass.setFont(new Font("Times New Roman",Font.ITALIC,28));
		pass.setForeground(Color.BLACK);
		pass.setLayout(null);
		loginpnl.add(pass);
		
		passfld=new JPasswordField();
		passfld.setBounds(150,200,300,50);
		passfld.setEchoChar('*');
		passfld.setForeground(Color.black);
		passfld.setFont(new Font("Times New Roman",Font.BOLD,28));
		loginpnl.add(passfld);
		
		
		loginb=new JButton();
		loginb.setBounds(160,260,130,50);
		loginb.setText("LOGIN");
		loginb.setFocusable(false);
		loginb.setFont(new Font("Times New Roman",Font.ITALIC,24));
		loginb.setForeground(Color.WHITE);
		loginb.setBackground(Color.BLACK);
		loginpnl.add(loginb);
		
		clearb=new JButton();
		clearb.setBounds(310,260,130,50);
		clearb.setText("CLEAR");
		clearb.setFocusable(false);
		clearb.setFont(new Font("Times New Roman",Font.ITALIC,24));
		clearb.setForeground(Color.WHITE);
		clearb.setBackground(Color.BLACK);
		loginpnl.add(clearb);
		
		register=new JButton();
		register.setBounds(205,400,200,50);
		register.setText("Register Now");
		register.setFocusable(false);
		register.setFont(new Font("Times New Roman",Font.ITALIC,24));
		register.setForeground(Color.WHITE);
		register.setBackground(Color.BLACK);
		loginpnl.add(register);
		
		
		clearb.addActionListener( new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				userfld.setText("");
				passfld.setText("");
				
			}
			
			
			
		});
loginb.addActionListener(new ActionListener() {

			
			
			public void actionPerformed(ActionEvent e) {
				String user="admin";
				String pass="123";
				
				if(user.equals(userfld.getText())&& pass.equals(passfld.getText())) {
					JOptionPane.showMessageDialog(null, "WLCOME!");
					addremove ar=new addremove();
					dispose();
					ar.setVisible(true);
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Fill Up Everything Correctly!");
				}
				
			
				
			}
			
		});


		register.addActionListener(new ActionListener() {

		
			public void actionPerformed(ActionEvent e) {
				
				adminreg reg=new adminreg();
				dispose();
				reg.setVisible(true);
			}
			
			
			
		});
		
	}

	
	public static void main(String[] args) {
		
		adminlgframe login=new adminlgframe();
		login.setVisible(true);
		
	}

}
