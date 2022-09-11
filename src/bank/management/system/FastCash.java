/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class FastCashDesign extends JPanel implements ActionListener {
    JPanel p;
    JFrame f;
    JLabel l,l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Font f1,f2;
    JPasswordField tx1;
    FastCashDesign(){
        f=new JFrame("Fast CASH");
        p=new JPanel();
        p.setLayout(null);
        f1=new Font("Times New Roman",Font.BOLD,27);
        f2=new Font("Times New Roman",Font.BOLD,20);
        p.setBackground(Color.WHITE);

        l1=new JLabel("PIN No.");
        l1.setBounds(483,5,100,20);
        l1.setForeground(new Color(106, 61, 49));
        l1.setFont(f2);
        p.add(l1);

        l=new JLabel("SELECT  WITHDRAWL  AMOUNT");
        l.setBounds(100,50,500,40);
        l.setForeground(new Color(106, 61, 49));
        l.setFont(f1);
        p.add(l);

        tx1=new JPasswordField(4);
        tx1.setBounds(562,5,70,20);
        tx1.setForeground(new Color(106, 61, 49));
        tx1.setFont(f2);
        p.add(tx1);

        b1=new JButton("₹ 100");
        b1.setBackground(new Color(106,61,49));
        b1.setForeground(Color.WHITE);
        b1.setFont(f2);
        b1.setFocusable(false);
        b1.setBounds(80,150,200,35);
        p.add(b1);

        b2=new JButton("₹ 500");
        b2.setBackground(new Color(106,61,49));
        b2.setForeground(Color.WHITE);
        b2.setFont(f2);
        b2.setFocusable(false);
        b2.setBounds(350,150,200,35);
        p.add(b2);

        b3=new JButton("₹ 1000");
        b3.setBackground(new Color(106,61,49));
        b3.setForeground(Color.WHITE);
        b3.setFont(f2);
        b3.setFocusable(false);
        b3.setBounds(80,230,200,35);
        p.add(b3);

        b4=new JButton("₹ 2000");
        b4.setBackground(new Color(106,61,49));
        b4.setForeground(Color.WHITE);
        b4.setFont(f2);
        b4.setFocusable(false);
        b4.setBounds(350,230,200,35);
        p.add(b4);

        b5=new JButton("₹ 5000");
        b5.setBackground(new Color(106,61,49));
        b5.setForeground(Color.WHITE);
        b5.setFont(f2);
        b5.setFocusable(false);
        b5.setBounds(80,310,200,35);
        p.add(b5);

        b6=new JButton("₹ 10,000");
        b6.setBackground(new Color(106,61,49));
        b6.setForeground(Color.WHITE);
        b6.setFont(f2);
        b6.setFocusable(false);
        b6.setBounds(350,310,200,35);
        p.add(b6);

        b7=new JButton("Exit");
        b7.setBackground(new Color(106,61,49));
        b7.setForeground(Color.WHITE);
        b7.setFont(f2);
        b7.setFocusable(false);
        b7.setBounds(210,390,200,35);
        p.add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        f.add(p);
        f.setSize(650,570);
        f.setVisible(true);
        f.setLocation(380,70);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public void actionPerformed(ActionEvent ae){
        try{
            String a= tx1.getText();
            double balance=0;

            if(ae.getSource()==b1){

                conn c1=new conn();
                ResultSet rs=c1.s.executeQuery("select * from bank where pin='"+a+"'");
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance = balance - 100;
                    String q1 = "insert into bank values ('" + pin + "','" + null + "',100,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }
                JOptionPane.showMessageDialog(null,"₹ 100 debited successfully");
                new TransactionDesign().setVisible(true);
                f.setVisible(false);
            }
            else if(ae.getSource()==b2){
                conn c1=new conn();
                ResultSet rs=c1.s.executeQuery("select * from bank where pin='"+a+"'");
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance = balance - 500;
                    String q1 = "insert into bank values ('" + pin + "','" + null + "',500,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }
                JOptionPane.showMessageDialog(null,"₹ 500 debited successfully");
                new TransactionDesign().setVisible(true);
                f.setVisible(false);
            }
            else if(ae.getSource()==b3){
                conn c1=new conn();
                ResultSet rs=c1.s.executeQuery("select * from bank where pin='"+a+"'");
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance = balance - 1000;
                    String q1 = "insert into bank values ('" + pin + "','" + null + "',1000,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }
                JOptionPane.showMessageDialog(null,"₹ 1000 debited successfully");
                new TransactionDesign().setVisible(true);
                f.setVisible(false);
            }
            else if(ae.getSource()==b4){
                conn c1=new conn();
                ResultSet rs=c1.s.executeQuery("select * from bank where pin='"+a+"'");
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance = balance - 2000;
                    String q1 = "insert into bank values ('" + pin + "','" + null + "',2000,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }
                JOptionPane.showMessageDialog(null,"₹ 2000 debited successfully");
                new TransactionDesign().setVisible(true);
                f.setVisible(false);
            }
            else if(ae.getSource()==b5){
                conn c1=new conn();
                ResultSet rs=c1.s.executeQuery("select * from bank where pin='"+a+"'");
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance = balance - 5000;
                    String q1 = "insert into bank values ('" + pin + "','" + null + "',5000,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }
                JOptionPane.showMessageDialog(null,"₹ 5000 debited successfully");
                new TransactionDesign().setVisible(true);
                f.setVisible(false);
            }
            else if(ae.getSource()==b6){
                conn c1=new conn();
                ResultSet rs=c1.s.executeQuery("select * from bank where pin='"+a+"'");
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance = balance - 10000;
                    String q1 = "insert into bank values ('" + pin + "','" + null + "',10000,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }
                JOptionPane.showMessageDialog(null,"₹ 10000 debited successfully");
                new TransactionDesign().setVisible(true);
                f.setVisible(false);
            }
            else{
                System.exit(0);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Error:"+e);
        }

    }
}
public class FastCash {
    public static void main(String[] args) {
            new FastCashDesign();

    }
}

