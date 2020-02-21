
public class VehicleDemo {
	public static void main (String[] args)
	{
		Vehicle1 newVehicle = new Vehicle1();
		
		//Testing overloaded constructor
		Vehicle1 newVehicle1 = new Vehicle1(5, 15.2, "Honda", 18);
		
		//Testing copy function
		Vehicle1 newVehicle2 = newVehicle.copy();
		
		//Ensuring references point to different objects
		newVehicle2.setBrand("Hyundai");
		System.out.println("Vehicle1 is the same from Vehicle2: " + (newVehicle1 == newVehicle2));
		
		//Testing custom getRange() method
		System.out.println("Vehicle Range: " + newVehicle1.getRange());
		
		System.out.println("Vehicle 1's Brand: " + newVehicle.getBrand() + ", Vehicle 2's Brand: " + newVehicle2.getBrand());
		
		System.out.println ("The range of this vehicle is " + newVehicle.getRange() + " miles");
		
		//Testing custom print function
		System.out.println(newVehicle1);
	}
}
