import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class UserDataFrame extends JFrame implements ActionListener 
{
    private JTable table;
    private JButton addButton, deleteButton, backButton;
    private String[] columnNames = {"Name", "Password", "DOB", "Email", "Mobile", "Address", "Gender"};
    private DefaultTableModel model;

    public UserDataFrame() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("User Data");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        // Create the JTable and set the model
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        // Create a JScrollPane to contain the table
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);

        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        backButton = new JButton("Back");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(backButton);

        this.add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        backButton.addActionListener(this);

        loadUserData(model);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == addButton)
        {
            new AddUserDataFrame(this, model);   
        } 
        else if(e.getSource() == deleteButton)
        {
            deleteUser(); 
        } 
        else if(e.getSource() == backButton)
        {
            new Admin();
            this.setVisible(false); 
        }
    }

    public void loadUserData(DefaultTableModel model) 
    {
        try 
        {
            Scanner scanner = new Scanner(new FileReader("user.txt"));  
            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine();
                String[] fields = line.split(":");
                if (fields.length == 7) 
                {
                    model.addRow(new Object[]{fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6]});
                } 
            }
            scanner.close(); 
        } 
        catch (IOException e) 
        {
            JOptionPane.showMessageDialog(this, "Error Loading User Data"); 
        }
    }

    private void deleteUser() 
    {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) 
        {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow);
            saveData();
        } 
        else 
        { 
            JOptionPane.showMessageDialog(this, "Please select a user to delete.");
        }
    }

    private void saveData()
    {
        try
        {
            FileWriter fileWriter = new FileWriter("user.txt", false); 
            int rowCount = model.getRowCount();

            for (int i = 0; i < rowCount; i++) 
            {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < model.getColumnCount(); j++) 
                {
                    line.append(model.getValueAt(i, j)).append(":");
                }
                line.append("\n");
                fileWriter.write(line.toString()); 
            }
            fileWriter.close(); 
                
        } 
        catch(IOException io)
        {
            JOptionPane.showMessageDialog(this, "Error saving data");
        }
    } 
}
