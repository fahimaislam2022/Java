package techgeek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class FrameWork extends JFrame{
	
	JPanel pnl1,pnl2,pnl3,logo2;
	JLabel background,user,pass,title,background2,title2,logoimg2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2,b3,back,admin;
	
	FrameWork(){
		ImageIcon topimg=new ImageIcon("400443685_1548923645856477_1374702581536554128_n.jpg");
		
		ImageIcon backgroundimg=new ImageIcon("Screenshot 2023-12-10 224355.png");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(350,60,1200,800);
		this.setTitle("TECH GEEK");
		this.setLayout(null);
		this.getContentPane().setBackground(Color.BLACK);
		this.setIconImage(topimg.getImage());
		
		
		
		
		
		Image img=backgroundimg.getImage();
		Image tempimg=img.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
		backgroundimg=new ImageIcon(tempimg);
		background=new JLabel("",backgroundimg,JLabel.CENTER);
		background.setBounds(0,0,1200,800);
		this.add(background);
		
		

		pnl1=new JPanel();
		pnl1.setBounds(790,80,330,600);
		pnl1.setBackground(Color.YELLOW);
		background.add(pnl1);
		
		pnl2=new JPanel();
		pnl2.setBounds(800,90,310,580);
		pnl2.setBackground(new Color(0,0,20));
		pnl1.add(pnl2);
		
		background.add(pnl2);
		background.add(pnl1);
		
		title=new JLabel();
		title.setText("WELCOME TO NEW EVOLUTION");
		title.setFont(new Font("Times New Roman",Font.ITALIC,33));
		title.setForeground(Color.CYAN);
		title.setBounds(380,-260,600,600);
		background.add(title);
		
		user=new JLabel();
		user.setText("User ID: ");
		user.setFont(new Font("Times New Roman",Font.ITALIC,18));
		user.setForeground(Color.white);
		user.setBounds(30,-70,200,200);
		pnl2.setLayout(null);
		pnl2.add(user);
		
		tf=new JTextField();
		tf.setBounds(30,60,250,50);
		tf.setFont(new Font("Times New Roman",Font.BOLD,18));
		tf.setForeground(Color.BLACK);
		pnl2.add(tf);
		
		pass=new JLabel();
		pass.setText("Password: ");
		pass.setFont(new Font("Times New Roman",Font.ITALIC,18));
		pass.setForeground(Color.white);
		pass.setBounds(30,40,200,200);
		pnl2.add(pass);
		
		pf=new JPasswordField();
		pf.setBounds(30,160,250,50);
		pf.setFont(new Font("Times New Roman",Font.BOLD,18));
		pf.setForeground(Color.BLACK);
		pf.setEchoChar('*');
		pnl2.add(pf);
	
		b1=new JButton();
		b1.setText("LOGIN");
		b1.setFont(new Font("Times New Roman",Font.ITALIC,18));
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.GREEN);
		b1.setFocusable(false);
		b1.setBounds(30,240,100,50);
		pnl2.add(b1);
		
		b2=new JButton();
		b2.setText("CLEAR");
		b2.setFont(new Font("Times New Roman",Font.ITALIC,18));
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.RED);
		b2.setFocusable(false);
		b2.setBounds(180,240,100,50);
		pnl2.add(b2);
		
		b3=new JButton();
		b3.setText("SIGN IN");
		b3.setFont(new Font("Times New Roman",Font.ITALIC,18));
		b3.setForeground(Color.BLACK);
		b3.setBackground(Color.PINK);
		b3.setFocusable(false);
		b3.setBounds(105,300,100,50);
		pnl2.add(b3);
	
		
		
		pnl3=new JPanel();
		pnl3.setBounds(0,90,500,500);
		pnl3.setBackground(new Color(0,0,0,10));
		
		background.add(pnl3); 
		
		ImageIcon img2=new ImageIcon("Lovepik_com-450098997-Account login flat illustration.png");
		img2.getImage();
		img2.setImage(img2.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
		
		background2=new JLabel(img2);
	
		
		pnl3.add(background2);
		
		
		title2=new JLabel();
		title2.setLayout(null);
		title2.setText("''Power is in your hand''");
		title2.setFont(new Font("Times New Roman",Font.ITALIC,40));
		title2.setForeground(Color.ORANGE);
		title2.setBounds(-10,90,500,500);
		
		pnl3.add(title2);
		
		back=new JButton();
		back.setBounds(170,600,130,40);
		back.setBackground(new Color(220,20,60));
		back.setText("BACK");
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Times New Roman",Font.BOLD,18));
		back.setFocusable(false);
		background.add(back);
		
		
		admin=new JButton();
		admin.setBounds(105,500,100,50);
		admin.setText("ADMIN");
		admin.setBackground(new Color(255,102,0));
		admin.setForeground(Color.black);
		admin.setFocusable(false);
		admin.setFont(new Font("Times New Roman",Font.ITALIC,18));
		pnl2.add(admin);
		
		
		
		
		
	back.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				Welcomepage welcome=new Welcomepage();
				dispose();
				welcome.setVisible(true);

			}
			
		});
		
		
		
		b1.addActionListener(new ActionListener() {

			
			
			public void actionPerformed(ActionEvent e) {
				String user="Protik";
				String pass="12345";
				
				if(user.equals(tf.getText())&& pass.equals(pf.getText())) {
					JOptionPane.showMessageDialog(null, "WLCOME!");
					Items item=new Items();
					dispose();
					item.setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Fill Up Everything Correctly!");
				}
				
			
				
			}
			
		});
		
		
		b2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				pf.setText("");
				
			}
			
		});

		
		b3.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				RegFrame fr=new RegFrame();
				dispose();
				fr.setVisible(true);
			}
			
		});
		admin.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				adminlgframe login=new adminlgframe();
				dispose();
				login.setVisible(true);
			}
			
			
			
		});
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		FrameWork fr=new FrameWork();
		fr.setVisible(true);
		

	}

	
}
