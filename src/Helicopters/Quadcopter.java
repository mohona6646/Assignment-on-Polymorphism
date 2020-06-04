// -----------------------------------------------------
// Part: 1
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
// -----------------------------------------------------
package Helicopters;

/**
 * 
 * @author maritabarikhan
 *
 */

//Quadcopter class extends from the Helicopter class
public class Quadcopter extends Helicopter {

	//Attribute for the Quadcopter object
	private int maxFlyingSpeed;

	/**
	 * Default constructor for the Quadcopter object
	 */
	public Quadcopter() { 
		//The Quadcopter constructor calls the Helicopter default constructor
		super();
		//Sets its attribute to the default value 0
		this.maxFlyingSpeed = 0;
	}

	/**
	 * Defines the parameterized constructor that takes a string, a double and five integers as parameters
	 * @param  brand attribute
	 * @param  price attribute
	 * @param  horsePower attribute
	 * @param  numCylinder attribute
	 * @param  creationYear attribute
	 * @param  passengerCapacity attribute
	 * @param  maxFlyingSpeed attribute
	 */
	public Quadcopter(String brand, double price, int horsePower, int numCylinder, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
		//The Quadcopter parameterized constructor calls the Helicopter parameterized constructor
		super(brand, price, horsePower, numCylinder, creationYear, passengerCapacity);
		//Sets its attribute to the passed value
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	/**
	 * Defines a copy constructor that takes another Quadcopter object
	 * @param other object
	 */
	public Quadcopter (Quadcopter other){
		//The Quadcopter copy constructor calls the Helicopter copy constructor
		super(other.brand, other.price, other.horsePower, other.numCylinder, other.creationYear, other.passengerCapacity);
		//Sets its attribute to the value from the other Quadcopter object, copying its value
		this.maxFlyingSpeed = other.maxFlyingSpeed;
	}

	/**
	 * Accessor method that returns the maximum flying speed of the Quadcopter
	 * @return integer
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed; 
	}

	//Mutator method that sets the maximum flying speed of the Quadcopter to the value passed
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	/**
	 * ToString method that returns relevant information about the Quadcopter
	 */
	public String toString() {
		return "This quadcopter is manufactured by " +  brand + ". It costs " + price + "$ and its horse power is " +  horsePower + ". The number of cylinders is " + numCylinder + " cylinders and it was created on the year " + creationYear + ". Its passenger capacity is " + passengerCapacity + " passengers and its maximum flying speed is  " + this.maxFlyingSpeed + ".";
	}

	/**
	 * Equals method that takes another Quadcopter object and compares the two objects by
	 * returning a boolean value
	 */
	public boolean equals(Object other) {

		//Returns false if the object passed to the method is null or is not from the same class as the calling method
		if (other==null||this.getClass()!=other.getClass())
			return false;
		else {
			//Casts the object of class Object to a Quadcopter
			Quadcopter q = (Quadcopter) other;
			//Returns a boolean value determining if the attributes of the objects are equal
			return (this.brand==q.brand&&this.price==q.price&&this.horsePower==q.horsePower&&this.numCylinder==q.numCylinder&&this.creationYear==q.creationYear&&this.passengerCapacity==q.passengerCapacity&&this.maxFlyingSpeed==q.maxFlyingSpeed);
		}
	}

}

