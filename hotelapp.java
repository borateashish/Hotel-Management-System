import java.util.*;
import java.util.Date;
import java.text.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

      public class hotelapp extends JFrame implements ActionListener,ItemListener
       {
          JLabel l10,l9,l1,l2,l3,l4,l5,l6,l7,l8,l11,l12,l13;
           JTextField t9,t1,t2,t3,t4,t5,t6,t7,t8,t10,t11,t12;
           JButton b1,b2,b3,b4;
           JPanel p3,p1,p2,p4,p5;
           JRadioButton r1,r2;
			JComboBox c1,c2;
 			Date date1;
			Icon icon,icon1;
			String c[]=new String[20];
			String z;
			Calendar cal = Calendar.getInstance();
			Calendar cal1 = Calendar.getInstance();
			Date date = cal.getTime();
			StringBuilder sb1 = new StringBuilder("");

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");
            String strDate=dateFormat.format(date);

            public hotelapp()
            {

				 l9=new JLabel("Details",JLabel.CENTER);
				 l10=new JLabel("Customer Name           : ",JLabel.RIGHT);
                 l1=new JLabel("Room Type               : ",JLabel.RIGHT);
                 l2=new JLabel("Address             	    : ",JLabel.RIGHT);
                 l3=new JLabel("Contact No              : ",JLabel.RIGHT);
                 l4=new JLabel("Id No                     : ",JLabel.RIGHT);
                 l5=new JLabel("Check In                  : ",JLabel.RIGHT);
                 l6=new JLabel("Check Out               : ",JLabel.RIGHT);
                 l7=new JLabel("No of people            : ",JLabel.RIGHT);
                 l8=new JLabel("Room No                 : ",JLabel.RIGHT);
                 l11=new JLabel("No of Days              : ",JLabel.RIGHT);
                 l12=new JLabel("Ocuppied Rooms          : ",JLabel.RIGHT);

                     t9=new JTextField(20);
                     t1=new JTextField(20);
                     t2=new JTextField(20);
                     t3=new JTextField(20);
                     t4=new JTextField(20);
                     t5=new JTextField(20);
                     t6=new JTextField(20);
                     t7=new JTextField(20);
                     t8=new JTextField(20);
                     t10=new JTextField(20);
                     t11=new JTextField(20);
                     t12=new JTextField(20);

                     c1=new JComboBox();
                     String a[]=new String[]{"101","102","103","104","105","106","107","108"};
                     c1=new JComboBox(a);
					 String b[]=new String[]{"AC-2000","Non-AC-1500"};
					 c2=new JComboBox(b);



                   c1.addItemListener(this);
                   c2.addItemListener(this);

                    ;
                 Font f=new Font("Times New Roman",Font.BOLD,20);




                 t8.setText(strDate);




                 p3= new JPanel();
                 p3.setLayout(new GridLayout(1,1));
                 p3.add(l9);


 				 b3=new JButton("Set");

				 b3.setMnemonic(KeyEvent.VK_B);
				 b3.addActionListener(this);
				 b4=new JButton("Check Availability");
				 b4.setMnemonic(KeyEvent.VK_B);
				 b4.addActionListener(this);
                 JPanel p4 = new JPanel();
                 p4.setLayout(new GridLayout(1,2));
                 p4.add(t11);	p4.add(b3);
				 JPanel p5 = new JPanel();
				 p5.setLayout(new GridLayout(1,2));
                 p5.add(c1);	p5.add(b4);



                 p1= new JPanel();
                 p1.setLayout(new GridLayout(11,2));
                 p1.add(l10);   p1.add(t9);
                 p1.add(l8);    p1.add(p5);
                 p1.add(l12);	p1.add(t1);
                 p1.add(l1);    p1.add(c2);
                 p1.add(l2);    p1.add(t2);
                 p1.add(l3);    p1.add(t3);
                 p1.add(l4);	p1.add(t4);
                 p1.add(l5);	p1.add(t8);
                 p1.add(l11);	p1.add(p4);
                 p1.add(l6);	p1.add(t10);
                 p1.add(l7);	p1.add(t7);





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
                 p2.setLayout(new GridLayout());
                 p2.add(b2);
                 p2.add(b1);

                 b2.setFont(new Font("SERIF",Font.BOLD,20));
                 b1.setFont(new Font("SERIF",Font.BOLD,20));
                 b3.setFont(new Font("SERIF",Font.BOLD,20));
                 b4.setFont(new Font("SERIF",Font.BOLD,16));
			     l1.setFont(new Font("SERIF",Font.BOLD,20));
			     l2.setFont(new Font("SERIF",Font.BOLD,20));
			     l3.setFont(new Font("SERIF",Font.BOLD,20));
			     l4.setFont(new Font("SERIF",Font.BOLD,20));
			     l5.setFont(new Font("SERIF",Font.BOLD,20));
			     l6.setFont(new Font("SERIF",Font.BOLD,20));
			     l7.setFont(new Font("SERIF",Font.BOLD,20));
			     l8.setFont(new Font("SERIF",Font.BOLD,20));
			     l9.setFont(new Font("SERIF",Font.BOLD,30));
			     l10.setFont(new Font("SERIF",Font.BOLD,20));
			     l11.setFont(new Font("SERIF",Font.BOLD,20));
			     l12.setFont(new Font("SERIF",Font.BOLD,20));


			     t1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
				 t2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
				 t3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
				 t4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
				 t5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
				 t6.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
				 t7.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
				 c1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
				 c2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
			     t9.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
			     t8.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
			     t10.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
			     t11.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));

				  p1.setBackground(Color.pink);
				  p2.setBackground(Color.pink);
				  p3.setBackground(Color.pink);
				  setTitle("Form");
				  setLayout(new BorderLayout());
				  add(p3, BorderLayout.NORTH);
				  add(p1, BorderLayout.CENTER);
				  add(p2, BorderLayout.SOUTH);
                  setSize(800,900);
                  setVisible(true);
                  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  setVisible(true);

         }
         public void itemStateChanged(ItemEvent it)
		 {

		 }
         public void actionPerformed(ActionEvent obj)
         {
			if(obj.getSource()==b2)
			{
				frame2 f1 = new frame2();
				dispose();
			}
			else if(obj.getSource()==b3)
			{
					int i=Integer.parseInt(t11.getText());
					cal1.add(Calendar.DAY_OF_MONTH, i);
					String strDate1=dateFormat.format(cal1.getTime());
					t10.setText(strDate1);
			}
			else if(obj.getSource()==b4)
						{
												Connection conn=null;
																		Statement stmt=null;
																		ResultSet rs=null;
																		PreparedStatement ps1=null;
																		int i=1;
																		try
																		{
																			Class.forName("org.postgresql.Driver");
																			conn=DriverManager.getConnection("jdbc:postgresql://localhost/ashishdb","postgres","12345");
																			if(conn!=null)
																			{
																				stmt=conn.createStatement();
												ps1= conn.prepareStatement("select room_no from hotel");
												rs=ps1.executeQuery();
												while(rs.next())
										{

													sb1.append(" "+rs.getString(1));
													i++;
										}
										String z=sb1.toString();
										t1.setText(z);
										z="";
												sb1.setLength(0);


																		}
																	}
																			catch(Exception e)
																													{
																														System.out.println("Error Occured  :"+e);
																														e.printStackTrace();

		}
			}

			else if(obj.getSource()==b1)
			{

										Connection conn=null;
										Statement stmt=null;
										ResultSet rs=null, rs1=null;
										PreparedStatement ps1=null, ps2 =null;
										try
										{
											Class.forName("org.postgresql.Driver");
											conn=DriverManager.getConnection("jdbc:postgresql://localhost/ashishdb","postgres","12345");

											if(conn!=null)
											{
												stmt=conn.createStatement();
												ps1= conn.prepareStatement("insert into hotel values(?,?,?,?,?,?,?,?,?,?)");
												ps2= conn.prepareStatement("insert into hoteldb values(?,?,?,?,?,?,?,?,?,?)");

												String name = t9.getText();
												String rno = (String)c1.getSelectedItem();
												String type= (String)c2.getSelectedItem();
												String addr = t2.getText();
												String cont = (t3.getText());



												int day=Integer.parseInt(t11.getText());
												float bill = 0;




												String id = (t4.getText());
											 	String cin=t8.getText();
												//String eid=t10.getText();
												String sDate1=t10.getText();
												int people1;
												int people=Integer.parseInt(t7.getText());
												if(people>3 || people<1)
												{
													JFrame fr2 = new JFrame("Warning");
													JOptionPane.showMessageDialog(fr2,"People less than 1 & more than 3 are not allowded");
												}
												else if(cont.length()!=10)
												{
													JFrame fr2 = new JFrame("Warning");
													JOptionPane.showMessageDialog(fr2,"Enter Correct Contact No");
												}
												else if(name.length()==0)
												{
													JFrame fr2 = new JFrame("Warning");
													JOptionPane.showMessageDialog(fr2,"Enter Name");
												}
												else if(addr.length()==0)
												{
													JFrame fr2 = new JFrame("Warning");
													JOptionPane.showMessageDialog(fr2,"Enter Address");
												}
												else if(sDate1.length()==0)
												{
														JFrame fr2 = new JFrame("Warning");
														JOptionPane.showMessageDialog(fr2,"Set Check Out Date");
												}
												else if(id.length()==0)
												{
														JFrame fr2 = new JFrame("Warning");
														JOptionPane.showMessageDialog(fr2,"Enter id");
												}
												else
												{
													  ps1.setString(1,name);	ps1.setString(2,rno);  ps1.setString(3,type);  ps1.setString(4,addr);  ps1.setString(5,cont);
												      ps1.setString(6,id);  ps1.setString(7,cin);ps1.setString(8,sDate1);ps1.setInt(9,people);ps1.setInt(10,day);
												      ps2.setString(1,name);	ps2.setString(2,rno);  ps2.setString(3,type);  ps2.setString(4,addr);  ps2.setString(5,cont);
												      ps2.setString(6,id);  ps2.setString(7,cin);ps2.setString(8,sDate1);ps2.setInt(9,people);ps2.setInt(10,day); //ps2.setInt(11,bill);
												}






												ps1.executeUpdate();
												ps2.executeUpdate();
												rs=stmt.executeQuery("select * from hotel");
												rs1=stmt.executeQuery("select * from hoteldb");
												stmt.close();
												rs.close();
												rs1.close();
												conn.close();

												JFrame fr1 = new JFrame("Warning");
												JOptionPane.showMessageDialog(fr1,"Form Submitted");
												t1.setText("");
	t2.setText("");	t3.setText("");
												t4.setText("");	t5.setText("");	t6.setText("");
												t7.setText("");	t8.setText(strDate);	t9.setText("");t10.setText("");t11.setText("");
												//l13.setText("");
												z="";
												sb1.setLength(0);

											}
										}
										catch(Exception e)
										{
										System.out.println("Error Occured  :"+e);
											e.printStackTrace();
											JOptionPane.showMessageDialog(null, "Please Enter Valid Details");
										}

    	}

	}

       public static void main(String args[])
        {
          hotelapp hp =new hotelapp();
        }
     }
