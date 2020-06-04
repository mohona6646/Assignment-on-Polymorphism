// -----------------------------------------------------
// Part: 1
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
// -----------------------------------------------------
package Drone;

//Import the Test package to use its attributes and methods
import Test.*;

/**
 * 
 * @author maritabarikhan
 *
 */

//The class UAV extends the FlyingObject class
public class UAV extends FlyingObject {
	
	//The attributes of the UAV class  
	//weight represents the weight of UAV
	protected double weight;
	//price represents the price of the UAV
	protected double price;

	/**
	 * Defines the default constructor
	 */
	public UAV() {

		//The default constructor calls the default constructor of the FlyingObject class
		super();
		//Sets its attributes to the default values to 0
		this.weight = 0;
		this.price = 0.0;
	}

	/**
	 * Defines the parameterized constructor that takes two double in the argument
	 * @param  weight attribute
	 * @param price attribute
	 */
	public UAV(double weight, double price) {

		//The parameterized constructor of the UAV class calls the default constructor of the Airplane class, because the class of FlyingObjects does not have any attributes to have a parameterized constructor
		super();
		//Sets its attributes to the passed values
		this.weight = weight;
		this.price = price;
	}

	/**
	 * Defines the copy constructor which takes another UAV object
	 * @param other attribute
	 */
	public UAV(UAV other) {

		//The UAV copy constructor calls the default constructor FLyingObject because it does not have any attributes to have a parameterized constructor
		super(); 
		//Sets its attributes to the passed values
		this.weight = other.weight;
		this.price = other.price;
	}

	/**
	 * Accessor method that returns the weight of the UAV
	 * @return a double 
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Mutator method that sets the weight of the UAV
	 * @param  weight attribute
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Accessor method that returns the price of the UAV
	 * @return double for price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Mutator method that sets the price of the UAV
	 * @param  price attribute
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * ToString method that returns relevant information about the UAV
	 */
	public String toString() {
		return "This UAV weights " +  this.weight + " pounds and it costs " + this.price + "$.";
	}
	/**
	 * Equals method that takes another object from Object class and returns a boolean value 
	 * determining if the two objects are equal
	 */
	public boolean equals(Object other) {

		//Returns false if the object passed is null and the classes of the two objects are different
		if (other==null||this.getClass()!=other.getClass())
			return false;

		else {

			//Casts the object of type Object to UAV
			UAV u = (UAV) other;

			//Returns a boolean value if their attributes are the same
			return (this.weight==u.weight&&this.price==u.price);
		}
	}

}
