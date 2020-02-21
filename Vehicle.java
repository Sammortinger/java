/*
 * Custom Vehicle class, holds info about the vehicle in private variables and contains getter and setter methods. 
 * For some reason, My IDE would not let me name the class Vehicle, as "Vehicle was already defined" (even though it wasn't)
 */
class Vehicle1
{
	private double mpg;
	private int seatNumber;
	private String brand;
	private double fuelCap;
	
	/*
	 * Default constructor method
	 */
	public Vehicle1 ()
	{
		this.mpg = 35;
		this.seatNumber = 5;
		this.brand = "Honda";
		this.fuelCap = 12.3;
	}
	
	/*
	 * Overloaded constructor method which sets all attributes from user input
	 */
	public Vehicle1 (int seats, double mpgIn, String brandIn, double fuelIn)
	{
		this.seatNumber = seats;
		this.mpg = mpgIn;
		this.brand = brandIn;
		this.fuelCap = fuelIn;
	}
	
	/*
	 * Custom copy method to allow copying of vehicles
	 */
	public Vehicle1 copy()
	{
		Vehicle1 temp = new Vehicle1();
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
	
	public boolean equals(Vehicle1 in)
	{
		return (this.mpg == in.getMPG() && this.brand.equalsIgnoreCase(in.getBrand()) && this.fuelCap == in.getFuelCap() && this.seatNumber == in.getSeats());
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