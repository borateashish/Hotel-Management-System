import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 public class log extends JFrame implements ActionListener
{

    JButton bt1,b2;
    JFrame f;
    JLabel l1,l2;
    JTextField at1,at2;
    ImageIcon img1;
    log()
    {

        l1=new JLabel("ADMIN");
	l1.setBounds(670,235,160,50);        
	
	at1 = new JTextField(20);
        at1.setBounds(820,230,150,45);

        l2=new JLabel("PASSWORD");
        l2.setBounds(670,285,160,50);

        at2 = new JPasswordField();
        at2.setBounds(820,280,150,45);

        bt1 = new JButton("Login");
	bt1.setBounds(700,350,150,40);
	bt1.setMnemonic(KeyEvent.VK_L);
	bt1.setBackground(Color.white);
	bt1.setForeground(Color.BLACK);


        img1=new ImageIcon("room.jpg");
        JLabel id=new JLabel("",img1,JLabel.CENTER);
        id.setBounds(50,130,568,377);

         add(l1);
         add(l2);
         add(at1);
         add(at2);
         add(bt1);
         add(id);

         bt1.addActionListener(this);

         l1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
         l2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
  	 at1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
	 at2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
	 bt1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));

          setLayout(null);
          setSize(1100,700);
          setVisible(true);

    }
   public void actionPerformed(ActionEvent e)
    {
		if(e.getSource()==bt1)
		{
								String unm = at1.getText();;
								String pwd = at2.getText();;
								if(pwd.length()==0 && unm.length()==0)
								{
										JFrame fr2 = new JFrame("Warning");
										JOptionPane.showMessageDialog(fr2,"Enter Username Password");
								}
								else if(unm.length()==0)
								{
										JFrame fr2 = new JFrame("Warning");
										JOptionPane.showMessageDialog(fr2,"Enter User Name");
								}
								else if(pwd.length()==0)
								{
										JFrame fr2 = new JFrame("Warning");
										JOptionPane.showMessageDialog(fr2,"Enter Password");
								}


								else
								{
								if((unm.equals("Rohit") && pwd.equals("Rohit123"))||(unm.equals("Ashish") && pwd.equals("Ashish123")))
								{

									frame2 f1 = new frame2();
									dispose();

								}

								else
								{
									JOptionPane.showMessageDialog(null, "Please Enter Correct Username and Password");
									at1.setText("");
									at2.setText("");
								}
								}
		}
    }


   public static void main(String[] args)
   {
        log l=new log();
   }

}
