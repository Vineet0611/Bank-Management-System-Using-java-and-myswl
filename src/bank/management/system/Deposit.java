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

class DepositDesign extends JPanel implements ActionListener {
       JFrame f;
       JPanel p;
       JTextField tx2;
       JLabel l1,l2,l3;
       JButton b1,b2,b3;
       Font f1,f3;
       JPasswordField tx1;
       public DepositDesign(){
           f=new JFrame("DEPOSIT");
           p=new JPanel();
           p.setLayout(null);

           f1=new Font("Times New Roman",Font.BOLD,25);
           f3=new Font("Times New Roman",Font.BOLD,20);

           l1=new JLabel("Enter Pin.");
           l1.setBounds(477,5,100,20);
           l1.setForeground(new Color(106, 61, 49));
           l1.setFont(f3);
           p.add(l1);

           tx1=new JPasswordField();
           tx1.setBounds(562,5,70,20);
           tx1.setForeground(new Color(106, 61, 49));
           tx1.setFont(f3);
           p.add(tx1);

           l3=new JLabel("ENTER  AMOUNT  YOU  WANT");
           l3.setBounds(130,170,400,30);
           l3.setFont(f1);
           l3.setForeground(new Color(106, 61, 49));
           p.add(l3);

           l2=new JLabel("TO  DEPOSIT");
           l2.setBounds(230,220,400,30);
           l2.setFont(f1);
           l2.setForeground(new Color(106, 61, 49));
           p.add(l2);

           tx2=new JTextField();
           tx2.setBounds(200,260,250,30);
           tx2.setForeground(new Color(106, 61, 49));
           tx2.setFont(f3);
           p.add(tx2);

           b1=new JButton("DEPOSIT");
           b1.setBackground(new Color(106,61,49));
           b1.setForeground(Color.WHITE);
           b1.setBounds(200,320,100,30);
           p.add(b1);



           b2=new JButton("BACK");
           b2.setBackground(new Color(106,61,49));
           b2.setForeground(Color.WHITE);
           b2.setBounds(350,320,100,30);
           p.add(b2);

           b3=new JButton("EXIT");
           b3.setBackground(new Color(106,61,49));
           b3.setForeground(Color.WHITE);
           b3.setBounds(260,380,120,30);
           p.add(b3);

           b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);

           f.add(p);
           f.setSize(650,700);
           f.setVisible(true);
           f.setLayout(null);
           f.setLocation(380,20);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       }
       public void actionPerformed(ActionEvent ae){

           String a= tx1.getText();
           String b= tx2.getText();
           try{
               if(ae.getSource()==b1){
                   if(tx1.getText().equals("")){
                       JOptionPane.showMessageDialog(null,"Please Enter Pin");
                   }
                   else if(tx2.getText().equals("")){
                       JOptionPane.showMessageDialog(null,"Please Enter Amount to Deposit");
                   }
                   else{
                       conn c1= new conn();
                       ResultSet rs=c1.s.executeQuery("Select * from bank where pin='"+a+"'");
                       double balance=0;
                       if(rs.next()){
                           String pin=rs.getString("pin");
                            balance=rs.getDouble("balance");
                            double d=Double.parseDouble(b);
                            balance=balance+d;
                            String q1="insert into bank values('"+pin+"','"+d+"',null,'"+balance+"')";
                            c1.s.executeUpdate(q1);
                       }
                       JOptionPane.showMessageDialog(null,"₹ '"+b+"' is Deposited Successfullu");
                       new TransactionDesign().setVisible(true);
                       f.setVisible(false);
                   }
               }else if(ae.getSource()==b2){
                   new TransactionDesign().setVisible(true);
                   f.setVisible(false);
               }else if(ae.getSource()==b3){
                   System.exit(0);
               }

           }
           catch(Exception e){
               e.printStackTrace();
               System.out.println("Error:"+e);
           }

       }


}
public class Deposit {
    public static void main(String[] args) {
        new DepositDesign();
    }
}
