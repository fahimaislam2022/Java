import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PaymentCheck extends JFrame implements ActionListener {

    JButton cashButton, cardButton, backButton;
    JLabel priceLabel;

    PaymentCheck(String totalPrice) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100, 100, 400, 250);
        this.setTitle("Payment Options");
        this.getContentPane().setBackground(new Color(250, 249, 246));
        this.setLocationRelativeTo(null);

        JLabel promptLabel = new JLabel("How do you want to make the payment?");
        promptLabel.setBounds(40, 20, 300, 30);
        promptLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(promptLabel);

        priceLabel = new JLabel("Total Price: " + totalPrice);
        priceLabel.setBounds(40, 50, 300, 30);
        priceLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(priceLabel);

        cashButton = new JButton("Cash");
        cashButton.setBounds(50, 90, 100, 30);
        cashButton.setBackground(new Color(220, 20, 60));
        cashButton.setForeground(Color.WHITE);
        cashButton.setFont(new Font("Arial", Font.BOLD, 14));
        cashButton.setFocusable(false);
        cashButton.addActionListener(this);
        this.add(cashButton);

        cardButton = new JButton("Card");
        cardButton.setBounds(200, 90, 100, 30);
        cardButton.setBackground(new Color(0, 128, 255));
        cardButton.setForeground(Color.WHITE);
        cardButton.setFont(new Font("Arial", Font.BOLD, 14));
        cardButton.setFocusable(false);
        cardButton.addActionListener(this);
        this.add(cardButton);

        backButton = new JButton("Back");
        backButton.setBounds(130, 140, 100, 30);
        backButton.setBackground(new Color(0, 0, 225));
        backButton.setForeground(Color.WHITE);
        backButton.setFont(new Font("Arial", Font.BOLD, 14));
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        this.add(backButton);

        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cashButton) {
            new PaySuccess().setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == cardButton) {
            new Payment().setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == backButton) {
            new Items().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new PaymentCheck("BDT 300 tk");
    }
}
