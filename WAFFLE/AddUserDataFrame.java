import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class AddUserDataFrame extends JFrame {
    private JTextField nameField, passField, dobField, emailField, mobileField, addressField;
    private JRadioButton maleButton, femaleButton;
    private JButton addButton, cancelButton;
    private DefaultTableModel tableModel;

    public AddUserDataFrame(UserDataFrame userDataFrame, DefaultTableModel tableModel) {
        this.setTitle("Add User Data");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.tableModel = tableModel;

        // Components
        JLabel nameLabel = new JLabel("Name:");
        JLabel passLabel = new JLabel("Password:");
        JLabel dobLabel = new JLabel("DOB:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel mobileLabel = new JLabel("Mobile:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel genderLabel = new JLabel("Gender:");

        nameField = new JTextField();
        passField = new JTextField();
        dobField = new JTextField();
        emailField = new JTextField();
        mobileField = new JTextField();
        addressField = new JTextField();

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");

        // Set component bounds
        nameLabel.setBounds(20, 20, 80, 20);
        passLabel.setBounds(20, 50, 80, 20);
        dobLabel.setBounds(20, 80, 80, 20);
        emailLabel.setBounds(20, 110, 80, 20);
        mobileLabel.setBounds(20, 140, 80, 20);
        addressLabel.setBounds(20, 170, 80, 20);
        genderLabel.setBounds(20, 200, 80, 20);

        nameField.setBounds(100, 20, 200, 20);
        passField.setBounds(100, 50, 200, 20);
        dobField.setBounds(100, 80, 200, 20);
        emailField.setBounds(100, 110, 200, 20);
        mobileField.setBounds(100, 140, 200, 20);
        addressField.setBounds(100, 170, 200, 20);
        maleButton.setBounds(100, 200, 80, 20);
        femaleButton.setBounds(180, 200, 80, 20);
        addButton.setBounds(100, 230, 80, 20);
        cancelButton.setBounds(200, 230, 100, 20);

        // Event Handlers
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                addUserData();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose(); // Close the frame
            }
        });

        // Add components to the frame
        this.add(nameLabel);
        this.add(passLabel);
        this.add(dobLabel);
        this.add(emailLabel);
        this.add(mobileLabel);
        this.add(addressLabel);
        this.add(genderLabel);
        this.add(nameField);
        this.add(passField);
        this.add(dobField);
        this.add(emailField);
        this.add(mobileField);
        this.add(addressField);
        this.add(maleButton);
        this.add(femaleButton);
        this.add(addButton);
        this.add(cancelButton);

        this.setLayout(null); // Use null layout

        this.setVisible(true);
    }

    private void addUserData() {
        String name = nameField.getText();
        String pass = passField.getText();
        String dob = dobField.getText();
        String email = emailField.getText();
        String mobile = mobileField.getText();
        String address = addressField.getText();
        String gender = maleButton.isSelected() ? "Male" : "Female";

        // Add data to the table model
        String[] userData = {name, pass, dob, email, mobile, address, gender};
        tableModel.addRow(userData);

        // Save the new data to file
        saveData();

        // Clear input fields
        nameField.setText("");
        passField.setText("");
        dobField.setText("");
        emailField.setText("");
        mobileField.setText("");
        addressField.setText("");
        maleButton.setSelected(false);
        femaleButton.setSelected(false);
        dispose();
    }

    private void saveData() {
        try {
            FileWriter fileWriter = new FileWriter("user.txt", true); // Append mode
            StringBuilder line = new StringBuilder();
            line.append(nameField.getText()).append(":")
                    .append(passField.getText()).append(":")
                    .append(dobField.getText()).append(":")
                    .append(emailField.getText()).append(":")
                    .append(mobileField.getText()).append(":")
                    .append(addressField.getText()).append(":")
                    .append(maleButton.isSelected() ? "Male" : "Female")
                    .append(System.lineSeparator());

            fileWriter.write(line.toString());
            fileWriter.close();

            JOptionPane.showMessageDialog(this, "Data saved successfully");
        } catch (IOException io) {
            JOptionPane.showMessageDialog(this, "Error saving data");
        }
    }

    public static void main(String[] args) {
    }
}
