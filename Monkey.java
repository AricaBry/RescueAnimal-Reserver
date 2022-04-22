// Arica N. Bryant

public class Monkey extends RescueAnimal{
	
	// UPDATED: Added private instance variables
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	// UPDATED: Added default constructor
	public Monkey() {
		tailLength = "";
		height = "";
		bodyLength = "";
		species = "";
	}
	
	// UPDATED: Added Advanced Constructor
	public Monkey(String name, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry,
	String tailLength, String height, String bodyLength, String species) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        // UPDATED: Added Monkey specific attributes
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);

    }
	
	// UPDATED: Added Mutator and Accessor Methods
	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}
