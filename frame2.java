import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class frame2 extends JFrame implements ActionListener, MouseListener
{
    JMenu menu1,menu2,menu3,menu4,menu5,menu6;
    JMenuItem i1, i2, i3,i4,i5,i6;
    ImageIcon img1,icon1;
    JLabel bg;
    JPanel p1;
    JButton btn1;

    frame2()
    {



        setLocation(100,70);
        setResizable(false);
        JMenuBar mb=new JMenuBar();
        menu1=new JMenu("ROOM DETAILS  ");
        menu2=new JMenu("  SEARCH & UPDATE  ");
        i4=new JMenuItem("ROOM");
        i5=new JMenuItem("EMPLOYE");
        menu3=new JMenu("  EMPLOYE DETAILS  ");
        menu4=new JMenu("    BILL    ");
        menu5=new JMenu("  VIEW DETAILS  ");
        i1=new JMenuItem("ROOM");
        i2=new JMenuItem("EMPLOYE");
        i3=new JMenuItem("P_DATA");
	i6=new JMenuItem("Bill");

         menu5.add(i1);
         menu5.add(i2);
         menu5.add(i3);
	 menu5.add(i6);

         menu2.add(i4);
         menu2.add(i5);






         img1 = new ImageIcon("menu1.jpg");
		 bg = new JLabel("",img1,JLabel.CENTER);
		 bg.setSize(1100,800);
		 add(bg);
		 icon1 = new ImageIcon("help.jpg");
		 btn1 = new JButton("",icon1);
		 btn1.setBounds(1060,3,30,30);
		 p1 = new JPanel();
		 p1.setBackground(new Color(0,0,0,100)); //first 3 zeros represents black colour and 85 means 85% our img will be displayed.
		 p1.setBounds(1060,3,30,30);
		 p1.add(btn1);
		 bg.add(p1);







         mb.add(menu1);
         mb.add(menu3);
         mb.add(menu2);
         mb.add(menu4);
         mb.add(menu5);
         add(btn1);
         btn1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
         menu1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
         menu2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
         menu3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
         menu4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
         menu5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
	 i1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
         i2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
         i3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
         i4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
         i5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
	 i6.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));



         menu1.addMouseListener(this);
         menu3.addMouseListener(this);
         menu4.addMouseListener(this);
         i1.addActionListener(this);
         i2.addActionListener(this);
         i3.addActionListener(this);
         i4.addActionListener(this);
         i5.addActionListener(this);
	 i6.addActionListener(this);
         btn1.addActionListener(this);
         setLayout(null);
         setJMenuBar(mb);
         setSize(1100,700);
         setVisible(true);

    }


    public void mouseClicked(MouseEvent e)
    {
		if(e.getSource()==menu1)
		    {


				 hotelapp hp =new hotelapp();
				 dispose();



			}



		else if(e.getSource()==menu3)
			{
				 employe e1 =new employe();
				 dispose();

			}

		else if(e.getSource()==menu4)
			{
				 bill b = new bill();
				 dispose();
			}

		else if(e.getSource()==i1)
			{
				 alldata ad = new alldata();
				 dispose();
			}
	}



	public void mouseEntered(MouseEvent e)
	{
	}


	public void mouseExited(MouseEvent e)
	{
	}

	public void mousePressed(MouseEvent e)
	{
	}

	public void mouseReleased(MouseEvent e)
	{
	}


	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i1)
				    {
						 alldata ad = new alldata();
						 dispose();


					}
		else if(e.getSource()==i2)
					{
						 empdata ed = new empdata();
						 dispose();


					}
		else if(e.getSource()==i3)
					{
						 pdata ad = new pdata();
						 dispose();
					}

		else if(e.getSource()==i4)
					{
						 search s = new search();
						 dispose();
					}
		else if(e.getSource()==i5)
					{
						 esearch s = new esearch();
						 dispose();
					}
		else if(e.getSource()==i6)
					{
						 bdata b = new bdata();
						 dispose();
					}
		else if(e.getSource()==btn1)
					{
						 help h = new help();

					}
	}















    public static void main(String args[])
    {
        frame2 f = new frame2();
    }
}
