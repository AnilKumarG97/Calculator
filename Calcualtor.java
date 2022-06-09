import java.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionLister
{
   JFrame frame;
   JTextField textField;
   JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
	JButton addButton,subButton,didButton,mulButton;
	JButton decButton,equButton,delButton,clrButton;
	JPanel panel;

	Font myFont = new Font("INk Free",Font.BOLD,30);

	double num1=0,num2=0,result=0;
	char operator;


	Calculator()
	{
		frame = new JFRame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);



		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
	}
	@override 
		public void ActionLister(ActionEvent e)
	{
		//too auto-gented method
	}
}