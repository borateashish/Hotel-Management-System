import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class help extends JFrame
{

	help()
	{
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1, 1, 727, 727);
		add(textArea);


		textArea.setText("1) Room Details\na) Room Details is used to fill Customer Information \nb) Contact no should be 10 digits only\nc) First check availability of room and then assign the room\nd) No of pople should not more than three\ne) Id no should be unique for each customer\nf) All the details should be filled\n\n\n2) Employe Dettails \na) Employe details are used to fill Employe Information\nb) Contact no should be 10 digit and employe id should be unique for each employe\n\n\n3) Customer Search\na) Customer Search is used to search the details of customer using room no\nb) We can update details of customer which we whant except customer id\n\n\n4) Employe Search\na) Employe Search is used to search the details of customer using employe id\nb) We can update details of Employe\n\n\n5) Bill\na) Here we create a bill of customer\nb) Check out button is used check out the customer when payment is done\n\n\n6) View Details\na) Information about occupied room is in Room Details\nb) Information of Customers is permenantly stored in P_data\nc) Information of Employe is in Employe Details");

		textArea.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,15));




		setLayout(null);
	        setSize(730,730);
         	setVisible(true);
	}


	public static void main(String args[])
	{

		help h = new help();

	}
}
