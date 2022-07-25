import java.util.Scanner;
import com.revature.models.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item banana = new Item("Banana", 0.69, "Yellow tasty fruit", "7 days");
		Item nyStripSteak = new Item("NY Strip Steak", 26.53, "Perfect for your next summer cookout", "7 days if thawed");
		Item spriteX6 = new Item("Sprite 6 pack", 8, "Sweet citrus goodness", "15 months");
		Item dogTreat = new Item("Dog Treats", 15, "Meaty, lean treat for you dog", "1 year");
		Item angelFoodCake = new Item("Angel Food Cake", 5.99, "Extra fluffy light sweet desert", "1 month");
		Item chickenWings = new Item("Chicken Wings", 6.99, "Amazing Chicken treats", "4 months frozen");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please select one of the following Grocery Items");
		System.out.println("[1]" + banana.toString());
		System.out.println("[2]" + nyStripSteak.toString());
		System.out.println("[3]" + spriteX6.toString());
		System.out.println("[4]" + dogTreat.toString());
		System.out.println("[5]" + angelFoodCake.toString());
		System.out.println("[6]" + chickenWings.toString());
		System.out.println("[x] Exit program");
		String userInput = scanner.nextLine();
		do {
			switch(userInput){
			case "1": System.out.println("Added Banana");
				break;
			case "2": System.out.println("Added NY Strip Steak");
				break;
			case "3": System.out.println("Added Sprite 6 pack");
				break;
			case "4": System.out.println("Added Dog Treats");
				break;
			case "5": System.out.println("Added Angel Food Cake");
				break;
			case "6": System.out.println("Added Chicken Wings");
				break;
			case "x": break;
			default: System.out.println("Not a valid input");
			}
			userInput = scanner.nextLine();
		} while(!(userInput.equals("x")));
		
		
		
		
		scanner.close();
	}

}
