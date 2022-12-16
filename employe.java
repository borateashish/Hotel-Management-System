import java.awt.*;
     import javax.swing.*;
     import java.awt.event.*;
     import java.sql.*;
      public class employe extends JFrame implements ActionListener, ItemListener
       {
          JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
          JTextField t1,t2,t3,t4,t5;
          JButton b1,b2;
          JPanel p1,p2,p3;
          Icon icon,icon1;


           public employe()
            {

          l1=new JLabel("Employe Details   ",JLabel.CENTER);
		  l2=new JLabel("Employe Name                      : ",JLabel.RIGHT);
		  l3=new JLabel("Employe Id                           : ",JLabel.RIGHT);
		  l4=new JLabel("Address                                  : ",JLabel.RIGHT);
		  l5=new JLabel("Contact No                            : ",JLabel.RIGHT);
		  l6=new JLabel("");
		  l7=new JLabel("");
		  l8=new JLabel("");
		  l9=new JLabel("");
		  l10=new JLabel("");
		  l11=new JLabel("");
		  l12=new JLabel("");
		  l13=new JLabel("");


         t1=new JTextField(20);
		 t2=new JTextField(20);
		 t3=new JTextField(20);
		 t4=new JTextField(20);
                 //t5=new JTextField(20);

                 p3= new JPanel();
				 p3.setLayout(new GridLayout(1,1));
				 p3.add(l1);


                p1= new JPanel();
                 p1.setLayout(new GridLayout(8,2));


				 p1.add(l12); p1.add(l13);
                 p1.add(l2); p1.add(t1);
                 p1.add(l6); p1.add(l7);
                 p1.add(l3); p1.add(t2);
                 p1.add(l8); p1.add(l9);
                 p1.add(l4); p1.add(t3);
                 p1.add(l10); p1.add(l11);
                 p1.add(l5); p1.add(t4);

         icon = new ImageIcon("submit.jpg");
		 b1=new JButton("Submit",icon);
		 b1.setMnemonic(KeyEvent.VK_S);
		 b1.addActionListener(this);
		 icon1 = new ImageIcon("back.jpg");
		 b2=new JButton("Back",icon1);
		 b2.setMnemonic(KeyEvent.VK_B);
		 b2.addActionListener(this);
		 b1.setBackground(Color.white);
		 b1.setForeground(Color.BLACK);
		 b2.setBackground(Color.white);
		 b2.setForeground(Color.BLACK);


		 p2= new JPanel();
		 p2.setLayout(new FlowLayout());
		 p2.add(b2);
         p2.add(b1);


          b2.setFont(new Font("SERIF",Font.BOLD,20));
		  b1.setFont(new Font("SERIF",Font.BOLD,20));
	      l1.setFont(new Font("SERIF",Font.BOLD,33));
		  l2.setFont(new Font("SERIF",Font.BOLD,20));
		  l3.setFont(new Font("SERIF",Font.BOLD,20));
		  l4.setFont(new Font("SERIF",Font.BOLD,20));
		  l5.setFont(new Font("SERIF",Font.BOLD,20));

		  t1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
	          t2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
		  t3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
		  t4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));


		   setTitle("Form");
		   setLayout(new BorderLayout());
		   add(p3, BorderLayout.NORTH);
		   add(p1, BorderLayout.CENTER);
		   add(p2, BorderLayout.SOUTH);
		   p1.setBackground(Color.pink);
		   p2.setBackground(Color.pink);
		   p3.setBackground(Color.pink);
		   setSize(700,600);
		   setVisible(true);
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setVisible(true);

            }


              public void actionPerformed(ActionEvent obj)
         {
			if(obj.getSource()==b2)
			{
				frame2 f = new frame2();
				dispose();
			}

			else if(obj.getSource()==b1)
			{
										Connection conn=null;
										Statement stmt=null;
										ResultSet rs=null;
										PreparedStatement ps1=null;
										try
										{
											Class.forName("org.postgresql.Driver");
											conn=DriverManager.getConnection("jdbc:postgresql://localhost/ashishdb","postgres","12345");
											if(conn!=null)
											{
												stmt=conn.createStatement();
												ps1= conn.prepareStatement("insert into employe values(?,?,?,?)");
												String enm  = 	t1.getText();
												int eid     =	Integer.parseInt(t2.getText());
												String addr =   t3.getText();
												String cno     =t4.getText();

  												if(enm.length()==0)
  												{
													JFrame fr2 = new JFrame("Warning");
													JOptionPane.showMessageDialog(fr2,"Enter Name");
												}
												else if(addr.length()==0)
												{
													JFrame fr2 = new JFrame("Warning");
													JOptionPane.showMessageDialog(fr2,"Enter Address");
												}

												else if(cno.length()!=10)
												{
															JFrame fr2 = new JFrame("Warning");
															JOptionPane.showMessageDialog(fr2,"Enter Correct Contact No");
												}

												else
												{
													ps1.setString(1,enm);	ps1.setInt(2,eid);  ps1.setString(3,addr);  ps1.setString(4,cno);
												}
												ps1.executeUpdate();
												rs=stmt.executeQuery("select * from employe;");
												stmt.close();
												rs.close();
												conn.close();

												JFrame fr1 = new JFrame("Warning");
												JOptionPane.showMessageDialog(fr1,"Form Submitted");
												t1.setText("");	t2.setText("");	t3.setText("");
												t4.setText("");
											}
										}
										catch(Exception e)
										{
											JOptionPane.showMessageDialog(null, "Please Enter Valid Details");
										}
			}



         }

          public void itemStateChanged(ItemEvent obj)
		             {
		 	                   System.out.println("Yoou have selected  "+obj);
                     }




       public static void main(String args[])
        {
          employe e =new employe();
        }
     }
