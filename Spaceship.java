/*
 * Simple custom Spaceship class
 * 
 * Author: Sam Mortinger
 * 
 */

/*
 * Custom Spaceship class, holds info about the vehicle in private variables and contains getter and setter methods
 */
class Spaceship
{
	static final double lightSpeed = 670616629.38;
	private double mpg;
	private double speed;
	private String travelMedium;
	private double fuelCap;
	
	/*
	 * Default constructor method
	 */
	Spaceship ()
	{
		this.mpg = 1500;
		this.speed = lightSpeed/2;
		this.travelMedium = "Space";
		this.fuelCap = 15000.5;
	}
	
	/*
	 * Overloaded constructor method which sets all attributes from user input
	 */
	Spaceship (double speed, double mpgIn, String travelMediumIn, double fuelIn)
	{
		this.speed = speed;
		this.mpg = mpgIn;
		this.travelMedium = travelMediumIn;
		this.fuelCap = fuelIn;
	}
	
	/*
	 * Custom copy method to allow copying of vehicles
	 * 
	 * To-Do: Fix for copying from Trucks to Cars
	 */
	public Spaceship copy()
	{
		Spaceship temp = new Spaceship();
		temp.setTravelMedium(this.travelMedium);
		temp.setFuelCap(this.fuelCap);
		temp.setMPG(this.mpg);
		temp.setSpeed(this.speed);
		
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
	 * Returns speed of spaceship in mph
	 */
	public double getSpeed ()
	{
		return this.speed;
	}
	
	/*
	 * Returns the speed of spaceship in km/h
	 */
	public double getSpeedKM()
	{
		return this.speed*1.6;
	}
	
	public double getRelativeToLightSpeed()
	{
		return this.speed/lightSpeed;
	}
	
	/*
	 * Returns The medium through which the ship can travel
	 */
	public String getTravelMedium ()
	{
		return this.travelMedium;
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
	public void setSpeed (double speedIn)
	{
		this.speed = speedIn;
	}
	
	/*
	 * Sets brand of vehicle
	 */
	public void setTravelMedium (String mediumIn)
	{
		this.travelMedium = mediumIn;
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
		return ("Travels through: " + this.getTravelMedium() + ", Speed (mph): " + this.getRelativeToLightSpeed() + " times speed of light, Mileage: " + this.getMPG() + ", Fuel Capacity: " + this.getFuelCap() + ", Range: " + this.getRange());
	}
	
	/**
	 * Compares object attributes to check for deep equality
	 * @param toCheck The object being checked for equality. Must be of type spaceship.
	 * @returns true if objects are equal, false otherwise
	 */
	public boolean equals(Spaceship toCheck)
	{
		return (toCheck != null && this.getFuelCap() == toCheck.getFuelCap() && this.getMPG() == toCheck.getMPG() && this.getSpeed() == toCheck.getSpeed() && this.getTravelMedium().equalsIgnoreCase(toCheck.getTravelMedium()));
	}
}