package Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import FoodList.burger;
import FoodList.dessert;
import FoodList.drinks;
import FoodList.pizza;

public void actionPerformed(ActionEvent e)
{
	Object source = e.getSource();
	double s1=0;
	if (source==btn)
	{
		//buger pattys
		if(a1.isSelected()){
			s1+=5.00;
		}
		if(a2.isSelected()){
			s1+=4.00;
		}
		
		//extra burger toppings
		if(c1.isSelected()) {//cheese
			s1+=0.50;
		}
		if(c2.isSelected()){//pickles
			s1+=0.50;
		}
		if(c3.isSelected()){//lettuce
			s1+=0.25;
		}
		
		//pizza sizes
		if(d1.isSelected()){//small
			s1+=5.00;
		}
		if(d2.isSelected()){//meduim
			s1+=10.00;
		}
		if(d3.isSelected()){//large
			s1+=20.00;
		}
		//crust
		if(d3_2.isSelected()){//deep dish
			s1+=1.00;
		}

		//pizza toppings
		if(e2.isSelected()){//pepperoni
			s1+=1.00;
		}
		if(e3.isSelected()){//sasuage
			s1+=1.00;
		}
		if(e4.isSelected()){//mushroom
			s1+=1.00;
		}
		if(e5.isSelected()){//olives
			s1+=1.00;
		}
		if(e6.isSelected()){//onion
			s1+=1.00;
		}
		
		//desserts
		if(f1.isSelected()){//apple pie
			s1+=2.00;
		}
		if(f2.isSelected()){//blueberry pie
			s1+=2.00;
		}
		if(f3.isSelected()){//van icecream
			s1+=1.50;
		}
		if(f4.isSelected()){//chocolate icecream
			s1+=1.50;
		}

		
		//Drink Prices
		if(h1.isSelected()){//pepsi
			s1+=2.00;
		}
		if(h2.isSelected()){//mt dew
			s1+=2.00;
		}
		if(h3.isSelected()){//root beer
			s1+=2.00;
		}
		if(h4.isSelected()){//fresh lemonade
			s1+=2.00;
		}
		if(h5.isSelected()){//water
			s1+=1.00;
		}
		
		DecimalFormat display=new DecimalFormat("###.00");
		priceTxtFeild.setText("Total is "+display.format(s1));
		
	}
	else if (source==btn2) 
	{
		JOptionPane.showMessageDialog(null,"Thank You");
		System.exit(0);
	}
	
}