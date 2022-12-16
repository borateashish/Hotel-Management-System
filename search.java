import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
      public class search extends JFrame implements ActionListener
       {
           JLabel lbx1,lbx2,lb1,lb2,lb3,ml2,ml3,ml4,ml5,ml6,ml7,ml8,ml9;
           JTextField tf1,mt11,mt12,mt13,mt14,mt15,mt16,mt17,mt18;
           JButton btn1,btn2,btn3,btn4;

           Icon icon1,icon2,icon3,icon4;

           public search()
           {
		                  lb2 = new JLabel("Customer Search",JLabel.CENTER);
		   			   	  lb2.setBounds(170,30,300,50);
		                  lb1 = new JLabel("Room Number  ");
		                  lb1.setBounds(20,100,400,30);
		                  tf1 = new JTextField(20);
		                  tf1.setBounds(200,100,200,30);
		                  icon1 = new ImageIcon("search.jpg");
		                  btn1 = new JButton("Search",icon1);
		                  btn1.setBounds(420,100,140,30);
		                  lbx1 = new JLabel("_________________________________________________________");
		                  lbx1.setBounds(0,120,400,50);
		                  lbx2 = new JLabel("_________________________________________________________________________________________________");
		                  lbx2.setBounds(120,120,800,50);
		                  icon2 = new ImageIcon("back.jpg");
		                  btn2 = new JButton("Back",icon2);
		                  btn2.setBounds(80,590,150,35);
		                  icon3 = new ImageIcon("reset.png");
		                  btn3 = new JButton("Reset",icon3);
		                  btn3.setBounds(230,590,150,35);
		                  icon4 = new ImageIcon("Up.png");
		                  btn4 = new JButton("Update",icon4);
		                  btn4.setBounds(380,590,150,35);


		                  btn1.setMnemonic(KeyEvent.VK_S);
		                  btn2.setMnemonic(KeyEvent.VK_B);
		                  btn3.setMnemonic(KeyEvent.VK_R);


		                  btn1.setBackground(Color.white);
						  btn1.setForeground(Color.BLACK);
						  btn2.setBackground(Color.white);
						  btn2.setForeground(Color.BLACK);
						  btn3.setBackground(Color.white);
						  btn3.setForeground(Color.BLACK);
						  btn4.setBackground(Color.white);
						  btn4.setForeground(Color.BLACK);


		                  add(lb2);	 add(lb1);
		                  add(tf1);	 add(btn1);
		   			   	  add(lbx1); add(lbx2);



		                  lb1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		                  lb2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,28));
		                  btn1.setFont(new Font("SERIF",Font.BOLD,20));
		   			   	  btn2.setFont(new Font("SERIF",Font.BOLD,20));
		   			   	  btn3.setFont(new Font("SERIF",Font.BOLD,20));
		   			   	  btn4.setFont(new Font("SERIF",Font.BOLD,18));
		   			      tf1.setFont(new Font("SERIF",Font.BOLD,20));

		   			       btn1.addActionListener(this);
		                   btn2.addActionListener(this);
		                   btn3.addActionListener(this);
		                   btn4.addActionListener(this);


		   				  ml2=new JLabel("Full Name");
		   				  ml2.setBounds(80,170,200,50);
		   				  ml3=new JLabel("Room Type",JLabel.LEFT);
		   				  ml3.setBounds(80,220,200,50);
		   				  ml4=new JLabel("Address",JLabel.LEFT);
		   				  ml4.setBounds(80,270,200,50);
		   				  ml5=new JLabel("Contact No",JLabel.LEFT);
		   				  ml5.setBounds(80,320,200,50);
		   				  ml6=new JLabel("Id",JLabel.LEFT);
		   				  ml6.setBounds(80,370,200,50);
		   				  ml7=new JLabel("Check In",JLabel.LEFT);
		   				  ml7.setBounds(80,420,200,50);
		   				  ml8=new JLabel("Check Out",JLabel.LEFT);
		   				  ml8.setBounds(80,470,200,50);
		   				  ml9=new JLabel("No of People",JLabel.LEFT);
		   				  ml9.setBounds(80,520,200,50);

		   				  mt11=new JTextField(20);
		   				  mt11.setBounds(260,170,300,45);
		   				  mt12=new JTextField(20);
		   				  mt12.setBounds(260,220,300,45);
		   				  mt13=new JTextField(20);
		   				  mt13.setBounds(260,270,300,45);
		   				  mt14=new JTextField(20);
		   				  mt14.setBounds(260,320,300,45);
		   				  mt15=new JTextField(20);
		   				  mt15.setBounds(260,370,300,45);
		   				  mt16=new JTextField(20);
		   				  mt16.setBounds(260,420,300,45);
		   				  mt17=new JTextField(20);
		   				  mt17.setBounds(260,470,300,45);
		   				  mt18=new JTextField(20);
		   				  mt18.setBounds(260,520,300,45);

		   				ml2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml6.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml7.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml8.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml9.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt11.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt12.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt13.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt14.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt15.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt16.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt17.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt18.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));


		   	setLayout(null);

		   	add(ml2);      add(mt11);
		   	add(ml3);      add(mt12);
		   	add(ml4);	   add(mt13);
		   	add(ml5);	   add(mt14);
		    add(ml6);	   add(mt15);
		    add(ml7);	   add(mt16);
		    add(ml8);	   add(mt17);
		    add(ml9);	   add(mt18);
		    add(btn2);	   add(btn3); add(btn4);


		    setSize(700,700);
		   	setVisible(true);
		   	setBackground(Color.pink);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



           }
           public void actionPerformed(ActionEvent e)
           {
			   if(e.getSource()==btn2)
			   {
			   			frame2 f1 = new frame2();
			   			dispose();
			   }
			   else if(e.getSource()==btn1)
           	   {
						Function f = new Function();
						ResultSet rs = null;


						rs = f.find(tf1.getText());
					try
					{
					  if(rs.next())
					  {
						mt11.setText(rs.getString("cust_name"));
						 mt12.setText(rs.getString("room_type"));
						  mt13.setText(rs.getString("addr"));
						   mt14.setText(rs.getString("contact_no"));
						   	mt15.setText(rs.getString("id"));
						   	 mt16.setText(rs.getString("cindatetime"));
						   	  mt17.setText(rs.getString("coutdatetime"));
						   	   mt18.setText(rs.getString("no_people"));


						   	   mt15.setEditable(false);

						   	/*    mt11.setEditable(false);
						   	     mt12.setEditable(false);
						   	      mt13.setEditable(false);
						   	       mt14.setEditable(false);

						   	         mt16.setEditable(false);
						   	          mt17.setEditable(false);
						   	           mt18.setEditable(false);*/
							}
					else
					{
						JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ROOM NO");
					}
				}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
				}
				else if(e.getSource()==btn3)
				{
				  tf1.setText("");
				  mt11.setText("");
				  mt12.setText("");
			  	  mt13.setText("");
				  mt14.setText("");
				  mt15.setText("");
				  mt16.setText("");
			  	  mt17.setText("");
				  mt18.setText("");
				}
				else if(e.getSource()==btn4)
								{
									Connection conn = null;
									Statement stmt = null;
									Statement stmt1 = null;
									try
									{
										Class.forName("org.postgresql.Driver");
										conn = DriverManager.getConnection("jdbc:postgresql://localhost/ashishdb","postgres","12345");
										stmt = conn.createStatement();
										stmt1 = conn.createStatement();
										stmt.executeUpdate("update hotel set cust_name='"+mt11.getText()+"',room_type='"+mt12.getText()+"',addr='"+mt13.getText()+"',contact_no='"+mt14.getText()+"',cindatetime='"+mt16.getText()+"',coutdatetime='"+mt17.getText()+"',no_people='"+mt18.getText()+"' where id ='"+mt15.getText()+"'");
										stmt1.executeUpdate("update hoteldb set cust_name='"+mt11.getText()+"',room_type='"+mt12.getText()+"',addr='"+mt13.getText()+"',contact_no='"+mt14.getText()+"',cindatetime='"+mt16.getText()+"',coutdatetime='"+mt17.getText()+"',no_people='"+mt18.getText()+"' where id ='"+mt15.getText()+"'");
										JOptionPane.showMessageDialog(null,"Updated Successfully");
									}
									catch(Exception exc)
									{
										System.out.println(exc);
									}
								}
	       }

	       public class Function
	       {
				Connection conn = null;
				ResultSet rs = null;
				PreparedStatement ps = null;
				public ResultSet find(String s)
				{
					try
				  	 {
						Class.forName("org.postgresql.Driver");
						conn = DriverManager.getConnection("jdbc:postgresql://localhost/ashishdb","postgres","12345");
						ps = conn.prepareStatement("select * from hotel where room_no = ?");
						ps.setString(1,s);
           				rs = ps.executeQuery();
					 }
					 catch(Exception ex)
					 {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					 }
					 return rs;
				}
			}

           public static void main(String args[])
        	{
        	 search s = new search();
        	}
       }

