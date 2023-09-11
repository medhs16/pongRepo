
public class Dog {//<-----class - header, defines the Datatype
	//a class is a blue print for creating objects
	//objects have properties like the examples below
	private String name;
	private String breed;
	
	//Constructor w/o parameters aka default constructor, no parameter constructor
	//NOT a method. Methods have return type
	public Dog() {//<--------constructors take the NAME of class
		//the job of a constructor is to assign values to attributes!
		//initializes the variables
		name = "Jack";
		breed = "French Bulldog";
	}
	
	//another constructor! again take note that there is no return type and is named after the class name!
	//parameterized constructor - has parameters!
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	//after the constructors, wou will typically see the methods!
	//"behaviors"
	public void bark() {
		System.out.println("Woof");
	}
	

	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public static void main(String[] arg) {
		//Declare the object variable (left side)
		//Instanttiate the object (right - side) - Creating the object
		Dog d = new Dog(); //d is a Dog object (vocab practice)
		
		//All objects have the dot operator functionality
		d.bark(); //invoke (use) the barkmethod/behavior of a Dog
		
		//declare and instantiate a 2nd Dog object please
		//called it Jack 
		Dog jack = new Dog(); //<---this is how to goes it its constructor
		//no parameters to add
		
		jack.bark();
		
		Dog bruno = new Dog("bruno", "terrier");
		bruno.getBreed();
		bruno.bark();
		
		System.out.println(bruno.getName());
		System.out.println(d.getName());
		System.out.println(jack.getName());
		
		
		
	}
}
