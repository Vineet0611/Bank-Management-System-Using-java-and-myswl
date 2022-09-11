/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PinDesign extends JPanel implements ActionListener {
    JFrame f;
    JPanel p;
    JLabel l1,l2,l3;
    JButton b1,b2;
    Font f1,f2,f3;
    JPasswordField tx1,tx2,tx3;
    PinDesign(){
        f=new JFrame("CHANGE PIN");
        p=new JPanel();
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        f1=new Font("Times New Roman",Font.BOLD,25);
        f2=new Font("Times New Roman",Font.BOLD,18);
        f3=new Font("Times New Roman",Font.BOLD,20);

        l1=new JLabel("CHANGE  PIN");
        l1.setBounds(240,170,450,30);
        l1.setFont(f1);
        l1.setForeground(new Color(106, 61, 49));
        p.add(l1);

        l2=new JLabel("Current Pin:");
        l2.setBounds(80,250,130,30);
        l2.setFont(f3);
        l2.setForeground(new Color(106, 61, 49));
        p.add(l2);

        tx1=new JPasswordField();
        tx1.setFont(f3);
        tx1.setBounds(210,250,250,25);
        tx1.setForeground(new Color(106, 61, 49));
        p.add(tx1);

        l2=new JLabel("New-Pin:");
        l2.setBounds(80,300,130,30);
        l2.setFont(f3);
        l2.setForeground(new Color(106, 61, 49));
        p.add(l2);

        tx2=new JPasswordField();
        tx2.setFont(f3);
        tx2.setBounds(210,300,250,25);
        tx2.setForeground(new Color(106, 61, 49));
        p.add(tx2);

        l3=new JLabel("Re-enter Pin:");
        l3.setBounds(80,350,130,30);
        l3.setFont(f3);
        l3.setForeground(new Color(106, 61, 49));
        p.add(l3);

        tx3=new JPasswordField();
        tx3.setFont(f3);
        tx3.setBounds(210,350,250,25);
        tx3.setForeground(new Color(106, 61, 49));
        p.add(tx3);

        b1=new JButton("SUBMIT");
        b1.setBackground(new Color(106,61,49));
        b1.setForeground(Color.WHITE);
        b1.setBounds(170,410,150,30);
        p.add(b1);

        b2=new JButton("BACK");
        b2.setBackground(new Color(106,61,49));
        b2.setForeground(Color.WHITE);
        b2.setBounds(350,410,150,30);
        p.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);


        f.add(p);
        f.setSize(650,700);
        f.setVisible(true);
        f.setLayout(null);
        f.setLocation(380,20);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        try {
            String a=tx1.getText();
            String b=tx2.getText();
            String c=tx3.getText();
            if(ae.getSource()==b1){
                if(tx1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the current pin");
                }
                if(tx2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the new pin");
                }
                if(tx3.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please  Re-enter new  pin");
                }
                if(tx2.getText().equals(tx3.getText())){
                    conn c1=new conn();
                    String q1="update bank set pin='"+b+"'where pin='"+a+"'";
                    String q2="update login set pin='"+b+"'where pin='"+a+"'";
                    String q3="update signup set pin='"+b+"'where pin='"+a+"'";

                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null,"pin changed successfully");
                    new TransactionDesign().setVisible(true);
                    f.setVisible(false);


                }
                else{
                    JOptionPane.showMessageDialog(null,"pin enter did not match");
                }
            }else if(ae.getSource()==b2){
                new TransactionDesign().setVisible(true);
                f.setVisible(false);
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error:" + e);
        }
    }
}
public class Pin {
    public static void main(String[] args) {
        new PinDesign();
    }
}
