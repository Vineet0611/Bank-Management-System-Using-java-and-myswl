/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Application2Design extends JPanel implements ActionListener {
    JPanel p1;
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    Font f1,f3;
    JTextField tx1,tx2,tx3;
    JComboBox c1,c2,c3,c4,c5;
    JRadioButton r1,r2,r3,r4;
    JButton btn;


    public Application2Design(){
        f=new JFrame("Application form 2");
        p1=new JPanel();
        f1=new Font("Times New Roman",Font.BOLD,25);
        f3=new Font("Times New Roman",Font.PLAIN,18);
       // p1.setLayout(new FlowLayout(FlowLayout.LEFT));

        p1.setBackground(Color.WHITE);
        l2=new JLabel("Form No.");
        l2.setBounds(490,5,100,20);
        l2.setForeground(new Color(106, 61, 49));
        l2.setFont(f3);
        p1.add(l2);

        tx1=new JTextField();
        tx1.setBounds(562,5,70,20);
        tx1.setForeground(new Color(106, 61, 49));
        tx1.setFont(f3);
        p1.add(tx1);

        l1=new JLabel("Page 2: Additional Details.");
        l1.setBounds(160,10,400,50);
        l1.setFont(f1);
        l1.setForeground(new Color(106, 61, 49));
        p1.add(l1);

        l3=new JLabel("Religion:");
        l3.setBounds(80,100,100,30);
        l3.setFont(f3);
        l3.setForeground(new Color(106, 61, 49));
        p1.add(l3);


        String str1[]={"Select","Hindu","Sikh","Bhuddhism","Jain"};
        c1=new JComboBox(str1);
        c1.setBounds(210,100,328,25);
        c1.setFont(f3);
        c1.setForeground(new Color(106, 61, 49));
        p1.add(c1);

        l4=new JLabel("Category:");
        l4.setBounds(80,151,100,30);
        l4.setFont(f3);
        l4.setForeground(new Color(106, 61, 49));
        p1.add(l4);


        String str2[]={"Select","SC","ST","OBC","General","VJ-NT"};
        c2=new JComboBox(str2);
        c2.setBounds(210,152,328,25);
        c2.setFont(f3);
        c2.setForeground(new Color(106, 61, 49));
        p1.add(c2);

        l5=new JLabel("Income:");
        l5.setBounds(80,201,100,30);
        l5.setFont(f3);
        l5.setForeground(new Color(106, 61, 49));
        p1.add(l5);


        String str3[]={"Select","Below ₹1 Lacs","₹1 Lacs to ₹5 Lacs","₹5 Lacs to ₹10 Lacs","₹10 Lacs to ₹25 Lacs","More than ₹25 Lacs"};
        c3=new JComboBox(str3);
        c3.setBounds(210,202,328,25);
        c3.setFont(f3);
        c3.setForeground(new Color(106, 61, 49));
        p1.add(c3);


        l6=new JLabel("Education:");
        l6.setBounds(80,247,200,50);
        l6.setFont(f3);
        l6.setForeground(new Color(106, 61, 49));
        p1.add(l6);


        String str4[]={"Select","SSLC","HSC","Diploma","Under Graduate","Post Graduate"};
        c4=new JComboBox(str4);
        c4.setBounds(210,257,328,25);
        c4.setFont(f3);
        c4.setForeground(new Color(106, 61, 49));
        p1.add(c4);

        l7=new JLabel("Occupation:");
        l7.setBounds(80,303,200,50);
        l7.setFont(f3);
        l7.setForeground(new Color(106, 61, 49));
        p1.add(l7);


        String str5[]={"Select","Salaried","Business","None","Student","Retired","None"};
        c5=new JComboBox(str5);
        c5.setBounds(210,312,328,25);
        c5.setFont(f3);
        c5.setForeground(new Color(106, 61, 49));
        p1.add(c5);

        l8=new JLabel("PAN Number:");
        l8.setBounds(80,358,200,50);
        l8.setFont(f3);
        l8.setForeground(new Color(106, 61, 49));
        p1.add(l8);

        tx2=new JTextField();
        tx2.setFont(f3);
        tx2.setBounds(210,369,328,25);
        p1.add(tx2);
        tx2.setForeground(new Color(106, 61, 49));

        l9=new JLabel("Aadhar Number:");
        l9.setBounds(80,410,200,50);
        l9.setFont(f3);
        p1.add(l9);
        l9.setForeground(new Color(106, 61, 49));

        tx3=new JTextField();
        tx3.setFont(f3);
        tx3.setBounds(210,423,328,25);
        p1.add(tx3);
        tx3.setForeground(new Color(106, 61, 49));

        l10=new JLabel("Senior Citizen:");
        l10.setBounds(80,460,200,50);
        l10.setFont(f3);
        p1.add(l10);
        l10.setForeground(new Color(106, 61, 49));

        r1=new JRadioButton("Yes");
        r1.setFont(f3);
        r1.setBackground(Color.WHITE);
        r1.setBounds(210,469,100,30);
        r1.setForeground(new Color(106, 61, 49));
        p1.add(r1);

        r2=new JRadioButton("No");
        r2.setFont(f3);
        r2.setBackground(Color.WHITE);
        r2.setBounds(315,469,100,30);
        p1.add(r2);
        r2.setForeground(new Color(106, 61, 49));

        ButtonGroup bg1 =new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);

        l11=new JLabel("Existing Account:");
        l11.setBounds(80,510,200,50);
        l11.setFont(f3);
        p1.add(l11);
        l11.setForeground(new Color(106, 61, 49));

        r3=new JRadioButton("Yes");
        r3.setFont(f3);
        r3.setBackground(Color.WHITE);
        r3.setBounds(210,520,100,30);
        p1.add(r3);
        r3.setForeground(new Color(106, 61, 49));

        r4=new JRadioButton("No");
        r4.setFont(f3);
        r4.setBackground(Color.WHITE);
        r4.setBounds(315,520,100,30);
        p1.add(r4);
        r4.setForeground(new Color(106, 61, 49));

        ButtonGroup bg2 =new ButtonGroup();
        bg2.add(r3);
        bg2.add(r4);

        btn=new JButton("Next");
        btn.setBackground(new Color(106, 61, 49));
        btn.setForeground(Color.WHITE);
        btn.setBounds(385,580,150,30);
        p1.add(btn);
        btn.addActionListener(this);

        p1.setLayout(null);
        f.add(p1);
        f.setSize(650,700);
        f.setVisible(true);
        f.setLayout(null);
        f.setLocation(380,20);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){
        String rel=(String)c1.getSelectedItem();
        String cas=(String)c2.getSelectedItem();
        String sal=(String)c3.getSelectedItem();
        String edu=(String)c4.getSelectedItem();
        String occ=(String)c5.getSelectedItem();
        String fm=tx1.getText();
        String pan=tx2.getText();
        String aadh=tx3.getText();
        String seni=null;
        if(r1.isSelected()){
            seni="Yes";
        }
        else if(r2.isSelected()){
            seni="No";
        }
         String ex=null;
        if(r3.isSelected()){
            ex="Yes";
        }
        else if(r4.isSelected()){
            ex="No";
        }
        try{
            if(tx1.getText().equals("")||tx2.getText().equals("")||tx3.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the required field");
            }
            else{
                conn c1=new conn();
                String q1="insert into signup2 values('"+fm+"','"+rel+"','"+cas+"','"+sal+"','"+edu+"','"+occ+"','"+pan+"','"+aadh+"','"+seni+"','"+ex+"')";
                c1.s.executeUpdate(q1);
                new Application3Design().setVisible(true);
               f.setVisible(false);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("error:"+e);
        }


    }
}
public class ApplicationForm2 {
    public static void main(String[] args) {
        new Application2Design();
    }
}

