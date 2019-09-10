import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author User
 *
 */
public class Inventory {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring keyboard input
				Scanner keyboard = new Scanner(System.in);
				
				
				
				
				//variables declaration
				int a = 0;
				int b = 0;
				int c = 0;
				int fchoice = 0;
				int option = 0;
				int size = 5;
				int quantity = 0;
				String componentnumber = " ";  String name = " "; String description = " "; String attribute = " ";
				String category = " ";
				double price = 0.0;
				final String PASSWORD = "EEE00775"; 
				String identify = " ";
	
	

				System.out.println("Welcome");
				
				//number of items that can be stored in the inventory
				System.out.println("You can only store 5 components ");
				
				//creating an empty array with capacity of 5
				Stationary[] itemDatabase = new Stationary[size];
				
				System.out.println("Fill out those the following:  ");
				
				
				//entering a loop
				for(i = 0; i<size-3; i++) {
					System.out.println("Stationary ID: ");
					componentnumber = keyboard.next();
					
					System.out.println("Stationary Name: ");
					name = keyboard.next();
					
					System.out.println("Stationary colour: ");
					colour = keyboard.next();
					
					System.out.println("Stationary category: ");
					category = keyboard.next();
					
					System.out.println("Stationary quantity: ");
					quantity = keyboard.nextInt();
					
					System.out.println("Stationary price: ");
					price = keyboard.nextDouble();
					
					itemDatabase [i] = new Stationary(componentnumber, name, colour, category, quantity, price);
					
					itemDatabase[i].setStationaryNameId(componentnumber);
					itemDatabase[i].setName(name);
					itemDatabase[i].setColour(colour);
					itemDatabase[i].setCategory(category);
					itemDatabase[i].setQuantity(quantity);
					itemDatabase[i].setPrice(price);
					
					System.out.println(itemDatabase[i].toString());
					
					
				}
				
				
				
				while (true) {
					
					
					System.out.println("What do you want to do? ");
					System.out.println(" ");
					System.out.println("    1 to add new Item to the inventory ");
					System.out.println("    2 to change information of an existing Item ");
					System.out.println("    3 to display all the Items with specified category ");
					System.out.println("    4 to display all Item to be re-ordered ");
					System.out.println("    5 to know number of Items currently in store ");
					System.out.println("    6 to quit ");
					System.out.println(" ");
					System.out.println("Choice: ");
					Decision = keyboard.nextInt();
	}

				if (decision == 2) {
				
					
					System.out.println("which items to update. Please Enter the Component number : ");
					identify = key.next();
					
					for(i = 0; i < size; i++) {
					String idselected = itemDatabase[i].getStationaryNameId();
					
					
					if (identify.equals(idselected)) {
						System.out.println("Which attribute to change");
						attribute = key.next();
						
						
						if (attribute.equalsIgnoreCase("name")) { 
							
							System.out.println("Please enter updated name : ");
							name = key.next();
							itemDatabase[i].setName(name);
			
						}
					    if (attribute.equalsIgnoreCase("colour")) {
					    	System.out.println("Please enter updated colour");
					    	colour = key.next();
					    	itemDatabase[i].setColour(colour);
					    }
					    if(attribute.equalsIgnoreCase("category")) {
					    	System.out.println("Please enter updated category : ");
					    	category = key.next();
					    	itemDatabase[i].setCategory(category);
					    }
					    if (attribute.equalsIgnoreCase("quantity")) {
					    	System.out.println("Please enter updated quantity : ");
					    	quantity = key.nextInt();
					    	itemDatabase[i].setQuantity(quantity);
					   
					    }
					    if (attribute.equalsIgnoreCase("price")) {
					    	System.out.println("Please enter updated price : ");
					    	price = key.nextDouble();
					    	itemDatabase[i].setPrice(price);
					    }
					    
					    
					    System.out.println(itemDatabase[i].toString());
					    
		 	        	
					
					
						}
					}
				}
					
}
