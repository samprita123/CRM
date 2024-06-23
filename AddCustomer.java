package customer.relationship.management;

import java.awt.*;
import javax.swing.*;
/*import com.toedter.calendar.JDateChooser;*/
import java.util.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation, dcdob;
    /*JDateChooser dcdate;*/
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddCustomer() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Customer Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        JLabel labelname = new JLabel("First_Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labelfname = new JLabel("last_Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel labelaadhar = new JLabel("Aadhar_Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel labeldob = new JLabel("dl_ID");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
        dcdob = new JTextField();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);
        
        JLabel labelsalary = new JLabel("Residential_ID");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
        
        
        JLabel labeleducation = new JLabel("brands");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        String courses[] = {"SELECT>>","FORD", "TATA", "TOYOTA", "AUDI", "BMW", "HONDA", "HYUNDAI", "KIA", "MAHINDRA", "JEEP", "SKODA", "JAGUAR", "MERCEDES", "FERRARI", "MARUTI CIAZ", "MARUTI SUZUKI"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
        JLabel labeldesignation = new JLabel("price");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);
        
        JLabel labelempId = new JLabel("serial_no");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);
        
        /*JLabel labeldate = new JLabel("date");
        labeldate.setBounds(50, 450, 150, 30);
        labeldate.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldate);
        
        JDateChooser dcdate = new JDateChooser();
        dcdate.setBounds(200, 450, 150, 30);
        add(dcdate);*/
        
        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String fname = tfname.getText();
            String lname = tffname.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String adhar_no = tfaadhar.getText();
            String dl_ID =  dcdob.getText();
            String Residential_ID = tfsalary.getText();
            String brand = (String) cbeducation.getSelectedItem();
            String price = tfdesignation.getText();
            String serial_no = lblempId.getText();
            /*String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();*/
            
            try {
                Conn conn = new Conn();
                String query = "insert into customerr values('"+fname+"', '"+lname+"','"+address+"', '"+phone+"', '"+email+"','"+adhar_no+"', '"+dl_ID+"', '"+Residential_ID+"', '"+brand+"', '"+price+"', '"+serial_no+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new AddCustomer();
    }
}