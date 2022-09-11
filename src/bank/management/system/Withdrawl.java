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

class WithdrawlDesign extends JPanel implements ActionListener {
    JFrame f;
    JPanel p;
    JTextField tx2;
    JLabel l1,l2,l3;
    JButton b1,b2,b3;
    Font f1,f2,f3;
    JPasswordField tx1;
    WithdrawlDesign(){
        f=new JFrame("WITHDRAWL");
        p=new JPanel();
        p.setLayout(null);
        p.setBackground(Color.WHITE);

        f1=new Font("Times New Roman",Font.BOLD,25);
        f2=new Font("Times New Roman",Font.BOLD,18);
        f3=new Font("Times New Roman",Font.BOLD,20);

        l1=new JLabel("PIN No.");
        l1.setBounds(483,5,100,20);
        l1.setForeground(new Color(106, 61, 49));
        l1.setFont(f3);
        p.add(l1);

        tx1=new JPasswordField(4);
        tx1.setBounds(562,5,70,20);
        tx1.setForeground(new Color(106, 61, 49));
        tx1.setFont(f3);
        p.add(tx1);

        l3=new JLabel("MAXIMUM  DAILY  WITHDRAWL");
        l3.setBounds(110,170,450,30);
        l3.setFont(f1);
        l3.setForeground(new Color(106, 61, 49));
        p.add(l3);

        l2=new JLabel("IS  ₹10,000");
        l2.setBounds(240,220,400,30);
        l2.setFont(f1);
        l2.setForeground(new Color(106, 61, 49));
        p.add(l2);

        l3=new JLabel("PLEASE ENTER YOUR AMOUNT");
        l3.setBounds(160,260,400,30);
        l3.setFont(f3);
        l3.setForeground(new Color(106, 61, 49));
        p.add(l3);

        tx2=new JTextField();
        tx2.setBounds(180,300,270,30);
        tx2.setForeground(new Color(106, 61, 49));
        tx2.setFont(f3);
        p.add(tx2);

        b1=new JButton("WITHDRAWL");
        b1.setBackground(new Color(106,61,49));
        b1.setForeground(Color.WHITE);
        b1.setBounds(130,360,180,30);
        b1.setFont(f2);
        b1.setFocusable(false);
        p.add(b1);

        b2=new JButton("BACK");
        b2.setBackground(new Color(106,61,49));
        b2.setForeground(Color.WHITE);
        b2.setBounds(320,360,180,30);
        b2.setFont(f2);
        b2.setFocusable(false);
        p.add(b2);

        b3=new JButton("EXIT");
        b3.setBackground(new Color(106,61,49));
        b3.setForeground(Color.WHITE);
        b3.setFont(f2);
        b3.setFocusable(false);
        b3.setBounds(220,410,180,30);
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
        try{
            String a=tx1.getText();
            String b=tx2.getText();
            if(ae.getSource()==b1){
                if(tx1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the Pin");
                }
                else if(tx2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the amount");
                }
                else
                {
                    conn c1=new conn();

                    ResultSet rs= c1.s.executeQuery("select * from bank where pin='"+a+"'");
                    double Balance=0;
                    if(rs.next()){
                        String pin=rs.getString("pin");
                        Balance=rs.getDouble("balance");
                        double d=Double.parseDouble(b);
                        Balance =Balance-d;
                        String q1="insert into bank value('"+pin+"','"+null+"','"+d+"','"+Balance+"')";
                        c1.s.executeUpdate(q1);
                    }
                    JOptionPane.showMessageDialog(null,"₹ "+b+" Debited Successfully");
                    new TransactionDesign().setVisible(true);
                    f.setVisible(false);

                }
            }else if(ae.getSource()==b2){
                new TransactionDesign().setVisible(true);
                f.setVisible(false);
            }else if(ae.getSource()==b3){
                System.exit(0);
            }

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error:"+e);
        }

    }

}
public class Withdrawl {
    public static void main(String[] args) {
        new WithdrawlDesign();
    }
}

