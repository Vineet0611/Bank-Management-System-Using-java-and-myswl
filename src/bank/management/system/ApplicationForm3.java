/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Application3Design extends JPanel implements ActionListener {
   JFrame f;
   JPanel p;
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
   JRadioButton r1,r2,r3,r4;
   JCheckBox c1,c2,c3,c4,c5,c6,c7;
   JTextField tx1;
   JButton b1,b2;
   Font f1,f2,f3;
   public Application3Design(){
        f=new JFrame(" Application Form 3 ");
        p=new JPanel();
        p.setLayout(null);

       f1=new Font("Times New Roman",Font.BOLD,25);
       f2=new Font("Times New Roman",Font.BOLD,12);
       f3=new Font("Times New Roman",Font.BOLD,20);
       p.setBackground(Color.WHITE);

       l1=new JLabel("Form No.");
       l1.setBounds(483,5,100,20);
       l1.setForeground(new Color(106, 61, 49));
       l1.setFont(f3);
       p.add(l1);

       tx1=new JTextField();
       tx1.setBounds(562,5,70,20);
       tx1.setForeground(new Color(106, 61, 49));
       tx1.setFont(f3);
       p.add(tx1);

       l2=new JLabel("Page 3: Account Details.");
       l2.setBounds(160,10,400,50);
       l2.setFont(f1);
       l2.setForeground(new Color(106, 61, 49));
       p.add(l2);

       l3=new JLabel("Account Type:");
       l3.setBounds(80,100,130,30);
       l3.setFont(f3);
       l3.setForeground(new Color(106, 61, 49));
       p.add(l3);

       r1=new JRadioButton("Savings Account");
       r1.setFont(f3);
       r1.setBackground(Color.WHITE);
       r1.setBounds(80,140,165,30);
       r1.setForeground(new Color(106, 61, 49));
       p.add(r1);

       r2=new JRadioButton("Fixed Deposit Account");
       r2.setFont(f3);
       r2.setBackground(Color.WHITE);
       r2.setBounds(280,140,230,30);
       r2.setForeground(new Color(106, 61, 49));
       p.add(r2);

       r3=new JRadioButton("Current Account");
       r3.setFont(f3);
       r3.setBackground(Color.WHITE);
       r3.setBounds(80,180,185,30);
       r3.setForeground(new Color(106, 61, 49));
       p.add(r3);

       r4=new JRadioButton("Reccuring Deposit Account");
       r4.setFont(f3);
       r4.setBackground(Color.WHITE);
       r4.setBounds(280,180,255,30);
       r4.setForeground(new Color(106, 61, 49));
       p.add(r4);

       ButtonGroup bg1 =new ButtonGroup();
       bg1.add(r1);
       bg1.add(r2);
       bg1.add(r3);
       bg1.add(r4);

       l4=new JLabel("Card Number:");
       l4.setBounds(80,240,130,30);
       l4.setFont(f3);
       l4.setForeground(new Color(106, 61, 49));
       p.add(l4);

       l5=new JLabel("4516-8962-XXXX-XXXX");
       l5.setBounds(280,240,230,30);
       l5.setFont(f3);
       l5.setForeground(new Color(106, 61, 49));
       p.add(l5);

       l6=new JLabel("(Your 16-digit Card number)");
       l6.setBounds(80,260,150,30);
       l6.setFont(f2);
       l6.setForeground(new Color(106, 61, 49));
       p.add(l6);

       l7=new JLabel("it would appear on ATM card/Cheque book and Statement");
       l7.setBounds(280,260,310,30);
       l7.setFont(f2);
       l7.setForeground(new Color(106, 61, 49));
       p.add(l7);

       l8=new JLabel("PIN:");
       l8.setBounds(80,300,130,30);
       l8.setFont(f3);
       l8.setForeground(new Color(106, 61, 49));
       p.add(l8);

       l9=new JLabel("XXXX");
       l9.setBounds(280,300,230,30);
       l9.setFont(f3);
       l9.setForeground(new Color(106, 61, 49));
       p.add(l9);

       l10=new JLabel("Services Required:");
       l10.setBounds(80,350,160,30);
       l10.setFont(f3);
       l10.setForeground(new Color(106, 61, 49));
       p.add(l10);

       c1=new JCheckBox("Atm Card");
       c1.setBounds(80,400,150,30);
       c1.setFont(f3);
       c1.setForeground(new Color(106, 61, 49));
       c1.setBackground(Color.WHITE);
       p.add(c1);

       c2=new JCheckBox("Internet Banking");
       c2.setBounds(280,400,250,30);
       c2.setFont(f3);
       c2.setForeground(new Color(106, 61, 49));
       c2.setBackground(Color.WHITE);
       p.add(c2);

       c3=new JCheckBox("Mobile Banking");
       c3.setBounds(80,440,200,30);
       c3.setFont(f3);
       c3.setForeground(new Color(106, 61, 49));
       c3.setBackground(Color.WHITE);
       p.add(c3);

       c4=new JCheckBox("Email Alerts");
       c4.setBounds(280,440,250,30);
       c4.setFont(f3);
       c4.setForeground(new Color(106, 61, 49));
       c4.setBackground(Color.WHITE);
       p.add(c4);

       c5=new JCheckBox("Cheque Book");
       c5.setBounds(80,480,150,30);
       c5.setFont(f3);
       c5.setForeground(new Color(106, 61, 49));
       c5.setBackground(Color.WHITE);
       p.add(c5);

       c6=new JCheckBox("E-Statement");
       c6.setBounds(280,480,250,30);
       c6.setFont(f3);
       c6.setForeground(new Color(106, 61, 49));
       c6.setBackground(Color.WHITE);
       p.add(c6);

       c7=new JCheckBox("I hereby declare that the above details are correct to the best of my knowlwdge");
       c7.setBounds(80,540,500,30);
       c7.setFont(f2);
       c7.setForeground(new Color(106, 61, 49));
       c7.setBackground(Color.WHITE);
       p.add(c7);

       b1=new JButton("Submit");
       b1.setBackground(new Color(106,61,49));
       b1.setForeground(Color.WHITE);
       b1.setBounds(200,600,100,30);
       p.add(b1);

       b2=new JButton("Cancel");
       b2.setBackground(new Color(106,61,49));
       b2.setForeground(Color.WHITE);
       b2.setBounds(320,600,100,30);
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


    public void actionPerformed(ActionEvent ae){
       String at=null;
       if(r1.isSelected()){
           at="Savings Account";
       }
       else if(r2.isSelected()){
           at="Fixed Deposit Account";
       }
       else if(r4.isSelected()){
           at="Reccuring Deposit Account";
       }
        Random ran =new Random();
       long first7=(ran.nextLong() % 90000000L) + 4516896200000000L;
       long first8=Math.abs(first7);

//       long first7=ran.nextLong(99999999L-100000000L)+4516896200000000L;
//       long first8=Math.abs(first7);
        Random rn =new Random();
        int first4=rn.nextInt(9999-1000)+1000;
        int first=Math.abs(first4);

        String a=tx1.getText();



       String sr="";
       if(c1.isSelected()){
           sr=sr+" Atm card";
       }
        if(c2.isSelected()){
           sr=sr+" Internet Banking";
       }
        if(c3.isSelected()){
           sr=sr+" Mobile Banking";
       }
        if(c4.isSelected()){
           sr=sr+" Email-Alert";
       }
        if(c5.isSelected()){
           sr=sr+" Cheque Book";
       }
        if(c6.isSelected()){
           sr=sr+" E-statement";
       }

     try {
         if (ae.getSource() == b1) {
             if (tx1.getText().equals("") ) {
                 JOptionPane.showMessageDialog(null, "Fill all the required field");
             }
             else if(!c7.isSelected()){
                 JOptionPane.showMessageDialog(null,"please check the last checkbox");
             }
             else{

                 conn c1 =new conn();
                 String q1="insert into signup3 values('"+a+"','"+at+"','"+first8+"','"+first+"','"+sr+"')";
                 String q2="insert into login values('"+first8+"','"+first+"')";
                 c1.s.executeUpdate(q1);
                 c1.s.executeUpdate(q2);
                 JOptionPane.showMessageDialog(null,"Card no:"+first8+"\n pin:"+first4);
                 new DepositDesign().setVisible(true);
                 f.setVisible(false);
             }
         }else if(ae.getSource()==b2){
             System.exit(0);
         }
     }
     catch(Exception e){
         e.printStackTrace();
         System.out.println("Error:"+e);
     }

    }
}
public class ApplicationForm3 {
    public static void main(String[] args) {
        new Application3Design();
    }
}

