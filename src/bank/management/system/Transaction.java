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

class TransactionDesign extends JPanel implements ActionListener {
    JPanel p;
    JFrame f;
    JLabel l;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Font f1,f2;
    TransactionDesign(){
        f=new JFrame("Transaction");
        p=new JPanel();
        p.setLayout(null);
        f1=new Font("Times New Roman",Font.BOLD,27);
        f2=new Font("Times New Roman",Font.BOLD,20);
        p.setBackground(Color.WHITE);

        l=new JLabel("Please Select Your Transaction");
        l.setBounds(130,50,500,40);
        l.setForeground(new Color(106, 61, 49));
        l.setFont(f1);
        p.add(l);

        b1=new JButton("Deposit");
        b1.setBackground(new Color(106,61,49));
        b1.setForeground(Color.WHITE);
        b1.setFont(f2);
        b1.setFocusable(false);
        b1.setBounds(80,150,200,35);
        p.add(b1);

        b2=new JButton("Cash Withdrawl");
        b2.setBackground(new Color(106,61,49));
        b2.setForeground(Color.WHITE);
        b2.setFont(f2);
        b2.setFocusable(false);
        b2.setBounds(350,150,200,35);
        p.add(b2);

        b3=new JButton("Fast Cash");
        b3.setBackground(new Color(106,61,49));
        b3.setForeground(Color.WHITE);
        b3.setFont(f2);
        b3.setFocusable(false);
        b3.setBounds(80,230,200,35);
        p.add(b3);

        b4=new JButton("Mini Statement");
        b4.setBackground(new Color(106,61,49));
        b4.setForeground(Color.WHITE);
        b4.setFont(f2);
        b4.setFocusable(false);
        b4.setBounds(350,230,200,35);
        p.add(b4);

        b5=new JButton("Pin Change");
        b5.setBackground(new Color(106,61,49));
        b5.setForeground(Color.WHITE);
        b5.setFont(f2);
        b5.setFocusable(false);
        b5.setBounds(80,310,200,35);
        p.add(b5);

        b6=new JButton("Balace Enquiry");
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
        if(ae.getSource()==b1){
            new DepositDesign().setVisible(true);
            f.setVisible(false);
        }
        else if(ae.getSource()==b2){
            new WithdrawlDesign().setVisible(true);
            f.setVisible(false);
        }
        else if(ae.getSource()==b3){
            new FastCashDesign().setVisible(true);
            f.setVisible(false);
        }
        else if(ae.getSource()==b5){
            new PinDesign().setVisible(true);
            f.setVisible(false);
        }
        else if(ae.getSource()==b6){
           String pinn=JOptionPane.showInputDialog("Enter pin");
           conn c1 =new conn();
           try{
               ResultSet rs=c1.s.executeQuery("select balance from bank ORDER BY pin='"+pinn+"'DESC LIMIT 1");
               if(rs.next()){
                   String Balance=rs.getString("balance");
                   JOptionPane.showMessageDialog(null,"Your balance is:"+Balance);

               }

           }
           catch (Exception e){

           }
        }
        else if(ae.getSource()==b7){
           System.exit(0);
        }


    }
}
public class Transaction {
    public static void main(String[] args) {new TransactionDesign();}
}
