import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JTextArea;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
      public class bill extends JFrame implements ActionListener
       {
       		JLabel lbx1,lbx2,lb1,lb2,lb3,ml2,ml3,ml4,ml5,ml6,ml7,ml8,ml9;
	        JTextField tf1,mt11,mt12,mt13,mt14,mt15,mt16,mt17,mt18;

	        private JTextArea textArea;
	        JButton btn1,btn2,btn3,btn4;
	        public String name, roomt, add, cin, cout, id, cno;
	        public int nop;
	        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
	        Date cdate=new Date();
	        String c_date=dateFormat.format(cdate);
	        Date date1,date2;
	        public float t;


       	 	Icon icon1,icon2,icon3,icon4;

       		 bill()
		           {
				  		lb2 = new JLabel("Bill Generation",JLabel.CENTER);
				  		lb2.setBounds(170,30,250,50);
				  		lb1 = new JLabel("Room Number  ");
				  		lb1.setBounds(20,100,400,30);
						tf1 = new JTextField(20);
		        	  	        tf1.setBounds(200,100,200,30);
		        	  	        icon1 = new ImageIcon("search.png");
				      		btn1 = new JButton("Bill",icon1);
				  		btn1.setBounds(400,100,125,30);
				  		lbx1 = new JLabel("_________________________________________________________");
						lbx1.setBounds(0,120,400,50);
			  			lbx2 = new JLabel("___________________________________________________________________");
			  			lbx2.setBounds(120,120,800,50);
			  			icon2 = new ImageIcon("back.jpg");
	                        		btn2 = new JButton("Back",icon2);
				  		btn2.setBounds(60,590,150,35);
				  		icon3 = new ImageIcon("reset.png");
						btn3 = new JButton("Reset",icon3);
			  			btn3.setBounds(210,590,150,35);
			  			icon4 = new ImageIcon("room.png");
			  			btn4 = new JButton("Check Out",icon4);
		                    		btn4.setBounds(360,590,160,35);

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
			  			add(lbx1); 	 add(lbx2);
			  			add(btn1);       add(btn2);
			  			add(btn3);	 add(btn4);


				  		lb1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
  		                  		lb2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,28));
  		                  		btn1.setFont(new Font("SERIF",Font.BOLD,20));
				  		btn2.setFont(new Font("SERIF",Font.BOLD,15));
				   	        btn3.setFont(new Font("SERIF",Font.BOLD,15));
				  		btn4.setFont(new Font("SERIF",Font.BOLD,15));
       			                        tf1.setFont(new Font("SERIF",Font.BOLD,20));


       			                        textArea = new JTextArea();
						textArea.setBounds(60, 160, 450, 420);
						add(textArea);


						   btn1.addActionListener(this);
						   btn2.addActionListener(this);
						   btn3.addActionListener(this);
				                   btn4.addActionListener(this);

      			          		setLayout(null);
       			          		setSize(600,700);
						setVisible(true);
		    			  	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			public int check(String s)
   			{
					int a;
					if(s.equals("AC-2000"))
						a=2000;
					else
						a=1500;
					return a;

                         }

			 public void actionPerformed(ActionEvent e)
	                 {

					 			if(e.getSource()==btn1)
					 			{
									Function f = new Function();
									ResultSet rs = null;

									rs = f.find(tf1.getText());
									try
									{
										if(rs.next())
										{
											     name =  rs.getString("cust_name");
												 roomt = rs.getString("room_type");
												 add =   rs.getString("addr");
												 cno =   rs.getString("contact_no");
												 cin =   rs.getString("cindatetime");
												 cout =  rs.getString("coutdatetime");
												 nop =   rs.getInt("no_people");
												 id = rs.getString("id");
												 int days = rs.getInt("days");
												 int price=check(roomt);
												 int total=price*days;
												 float gst=(total*6)/100;
												 t = total+gst;




											textArea.setText("                             \n\n");
											textArea.setText("\n\n            **************************************************************************\n");
								   			textArea.setText(textArea.getText()+"                            ******               YOUR BILL RECEIPT           ******\n");
	  							    		textArea.setText(textArea.getText()+"            *************************************************************************\n\n");
								            textArea.setText(textArea.getText()+"             DATE        : "+c_date+"\n\n");
 								    		textArea.setText(textArea.getText()+"             NAME             :    "+name+"\n\n");
								    		//textArea.setText(textArea.getText()+"             ADDRESS       :    "+add+"\n\n");
				 				    		textArea.setText(textArea.getText()+"             PHONE NUM   :    "+cno+"\n\n");
											textArea.setText(textArea.getText()+"             ROOM TYPE       : "+roomt+"\n\n");
											textArea.setText(textArea.getText()+"             Rate       : "+price+"\n\n");
											textArea.setText(textArea.getText()+"             Check In time      : "+cin+"\n\n");
											//textArea.setText(textArea.getText()+"             Check out Time      : "+cout+"\n\n");
											textArea.setText(textArea.getText()+"             NO OF PEOPLE  : "+nop+"\n\n");
								    		textArea.setText(textArea.getText()+"              AMOUNT  : "+total+"               GST  "+gst+"\n\n");
								    		textArea.setText(textArea.getText()+"              Total Bill   : "+t+"\n\n");
								   			textArea.setText(textArea.getText()+"                                ******               VISIT AGAIN         ******\n");

											textArea.setEditable(false);

										}
										else
										{
												JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
										}
									}
									catch(Exception ex)
									{
											JOptionPane.showMessageDialog(null, ex.getMessage());
									}




								}


								else if(e.getSource()==btn2)
								{
									frame2 f = new frame2();
									dispose();
								}


				   				else if(e.getSource()==btn3)
				   				{
									tf1.setText("");
									textArea.setText("");


				   				}


				   				else if(e.getSource()==btn4)
				   				{
									Connection conn = null;
									Statement stmt = null;
									Statement stmt1 = null;
									Statement stmt2 = null;
									PreparedStatement ps1=null;
									try
									{
										Class.forName("org.postgresql.Driver");
										conn = DriverManager.getConnection("jdbc:postgresql://localhost/ashishdb","postgres","12345");
										stmt = conn.createStatement();
										stmt1 =conn.createStatement();
										stmt2 =conn.createStatement();
										ps1= conn.prepareStatement("insert into bill(c_name,bill) values(?,?)");
										ps1.setString(1,name);	ps1.setFloat(2,t);
										ps1.executeUpdate();
										stmt.executeUpdate("delete from hotel where room_no='"+tf1.getText()+"'");
										stmt1.executeUpdate("update hoteldb set billno =(select max(billno) from bill) where id='"+id+"'");
										JOptionPane.showMessageDialog(null,"Check Out Successfully");
										tf1.setText("");
										textArea.setText("");
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
					   bill b = new bill();
			   }
		}


























