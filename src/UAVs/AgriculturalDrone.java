// -----------------------------------------------------
// Part: 1
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
// -----------------------------------------------------
package UAVs;

//import the Drone package in order to be able to inherit UAV and access its attributes
import Drone.*;
/**
 * 
 * @author maritabarikhan
 *
 */

//this class inherits from UAV
public class AgriculturalDrone extends UAV{

	//the attributes of the AgriculturalDrone class
	//brand represents the brand of the ArgiculturalDrone
	private String brand;
	//carryCapacity represents the carrying capacity of this drone
	private int carryCapacity;

	/**
	 * This is the default constructor to set all values to default when creating an object
	 */
	public AgriculturalDrone() {
		//call the UAV default constructor
		super();
		//initialize all the variables for the default
		this.brand = "";
		this.carryCapacity = 0;
	}

	/**
	 * this is a parameterized constructor to set all the values to the passed ones when creating the new object
	 * @param  weight attribute
	 * @param  price attribute
	 * @param  brand attribute
	 * @param  carryCapacity attribute
	 */
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
		//call the UAV parameterized constructor
		super(weight, price);
		//set all the values to the passed ones
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}

	/**
	 * This is a copy constructor to copy an already existing object into a new one
	 * @param other  attribute
	 */
	public AgriculturalDrone(AgriculturalDrone other) {
		//call the parameterized constructor of the UAV class with the passed values of the object we want to copy
		super(other.weight, other.price);
		//set all the values the same as the object we want to copy
		this.brand = other.brand;
		this.carryCapacity = other.carryCapacity;
	}

	/**
	 * Accessor method to get the brand
	 * @return a string
	 */
	public String getBrand() {
		return brand;
	}
}