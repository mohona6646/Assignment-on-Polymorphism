// -----------------------------------------------------
// Part: 1
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
// -----------------------------------------------------
package Airplane;
import Test.*;

/**
 * 
 * @author maritabarikhan
 *
 */

//Airplane class extends FLyingObjects class
public class Airplane extends FlyingObject{

	//Attributes for Airplane objects which are protected since
	//they need to be accessed by the derived classes and classes within the same package
	protected String brand;
	protected double price;
	protected int horsePower;

	/**
	 * Defines a default constructor
	 */
	public Airplane() { 

		//The Airplane constructor calls the Flyingobject constructor
		super();

		//Sets its attributes to default values
		this.brand = "";
		this.price = 0.0; 
		this.horsePower = 0; 
	}

	/**
	 * Defines a parameterized constructor that takes a string, double and an integer
	 * @param brand attribute
	 * @param price attribute
	 * @param horsePower attribute
	 */
	public Airplane(String brand, double price, int horsePower) {

		//The parameterized Airplane constructor calls the FlyingObject default constructor
		super();

		//Sets its attributes to passed values
		this.brand = brand;
		this.price= price;
		this.horsePower = horsePower;
	}

	/**
	 * Defines a copy constructor that takes another Airplane object to copy from
	 * @param other object
	 */
	public Airplane(Airplane other) {

		//The Airplane copy constructor calls the default constructor of the FLyingObject
		super();
		this.brand = other.brand;
		this.price = other.price;
		this.horsePower = other.horsePower;
	}

	/**
	 * Accessor method that returns the brand of the Airplane object
	 * @return other brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Mutator method that sets the brand of the Airplane object to the passed value
	 * @param brand object
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * Accessor method that returns the price of the Airplane
	 * @return a double
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Mutator method that sets the price of the Airplane
	 * @param price attribute 
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Accessor method that returns the horse power of the Airplane object
	 * @return an integer
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * Mutator method that sets the horse power of the Airplane object
	 * @param horsePower attribute
	 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	/**
	 * ToString method that returns relevant information about the Airplane object
	 */
	public String toString() {
		return "This Airplane is manufactured by " +  this.brand +". It costs " + this.price + "$ and its horse power is " + this.horsePower + ".";
	}

	/**
	 * 	Equals method that takes another object from Object class and indicates if the 
	 *	two objects are equal by returning a boolean value
	 */
	public boolean equals(Object other) {

		//Returns false if the object is null or the two objects are from different classes
		if (other==null||this.getClass()!=other.getClass())
			return false;

		else {

			//Casts the object from class Object to the Airplane class
			Airplane a = (Airplane) other;

			//Returns a boolean value indicating if the two objects are equal
			return (this.brand==a.brand&&this.price==a.price&&this.horsePower==a.horsePower);
		}
	}
}
