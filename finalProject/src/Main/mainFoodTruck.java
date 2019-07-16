package Main;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

//import Main.Menu;


public class mainFoodTruck {

	
	
	public static void main(String[] args) 

	{
		final int WIDTH=1000;
		final int HEIGHT=1600;

		Menu FoodTruckFrame=new Menu();
		FoodTruckFrame.setSize(WIDTH,HEIGHT);
		FoodTruckFrame.setVisible(true);
		
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
