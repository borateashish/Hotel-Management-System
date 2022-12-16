 import java.util.*;
 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;;
public class service implements ItemListener,ActionListener
{

		JCheckBox c1,c2,c3,c4;
		JTextField t1,t2,t3,t4,t5;
		JLabel l;
		JButton b1,b2,b3;
		JFrame f;


     	service()
     	{
        JFrame f= new JFrame("Service");

        l= new JLabel("Services");

        c1= new JCheckBox("Break Fast");
        c2= new JCheckBox("Lunch");
        c3= new JCheckBox("Dinner");
        c4= new JCheckBox("Laundary");

        t1= new JTextField(10);
        t2= new JTextField(10);
        t3= new JTextField(10);
        t4= new JTextField(10);
        t5= new JTextField(10);

        b1=new JButton("Total");
        b2=new JButton("Submit");
        b3=new JButton("Back");




		l.setBounds(300,30, 130,50);

        c1.setBounds(40,100, 130,50);
        c2.setBounds(40,180, 130,50);
        c3.setBounds(40,260, 130,50);
        c4.setBounds(40,340, 130,50);

        t1.setBounds(200,110, 130,30);
		t2.setBounds(200,190, 130,30);
		t3.setBounds(200,270, 130,30);
        t4.setBounds(200,350, 130,30);
        t5.setBounds(200,410, 130,30);

        b1.setBounds(40,410, 130,30);
        b2.setBounds(40,470, 130,30);
        b3.setBounds(200,470, 130,30);


		l.setFont(new Font("SERIF",Font.BOLD,20));

        c1.setFont(new Font("SERIF",Font.BOLD,18));
        c2.setFont(new Font("SERIF",Font.BOLD,18));
        c3.setFont(new Font("SERIF",Font.BOLD,18));
        c4.setFont(new Font("SERIF",Font.BOLD,18));

        b1.setFont(new Font("SERIF",Font.BOLD,18));
        b2.setFont(new Font("SERIF",Font.BOLD,18));
        b3.setFont(new Font("SERIF",Font.BOLD,18));



        f.add(l);

        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);

        f.add(b1);
        f.add(b2);
        f.add(b3);


        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        f.setSize(700,600);
        f.setLayout(null);
        f.setVisible(true);
        }

      public void itemStateChanged(ItemEvent obj)
	  {
	       if(c1.isSelected())
	       {
			   	t1.setText(String.valueOf(200));
           }
           else
           {
              	String msg = ("");
              	t1.setText(msg);
           }

           if(c2.isSelected())
   	       {
   			   	t2.setText(String.valueOf(300));
           }
           else
           {
              	String msg = ("");
              	t2.setText(msg);
           }

           if(c3.isSelected())
   	       {
		   	   	t3.setText(String.valueOf(400));
           }
           else
		   {
		       	String msg = ("");
		     	t3.setText(msg);
           }

           if(c4.isSelected())
		   	{
		   	   	t4.setText(String.valueOf(100));
            }
           else
           {
           	String msg = ("");
           	t4.setText(msg);
           }
   	  }


   	  public void actionPerformed(ActionEvent obj)
	  {
	  	if(obj.getSource()==b1)
	  	{
			String a = t1.getText();
			String b = t2.getText();
			String c = t3.getText();
			String d = t4.getText();


				int t=Integer.parseInt(c)+Integer.parseInt(d);


	  		t5.setText(String.valueOf(t));
		}

		else if(obj.getSource()==b2)
		{
		}

		else if(obj.getSource()==b3)
		{
			hotelapp hp =new hotelapp();
			f.dispose();
		}
      }

	public static void main(String args[])
    {
    new service();
    }
}