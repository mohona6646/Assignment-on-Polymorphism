// -----------------------------------------------------
// Part: 1
// Written by: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
//This program is designed to create flying objects and test their 
//equality as well as their constructor methods. The purpose of this
//assignment is to test the inheritance of different objects.
// -----------------------------------------------------
package Test;

//import all the packages of the program in order to be able to use its methods and create objects
import Airplane.*;
import Drone.*;
import Helicopters.*;
import Multirotor.*;
import UAVs.*;

/**Names and IDs: Marita Brichan (40138194) and Mohona Mazumdar (40129421)
 * <br>
 * COMP249 
 * <br>
 * Assignment #2 Phase 1
 * <br>
 * Due Date: Tuesday, 25th february 2020
 * 
 * @author  Marita Brichan and Mohona Mazumdar
 *<br>
 *<br> 
 *
 * This program creates different objects such as helicopters, agricultural drones, quadcopters
 * using their respective constructors. It will print the objects making use of their toString methods
 * and then, compare between the objects to test their equality. Later on, it prints the lowest and the
 * second lowest prices among all the objects created using their accessor methods.
 * 
 */

public class Driver {

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
		FlyingObject[] flyingObjects  = new FlyingObject[18];
		flyingObjects[0]=helicopter1;
		flyingObjects[1]=helicopter2;
		flyingObjects[2]=helicopter3;
		flyingObjects[3]=airplane1;
		flyingObjects[4]=airplane2;
		flyingObjects[5]=quadcopter1;
		flyingObjects[6]=quadcopter2;
		flyingObjects[7]=multirotor1;
		flyingObjects[8]=multirotor2;
		flyingObjects[9]=multirotor3;
		flyingObjects[10]=UAV1;
		flyingObjects[11]=UAV2;
		flyingObjects[12]=UAV3;
		flyingObjects[13]=agriculturalDrone1;
		flyingObjects[14]=agriculturalDrone2;
		flyingObjects[15]=agriculturalDrone3;
		flyingObjects[16]=MAV1;
		flyingObjects[17]=MAV2;

		//Display a welcome message for the user
		System.out.println("\t*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n\t*\t\t\t\t\t\t*" + "\n\t*\tWelcome to Marita and Mohona's program\t*"+"\n\t*\t\t\t\t\t\t*"+ "\n\t*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n");

		//Say what the user is about to see
		System.out.println("\n\nThe Flying objects that we have are:\n\n");

		//print all the objects created
		for(int i = 0; i<flyingObjects.length;i++) {
			System.out.println(flyingObjects[i]);
		}

		//put a line to indicate the end of the previous part and tell the user what he is about to see
		System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n\nTesting the equality method:\n");

		//use the equals method multiple times with different objects and display to the user if those objects are equal or not by using an if-else statement each time
		if(airplane1.equals(airplane2)) {
			System.out.println("airplane1 and airplane2 are the same");
		}
		else {
			System.out.println("airplane1 and airplane2 are NOT the same");
		}

		if(helicopter2.equals(helicopter3)) {
			System.out.println("helicopter2 and helicopter3 are the same");
		}
		else {
			System.out.println("helicopter2 and helicopter3 are NOT the same");
		}

		if(quadcopter1.equals(quadcopter2)) {
			System.out.println("quadcopter1 and quadcopter2 are the same");
		}
		else {
			System.out.println("quadcopter1 and quadcopter2 are NOT the same");
		}

		if(multirotor2.equals(multirotor3)) {
			System.out.println("multirotor2 and multirotor3 are the same");
		}
		else {
			System.out.println("multirotor2 and multirotor3 are NOT the same");
		}

		if(MAV2.equals(agriculturalDrone3)) {
			System.out.println("MAV2 and agriculturalDrone3 are the same");
		}
		else {
			System.out.println("MAV2 and agriculturalDrone3 are NOT the same");
		}

		if(agriculturalDrone1.equals(helicopter3)) {
			System.out.println("agriculturalDrone1 and helicopter3 are the same");
		}
		else {
			System.out.println("agriculturalDrone1 and helicopter3 are NOT the same");
		}

		if(airplane1.equals(helicopter1)) {
			System.out.println("airplane1 and helicopter1 are the same");
		}
		else {
			System.out.println("airplane1 and helicopter1 are NOT the same");
		}

