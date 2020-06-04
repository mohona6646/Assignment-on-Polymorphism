// -----------------------------------------------------
// Part: 2
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
// -----------------------------------------------------
package Test;

//Imports all the packages needed
import Drone.*;
import Helicopters.*;
import Multirotor.*;
import UAVs.*;
import Test.FlyingObject;
import Airplane.Airplane;

/**Names and IDs: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
 * <br>
 * COMP249 
 * <br>
 * Assignment #1 Phase 2
 * <br>
 * Due Date: Tuesday, 25th February 2020
 * 
 * @author  Marita Brichan and Mohona Mazumdar
 *<br>
 *<br> 
 *
 *This program will attempt to return a copy of an array of type Flyingobjects 
 *and will fail. The objects created will be of type FlyingObjects instead of being
 *a helicopter, quadcopter, UAV, etc.  
 */
public class Driver2 {

	//Creates a static method that copies all objects from the passed FlyingObject array 
	//and stores each object to another array
	public static FlyingObject [] copyFlyingObjects(FlyingObject [] x) {

		//The new array created is of type FlyingObject and has the same length as the 
		//passed array
		FlyingObject [] yCopy = new FlyingObject[x.length];

		//The for loop iterates till the length of the array 
		//and copies each object from the passed array
		for (int i=0; i<x.length;i++) {
			yCopy[i] = new FlyingObject(x[i]);
			//Displays information about each object of the array
			System.out.println(yCopy[i]);
		}
		//Returns the copy of the array
		return yCopy;
	}
	public static void main(String[] args) { 

		//Creates new objects of different types with different constructors
		Helicopter helicopter1 = new Helicopter();
		Helicopter helicopter2 = new Helicopter("bombardier",5,4,7,5,9);
		Helicopter helicopter3 = new Helicopter(helicopter2);
		Airplane airplane1 = new Airplane();
		Airplane airplane2 = new Airplane("bombardier",5,8);
		Quadcopter quadcopter1 = new Quadcopter();
		Quadcopter quadcopter2 = new Quadcopter("boieng",5,7,54,3,765,5);
		Multirotor multirotor1 = new Multirotor();
		Multirotor multirotor2 = new Multirotor("boeing",54,43,2,5,4,3);
		Multirotor multirotor3 = new Multirotor(multirotor2);
		UAV UAV1 = new UAV();
		UAV UAV2 = new UAV(54,76);
		UAV UAV3 = new UAV(UAV2);
		AgriculturalDrone agriculturalDrone1 = new AgriculturalDrone();
		AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone(43,543,"bombardier",43);
		AgriculturalDrone agriculturalDrone3 = new AgriculturalDrone(agriculturalDrone2);
		MAV MAV1 = new MAV();
		MAV MAV2 = new MAV(67,54,"bombardier","I54",54);

		//Creates a new array of type of Flying Object with the objects created
		FlyingObject[] z  = new FlyingObject[18];
		z[0]=helicopter1;
		z[1]=helicopter2;
		z[2]=helicopter3;
		z[3]=airplane1;
		z[4]=airplane2;
		z[5]=quadcopter1;
		z[6]=quadcopter2;
		z[7]=multirotor1;
		z[8]=multirotor2;
		z[9]=multirotor3;
		z[10]=UAV1;
		z[11]=UAV2;
		z[12]=UAV3;
		z[13]=agriculturalDrone1;
		z[14]=agriculturalDrone2;
		z[15]=agriculturalDrone3;
		z[16]=MAV1;
		z[17]=MAV2;

		//Display a welcome message for the user
		System.out.println("\t*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n\t*\t\t\t\t\t\t*" + "\n\t*\tWelcome to Marita and Mohona's program\t*"+"\n\t*\t\t\t\t\t\t*"+ "\n\t*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n");
		
		//Calls the static method to create a copy of the array of type flying objects	
		Driver2.copyFlyingObjects(z);

		/*
		 * The output is wrong because the static method uses the copy constructor of the flying objects instead of using 
		 * the copy constructor of each object stored in the array, which does not let polymorphism work in the way it should, 
		 * which causes the program to misbehave and create all the copy objects as Flying Objects, while in fact they are all inherited
		 * from Flying Object and not just Flying Object
		 * 
		 * In order for the copy to work, there should have been a clone method used, because polymorphism needs to function well, the objects at the end all printed out as FlyingObjects
		 * while in fact none of them were simply FlyingObjects, which is how the program misbehaved
		 */

		//display a closing message to indicate to the user the end of the program
		System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n\nThis program has ended, thank you for using it!\n");

	}


}


