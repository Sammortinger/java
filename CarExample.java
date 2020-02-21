/*
 * Simple custom object example using Cars and Trucks to show inheritance, constructor overloading, and method overriding
 * 
 * Author: Sam Mortinger
 * 
 * To-Do: Fix Copy method for child class
 */

import java.util.Scanner;
class CarExample {
	public static void main (String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		Car newVehicle;
		
		//Basic testing of custom Car and Truck objects
		System.out.println ("Were you in a car or a truck?");
		String vehicleType = scan.nextLine();
		if (vehicleType.equalsIgnoreCase("Car"))
		{
			newVehicle = new Car();
		}
		else
		{
			newVehicle = new Truck();
		}
					
		System.out.println ("How many miles per gallon does it get?");
		double mpg = scan.nextDouble();
		newVehicle.setMPG(mpg);
		String garbage = scan.nextLine();
		
		System.out.println ("What's the vehicle's brand?");
		String brand = scan.nextLine();
		newVehicle.setBrand(brand);
		
		//Testing overloaded constructor
		Car newVehicle1 = new Car(5, 15.2, "Honda", 18);
		
		//Testing copy function
		Car newVehicle2 = newVehicle.copy();
		
		//Ensuring references point to different objects
		newVehicle2.setBrand("Hyundai");
		
		//Testing custom getRange() method
		System.out.println(newVehicle1.getRange());
		
		System.out.println(newVehicle.getBrand() + " " + newVehicle2.getBrand());
		
		System.out.println ("The range of this vehicle is " + newVehicle.getRange() + " miles");
		
		System.out.println(newVehicle1);
		scan.close();
	}
}
	
/*
 * Custom Car class, holds info about the vehicle in private variables and contains getter and setter methods
 */
class Car
{
	private double mpg;
	private int seatNumber;
	private String brand;
	private double fuelCap = 12.3;
	
	/*
	 * Default constructor method
	 */
	Car ()
	{
		
	}
	
	/*
	 * Overloaded constructor method which sets all attributes from user input
	 */
	Car (int seats, double mpgIn, String brandIn, double fuelIn)
	{
		this.seatNumber = seats;
		this.mpg = mpgIn;
		this.brand = brandIn;
		this.fuelCap = fuelIn;
	}
	
	/*
	 * Custom copy method to allow copying of vehicles
	 * 
	 * To-Do: Fix for copying from Trucks to Cars
	 */
	public Car copy()
	{
		Car temp = new Car();
		temp.setBrand(this.brand);
		temp.setFuelCap(this.fuelCap);
		temp.setMPG(this.mpg);
		temp.setSeats(this.seatNumber);
		
		return temp;
	}
	
	/*
	 * Returns mileage for vehicle
	 */
	public double getMPG ()
	{
		return mpg;
	}
	
	/*
	 * Returns seat number of vehicle
	 */
	public int getSeats ()
	{
		return seatNumber;
	}
	
	/*
	 * Returns brand of vehicle
	 */
	public String getBrand ()
	{
		return brand;
	}
	
	/*
	 * Returns fuel capacity for vehicle
	 */
	public double getFuelCap()
	{
		return fuelCap;
	}
	
	/*
	 * Sets mileage for vehicle
	 */
	public void setMPG (double mpgIn)
	{
		mpg = mpgIn;
	}
	
	/*
	 * Sets seat number for vehicle
	 */
	public void setSeats (int seatsIn)
	{
		seatNumber = seatsIn;
	}
	
	/*
	 * Sets brand of vehicle
	 */
	public void setBrand (String brandIn)
	{
		brand = brandIn;
	}
	
	/*
	 * Sets fuel capacity of vehicle
	 */
	public void setFuelCap(double capIn)
	{
		fuelCap = capIn;
	}
	
	/*
	 * Returns range (mpg*fuelCapacity) of vehicle
	 */
	public double getRange()
	{
		return fuelCap*mpg;
	}
	
	public double fuelNeeded(int miles)
	{
		return miles/this.mpg;
	}
	
	/*
	 * Custom toString, prints all attributes of the vehicle
	 */
	@Override
	public String toString()
	{
		return ("Brand: " + this.brand + ", Seat Numbers: " + this.seatNumber + ", Mileage: " + this.mpg + ", Fuel Capacity: " + this.fuelCap + ", Range: " + this.getRange());
	}
}

/*
 * Child class of Car with some slight differences for Trucks
 */
class Truck extends Car
{
	public Truck ()
	{
		super();
		super.setFuelCap(19.1);
	}
	
	/*
	 * Untested copy method for child class
	 */
	public Car copy()
	{
		Car temp = new Car();
		temp.setBrand(this.getBrand());
		temp.setFuelCap(this.getFuelCap());
		temp.setMPG(this.getMPG());
		temp.setSeats(this.getSeats());
		return temp;
	}
	
	public void setMPG (double mpgIn)
	{
		super.setMPG(mpgIn*.9);
	}
	
	public double getRange()
	{
		return super.getFuelCap()*super.getMPG();
	}
}