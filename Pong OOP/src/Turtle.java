//class header
public class Turtle {
	//Attributes
	private String species;
	private boolean landTurtle;
	
	public Turtle() {
		species = "Box Turtle";
		landTurtle = true;
	}
	
	//default constructors
	public Turtle(String initialSpecies, boolean isLandTurtle) {
		//non-default constructors
		species = initialSpecies;
		landTurtle = isLandTurtle;
	}

	//Methods/behaviors
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isLandTurtle() {
		return landTurtle;
	}

	public void setLandTurtle(boolean landTurtle) {
		this.landTurtle = landTurtle;
	}

	public static void main(String[] arg) {
		 
		
		
	}
	
}
