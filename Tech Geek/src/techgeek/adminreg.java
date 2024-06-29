package techgeek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class adminreg extends JFrame {
	
	JLabel registertext,name,pass,conpass,panelpic,email,address,logoimg,textinicon;
	JTextField tf1,em,adrs;
	JPasswordField pf1,cnpf;
	JPanel info,picpnl,logo1;
	JButton signup,back;
	
	adminreg(){
		ImageIcon topimg=new ImageIcon("400443685_1548923645856477_1374702581536554128_n.jpg");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(350,60,1200,800);
		this.setTitle("Registration frame");
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(135, 206, 235));
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
		
		
		registertext=new JLabel();
		registertext.setText("REGISTER ADMIN ACCOUNT");
		registertext.setForeground(Color.MAGENTA);
		registertext.setBounds(380,-260,600,600);
		registertext.setFont(new Font("Times New Roman",Font.ITALIC,33));
		this.add(registertext);
		
		
		info=new JPanel();
		info.setBounds(600,80,450,600);
		info.setLayout(null);
		info.setBackground(new Color(0,0,0,150));
		this.add(info);
		
		name=new JLabel();
		name.setText("Name: ");
		name.setBounds(20,-110,300,300);
		name.setFont(new Font("Times new Roman",Font.ITALIC,24));
		name.setForeground(new Color(255,204,51));
		info.add(name);
		
		tf1=new JTextField();
		tf1.setBounds(20,60,400,50);
		tf1.setFont(new Font("Times New Roman",Font.BOLD,24));
		tf1.setBackground(new Color(0,0,10));
		tf1.setForeground(Color.WHITE);
		info.add(tf1);
		
		pass=new JLabel();
		pass.setText("Password: ");
		pass.setBounds(20,-20,300,300);
		pass.setFont(new Font("Times new Roman",Font.ITALIC,24));
		pass.setForeground(new Color(255,204,51));
		info.add(pass);
		
		pf1=new JPasswordField();
		pf1.setBounds(20,150,400,50);
		pf1.setEchoChar('*');
		pf1.setFont(new Font("Times New Roman",Font.BOLD,24));
		pf1.setBackground(new Color(0,0,10));
		pf1.setForeground(Color.WHITE);
		info.add(pf1);
		
		conpass=new JLabel();
		conpass.setText("Confirm Password: ");
		conpass.setBounds(20,70,300,300);
		conpass.setFont(new Font("Times new Roman",Font.ITALIC,24));
		conpass.setForeground(new Color(255,204,51));
		info.add(conpass);
		
		cnpf=new JPasswordField();
		cnpf.setBounds(20,240,400,50);
		cnpf.setEchoChar('*');
		cnpf.setFont(new Font("Times New Roman",Font.BOLD,24));
		cnpf.setBackground(new Color(0,0,10));
		cnpf.setForeground(Color.WHITE);
		info.add(cnpf);
		
		email=new JLabel();
		email.setText("Email ID: ");
		email.setBounds(20,160,300,300);
		email.setFont(new Font("Times new Roman",Font.ITALIC,24));
		email.setForeground(new Color(255,204,51));
		info.add(email);
		
		
		em=new JTextField();
		em.setBounds(20,330,400,50);
		em.setFont(new Font("Times New Roman",Font.BOLD,24));
		em.setBackground(new Color(0,0,10));
		em.setForeground(Color.WHITE);
		info.add(em);
		
		address=new JLabel();
		address.setText("Address: ");
		address.setBounds(20,250,300,300);
		address.setFont(new Font("Times new Roman",Font.ITALIC,24));
		address.setForeground(new Color(255,204,51));
		info.add(address);
		
		adrs=new JTextField();
		adrs.setBounds(20,420,400,50);
		adrs.setFont(new Font("Times New Roman",Font.BOLD,24));
		adrs.setBackground(new Color(0,0,10));
		adrs.setForeground(Color.WHITE);
		info.add(adrs);
		
		
		signup=new JButton();
		signup.setBounds(160,500,120,50);
		signup.setText("SIGN UP");
		signup.setFont(new Font("Times New Roman",Font.ITALIC,18));
		signup.setFocusable(false);
		signup.setForeground(Color.white);
		signup.setBackground(new Color(170, 51, 106));
		info.add(signup);
		
		back=new JButton();
		back.setBounds(40,690,130,40);
		back.setBackground(new Color(220,20,60));
		back.setText("BACK");
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Times New Roman",Font.BOLD,18));
		back.setFocusable(false);
		this.add(back);
		
		picpnl=new JPanel();
		picpnl.setBounds(0,120,450,600);
		picpnl.setBackground(new Color(0,0,0,1));
		this.add(picpnl);
		
		
		ImageIcon img=new ImageIcon("adminregpic.png");
		img.getImage();
		
		img.setImage(img.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
		
		panelpic=new JLabel(img);
		picpnl.add(panelpic);
		
		
		
		
		signup.addActionListener (new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				String name=tf1.getText();
				String pass=pf1.getText();
				String conpass=cnpf.getText();
				
				if(name.equals(tf1.getText()) && pass.equals(pf1.getText()) && conpass.equals(pass)) {
					JOptionPane.showInternalMessageDialog(null, "You Successfully Logged IN!");
					
					adminlgframe login=new adminlgframe();
					dispose();
					login.setVisible(true);
					
				}
				else if(!name.isEmpty() && !pass.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Fill Up Everything Correctly.");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Fill Up Everything Correctly.");
					
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
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		adminreg reg=new adminreg();
		reg.setVisible(true);

	}

}
