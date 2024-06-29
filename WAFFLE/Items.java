import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class Items extends JFrame implements ActionListener 
{
	JPanel logo1,panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8;
	JLabel logoimg,textinicon,textup,chocolatewaffle,strawberrywaffle,vanillawaffle,label4,label5,label6,label7,label8,search;
	JButton p1, p2, p3, p4, p5, p6, p7, p8,addButton,deleteButton;
	JButton Chocolatewaffle,Strawberrywaffle,Vanillawaffle,b4,b5,b6,b7,b8,ok,refresh,back;
	JTextField srch;
	
	Items()
	{
		ImageIcon topimg=new ImageIcon("Icon.jpg"); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(60,60,1400,800);
		this.setTitle("Waffle Verse");
		this.setIconImage(topimg.getImage());
		this.getContentPane().setBackground(new Color(250,249,246));
		this.setLocationRelativeTo(null);
		
		textup=new JLabel();
		textup.setText("Select Your Desirable Waffle: ");
		textup.setBounds(60,-100,400,400);
		textup.setForeground(Color.RED);
		textup.setFont(new Font("Times New Roman",Font.ITALIC,20));
		this.add(textup);
		
		
		logo1=new JPanel();
		logo1.setBounds(20,20,80,80);
		logo1.setBackground(new Color(0,0,20));
		this.add(logo1);
		

		ImageIcon img2=new ImageIcon("Icon.jpg");
		img2.getImage();
		img2.setImage(img2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));
		logoimg=new JLabel(img2);
		logo1.add(logoimg);
		
		textinicon=new JLabel();
		textinicon.setText("Waffle Verse");
		textinicon.setFont(new Font("Times New Roman",Font.ITALIC,40));
		textinicon.setForeground(Color.RED);
	    textinicon.setBounds(120,-140,400,400);
		this.add(textinicon);
		//panel
		panel1=new JPanel();
		panel1.setBounds(50,120,300,220);
		panel1.setBackground(new Color(250,249,246));
		this.add(panel1);
		ImageIcon w1img=new ImageIcon("57d30fa6036368b698aa47391b2fe99c.jpg");
		w1img.getImage();
		w1img.setImage(w1img.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
		chocolatewaffle=new JLabel(w1img);
		panel1.add(chocolatewaffle);
		Chocolatewaffle=new JButton();
		Chocolatewaffle.setBounds(80,300,250,35);
		Chocolatewaffle.setBackground(new Color(220,20,60));
		Chocolatewaffle.setText("DEATH BY NUTELLA");
		Chocolatewaffle.setForeground(Color.WHITE);
		Chocolatewaffle.setFont(new Font("Times New Roman",Font.BOLD,18));
		Chocolatewaffle.setFocusable(false);
		this.add(Chocolatewaffle);
		p1 = new JButton("BDT 250 tk");
        p1.setBounds(80, 335, 250, 35);
        p1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		this.add(p1);
		
		
		
		
		
		//
		panel2=new JPanel();
		panel2.setBounds(370,120,300,220);
		panel2.setBackground(new Color(250,249,246));
		this.add(panel2);
		
		ImageIcon w2img=new ImageIcon("w22.jpg");
		w2img.getImage();
		w2img.setImage(w2img.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
		strawberrywaffle=new JLabel(w2img);
		panel2.add(strawberrywaffle);
		Strawberrywaffle=new JButton();
		Strawberrywaffle.setBounds(380,300,300,35);
		Strawberrywaffle.setBackground(new Color(220,20,60));
		Strawberrywaffle.setText("VERY-STRAWBERRY");
		Strawberrywaffle.setForeground(Color.WHITE);
		Strawberrywaffle.setFont(new Font("Times New Roman",Font.BOLD,18));
		Strawberrywaffle.setFocusable(false);
		this.add(Strawberrywaffle);
		p2 = new JButton("BDT 260 tk");
        p2.setBounds(380, 335, 300, 35);
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		this.add(p2);
		
		
		
		
		//
		panel3=new JPanel();
		panel3.setBounds(690,120,300,220);
		panel3.setBackground(new Color(250,249,246));
		this.add(panel3);
		
		ImageIcon w3img=new ImageIcon("w33.JPG");
		w3img.getImage();
		w3img.setImage(w3img.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
		vanillawaffle=new JLabel(w3img);
		panel3.add(vanillawaffle);
		Vanillawaffle=new JButton();
		Vanillawaffle.setBounds(700,300,300,35);
		Vanillawaffle.setBackground(new Color(220,20,60));
		Vanillawaffle.setText("BANANA&NUTELLA");
		Vanillawaffle.setText("BANANA&NUTELLA");
		Vanillawaffle.setForeground(Color.WHITE);
		Vanillawaffle.setFont(new Font("Times New Roman",Font.BOLD,18));
		Vanillawaffle.setFocusable(false);
		this.add(Vanillawaffle);
		p3 = new JButton("BDT 280 tk");
        p3.setBounds(700, 335, 300, 35);
        p3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		this.add(p3);
		
		
		//
		panel4=new JPanel();
		panel4.setBounds(1000,120,300,220);
		panel4.setBackground(new Color(250,249,246));
		this.add(panel4);
		ImageIcon w4img=new ImageIcon("MicrosoftTeams-image (1).png");
		w4img.getImage();
		w4img.setImage(w4img.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
	    label4=new JLabel(w4img);
		panel4.add(label4);
		b4=new JButton();
		b4.setBounds(1020,300,300,35);
		b4.setBackground(new Color(220,20,60));
		b4.setText("RAINBOW WAFFLE");
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("Times New Roman",Font.BOLD,18));
		b4.setFocusable(false);
		this.add(b4);
		p4 = new JButton("BDT 290 tk");
        p4.setBounds(1020, 335, 300, 35);
        p4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		this.add(p4);
		
		//next line
		panel5=new JPanel();
		panel5.setBounds(60,390,300,220);
		panel5.setBackground(new Color(250,249,246));
		this.add(panel5);
		ImageIcon w5img=new ImageIcon("MicrosoftTeams-image (2).png");
		w5img.getImage();
		w5img.setImage(w5img.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
	    label5=new JLabel(w5img);
		panel5.add(label5);
		b5=new JButton();
		b5.setBounds(60,580,300,35);
		b5.setBackground(new Color(220,20,60));
		b5.setText("RED WAFFLE");
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("Times New Roman",Font.BOLD,18));
		b5.setFocusable(false);
		this.add(b5);
		p5 = new JButton("BDT 300 tk");
        p5.setBounds(60, 615, 300, 35);
        p5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		this.add(p5);
		
		//next line
		panel6=new JPanel();
		panel6.setBounds(380,390,300,220);
		panel6.setBackground(new Color(250,249,246));
		this.add(panel6);
		ImageIcon w6img=new ImageIcon("MicrosoftTeams-image (3).png");
		w6img.getImage();
		w6img.setImage(w6img.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
	    label6=new JLabel(w6img);
		panel6.add(label6);
		b6=new JButton();
		b6.setBounds(380,580,300,35);
		b6.setBackground(new Color(220,20,60));
		b6.setText("HONEYCOMB");
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("Times New Roman",Font.BOLD,18));
		b6.setFocusable(false);
		this.add(b6);
		p6 = new JButton("BDT 310 tk");
        p6.setBounds(380, 615, 300, 35);
        p6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		this.add(p6);
		
		panel7=new JPanel();
		panel7.setBounds(700,390,300,220);
		panel7.setBackground(new Color(250,249,246));
		this.add(panel7);
		ImageIcon w7img=new ImageIcon("MicrosoftTeams-image (4).png");
		w7img.getImage();
		w7img.setImage(w7img.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
	    label7=new JLabel(w7img);
		panel7.add(label7);
		b7=new JButton();
		b7.setBounds(700,580,300,35);
		b7.setBackground(new Color(220,20,60));
		b7.setText("CHOCOLATE WAFFLE");
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("Times New Roman",Font.BOLD,18));
		b7.setFocusable(false);
		this.add(b7);
		p7 = new JButton("BDT 320 tk");
        p7.setBounds(700, 615, 300, 35);
        p7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		this.add(p7);
		
		
		
		panel8=new JPanel();
		panel8.setBounds(1020,390,300,220);
		panel8.setBackground(new Color(250,249,246));
		this.add(panel8);
		ImageIcon w8img=new ImageIcon("OIP.jpg");
		w8img.getImage();
		w8img.setImage(w8img.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
	    label8=new JLabel(w8img);
		panel8.add(label8);
		
		
		search=new JLabel();
		search.setText("Bill: ");
		search.setFont(new Font("Times New Roman",Font.ITALIC,24));
		search.setForeground(Color.RED);
		
		search.setBounds(810,-140,400,400);
		this.add(search);
		
		
		srch = new JTextField();
        srch.setEditable(false); 
		srch.setBounds(900,35,370,40);
		srch.setFont(new Font("Times New Roman",Font.ITALIC,24));
		srch.setForeground(Color.black);
		srch.setBackground(new Color(255,255,255));
		this.add(srch);
		
	    ok=new JButton();
		ok.setBounds(1060,80,80,35);
		ok.setBackground(new Color(0,128,0));
		ok.setText("OK");
		ok.setForeground(Color.black);
		ok.setFont(new Font("Times New Roman",Font.BOLD,18));
		ok.setFocusable(false);
		this.add(ok);
		
	    refresh=new JButton();
		refresh.setBounds(900,80,140,35);
		refresh.setBackground(new Color(255,223,0));
		refresh.setText("REFRESH");
		refresh.setForeground(Color.BLACK);
		refresh.setFont(new Font("Times New Roman",Font.BOLD,18));
		refresh.setFocusable(false);
		this.add(refresh);
		
		back=new JButton();
		back.setBounds(1150,80,120,35);
		back.setBackground(new Color(0,0,225));
		back.setText("BACK");
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Times New Roman",Font.BOLD,18));
		back.setFocusable(false);
		this.add(back);
		
	    /*addButton = new JButton("Add Waffle");
        addButton.setBounds(350, 35, 150, 35);
        addButton.setBackground(new Color(0, 128, 0));
        addButton.setForeground(Color.BLACK);
        addButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
        addButton.setFocusable(false);
        //addButton.addActionListener(this);
        this.add(addButton);

        // Add button for deleting a waffle
        deleteButton = new JButton("Delete Waffle");
        deleteButton.setBounds(540, 35, 150, 35);
        deleteButton.setBackground(new Color(255, 0, 0));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
        deleteButton.setFocusable(false);
        //deleteButton.addActionListener(this);
        this.add(deleteButton);*/
		
	    this.setVisible(true);
		 
		 
		Chocolatewaffle.addActionListener(this);
        Strawberrywaffle.addActionListener(this);
        Vanillawaffle.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        p1.addActionListener(this);
        p2.addActionListener(this);
        p3.addActionListener(this);
        p4.addActionListener(this);
        p5.addActionListener(this);
        p6.addActionListener(this);
        p7.addActionListener(this); 
        ok.addActionListener(this);
        refresh.addActionListener(this);
        back.addActionListener(this); 

	}
		
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            new Login().setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == p1) {
            addPriceToTotal("250 tk");
        } else if (e.getSource() == p2) {
            addPriceToTotal("260 tk");
        } else if (e.getSource() == p3) {
            addPriceToTotal("280 tk");
        } else if (e.getSource() == p4) {
            addPriceToTotal("290 tk");
        } else if (e.getSource() == p5) {
            addPriceToTotal("300 tk");
        } else if (e.getSource() == p6) {
            addPriceToTotal("310 tk");
        } else if (e.getSource() == p7) {
            addPriceToTotal("320 tk");
        } else if (e.getSource() == refresh) {
            srch.setText(""); 
        } else if (e.getSource() == ok) {
            if (!srch.getText().isEmpty()) {
                new PaymentCheck(srch.getText()).setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a waffle first.");
            }
        }
    }
	
	private void addPriceToTotal(String price) {
        String currentTotal = srch.getText();
        if (currentTotal.isEmpty()) {
            srch.setText(price); 
        } else {
            int currentPrice = Integer.parseInt(currentTotal.replaceAll("\\D", ""));
            int newPrice = Integer.parseInt(price.replaceAll("\\D", ""));
            int updatedTotal = currentPrice + newPrice;
            srch.setText("BDT " + updatedTotal + " tk");
        }
    }
		
			

	public static void main(String[] args) 
	{
		new Items();
		
		

	}

}
