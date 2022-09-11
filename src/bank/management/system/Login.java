/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;



import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;

class LoginDesign  extends JFrame implements ActionListener {
    JFrame f;
    JButton b1,b2,b3;
    JPasswordField pass;
    JTextField tx1;
    JLabel l1,l2,l3,img,fake;
    Font f1,f2;



    public LoginDesign ()
    {


            f2=new Font(Font.MONOSPACED,Font.PLAIN,23);
            f1=new Font("Times New Roman",Font.PLAIN,25);

        f=new JFrame("Automatic Teller Machine");
        f.getContentPane().setBackground(Color.WHITE);
        //label for Image
        img=new JLabel("");
        img.setIcon(new ImageIcon("C:\\Users\\vineet mendon\\Desktop\\bot\\bankLogo.png"));
        img.setBounds(135,10,270,70);
        f.add(img);




        //label for welcome to atm
        l1=new JLabel("⚜️ WELCOME TO ATM ⚜️");
        l1.setBounds(135,100,300,30);
        l1.setForeground(new Color(106, 61, 49));
        l1.setFont(f2);
        f.add(l1);
         //label for card no
        l2=new JLabel("Card No:");
        l2.setBounds(80,170,150,30);
        l2.setFont(f1);
        l2.setForeground(new Color(106, 61, 49));
        f.add(l2);

        //textfield for card no
        tx1=new JTextField(16);
        tx1.setBounds(210,170,200,30);
        tx1.setFont(f1);
        f.add(tx1);
        //create   pin no
        l3=new JLabel("Pin No :");
        l3.setBounds(80,230,150,30);
        l3.setFont(f1);
        l3.setForeground(new Color(106, 61, 49));
        f.add(l3);
        //creating password field
        pass =new JPasswordField(4);
        pass.setBounds(210,230,200,30);
        pass.setFont(f1);
        f.add(pass);
        //creating  for sign -in
        b1=new JButton("Sign In");
        b1.setBounds(80,290,160,30);
        b1.setBackground(new Color(106, 61, 49));
        b1.setForeground(Color.WHITE);
        b1.setFont(f1);
        f.add(b1);

        //creating button for clear
        b2=new JButton("Clear");
        b2.setBounds(250,290,160,30);
        b2.setBackground(new Color(106, 61, 49));
        b2.setForeground(Color.WHITE);
        b2.setFont(f1);
        f.add(b2);

        //creating button for sign-up
        b3=new JButton("Sign-Up");
        b3.setBounds(80,350,330,30);
        b3.setBackground(new Color(106, 61, 49));
        b3.setForeground(Color.WHITE);
        b3.setFont(f1);
        f.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        //fake label i used
        fake=new JLabel("");
        fake.setBounds(200,150,200,20);
        f.add(fake);
        f.setLayout(null);
        //seting the frame size

        f.setSize(550,600);
        f.setVisible(true);
        f.setLocation(400,70);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae)
    {
        try{
            conn c1 =new conn();
            String a= tx1.getText();
            String b=pass.getText();
            String q= "select * from login where CardNo ='"+a+"'and pin='"+b+"'";
            ResultSet rs=c1.s.executeQuery(q);

            if(ae.getSource()==b1){
                if(rs.next()){
                    new TransactionDesign().setVisible(true);
                    f.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card_No or Pin");
                }
            }
            else if(ae.getSource()==b2){
                tx1.setText("");
                pass.setText("");
            }
            else if(ae.getSource()==b3){
                new Application1Design().setVisible(true);
                f.setVisible(false);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("error:"+e);
        }


    }


}
public class Login  {
    public static void main(String[] args) {
        new LoginDesign();
    }


}
