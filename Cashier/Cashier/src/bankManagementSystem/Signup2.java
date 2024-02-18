package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    JButton b1, b2;
    JRadioButton r1, r2, r3, r4;
    JTextField t1, t2, t3;
    JComboBox<String> c1, c2, c3, c4, c5;
    String formno;

    HashMap<String, String> formData;

    Signup2(String formno, HashMap<String, String> formData) {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);

        this.formno = formno;
        this.formData = formData;

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        l1 = new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));

        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));

        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));

        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));

        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));

        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));

        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));

        l7 = new JLabel("PAN Number:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));

        l8 = new JLabel("Aadhar Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));

        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));

        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));

        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));

        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));

        b1 = new JButton("Next");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Back");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox<>(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));

        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox<>(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox<>(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox<>(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));

        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        c5 = new JComboBox<>(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));


        setLayout(null);


        l12.setBounds(700,10,60,30);
        add(l12);

        l13.setBounds(760,10,60,30);
        add(l13);

        l1.setBounds(280,30,600,40);
        add(l1);

        l2.setBounds(100,120,100,30);
        add(l2);

        c1.setBounds(350,120,320,30);
        add(c1);

        l3.setBounds(100,170,100,30);
        add(l3);

        c2.setBounds(350,170,320,30);
        add(c2);

        l4.setBounds(100,220,100,30);
        add(l4);

        c3.setBounds(350,220,320,30);
        add(c3);

        l5.setBounds(100,270,150,30);
        add(l5);

        c4.setBounds(350,270,320,30);
        add(c4);

        l11.setBounds(100,290,150,30);
        add(l11);

        l6.setBounds(100,340,150,30);
        add(l6);

        c5.setBounds(350,340,320,30);
        add(c5);

        l7.setBounds(100,390,150,30);
        add(l7);

        t1.setBounds(350,390,320,30);
        add(t1);

        l8.setBounds(100,440,180,30);
        add(l8);

        t2.setBounds(350,440,320,30);
        add(t2);

        l9.setBounds(100,490,150,30);
        add(l9);

        r1.setBounds(350,490,100,30);
        add(r1);

        r2.setBounds(460,490,100,30);
        add(r2);

        l10.setBounds(100,540,180,30);
        add(l10);

        r3.setBounds(350,540,100,30);
        add(r3);

        r4.setBounds(460,540,100,30);
        add(r4);

        b1.setBounds(570,640,100,30);
        add(b1);

        b2.setBounds(400,640,100,30);
        add(b2);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Next button action
                String religion = (String) c1.getSelectedItem();
                String category = (String) c2.getSelectedItem();
                String income = (String) c3.getSelectedItem();
                String education = (String) c4.getSelectedItem();
                String occupation = (String) c5.getSelectedItem();

                String pan = t1.getText();
                String aadhar = t2.getText();

                String scitizen = r1.isSelected() ? "Yes" : "No";
                String eaccount = r3.isSelected() ? "Yes" : "No";

                try {
                    if (validateAadhar(aadhar) && validatePAN(pan)) { // Check Aadhar and PAN validation
                        Conn c1 = new Conn();
                        String q1 = "insert into signup2 values('" + formData.get("formno") + "','" + religion + "','" + category + "','" + income + "','" + education + "','" + occupation + "','" + t1.getText() + "','" + t2.getText() + "','" + scitizen + "','" + eaccount + "')";
                        c1.s.executeUpdate(q1);

                        new Signup3(formData.get("formno")).setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Aadhar or PAN number");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Back button action
                new Signup().setVisible(true);
                setVisible(false);
            }
        });

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 750);
        setLocation(500, 120);
        setVisible(true);
    }

    // Method to validate Aadhar card number
    public boolean validateAadhar(String aadhar) {
        // Aadhar number must be 12 digits long and contain only digits
        if (aadhar.matches("\\d{12}")) {
            return true;
        } else {
            return false;
        }
    }

    // Method to validate PAN card number
    public boolean validatePAN(String pan) {
        // PAN number must be in the format ABCDE1234F where ABCDE can be any 5 characters, 1234 is any 4 digits, and F is any character
        if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String yourFormNo = "123";
        HashMap<String, String> formData = new HashMap<>();
        new Signup2(yourFormNo, formData).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
