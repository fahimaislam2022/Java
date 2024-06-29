import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
public class Registration extends JFrame implements ActionListener {
	
	private JTextField nameField,dobField,emailField,addressField,mobileField;
	private JRadioButton maleButton,femaleButton;
	private ButtonGroup genderGroup;
	private JButton registerButton;
	private JPasswordField passField;
	private JLabel imgLabel,imgLabel2,pname,slogan;
	private ImageIcon img,img2;
	JFrame frame2;
	
	public Registration(){
		frame2=new JFrame();
		frame2.setTitle("Registration Form");
		frame2.setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLayout(null);
		
		JLabel nameLabel=new JLabel("User Name:");
		nameLabel.setBounds(40,140,80,20);
		frame2.add(nameLabel);
		nameField=new JTextField();
		nameField.setBounds(140,140,200,20);
		frame2.add(nameField);
		
		JLabel passLabel=new JLabel("Password:");
		passLabel.setBounds(40,170,80,20);
		frame2.add(passLabel);
		passField=new JPasswordField();
		passField.setBounds(140,170,200,20);
		frame2.add(passField);
		
		JLabel dobLabel=new JLabel("Date Of Birth (DD/MM/YYYY):");
		dobLabel.setBounds(40,200,180,20);
		frame2.add(dobLabel);
		dobField=new JTextField();
		dobField.setBounds(240,200,100,20);
		frame2.add(dobField);
		
		JLabel emailLabel=new JLabel("Email:");
		emailLabel.setBounds(40,230,80,20);
		frame2.add(emailLabel);
		emailField=new JTextField();
		emailField.setBounds(140,230,200,20);
		frame2.add(emailField);
		
		JLabel mobileLabel=new JLabel("Mobile Number:");
		mobileLabel.setBounds(40,260,120,20);
		frame2.add(mobileLabel);
		mobileField=new JTextField();
		mobileField.setBounds(140,260,200,20);
		frame2.add(mobileField);
		
		JLabel addressLabel=new JLabel("Address:");
		addressLabel.setBounds(40,290,80,20);
		frame2.add(addressLabel);
		addressField=new JTextField();
		addressField.setBounds(140,290,200,20);
		frame2.add(addressField);
		
		JLabel genderLabel=new JLabel("Gender:");
		genderLabel.setBounds(40,320,80,20);
		frame2.add(genderLabel);
		
		maleButton=new JRadioButton("Male");
		maleButton.setBounds(140,320,80,20);
		frame2.add(maleButton);
		
		femaleButton=new JRadioButton("Female");
		femaleButton.setBounds(240,320,80,20);
		frame2.add(femaleButton);
		
		genderGroup=new ButtonGroup();
		genderGroup.add(maleButton);
		genderGroup.add(femaleButton);
		
		registerButton=new JButton("REGISTER");
		registerButton.setBounds(170,350,100,30);
		frame2.add(registerButton);
		registerButton.addActionListener(this);
		JButton backButton=new JButton("Back");
		backButton.setBounds(370,135,70,30);
		frame2.add(backButton);
		
		frame2.getContentPane().setBackground(Color.PINK);
		img =new ImageIcon(getClass().getResource("final_image.PNG"));
		img2 =new ImageIcon(getClass().getResource("download (2).JPG"));
		imgLabel=new JLabel(img);
		imgLabel2=new JLabel(img2);
		imgLabel.setBounds(630,70,img.getIconWidth(),img.getIconHeight());
		imgLabel2.setBounds(70,410,img2.getIconWidth(),img2.getIconHeight());
		frame2.add(imgLabel);
		frame2.add(imgLabel2);
		
		pname=new JLabel("WAFFLE VERSE");
		pname.setBounds(130,0,500,150);
		pname.setFont(new Font("Bookman", Font.ITALIC, 40));
		frame2.add(pname);
		slogan=new JLabel("Eat Or Regret!!");
		slogan.setBounds(200,75,300,75);
		slogan.setFont(new Font("Bookman", Font.ITALIC, 25));
		frame2.add(slogan);
		
		frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		frame2.setVisible(true);
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed( ActionEvent e){
				if(e.getSource()==backButton){
					new Login();
			     frame2.setVisible(false);
				}
			}
		});
	}
	private boolean checkAllInputs(){
			String name=nameField.getText().trim();
			String pass=new String(passField.getPassword()).trim();
			String dob=dobField.getText().trim();
			String email=emailField.getText().trim();
			String mobile=mobileField.getText().trim(); 
			String address=addressField.getText().trim();
			String gender=maleButton.isSelected() ?"Male":"Female";
			return !name.isEmpty()&& !pass.isEmpty()&& !dob.isEmpty()&& !email.isEmpty()&& !mobile.isEmpty()&& !address.isEmpty()&& !gender.isEmpty();
	}
			
 public void actionPerformed(ActionEvent e) {
    if (e.getSource() == registerButton) {
		
             if (checkAllInputs()) {
            SignUp signUp = new SignUp(
               nameField.getText().trim(),
               new String(passField.getPassword()).trim(),
                dobField.getText().trim(),
                emailField.getText().trim(),
                mobileField.getText().trim(),
                addressField.getText().trim(),
                maleButton.isSelected() ? "Male" : "Female"
            );

            if (signUp.saveData()) {
                JOptionPane.showMessageDialog(this, "Data saved Successfully");
                new Login();
            } else {
                JOptionPane.showMessageDialog(this, "Error While saving data");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fill all Fields");
        }
    }
}


public static void main(String[] args){
		
				new Registration();
		
      }
}