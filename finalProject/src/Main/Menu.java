package Main;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;


public class Menu extends JFrame implements ItemListener,ActionListener
{
	JCheckBox a1= new JCheckBox("Beef Patty ($5.00)");
	JCheckBox a2= new JCheckBox("Vegi Patty ($4.00)");

	JCheckBox b1=new JCheckBox("Cheese ");
	JCheckBox b2=new JCheckBox("Pickles ");
	JCheckBox b3=new JCheckBox("Lettuce ");
	JCheckBox b4=new JCheckBox("Ketchup ");
	JCheckBox b5=new JCheckBox("Mustard ");

	JCheckBox c1=new JCheckBox("Extra Cheese (+$0.50)");
	JCheckBox c2=new JCheckBox("Extra Pickles (+$0.50)");
	JCheckBox c3=new JCheckBox("Extra Lettuce (+$0.25)");
	JCheckBox c4=new JCheckBox("Extra Ketchup (Free) ");
	JCheckBox c5=new JCheckBox("Extra Mustard (Free)");

	JCheckBox d1=new JCheckBox("Small ($5.00)");
	JCheckBox d2=new JCheckBox("Meduim ($10.00)");
	JCheckBox d3=new JCheckBox("Large ($20.00)");
	
	JCheckBox d1_2=new JCheckBox("Regula Hand Toss ");
	JCheckBox d2_2=new JCheckBox("Thin Crust ");
	JCheckBox d3_2=new JCheckBox("Deep Dish (+$1.00)");
	
	JCheckBox e1=new JCheckBox("Cheese ONLY ");
	JCheckBox e2=new JCheckBox("Pepperoni ");
	JCheckBox e3=new JCheckBox("Sausage ");
	JCheckBox e4=new JCheckBox("Mushroom ");
	JCheckBox e5=new JCheckBox("Olives ");
	JCheckBox e6=new JCheckBox("Onion ");

	JCheckBox f1=new JCheckBox("Slice of Apple Pie ($2.00)");
	JCheckBox f2=new JCheckBox("Slice of Blueberry Pie ($2.00)");
	JCheckBox f3=new JCheckBox("Vanila Icecream Cone ($1.50)");
	JCheckBox f4=new JCheckBox("Chocolate Icecream Cone ($1.50)");
	
	JCheckBox h1=new JCheckBox("Pepsi");
	JCheckBox h2=new JCheckBox("Mt Dew");
	JCheckBox h3=new JCheckBox("Root beer ");
	JCheckBox h4=new JCheckBox("Fresh Lemonade ");
	JCheckBox h5=new JCheckBox("Water ($1.00)");

	JPanel panel= new JPanel();
	JPanel panel2= new JPanel();
	JPanel panel3= new JPanel();
	JPanel panel4= new JPanel();
	JPanel panel5= new JPanel();
	JPanel panel6= new JPanel();
	JPanel panel7= new JPanel();
	JPanel panel8= new JPanel();
	JPanel panel9= new JPanel();
	JPanel panel10= new JPanel();
	
	JLabel g1=new JLabel("Burger Types:                                " + "       " + "\n");
	JLabel g2=new JLabel("Topping: (First toppings are FREE)           " + "       " + "\n");
	JLabel g3=new JLabel("Extras:                                      " + "       " + "\n");
	JLabel g4=new JLabel("Pizza Sizes:"+"\n");
	JLabel g5=new JLabel("Pizza Crust:"+"\n");
	JLabel g6=new JLabel("Pizza Toppings: (Cheese FREE, others +$1.00)"+"\n");
	JLabel g7=new JLabel("Desserts: " + "\n");
	JLabel g8=new JLabel("Drinks: ($2.00 each)"+"\n");

	JButton btn=new JButton("Your TOTAL");
	JButton btn2=new JButton("Finish Order");
	JTextArea txtArea= new JTextArea();

	JScrollPane	scroll = new JScrollPane(txtArea);
	JTextField priceTxtFeild=new JTextField(10);

	public Menu() 
	{
		setTitle("CSCI1082 Food Truck");
	

		add(panel);
		add(new JLabel("Welcome to CSCI1082 Food Truck"));

		
		add(new JLabel(" "));
		add(new JLabel("BURGERS "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(panel2);//burger meat
		panel2.add(g1);
		panel2.add(a1);
		panel2.add(a2);

		add(panel3);//burger toppings
		panel3.add(g2);
		panel3.add(b1);
		panel3.add(b2);
		panel3.add(b3);
		panel3.add(b4);
		panel3.add(b5);
		
		add(panel4);//topping extras
		panel4.add(g3);
		panel4.add(c1);
		panel4.add(c2);
		panel4.add(c3);
		panel4.add(c4);
		panel4.add(c5);
		
		
		add(new JLabel("Pizzas"));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(panel5); //pizza sizes
		panel5.add(g4);
		panel5.add(d1);
		panel5.add(d2);
		panel5.add(d3);
		
		add(panel9); //pizza crust
		panel9.add(g5);
		panel9.add(d1_2);
		panel9.add(d2_2);
		panel9.add(d3_2);

		add(panel6); //pizza toppings
		panel6.add(g6);
		panel6.add(e1);
		panel6.add(e2);
		panel6.add(e3);
		panel6.add(e4);
		panel6.add(e5);
		panel6.add(e6);

		
		add(panel7); //deserts
		panel7.add(g7);
		panel7.add(f1);
		panel7.add(f2);
		panel7.add(f3);
		panel7.add(f4);
	
		
		add(panel10); //drinks
		panel10.add(g8);
		panel10.add(h1);
		panel10.add(h2);
		panel10.add(h3);
		panel10.add(h4);
		panel10.add(h5);


		a1.addItemListener(this);
		a2.addItemListener(this);
		
		b1.addItemListener(this);
		b2.addItemListener(this);
		b3.addItemListener(this);
		b4.addItemListener(this);
		b5.addItemListener(this);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);

		d1.addItemListener(this);
		d2.addItemListener(this);
		d3.addItemListener(this);
		
		d1_2.addItemListener(this);
		d2_2.addItemListener(this);
		d3_2.addItemListener(this);

		e1.addItemListener(this);
		e2.addItemListener(this);
		e3.addItemListener(this);
		e4.addItemListener(this);
		e5.addItemListener(this);
		e6.addItemListener(this);

		f1.addItemListener(this);
		f2.addItemListener(this);
		f3.addItemListener(this);
		f4.addItemListener(this);

		
		h1.addItemListener(this);
		h2.addItemListener(this);
		h3.addItemListener(this);
		h4.addItemListener(this);
		h5.addItemListener(this);
		
		btn.addActionListener(this);		
		btn2.addActionListener(this);	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		getContentPane().setLayout(new FlowLayout());
		setLayout(new GridLayout(7, 1));
		
		txtArea.setText("Your list of Selected items"+"\n");
		add(scroll);
		add(new JLabel(" "));
		
		
		add(panel8);
		panel8.add(btn);
		add(priceTxtFeild);
		panel8.add(btn2);
	}



	public void actionPerformed(ActionEvent e) {
		cost costN = new cost();
		costN.actionPerformed(e);
	}


	public void itemStateChanged(ItemEvent e) {
		unCheckList unCheckListN = new unCheckList();
		unCheckListN.itemStateChanged(e);
	}
	
	
}
			