		if(UAV2.equals(airplane2)) {
			System.out.println("UAV2 and airplane2 are the same");
		}
		else {
			System.out.println("UAV2 and airplane2 are NOT the same");
		}

		if(UAV3.equals(agriculturalDrone3)) {
			System.out.println("UAV3 and agriculturalDrone3 are the same");
		}
		else {
			System.out.println("UAV3 and agriculturalDrone3 are NOT the same");
		}

		if(multirotor3.equals(MAV1)) {
			System.out.println("multirotor3 and MAV1 are the same");
		}
		else {
			System.out.println("multirotor3 and MAV1 are NOT the same");
		}

		//put a line to indicate the end of the previous part and tell the user what he is about to see
		System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n\nSearching for the two objects that have the least expensive price:\n");

		//create an array which contains the prices of all the objects, since the array is a flying object, and the price is in the airplane or UAV class, each value has to be extracted alone without a for loop
		//make this array in the same order as the initial one with the flying objects
		double[] price  = new double[18];
		price[0]=helicopter1.getPrice();
		price[1]=helicopter2.getPrice();
		price[2]=helicopter3.getPrice();
		price[3]=airplane1.getPrice();
		price[4]=airplane2.getPrice();
		price[5]=quadcopter1.getPrice();
		price[6]=quadcopter2.getPrice();
		price[7]=multirotor1.getPrice();
		price[8]=multirotor2.getPrice();
		price[9]=multirotor3.getPrice();
		price[10]=UAV1.getPrice();
		price[11]=UAV2.getPrice();
		price[12]=UAV3.getPrice();
		price[13]=agriculturalDrone1.getPrice();
		price[14]=agriculturalDrone2.getPrice();
		price[15]=agriculturalDrone3.getPrice();
		price[16]=MAV1.getPrice();
		price[17]=MAV2.getPrice();

		//temp represnts the temporary take of a number
		double temp;
		//i and j are used in the nested loop in order to put all the prices in order from the cheapest to highest
		int i,j;
		//create a copy array which will have the prices from cheapest to highest, because we will need the unsorted array later on to find out what objects have this price
		double [] sortedPrice = new double [price.length];

		//copy the array as it is
		for (i=0;i<sortedPrice.length;i++) {
			sortedPrice[i]=price[i];
		}

		//sort the sortedPrice array in order with this nested loop
		for (i = 0; i < sortedPrice.length; i++)   
		{  
			for (j = i + 1; j < sortedPrice.length; j++)   
			{  
				if (sortedPrice[i] > sortedPrice[j])   
				{  
					temp = sortedPrice[i];  
					sortedPrice[i] = sortedPrice[j];  
					sortedPrice[j] = temp;  
				}  
			}  
		}

		//priceCheapest represents how many objects have the cheapest price
		int priceCheapest = 0;
		//this loop will iterate to find out how many objects are equal to the cheapest price, since many can have the same price
		for(int y=0; y < price.length; y++) {
			//if the price is equal to the cheapest, then increment the counter
			if(price[y] == sortedPrice[0]) {
				priceCheapest++;
			}
		}

		/*
		 * enter a loop which will search if any of the objects are the equal the the cheapest one, or the second cheapest object, which will be equal to priceCheapest, since
		 * priceCheapest is the counter of how many objects have the cheapest price, and they were all sorted, then the object that is in the place where it is the number of how many
		 * objects there are, it will know that this is the second cheapest price, and then print it.
		 */
		for(int k=0; k < price.length; k++) {
			//if the array of unordered prices has the cheapest price at k, then the object in that flyingObjects array at k has the cheapest price too, so we print it
			if(price[k]== sortedPrice[0]) {
				System.out.println("\n\nThis object has the cheapest price. Those are the attributes:\n" + flyingObjects[k]);
			}
			//if the array of unordered prices has the second cheapest price at k, then the object in that flyingObjects array at k has the second cheapest price too, so we print it
			else if(sortedPrice[priceCheapest] == price[k]) {
				System.out.println("\n\nThis object has the second cheapest price. Those are the attributes:\n" + flyingObjects[k]);
			}
		}

		//display a closing message to indicate to the user the end of the program
		System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n\nThis program has ended, thank you for using it!\n");

	}

}
