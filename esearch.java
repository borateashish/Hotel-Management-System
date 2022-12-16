import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
      public class esearch extends JFrame implements ActionListener
       {
           JLabel lbx1,lbx2,lb1,lb2,lb3,ml2,ml3,ml4,ml5,ml6,ml7,ml8,ml9;
           JTextField tf1,mt11,mt12,mt13,mt14,mt15,mt16,mt17,mt18;
           JButton btn1,btn2,btn3,btn4;
           JPanel pn1,pn2,pn3;
           Icon icon1,icon2,icon3,icon4;

           public esearch()
           {
		                  lb2 = new JLabel("Employe Search",JLabel.CENTER);
		   			   	  lb2.setBounds(170,30,300,50);
		                  lb1 = new JLabel("Employe Id  ");
		                  lb1.setBounds(20,100,400,30);
		                  tf1 = new JTextField(20);
		                  tf1.setBounds(170,100,200,30);
		                  icon1 = new ImageIcon("search.jpg");
		                  btn1 = new JButton("Search",icon1);
		                  btn1.setBounds(400,100,140,28);
		                  lbx1 = new JLabel("_________________________________________________________");
		                  lbx1.setBounds(0,120,400,50);
		                  lbx2 = new JLabel("___________________________________________________________________");
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

		                  btn1.setBackground(Color.white);
						  btn1.setForeground(Color.BLACK);
						  btn2.setBackground(Color.white);
						  btn2.setForeground(Color.BLACK);
						  btn3.setBackground(Color.white);
						  btn3.setForeground(Color.BLACK);
						  btn4.setBackground(Color.white);
    					  btn4.setForeground(Color.BLACK);


		                  btn1.setMnemonic(KeyEvent.VK_S);
		                  btn2.setMnemonic(KeyEvent.VK_B);
		                  btn3.setMnemonic(KeyEvent.VK_R);

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


		   				  ml2=new JLabel("Employe Name");
		   				  ml2.setBounds(40,220,200,50);
		   				  ml3=new JLabel("Address",JLabel.LEFT);
		   				  ml3.setBounds(40,330,200,50);
		   				  ml4=new JLabel("Contact No",JLabel.LEFT);
		   				  ml4.setBounds(40,440,200,50);


		   				  mt11=new JTextField(20);
		   				  mt11.setBounds(230,220,300,45);
		   				  mt12=new JTextField(20);
		   				  mt12.setBounds(230,330,300,45);
		   				  mt13=new JTextField(20);
		   				  mt13.setBounds(230,440,300,45);


		   				ml2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				ml4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));

		   				mt11.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt12.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		   				mt13.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));



		   	setLayout(null);

		   	add(ml2);      add(mt11);
		   	add(ml3);      add(mt12);
		   	add(ml4);	   add(mt13);
		    add(btn2);	   add(btn3);
		    add(btn4);

		    setSize(600,700);
		   	setVisible(true);
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


				rs = f.find(Integer.parseInt(tf1.getText()));
				try
				{
					if(rs.next())
					{
						mt11.setText(rs.getString("enm"));
						 mt12.setText(rs.getString("addr"));
						  mt13.setText(rs.getString("cno"));



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
				else if(e.getSource()==btn3)
				{
				  tf1.setText("");
				  mt11.setText("");
				  mt12.setText("");
			  	  mt13.setText("");

				}
				else if(e.getSource()==btn4)
								{
									Connection conn = null;
									Statement stmt = null;
									try
									{
										Class.forName("org.postgresql.Driver");
										conn = DriverManager.getConnection("jdbc:postgresql://localhost/ashishdb","postgres","12345");
										stmt = conn.createStatement();
										stmt.executeUpdate("update employe set enm='"+mt11.getText()+"',addr='"+mt12.getText()+"',cno='"+mt13.getText()+"' where eid="+Integer.parseInt(tf1.getText()));
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
				public ResultSet find(int s)
				{
					try
				  	 {
						Class.forName("org.postgresql.Driver");
						conn = DriverManager.getConnection("jdbc:postgresql://localhost/ashishdb","postgres","12345");
						ps = conn.prepareStatement("select * from employe where eid = ?");
						ps.setInt(1,s);
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
        	 esearch s = new esearch();
        	}
       }

