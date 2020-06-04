// -----------------------------------------------------
// Part: 1
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
// -----------------------------------------------------
package Multirotor;

//import the Helicopter package in order to inherit from it and use its attributes
import Helicopters.*;

/**
 * 
 * @author maritabarikhan
 *
 */

//inherit the Helicopter class
public class Multirotor extends Helicopter{
	
	//the attributes of this class
	//numRotors represents the number of rotors
	private int numRotors;
	
	/**
	 * This is the default constructor to set all values to default when creating an object
	 */
	public Multirotor() {
		//call the UAV default constructor
		super();
		this.numRotors = 0;
	}
	
	/**
	 * this is a parameterized constructor to set all the values to the passed ones when creating the new object
	 * @param  brand attribute
	 * @param  price attribute
	 * @param  horsePower attribute
	 * @param  numCylinder attribute
	 * @param creationYear attribute
	 * @param passengerCapacity attribute
	 * @param numRotors attribute
	 */
	public Multirotor(String brand, double price, int horsePower, int numCylinder, int creationYear, int passengerCapacity, int numRotors) {
		//call the Helicopter parametrized constructer with the passed values of the object we want to create
		super(brand, price, horsePower, numCylinder, creationYear, passengerCapacity);
		//set all the values with the passed ones
		this.numRotors = numRotors;
	}
	
	/**
	 * This is a copy constructor to copy an already existing object into a new one
	 * @param other attribute
	 */
	public Multirotor (Multirotor other){
		//call the Helicopter parametrized constructor with the passed values as the ones of the object we want to copy
		super(other.brand, other.price, other.horsePower, other.numCylinder, other.creationYear, other.passengerCapacity);
		//copy all the values of the object we want to copy
		this.numRotors = other.numRotors;
	}

	/**
	 * Accessor method that returns the value of the number of rotors
	 * @return integer
	 */
	public int getNumRotors() {
		return numRotors;
	}

	/**
	 * Mutaor method that sets the values of the number of rotors
	 * @param  numRotors attribute
	 */
	public void setNumRotors(int numRotors) {
		this.numRotors = numRotors;
	}
	
	/**
	 * toString method to return the information of the object
	 */
	public String toString() {
		return "This multirotor is manufactured by " + brand + ". It costs " + price + "$ and its horse power is " +  horsePower + ". The number of cylinders is " + numCylinder + " cylinders and it was created on the year " + creationYear + ". Its passenger capacity is " + passengerCapacity +  "passengers and the number of rotors is "+this.numRotors + ".";
	}

	/**
	 * equals method to verify if 2 objects are the same or not
	 * @param other attribute
	 * @return boolean
	 */
	public boolean equals(Multirotor other) {
		//Returns false if the object passed is null and the classes of the two objects are different
		if (other==null||this.getClass()!=other.getClass())
			return false;
		else {
			//Casts the object of type Object to UAV
			Multirotor m = (Multirotor) other;
			//Returns a boolean value if their attributes are the same
			return (this.brand==m.brand&&this.price==m.price&&this.horsePower==m.horsePower&&this.numCylinder==m.numCylinder&&this.creationYear==m.creationYear&&this.passengerCapacity==m.passengerCapacity&&this.numRotors==m.numRotors);
		}
	}
}
