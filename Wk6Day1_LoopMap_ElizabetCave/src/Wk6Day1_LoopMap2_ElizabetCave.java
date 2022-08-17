import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Wk6Day1_LoopMap2_ElizabetCave {

	public static void main(String[] args) {
		// HashMap creation
		HashMap<String, String> modelMake = new HashMap<String, String>();
		
		// Adding key-value pairs
		modelMake.put("Prius", "Toyota");
		modelMake.put("Camry", "Toyota");
		modelMake.put("Corolla", "Toyota");
		modelMake.put("Yaris", "Toyota");
		modelMake.put("4Runner", "Toyota");
		modelMake.put("Venza", "Toyota");
		modelMake.put("Highlander", "Toyota");
		modelMake.put("Rav4", "Toyota");
		modelMake.put("Tacoma", "Toyota");
		modelMake.put("Sienna", "Toyota");
		
		modelMake.put("Civic", "Honda");
		modelMake.put("Accord", "Honda");
		modelMake.put("CR-V", "Honda");
		modelMake.put("Passport", "Honda");
		modelMake.put("Pilot", "Honda");
		
		modelMake.put("Legacy", "Subaru");
		modelMake.put("Ascent", "Subaru");
		modelMake.put("Outback", "Subaru");
		
		modelMake.put("Jetta", "Volkswagen");
		modelMake.put("Passat", "Volkswagen");
		modelMake.put("Voyage", "Volkswagen");
		

		System.out.println("What type of model vehicle are you looking for? ");
		Scanner myVehicle = new Scanner(System.in);
		String vehicle = myVehicle.nextLine();
		System.out.println(vehicle);
		myVehicle.close();
		
		if (modelMake.containsKey(vehicle)) {
			System.out.println("Yes, we have that model.");
		}
		else if (!modelMake.containsKey(vehicle)) {
			System.out.println("Sorry, we do not have that model now.");
		}
		else {
			System.out.println("Uh Oh, this is not what we want to see");
		}
		

		

	}

}
