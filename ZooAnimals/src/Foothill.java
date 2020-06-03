import java.util.ArrayList;
import java.util.Scanner;

public class Foothill {	
	
	public static void main(String[] args) {
	
	ArrayList<iAnimal> animals = new ArrayList<iAnimal>();
	 
	while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide an animal type or q to quit");
		String animalType = sc.nextLine();
		// Check if input is q, if so break. 
		if (animalType.equalsIgnoreCase("q")) {
			System.out.println("Thank you");
			break;
		}
		System.out.println("Provide an id as an integer for this animal");
		int animalId = sc.nextInt(); 
		
		iAnimal animal;
		
		if (animalType.equalsIgnoreCase("Kangaroo")){
			animal = new Kangaroo();
			animal.setIdTag(animalId);
			boolean exists = false;
			
			for (int i = 0; i < animals.size(); i++) {
				int animalCompare =  animal.compareTo(animals.get(i));
				
				if (animalCompare == 0) {
					exists = true;
					break;
				} 
			}
			// if exists then don't add it. Otherwise add it. 
			if (!exists) {
				animals.add(animal);
				}
			}
		System.out.println(animals);
	}
		
	}
}
