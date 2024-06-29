import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame {

    private Container mainContainer;
    private ImageIcon frameIcon, headerIcon;
    private JLabel headerLabel, logoLabel;
    private Font titleFont, buttonFont;
    private JButton userDataButton, backButton, exitButton, passwordButton, hiddenButton;
    private Cursor handCursor;

    Admin() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Admin");
        this.setSize(650, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        mainContainer = this.getContentPane();
        mainContainer.setLayout(null);
        mainContainer.setBackground(Color.PINK);

        // Icon
        frameIcon = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(frameIcon.getImage());

        // Logo
        headerIcon = new ImageIcon(getClass().getResource("icon.png"));
        logoLabel = new JLabel(headerIcon);
        logoLabel.setBounds(127, 20, headerIcon.getIconWidth(), headerIcon.getIconHeight());
        mainContainer.add(logoLabel);

        // Fonts
        titleFont = new Font("Bookman", Font.BOLD, 60);
        buttonFont = new Font("Bookman", Font.PLAIN, 30);

        // Title
        headerLabel = new JLabel("ADMIN");
        headerLabel.setBounds(230, 415, 433, 50);
        headerLabel.setFont(titleFont);
        mainContainer.add(headerLabel);

        // Cursor for Buttons
        handCursor = new Cursor(Cursor.HAND_CURSOR);

        // Buttons
        userDataButton = new JButton("User Data");
        userDataButton.setBounds(64, 510, 207, 50);
        userDataButton.setFont(buttonFont);
        userDataButton.setCursor(handCursor);
        userDataButton.setForeground(Color.BLACK);
        userDataButton.setBackground(Color.WHITE);
        mainContainer.add(userDataButton);

        backButton = new JButton("Back");
        backButton.setBounds(299, 581, 270, 50);
        backButton.setFont(buttonFont);
        backButton.setCursor(handCursor);
        backButton.setForeground(Color.BLACK);
        backButton.setBackground(Color.WHITE);
        mainContainer.add(backButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(64, 581, 207, 50);
        exitButton.setFont(buttonFont);
        exitButton.setCursor(handCursor);
        exitButton.setForeground(Color.BLACK);
        exitButton.setBackground(Color.WHITE);
        mainContainer.add(exitButton);

        passwordButton = new JButton("Update");
        passwordButton.setBounds(299, 510, 270, 50);
        passwordButton.setFont(buttonFont);
        passwordButton.setCursor(handCursor);
        passwordButton.setForeground(Color.BLACK);
        passwordButton.setBackground(Color.WHITE);
        mainContainer.add(passwordButton);

        hiddenButton = new JButton("");
        hiddenButton.setBounds(0, 0, 0, 0);
        mainContainer.add(hiddenButton);
		
		setVisible(true);
		userDataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new UserDataFrame().setVisible(true); 
				setVisible(false);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				new Login();
                setVisible(false);
            }
        });

        passwordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Handle admin password action
				new Items();
				setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
       
	     
		  new Admin();
    }
}
