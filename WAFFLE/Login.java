import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
public class Login extends JFrame implements ActionListener{
	private JButton lgnbtn,signbtn,adlgnbtn;
	private JLabel usn,pass,pname;
	private JTextField uname;
	private JPasswordField upass;
	private JLabel imgLabel,imgLabel2;
	private ImageIcon img,img2;
	JFrame frame;
	
	User u1,u2,u3;
	User users[];
	
	Login(){
		
		
		u1=new User("Mazid","1234");
		u2=new User("Hasib","4321");
		u3=new User("Shahadat","1324");
		/*u4=new User("Sadek","2134");
		u5=new User("Fahima","2341");
		u6=new User("Nayeem","3421");*/
		users =new User[5];
		users[0]=u1;
		users[1]=u2;
		users[2]=u3;
		/*users[3]=u4;
		users[4]=u5;
		users[5]=u6;*/
		
		frame=new JFrame("Waffle Verse");
		
		//contructing components
		lgnbtn=new JButton("LOGIN");
		signbtn=new JButton("SIGN UP");
		adlgnbtn=new JButton("LOGIN AS ADMIN");
		pname=new JLabel("WAFFLE VERSE");
		pname.setBounds(130,0,500,150);
		pname.setFont(new Font("Bookman", Font.ITALIC, 40));
		
		usn=new JLabel("USER NAME");
		usn.setForeground(Color.white);
		
		pass=new JLabel("PASSWORD");
		pass.setForeground(Color.white);
		uname=new JTextField();
		upass=new JPasswordField();
		
		lgnbtn.setBounds(150,185,100,30);
		signbtn.setBounds(305,185,100,30);
		adlgnbtn.setBounds(205,235,140,30);
		usn.setBounds(150,105,100,25);
		pass.setBounds(150,145,100,25);
		uname.setBounds(305,105,100,25);
		upass.setBounds(305,145,100,25);
		
		
		lgnbtn.addActionListener(this);
		signbtn.addActionListener(this);
		adlgnbtn.addActionListener(this);
		
		frame.add(lgnbtn);
		frame.add(signbtn);
		frame.add(adlgnbtn);
		frame.add(usn);
		frame.add(pass);
		frame.add(uname);
		frame.add(upass);
		frame.add(pname);
		
		
		
		//frame.setSize(700,450);
		//frame.setLocationRealativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane();
		frame.setVisible(true);
		//frame.setBounds(300,100,500,500);
		frame.getContentPane().setBackground(Color.PINK);
		img =new ImageIcon(getClass().getResource("final_image.PNG"));
		img2 =new ImageIcon(getClass().getResource("download (2).JPG"));
		imgLabel=new JLabel(img);
		imgLabel2=new JLabel(img2);
		imgLabel.setBounds(630,70,img.getIconWidth(),img.getIconHeight());
		imgLabel2.setBounds(140,290,img2.getIconWidth(),img2.getIconHeight());
		frame.add(imgLabel);
		frame.add(imgLabel2);
		
		frame.add(pname);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==lgnbtn){
			login();
		}
		else if(e.getSource()==signbtn){
			new Registration();
			frame.setVisible(false);
		}
		else if(e.getSource()==adlgnbtn){
			String user=uname.getText();
			String password=upass.getText();
			
			int flag=0;
			for(int i=0;i<2;i++){
				if(user.equals(users[i].getUsername())&& password.equals(users[i].getPassword())){
					flag=1;
					break;
				}
			}
			if (flag==1){
				new Admin();
				frame.setVisible(false);
			}
			else{
				showMessageDialog(null,"Invalid info(username or password)!!");
			}
	}
	
	}
	private void login(){
		String name=uname.getText();
		String pass=new String(upass.getPassword());
		
		try{
			Scanner scanner =new Scanner(new File("C:\\Users\\shaha\\OneDrive\\Desktop\\grp-1 Final Project\\user.txt"));
			while(scanner.hasNextLine()){
				String line=scanner.nextLine();
				String[] fields=line.split(":");
				if(fields.length==7){
					String cname=fields[0].trim();
					String cpass=fields[1].trim();
					String cdob=fields[2].trim();
					String cemail=fields[3].trim();
					String cmobile=fields[4].trim();
					String caddress=fields[5].trim();
					String cgender=fields[6].trim();
					if( name.equals(cname)&& pass.equals(cpass)){
						new Items();
						return;
					}
					
				}
			}
			JOptionPane.showMessageDialog(this,"Invalid, Try again");
		}catch(IOException io){
			JOptionPane.showMessageDialog(this,"Error while reading data");
		}
		
	}
	
		
		public static void main(String[] args){
			new Login();
		}
	}
	
