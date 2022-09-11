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

class Application1Design extends JPanel implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7;
    JComboBox date,month,year;
    JRadioButton male,female,married,unmarried,other;
    JPanel p;
    JButton btn;
    JFrame f;
    Font f1,f2,f3;
    Random rn =new Random();
    long first4=(rn.nextLong()%9000L)+1000L;
    long first=Math.abs(first4);

    public Application1Design()
    {

      f=new JFrame("New Account Application Form");
      p=new JPanel();
      f.getContentPane().setBackground(Color.WHITE);
      f1=new Font("Times New Roman",Font.BOLD,25);
      f2=new Font("Times New Roman",Font.BOLD,20);
      f3=new Font("Times New Roman",Font.PLAIN,18);



      l1=new JLabel("APPLICATION FORM NO. "+first);
      l1.setFont(f1);
      l1.setBounds(120,10,400,50);
      p.add(l1);

      l2=new JLabel("Page 1:Personal Details");
      l2.setFont(f2);
      l2.setBounds(190,35,230,50);
      p.add(l2);

      l3=new JLabel("Name:");
      l3.setFont(f3);
      l3.setBounds(80,100,100,30);
      p.add(l3);

      tx1=new JTextField(15);
      tx1.setBounds(210,100,328,30);
      tx1.setFont(f3);
      p.add(tx1);

      l4=new JLabel("Father's Name:");
      l4.setFont(f3);
      l4.setBounds(80,130,130,50);
      p.add(l4);

      tx2=new JTextField(15);
      tx2.setBounds(210,140,328,30);
      tx2.setFont(f3);
      p.add(tx2);

      l5=new JLabel("Date of Birth:");
      l5.setFont(f3);
      l5.setBounds(80,170,130,50);
      p.add(l5);

      l6=new JLabel("Date");
      l6.setFont(f3);
      l6.setBounds(210,170,40,50);
      p.add(l6);

      String dt[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
      date=new JComboBox(dt);
      date.setBounds(247,187,40,20);
      p.add(date);

      l15=new JLabel("Month");
      l15.setFont(f3);
      l15.setBounds(293,170,50,50);
      p.add(l15);

      String Mtn[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
      month=new JComboBox(Mtn);
      month.setBounds(344,187,80,20);
      p.add(month);

      l7=new JLabel("Year");
      l7.setFont(f3);
      l7.setBounds(425,180,50,30);
      p.add(l7);

      String yr[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
      year=new JComboBox(yr);
      year.setBounds(465,187,70,20);
      p.add(year);

      l8=new JLabel("Gender:");
      l8.setFont(f3);
      l8.setBounds(80,220,100,30);
      p.add(l8);

      male=new JRadioButton("Male");
      male.setFont(f3);
      male.setBackground(Color.WHITE);
      male.setBounds(205,220,80,30);
      p.add(male);

      female=new JRadioButton("Female");
      female.setFont(f3);
      female.setBackground(Color.WHITE);
      female.setBounds(293,220,100,30);
      p.add(female);

      other=new JRadioButton("Other");
      other.setFont(f3);
      other.setBackground(Color.WHITE);
      other.setBounds(400,220,100,30);
      p.add(other);

      ButtonGroup b=new ButtonGroup();
      b.add(male);
      b.add(female);
      b.add(other);

      l9=new JLabel("Email-Address:");
      l9.setBounds(80,260,150,30);
      l9.setFont(f3);
      p.add(l9);

      tx3=new JTextField(25);
      tx3.setFont(f3);
      tx3.setBounds(210,260,328,30);
      p.add(tx3);

      l10=new JLabel("Marital Status:");
      l10.setBounds(80,305,150,30);
      l10.setFont(f3);
      p.add(l10);

      married =new JRadioButton("Married");
      married.setBounds(210,305,85,30);
      married.setFont(f3);
      married.setBackground(Color.WHITE);
      p.add(married);

      unmarried =new JRadioButton("Unmarried");
      unmarried.setBounds(295,305,120,30);
      unmarried.setFont(f3);
      unmarried.setBackground(Color.WHITE);
      p.add(unmarried);

      l11=new JLabel("Address:");
      l11.setBounds(80,345,150,30);
      l11.setFont(f3);
      p.add(l11);

      tx4=new JTextField(25);
      tx4.setFont(f3);
      tx4.setBounds(210,345,328,30);
      p.add(tx4);

      l12=new JLabel("City:");
      l12.setBounds(80,385,150,30);
      l12.setFont(f3);
      p.add(l12);

      tx5=new JTextField(25);
      tx5.setFont(f3);
      tx5.setBounds(210,385,328,30);
      p.add(tx5);

      l13=new JLabel("Pin-Code:");
      l13.setBounds(80,425,150,30);
      l13.setFont(f3);
      p.add(l13);

      tx6=new JTextField(25);
      tx6.setFont(f3);
      tx6.setBounds(210,425,328,30);
      p.add(tx6);

      l14=new JLabel("State:");
      l14.setBounds(80,465,150,30);
      l14.setFont(f3);
      p.add(l14);

      tx7=new JTextField(25);
      tx7.setFont(f3);
      tx7.setBounds(210,465,328,30);
      p.add(tx7);

      btn =new JButton("Next");
      btn.setBackground(Color.BLACK);
      btn.setForeground(Color.WHITE);
      btn.setBounds(437,505,100,30);
      p.add(btn);



      l1.setForeground(new Color(106, 61, 49));
      l2.setForeground(new Color(106, 61, 49));
      l3.setForeground(new Color(106, 61, 49));
      l4.setForeground(new Color(106, 61, 49));
      l5.setForeground(new Color(106, 61, 49));
      l6.setForeground(new Color(106, 61, 49));
      l7.setForeground(new Color(106, 61, 49));
      l8.setForeground(new Color(106, 61, 49));
      l9.setForeground(new Color(106, 61, 49));
      l10.setForeground(new Color(106, 61, 49));
      l11.setForeground(new Color(106, 61, 49));
      l12.setForeground(new Color(106, 61, 49));
      l13.setForeground(new Color(106, 61, 49));
      l14.setForeground(new Color(106, 61, 49));
      l15.setForeground(new Color(106, 61, 49));
      tx1.setForeground(new Color(106, 61, 49));
      tx2.setForeground(new Color(106, 61, 49));
      tx3.setForeground(new Color(106, 61, 49));
      tx4.setForeground(new Color(106, 61, 49));
      tx5.setForeground(new Color(106, 61, 49));
      tx6.setForeground(new Color(106, 61, 49));
      tx7.setForeground(new Color(106, 61, 49));
      date.setForeground(new Color(106, 61, 49));
      month.setForeground(new Color(106, 61, 49));
      year.setForeground(new Color(106, 61, 49));
      married.setForeground(new Color(106, 61, 49));
      unmarried.setForeground(new Color(106, 61, 49));
      male.setForeground(new Color(106, 61, 49));
      female.setForeground(new Color(106, 61, 49));
      other.setForeground(new Color(106, 61, 49));
      btn.setBackground(new Color(106, 61, 49));

      btn.addActionListener(this);


      f.add(p);
      p.setLayout(null);
      f.setSize(650,700);
      f.setVisible(true);
      f.setLocation(380,20);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

  public void actionPerformed(ActionEvent ae)
  {


      String a=tx1.getText();
      String b=tx2.getText();
      String c=(String) date.getSelectedItem();
      String e=(String) month.getSelectedItem();
      String f=(String) year.getSelectedItem();
      String h=null;
      if(male.isSelected()){h="Male";}
      else if (female.isSelected()){h="Female";}
      else{h="other";}
      String i=tx3.getText();
      String j=null;
      if(married.isSelected()){j="Married";}
      else if(unmarried.isSelected()){j="Unmarried";}
      String add=tx4.getText();
      String cty=tx5.getText();
      String pc=tx6.getText();
      String sts=tx7.getText();

      try{

        if(tx1.getText().equals("")||tx2.getText().equals("")||tx3.getText().equals("")||tx4.getText().equals("")||tx5.getText().equals("")||tx6.getText().equals("")||tx7.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Fill all the required fields");
        }
      else
      {

        conn c1=new conn();
        String q="insert into signup values('"+first+"','"+a+"','"+b+"','"+c+"','"+e+"','"+f+"','"+h+"','"+i+"','"+j+"','"+add+"','"+pc+"','"+sts+"','"+cty+"')";
        c1.s.executeUpdate(q);
        new Application2Design().setVisible(true);
        //f.setVisible(false);
     }
    }
      catch(Exception ex)
      {
        ex.printStackTrace();
        System.out.println("Error:"+ex);
      }
  }
}
public class ApplicationForm1 {
    public static void main(String[] args) {
      new Application1Design();
    }
}

