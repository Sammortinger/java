/*
 * Lab 3 Code, with some extra stuff added for fun
 * 
 * Author: Sam Mortinger
 */

/*
 * Vehicle object to simulate real-world vehicles. Tracks passenger limit, fuel capacity and mpg of the vehicle.
 * 
 * Includes fuelNeeded() method to calculate fuel used on a trip of x miles, and custom copy() and toString() methods
 */
class Vehicle {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity
	int mpg; // fuel consumption in miles per gallon

	/*
	 * Default Constructor, sets default values when no custom parameters are
	 * included
	 */
	public Vehicle() {
		this.passengers = 5;
		this.fuelcap = 16;
		this.mpg = 15;
	}

	/*
	 * Overloaded constructor, sets variables using input parameters
	 */
	public Vehicle(int pass, int fuel, int mpg) {
		this.passengers = pass;
		this.fuelcap = fuel;
		this.mpg = mpg; // Using *this* to avoid ambiguity
	}

	public double fuelNeeded(int miles) {
		return miles * 1.0 / mpg;
	}

	public int getRange() {
		return mpg * fuelcap;
	}

	/*
	 * Custom toString method because bored. Prints out stats of vehicle.
	 * 
	 * Overrides default toString() method for Java objects (hence @Override)
	 */
	@Override
	public String toString() {
		return ("VEHICLE STATS - Passengers: " + this.passengers + " people, Fuel Capacity: " + this.fuelcap
				+ " gallons, MPG: " + this.mpg);
	}

	/*
	 * Copy method because bored
	 */
	public Vehicle copy() {
		Vehicle temp = new Vehicle();
		temp.passengers = this.passengers;
		temp.fuelcap = this.fuelcap;
		temp.mpg = this.mpg;

		return temp; // Could also use return new Vehicle(this.passengers, this.fuelcap, this.mpg);
						// for brevity
	}
}

/*
 * Driver method to test everything
 */
class Lab3 {
	public static void main(String args[]) {

		// Testing default constructor
		Vehicle minivan = new Vehicle();

		// Testing overloaded constructor
		Vehicle minivan2 = new Vehicle(5, 14, 21);

		// Testing copy method
		Vehicle minivan3 = minivan.copy();

		// ensuring copy method works properly to create new object
		minivan3.passengers = 9;
		minivan3.fuelcap = 90;

		// Testing fuelNeeded() method
		System.out.println("Fuel needed: " + String.format("%.2f", minivan.fuelNeeded(100))
				+ " gallons (formatted to 2 decimal places)"); // formatted to 2 decimal places because bored

		// Testing getRange() method
		System.out.println("Range: " + minivan.getRange() + " miles");

		// Testing toString, as well as showing differences in objects using different
		// methods to instantiate objects
		System.out.println(minivan);
		System.out.println(minivan2);
		System.out.println(minivan3);
	}
}
