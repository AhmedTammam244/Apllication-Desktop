package sales;
import javax.swing.*;

import model.Deprecition;
import java.sql.*;
import java.awt.event.*;

public class InsertSales implements ActionListener{
JFrame frame, frame1;

 JTextField deprecition;
 JTextField batch;
JLabel label;
JButton button;
JPanel panel;
static JTable table;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/new";
String userName = "root";
String password = "";
String[] columnNames = {"batch", "size", "deprecition"};
 JTextField size;

/**
 * @wbp.parser.entryPoint
 */
public void createUI(){
frame = new JFrame("Database Search Result");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);


label = new JLabel("Enter batch");
label.setBounds(10, 11, 100, 20);
batch = new JTextField();
batch.setBounds(130,11,150,20); 
frame.getContentPane().add(batch);

frame.getContentPane().add(label);
label = new JLabel("Enter size");
label.setBounds(10, 50, 100, 20);
deprecition = new JTextField();

deprecition.setBounds(118,98,150,20); 
frame.getContentPane().add(deprecition);

frame.getContentPane().add(label);
label = new JLabel("Enter deprecition");
label.setBounds(10, 98, 100, 20);
frame.getContentPane().add(deprecition);
frame.getContentPane().add(label);
button = new JButton("deprecition rate");
button.setBounds(148,226,150,20);
button.addActionListener(this);

frame.getContentPane().add(button);
size = new JTextField();
size.setBounds(118, 50, 150, 20);
frame.getContentPane().add(size);
frame.setVisible(true);
frame.setSize(500, 400); 
} 
Double sizee ,deprecitionn ;
String batchh;
public void actionPerformed(ActionEvent ae){
button = (JButton)ae.getSource();

 batchh = batch.getText();

 sizee = Double.parseDouble(size.getText());

 deprecitionn = Double.parseDouble(deprecition.getText());
 
System.out.println(sizee);
System.out.println(batchh);
System.out.println(deprecitionn);
System.out.println("Showing Table Data.......");

insertData(); 
  batch.setText("");
  size.setText("");
  deprecition.setText("");


//TODO add your handling code here:
 Deprecition sh=new Deprecition();
sh.setBatch(batchh);
sh.setDeprecition(deprecitionn);
sh.setSize(sizee);
} 

public void insertData(){
try {
Class.forName(driverName); 
Connection con = DriverManager.getConnection(url, userName, password);
String sql = "INSERT INTO `deprecition`(`batch`, `size`, `deprecition`) VALUES ("+batchh +","+sizee+
		 ","+deprecitionn+")";
System.out.println(size);
PreparedStatement ps = con.prepareStatement(sql);
ps.execute();


ps.close();
System.out.println("Successfully Data Insert");
}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
}

public static void main(String args[]){
	InsertSales sr = new InsertSales();
sr.createUI(); 
}
}