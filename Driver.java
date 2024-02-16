// Arica N. Bryant

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	// Instance variables
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    
    // UPDATED: Added Array List for Monkeys
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    // UPDATED: Added scanner object
    private static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {

    	String menuInput = "";
    	
        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.        
        // UPDATED: Added while loop to check user input for menu
        while(!menuInput.equalsIgnoreCase("q")) {
        	displayMenu();
        	menuInput = scnr.nextLine(); // get menu choice from user
        	switch(menuInput) {
        		case "1":
        			intakeNewDog(scnr);
        			break;
        		case "2":
        			intakeNewMonkey(scnr);
        			break;
        		case "3":
        			reserveAnimal(scnr);
        			break;
        		case "4":
        			printAnimals(4);
        			break;
        		case "5":
        			printAnimals(5);
        			break;
        		case "6":
        			printAnimals(6);
        			break;
        		default:
        			if(!menuInput.equalsIgnoreCase("q")) {
        				System.out.println("Invalid input. Try again.");
        		}
        		break;
        	}
        }
    	System.out.println("Ending program");

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Simon", "male", "6", "20.2", "04-01-2022", "United States", "intake", false, "United States", "6.5", "10.5", "10.0", "Tamarin");
    	monkeyList.add(monkey1);
    }


    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        // UPDATED: Added code to intake new dog
        // Object to hold dog attributes
        Dog dogs = new Dog();
        
        // Set dog name
        dogs.setName(name);
        
        // Get and set the dog breed from user
        System.out.println("What is the dog's breed?");
        String breed = scnr.nextLine();
        dogs.setBreed(breed);
        
        // get and set the dog gender from user
        System.out.println("What is the dog's gender?");
        String gender = scnr.nextLine();
        dogs.setGender(gender);
        
        // get and set the dog age from user
        System.out.println("What is the dog's age?");
        String age = scnr.nextLine();
        dogs.setAge(age);
        
        // get and set the dog weight from user
        System.out.println("What is the dog's weight?");
        String weight = scnr.nextLine();
        dogs.setWeight(weight);
        
        // get and set the date acquired from user
        System.out.println("What date was this dog acquired on?");
        String acquisitionDate = scnr.nextLine();
        dogs.setAcquisitionDate(acquisitionDate);
        
        // get and set the location where acquired from user
        System.out.println("What country was this dog acquired in?");
        String acquisitionCountry = scnr.nextLine();
        dogs.setAcquisitionLocation(acquisitionCountry);
        
        // get and set the training status from user
        System.out.println("What is the training status of this dog?");
        String trainingStatus = scnr.nextLine();
        dogs.setTrainingStatus(trainingStatus);
        
        // get and set the reserve status from user
        System.out.println("What is the reservation status of this dog? Enter True or False.");
        boolean reserved = scnr.nextBoolean();
        dogs.setReserved(reserved);
        scnr.nextLine();
        
        // get and set the current service country from user
        System.out.println("What country is the dog in service?");
        String inServiceCountry = scnr.nextLine();
        dogs.setInServiceCountry(inServiceCountry);
        
        // add new dog to Array List
        dogList.add(dogs);
    }


	//Instantiate and add the new monkey to the appropriate list
        // Validate the input to make sure the monkey doesn't already exist and the species type is allowed
    	// UPDATED: Added method to intake new monkeys
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scnr.nextLine(); // get input from user
            
            // validate input
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("This monkey is already registered.");
            		return; // return to main menu
            	}
            }
            
            // object to hold monkey attributes
            Monkey monk = new Monkey();
            boolean exit = false; // Create variable to check valid species
            
            // validate monkey species
            System.out.println("What species is the monkey?");
            String species = scnr.nextLine();
            while (!exit) {
            	if (species == "Capuchin") {
            		monk.setSpecies(species);
            		exit = true;
            	}
            	else if (species == "Guenon") {
            		monk.setSpecies(species);
            		exit = true;
            	}
            	else if (species == "Macaque") {
            		monk.setSpecies(species);
            		exit = true;
            	}
            	else if (species == "Marmoset") {
            		monk.setSpecies(species);
            		exit = true;
            	}
            	else if (species == "Squirrel monkey") {
            		monk.setSpecies(species);
            		exit = true;
            	}
            	else if (species == "Tamarin") {
            		monk.setSpecies(species);
            		exit = true;
            	}
            	else {
            		System.out.println("This type of monkey is not eligible for training.");
            		exit = false;
            		return; // returns to main menu
            	}
            }
            
            // set monkey name
            monk.setName(name);
            
            // get and set the monkey gender from user
            System.out.println("What is the monkey's gender?");
            String gender = scnr.nextLine();
            monk.setGender(gender);
            
            // get and set the monkey age from user
            System.out.println("What is the monkey's age?");
            String age = scnr.nextLine();
            monk.setAge(age);
            
            // get and set the monkey weight from user
            System.out.println("What is the monkey's weight?");
            String weight = scnr.nextLine();
            monk.setWeight(weight);
            
            // get and set the date acquired from user
            System.out.println("What date was this monkey acquired on?");
            String acquisitionDate = scnr.nextLine();
            monk.setAcquisitionDate(acquisitionDate);
            
            // get and set the location where acquired from user
            System.out.println("What country was this monkey acquired in?");
            String acquisitionCountry = scnr.nextLine();
            monk.setAcquisitionLocation(acquisitionCountry);
            
            // get and set the training status from user
            System.out.println("What is the training status of this monkey?");
            String trainingStatus = scnr.nextLine();
            monk.setTrainingStatus(trainingStatus);
            
            // get and set the reserve status from user
            System.out.println("What is the reservation status of this monkey? Enter True or False.");
            boolean reserved = scnr.nextBoolean();
            monk.setReserved(reserved);
            scnr.nextLine();
            
            // get and set the current service country from user
            System.out.println("What country is the monkey in service?");
            String inServiceCountry = scnr.nextLine();
            monk.setInServiceCountry(inServiceCountry);
            
            // get and set the tail length from user
            System.out.println("What is the monkey's tail length?");
            String tailLength = scnr.nextLine();
            monk.setTailLength(tailLength);
            
            // get and set the height from user
            System.out.println("What is the monkey's height?");
            String height = scnr.nextLine();
            monk.setHeight(height);
            
            // get and set the body length from user
            System.out.println("What is the monkey's body length?");
            String bodyLength = scnr.nextLine();
            monk.setBodyLength(bodyLength);
           
            // add new monkey to Array List
            monkeyList.add(monk);
        }

        public static void reserveAnimal(Scanner scanner) {
        	// Object to hold rescue animal attributes
        	RescueAnimal animal = new RescueAnimal();
        	boolean found = false;
        	
        	// Set and get animal type from user
            System.out.println("What type of animal is being reserved?");
            String animalType = scnr.nextLine();
            animal.setAnimalType(animalType);
            
            // Set and get animal service country from user
            System.out.println("What country is the animal in service for?");
            String inServiceCountry = scnr.nextLine();
            animal.setInServiceCountry(inServiceCountry);
            
            // Validate input animal type
            if (animalType.equals("dog")) {
            	for(Dog dog: dogList) {
            		// Check for available dog in list and update reserved status accordingly
            		if (dog.getInServiceLocation().equals(inServiceCountry) && (dog.getReserved() == false)) {
            			dog.setReserved(true);
            			System.out.println("Dog has been found in " + inServiceCountry + ". Reserved status has been updated");
            			found = true;
            			break; // Exit the loop
            		}
            	}
            	// Output if no available dog is found
            	if (!found) {
            		System.out.println("There is currently no available dog in the system.");
            	}
            }
            else if (animalType.equals("monkey")) {
            	for(Monkey monkey: monkeyList) {
            		if (monkey.getInServiceLocation().equals(inServiceCountry) && (monkey.getReserved())) {
            			monkey.setReserved(true);
            			System.out.println("Monkey has been found in " + inServiceCountry + ". Reserved status has been updated");
            			found = true;
            			break;
            		}
            	}
            	if (!found) {
            		System.out.println("There is currently no available monkey in the system.");
            	}
            }
            else {
            	System.out.println("Invalid animal type input.");
            	return;
            }
            
            

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// The other lists can have a print statement saying "This option needs to be implemented".
        public static void printAnimals(int action) {
        	// prints list of dogs
            if (action == 4) {
            	for (Dog dog: dogList) {
            		System.out.println("Name: " + dog.getName());
            		System.out.println("Status: " + dog.getTrainingStatus());
            		System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
            		System.out.println("Reservation Status: " + dog.getReserved());
            		System.out.println();
            	}
            }
            // Prints list of monkeys
            else if (action == 5) {
            	for (Monkey monkey: monkeyList) {
                	System.out.println("Name: " + monkey.getName());
                	System.out.println("Status: " + monkey.getTrainingStatus());
                	System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
                	System.out.println("Reservation Status: " + monkey.getReserved());
                	System.out.println();
            	}
            }
            // Prints available animals
            else if (action == 6) {
            	for (Dog dog: dogList) { // Prints available dogs
            		if (dog.getTrainingStatus().equals("in service") && (dog.getReserved() == false)) {
            			System.out.println("Name: " + dog.getName());
                		System.out.println("Status: " + dog.getTrainingStatus());
                		System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
                		System.out.println("Reservation Status: " + dog.getReserved());
                		System.out.println();
            		}
            	}
            	for (Monkey monkey: monkeyList) { // Prints available monkeys
            		if (monkey.getTrainingStatus().equals("in service") && (monkey.getReserved() == false)) {
            			System.out.println("Name: " + monkey.getName());
            			System.out.println("Status: " + monkey.getTrainingStatus());
            			System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
            			System.out.println("Reservation Status: " + monkey.getReserved());
                		System.out.println();
            		}
            	}
            }

        }
}

