package deprecition;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;
import java.util.Vector;
import java.awt.event.*;

public class ShowDeprecition implements ActionListener{
	Vector columnNames = new Vector();
    Vector data = new Vector();  
JFrame frame, frame1;
JButton button;
JPanel panel;
static JTable table;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/new";
String userName = "root";
String password = "";
String[] columnNames = {"batch", "size", "shot"};

/**
 * @wbp.parser.entryPoint
 */
public void createUI()
{
frame = new JFrame("Database Search Result");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
button = new JButton("show Shots");
button.setBounds(63,28,150,20);
button.addActionListener(this);
frame.getContentPane().add(button);
frame.setVisible(true);
frame.setSize(500, 400); 
} 

public void actionPerformed(ActionEvent ae)
{
button = (JButton)ae.getSource();

System.out.println("Showing Table Data.......");
showTableData(); 
} 

public void showTableData()
{

frame1 = new JFrame("Database Search Result");
frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame1.getContentPane().setLayout(new BorderLayout()); 
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
String batch= "";
String size= "";
String shot = "";
try
{ 
Class.forName(driverName); 
Connection con = DriverManager.getConnection(url, userName, password);
String sql = "select * from shot ";

Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery( sql );
ResultSetMetaData md = rs.getMetaData();
int columns = md.getColumnCount();


int i =0;
if(rs.next())
{for (i=0;i<=rs.getFetchSize();i++) {
	i++;
	batch = rs.getString("batch");
	size = rs.getString("size");
	shot = rs.getString("shot");
	model.addRow(new Object[]{batch, size, shot});
}
	i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame1.getContentPane().add(scroll);
frame1.setVisible(true);
frame1.setSize(400,300);
}

public static void main(String args[])
{
	ShowDeprecition sr = new ShowDeprecition();
sr.createUI(); 
}
}