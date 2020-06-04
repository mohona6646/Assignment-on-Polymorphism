// -----------------------------------------------------
// Part: 1
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
// -----------------------------------------------------
package UAVs;

//import the Drone package in order to use its attributes and inheritence in this class
import Drone.*;

/**
 * 
 * @author maritabarikhan
 *
 */

//the class uses inheritence which is extended from UAV
public class MAV extends UAV {
	
	//The attributes of the MAV class
	//model represents the model of the MAV
	private String model;
	//size represents the size of the MAV
	private double size;
	
	
	/**
	 * This is the default constructor which creats objects with the default ways
	 */
	public MAV() {
		//call the default constructor of the UAV class
		super();
		//initialize all the attributes
		this.model = "";
		this.size = 0;
	}
	
	/**
	 * This is a parameterized constructor which creates objects with the passed values 
	 * @param  weight attribute
	 * @param  price attribute
	 * @param  brand attribute
	 * @param  model attribute
	 * @param  size attribute
	 */
	public MAV(double weight, double price, String brand, String model, double size) {
		//call the parameterized constructor of the UAV class with the passed values
		super(weight, price);
		//sets all the attributes to the passed ones
		this.size = size;
		this.model = model;
	}
	
	/**
	 * This is a copy constructor to copy an already existing object
	 * @param other  attribute
	 */
	public MAV(MAV other) {
		//call the parameterized constructor of the UAV class with the values of the object we want to copy
		super(other.weight, other.price);
		//sets all the attributes to the passed ones by the object we want to copy
		this.model = other.model;
		this.size = other.size;
	}

	/**
	 * Accessor method to get the model of the MAV
	 * @return string
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Mutator method to set the value of the model
	 * @param model attribute
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Accessor method to get the size of the MAV
	 * @return double
	 */
	public double getSize() {
		return size;
	}

	/**
	 * Mutator method to set the value of the size of the MAV
	 * @param  size attribute
	 */
	public void setSize(double size) {
		this.size = size;
	}
	
	/**
	 * toString method to return the information of the object created
	 */
	public String toString() {
		return "This MAV weights " + weight + " pounds and it costs " + price + "$. The model is " + this.model + " and its size restrictions " + this.size + ".";
	}
	
	/**
	 * equals method to verify if 2 objects are the same
	 */
	public boolean equals(Object other) {
		//Returns false if the object passed is null and the classes of the two objects are different
		if (other==null||this.getClass()!=other.getClass())
			return false;
		
		else {
			//Casts the object of type Object to UAV
			MAV m = (MAV) other;
			//Returns a boolean value if their attributes are the same
			return (this.weight==m.weight&&this.price==m.price&&this.model==m.model&&this.size==m.size);
		}
		}

}
