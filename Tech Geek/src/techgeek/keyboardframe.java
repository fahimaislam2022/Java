package techgeek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class keyboardframe extends JFrame {
	JLabel logoimg2,textinicon2,uppertext,img1,nameofmac,rating,sells,price,payment,cardnum,pin;
	JPanel logo2,pnel1;
	JTextField pymnt,cardf;
	JButton buy,visacard2,paypal,back;
	JPasswordField pinnum;
	
	keyboardframe(){
		ImageIcon topimg=new ImageIcon("400443685_1548923645856477_1374702581536554128_n.jpg");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(350,60,1200,800);
		this.setTitle("Tech Geek");
		this.setIconImage(topimg.getImage());
		//this.getContentPane().setBackground(Color.WHITE);
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
		textinicon2.setForeground(Color.black);
		textinicon2.setBounds(120,-140,400,400);
		this.add(textinicon2);
		
		
		
		uppertext=new JLabel();
		uppertext.setText("Shop Now");
		uppertext.setForeground(Color.black);
		uppertext.setBounds(495,-110,300,300);
		uppertext.setFont(new Font("Times New Roman",Font.ITALIC,40));
		this.add(uppertext);
		
		pnel1=new JPanel();
		pnel1.setBounds(50,170,400,400);
		pnel1.setBackground(new Color(0,0,0,50));
		this.add(pnel1);
		
		ImageIcon pnel1img=new ImageIcon("rgb keyboard.png");
		pnel1img.getImage();
		pnel1img.setImage(pnel1img.getImage().getScaledInstance(400, 350, Image.SCALE_SMOOTH));
		img1=new JLabel(pnel1img);
		pnel1.add(img1);
		
		nameofmac=new JLabel();
		nameofmac.setText("Name: Keyboard and Mouse(RGB)");
		nameofmac.setForeground(Color.black);
		nameofmac.setBounds(490,-110,800,600);
		nameofmac.setFont(new Font("Times New Roman",Font.ITALIC,36));
		this.add(nameofmac);
		

		rating=new JLabel();
		rating.setText("Rating: 9.7/10");
		rating.setForeground(Color.black);
		rating.setBounds(490,-20,600,600);
		rating.setFont(new Font("Times New Roman",Font.ITALIC,36));
		this.add(rating);
		
		sells=new JLabel();
		sells.setText("Number of sales in one month:112");
		sells.setForeground(Color.black);
		sells.setBounds(490,70,600,600);
		sells.setFont(new Font("Times New Roman",Font.ITALIC,36));
		this.add(sells);
		
		price=new JLabel();
		price.setText("Price:$92");
		price.setForeground(Color.black);
		price.setBounds(490,160,600,600);
		price.setFont(new Font("Times New Roman",Font.ITALIC,36));
		this.add(price);
		
		payment=new JLabel();
		payment.setText("Payment:");
		payment.setForeground(Color.black);
		payment.setBounds(490,250,600,600);
		payment.setFont(new Font("Times New Roman",Font.ITALIC,36));
		this.add(payment);
		
		pymnt=new JTextField();
		pymnt.setBounds(630,527,350,50);
		pymnt.setFont(new Font("Times New Roman",Font.PLAIN,36));
		pymnt.setForeground(Color.black);
		this.add(pymnt);
		
		buy=new JButton();
		buy.setBounds(715,600,150,50);
		buy.setText("BUY NOW");
		buy.setFont(new Font("Times New Roman",Font.BOLD,18));
		buy.setBackground(Color.BLACK);
		buy.setForeground(Color.WHITE);
		buy.setFocusable(false);
		this.add(buy);
		
		ImageIcon visacardimg=new ImageIcon("VISA-Logo-1976.png");
		visacardimg.getImage();
		visacardimg.setImage(visacardimg.getImage().getScaledInstance(120,65, Image.SCALE_SMOOTH));
		visacard2=new JButton(visacardimg);
		visacard2.setBounds(900,5,100,60);
		visacard2.setFocusable(false);
		this.add(visacard2);
		
		
		ImageIcon paypalimg=new ImageIcon("paypal.png");
		paypalimg.getImage();
		paypalimg.setImage(paypalimg.getImage().getScaledInstance(100,60, Image.SCALE_SMOOTH));
		paypal=new JButton(paypalimg);
		paypal.setBounds(1010,5,100,60);
		paypal.setFocusable(false);
		this.add(paypal);
		
		cardf=new JTextField();
		cardf.setBounds(900,70,200,30);
		cardf.setFont(new Font("Times New Roman",Font.BOLD,20));
		cardf.setForeground(Color.BLACK);
		this.add(cardf);
		
		
		cardnum=new JLabel();
		cardnum.setText("Card Number:");
		cardnum.setFont(new Font("Times New Roman",Font.ITALIC,20));
		cardnum.setForeground(Color.BLACK);
		cardnum.setBounds(780,-65,300,300);
		this.add(cardnum);
		
		
		pin=new JLabel();
		pin.setText("PIN:");
		pin.setFont(new Font("Times New Roman",Font.ITALIC,20));
		pin.setForeground(Color.BLACK);
		pin.setBounds(855,-35,300,300);
		this.add(pin);
		
		
		pinnum=new JPasswordField();
		pinnum.setBounds(900,105,200,30);
		pinnum.setFont(new Font("Times New Roman",Font.BOLD,20));
		pinnum.setEchoChar('*');
		pinnum.setForeground(Color.BLACK);
		this.add(pinnum);
		
		back=new JButton();
		back.setBounds(40,690,130,40);
		back.setBackground(Color.BLACK);
		back.setText("BACK");
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Times New Roman",Font.BOLD,18));
		back.setFocusable(false);
		this.add(back);
		
back.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				componentsframe components=new componentsframe();
				dispose();
				components.setVisible(true);
				
			}
			
		});
visacard2.addActionListener(new ActionListener() {


public void actionPerformed(ActionEvent e) {

	JOptionPane.showMessageDialog(null, "Your Card Has Been Selected!");
	
}



});

paypal.addActionListener(new ActionListener() {


public void actionPerformed(ActionEvent e) {

	JOptionPane.showMessageDialog(null, "Your Card Has Been Selected!");
	
}



});

buy.addActionListener(new ActionListener() {


public void actionPerformed(ActionEvent e) {

	String payment=pymnt.getText();
	
	if(payment.equals("92")) {
		JOptionPane.showMessageDialog(null, "Congratulation.Thank You For Buying!");
		
		Items item=new Items();
		dispose();
		item.setVisible(true);
	}
	else {
		JOptionPane.showMessageDialog(null, "please pay your payment prefectly!");
	}
	
	
	
}

});



	}
	
	
	
	

	public static void main(String[] args) {
		keyboardframe keyboard=new keyboardframe();
		keyboard.setVisible(true);
		

	}

}
