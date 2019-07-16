package Main;
import java.awt.event.ItemEvent;

public class unCheckList extends Menu{

	public void itemStateChanged(ItemEvent e)
	{
		Object source=e.getSource();
		int select=e.getStateChange();
		
		
		//BURGER
		if(source==a1){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Beef Patty"+"\n");
			else 
			txtArea.append("Beef Patty DELETED"+"\n");
		}
		else if(source==a2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Vegi Patty"+"\n");
			else 
			txtArea.append("Vegi Patty DELETED"+"\n");
		}
		else if(source==b1){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Cheese"+"\n");
			else 
			txtArea.append("Cheese DELETED"+"\n");
		}
		else if(source==b2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Pickles"+"\n");
			else 
			txtArea.append("Pickles DELETED"+"\n");
		}
		else if(source==b3){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Lettuce"+"\n");
			else 
			txtArea.append("Lettuce DELETED"+"\n");
		}
		else if(source==b4){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Ketchup"+"\n");
			else 
			txtArea.append("Ketchup DELETED"+"\n");
		}
		else if(source==b5){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Mustard"+"\n");
			else 
			txtArea.append("Mustard DELETED"+"\n");
		}

		else if(source==c1){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Cheese"+"\n");
			else 
			txtArea.append("Extra Cheese DELETED"+"\n");
		}
		else if(source==c2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Pickles"+"\n");
			else 
			txtArea.append("Extra Pickles DELETED"+"\n");
		}
		else if(source==c3){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Lettuce"+"\n");
			else 
			txtArea.append("Extra Lettuce DELETED"+"\n");
		}
		else if(source==c4){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Ketchup"+"\n");
			else 
			txtArea.append("Extra Ketchup DELETED"+"\n");
		}
		else if(source==c5){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Mustard"+"\n");
			else 
			txtArea.append("Extra Mustard DELETED"+"\n");
		}
		
		
		//PIZZA
		else if(source==d1){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Small Pizza"+"\n");
			else 
			txtArea.append("Small Pizza is de-selected"+"\n");
		}
		else if(source==d2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Meduim pizza"+"\n");
			else 
			txtArea.append("Meduim pizza is de-selected"+"\n");
		}
		else if(source==d3){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Large Pizza"+"\n");
			else 
			txtArea.append("Large Pizza is de-selected"+"\n");
		}
		else if(source==d1_2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Regular Hand Toss Crust"+"\n");
			else 
			txtArea.append("Regular Hand Toss Crust DELETED"+"\n");
		}
		else if(source==d2_2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Thin Crust"+"\n");
			else 
			txtArea.append("Thin Crust DELETED"+"\n");
		}
		else if(source==d3_2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Deep Dish"+"\n");
			else 
			txtArea.append("Deep Dish DELETED"+"\n");
		}
		else if(source==e1){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Cheese ONLY" +"\n");
			else 
			txtArea.append("Cheese ONLY DELETED"+"\n");
		}
		else if(source==e2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Pepperoni"+"\n");
			else 
			txtArea.append("Pepperoni DELETED"+"\n");
		}
		else if(source==e3){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Sausage"+"\n");
			else 
			txtArea.append("Sausage DELETED"+"\n");
		}
		else if(source==e4){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Mushroom"+"\n");
			else 
			txtArea.append("Mushroom DELETED"+"\n");
		}
		else if(source==e5){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Olives"+"\n");
			else
			txtArea.append("Olives DELETED"+"\n");
		}
		else if(source==e6){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Onion"+"\n");
			else
			txtArea.append("Onion DELETED"+"\n");
		}
		
		
		
		//Desert
		else if(source==f1){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Slice of Apple Pie"+"\n");
			else
			txtArea.append("Slice of Apple Pie DELETED"+"\n");
		}
		else if(source==f2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Slice of Blueberry Pie"+"\n");
			else
			txtArea.append("Slice of Blueberry Pie DELETED"+"\n");
		}
		else if(source==f3){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Vanila Icecream Cone"+"\n");
			else 
			txtArea.append("Vanila Icecream Cone DELETED"+"\n");
		}
		else if(source==f4){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Chocolate Icecream Cone"+"\n");
			else 
			txtArea.append("Chocolate Icecream DELETED"+"\n");
		}

		//Drinks
		else if(source==h1){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Pepsi"+"\n");
			else
			txtArea.append("Pepsi DELETED"+"\n");
		}
		else if(source==h2){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Mt Dew"+"\n");
			else
			txtArea.append("Mt Dew DELETED"+"\n");
		}
		else if(source==h3){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Root Beer"+"\n");
			else 
			txtArea.append("Root Beer DELETED"+"\n");
		}
		else if(source==h4){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Fresh Lemonade" +"\n");
			else 
			txtArea.append("Fresh Lemonade DELETED"+"\n");
		}
		else if(source==h5){
			if(select==ItemEvent.SELECTED)
			txtArea.append("Water"+"\n");
			else 
			txtArea.append("Water DELETED"+"\n");
		}
	}	

}
