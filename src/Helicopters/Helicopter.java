// -----------------------------------------------------
// Part: 1
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
// -----------------------------------------------------
package Helicopters;

//Imports the class Airplane to use its attributes and methods
import Airplane.*;

/**
 * 
 * @author maritabarikhan
 *
 */

//Helicopter class extends Airplane class
public class Helicopter extends Airplane {

	//Attributes of an object of type Helicopter
	protected int numCylinder;
	protected int creationYear;
	protected int passengerCapacity; 

	/**
	 * Defines the constructor method that takes no parameter
	 */
	public Helicopter() {

		//The Helicopter constructor calls the constructor of the base class Airplane which does not take any parameter 
		super();
		//Sets the attributes to default values 0
		this.numCylinder = 0;
		this.creationYear = 0;
		this.passengerCapacity = 0;
	}

	/**
	 * Defines the constructor methods that takes a string and four integers 
	 * @param brand attribute
	 * @param price attribute
	 * @param  horsePower attribute
	 * @param  numCylinder attribute
	 * @param  creationYear attribute
	 * @param  passengerCapacity attribute
	 */
	public Helicopter(String brand, double price, int horsePower, int numCylinder, int creationYear, int passengerCapacity) {
		//The Helicopter parameterized constructor calls the parameterized Airplane constructor
		super(brand, price, horsePower);
		//Sets the attributes of the calling object to the passed values
		this.numCylinder = numCylinder;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}

	/**
	 * Defines the Helicopter copy constructor that takes another Helicopter as a parameter 
	 * @param other  attribute
	 */
	public Helicopter(Helicopter other) {

		//The Helicopter copy constructor calls the copy constructor of the Airplane
		super(other.brand, other.price, other.horsePower);

		//Sets its attributes to the attributes of the passed object of type of helicopter
		this.numCylinder = other.numCylinder;
		this.creationYear = other.creationYear;
		this.passengerCapacity = other.passengerCapacity;
	}
}