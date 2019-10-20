package product_store;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class DeleteProduct_store implements ActionListener{
JFrame frame, frame1;
JTextField textbox;
JLabel label;
JButton button;
JPanel panel;
static JTable table;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/new";
String userName = "root";
String password = "";
String[] columnNames = {"batch", "size", "deprecition"};

public void createUI()
{
frame = new JFrame("Database Search Result");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
textbox = new JTextField();
textbox.setBounds(120,30,150,20); 
label = new JLabel("Enter batch no");
label.setBounds(10, 30, 100, 20);
button = new JButton("Delete");
button.setBounds(120,130,150,20);
button.addActionListener(this);

frame.add(textbox);
frame.add(label);
frame.add(button);
frame.setVisible(true);
frame.setSize(500, 400); 
} 

public void actionPerformed(ActionEvent ae)
{
button = (JButton)ae.getSource();
System.out.println("Showing deprecition rate");
showTableData(); 
} 

public void showTableData()
{

frame1 = new JFrame("Database Search Result");
frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame1.setLayout(new BorderLayout()); 
//TableModel tm = new TableModel();
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
//table = new JTable(model);
table = new JTable();
table.setModel(model); 
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
String textvalue = textbox.getText();

try
{ 
Class.forName(driverName); 
Connection con = DriverManager.getConnection(url, userName, password);
String sql = "DELETE FROM `deprecition` WHERE  `batch`="+textvalue;

PreparedStatement ps = con.prepareStatement(sql);
ps.execute();
ps.close();
System.out.println("Successfully Data Insert");
textbox.setText("");
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
}

public static void main(String args[])
{
DeleteProduct_store sr = new DeleteProduct_store();
sr.createUI(); 
}
}