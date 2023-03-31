import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.util.ArrayList;

class ExcelWriter extends JFrame implements ActionListener {
    private final JTextField nameField;
    private final JTextField emailField;
    private final JTextField phoneField;
    private final JButton saveButton;
    private final ArrayList<String> nameList;
    private final ArrayList<String> emailList;
    private final ArrayList<String> phoneList;

    public ExcelWriter() {
        nameList = new ArrayList<>();
        emailList = new ArrayList<>();
        phoneList = new ArrayList<>();

        // create GUI components
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel phoneLabel = new JLabel("Phone:");

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);

        saveButton = new JButton("Save");
        saveButton.addActionListener(this);

        // set font size and style for all components
        Font font = new Font("Segoe UI", Font.PLAIN, 20);
        nameLabel.setFont(font);
        emailLabel.setFont(font);
        phoneLabel.setFont(font);
        nameField.setFont(font);
        emailField.setFont(font);
        phoneField.setFont(font);
        saveButton.setFont(font);

        // create panel for text fields and labels
        JPanel inputPanel = new JPanel();
//        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        inputPanel.add(phoneLabel);
        inputPanel.add(phoneField);

        // create panel for the save button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);

        // add panels to the frame
        this.setLayout(new BorderLayout());
        this.add(inputPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // set frame properties
        this.setTitle("Excel Writer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            // add data to lists
            nameList.add(nameField.getText());
            emailList.add(emailField.getText());
            phoneList.add(phoneField.getText());

            // clear text fields
            nameField.setText("");
            emailField.setText("");
            phoneField.setText("");

            // write data to Excel file
            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Data");

                for (int i = 0; i < nameList.size(); i++) {
                    HSSFRow row = sheet.createRow(i);
                    HSSFCell cell1 = row.createCell(0);
                    cell1.setCellValue(nameList.get(i));
                    HSSFCell cell2 = row.createCell(1);
                    cell2.setCellValue(emailList.get(i));
                    HSSFCell cell3 = row.createCell(2);
                    cell3.setCellValue(phoneList.get(i));
                }

                FileOutputStream fileOut = new FileOutputStream("data.xls");
                workbook.write(fileOut);
                fileOut.close();
                JOptionPane.showMessageDialog(this, "Data saved to Excel file.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error writing to Excel file.");
            }
        }
    }

}

public class Main{
    public static void main(String[] args) {
        new ExcelWriter();
    }
}