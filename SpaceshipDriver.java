class SpaceshipDriver {
	public static void main (String[] args)
	{
		//testing default constructor
		Spaceship newShip = new Spaceship();
		System.out.println("Default ship: " + newShip);
		
		//testing copy method
		Spaceship newShipCopy = newShip.copy();
		
		//testing setter methods
		newShipCopy.setMPG(900);
		newShipCopy.setTravelMedium("Water");
		System.out.println("Copied ship with changes: " + newShipCopy);
		
		//testing custom speed method (using static variable)
		System.out.println("Ship\'s speed relative to light: " + newShip.getRelativeToLightSpeed());
		
		//testing custom equals method
		System.out.println("Ship 1 equal to ship 2: " + newShip.equals(newShipCopy));
		Spaceship newShipExactCopy = newShip.copy();
		System.out.println("Ship 1 equal to ship 3: " + newShip.equals(newShipExactCopy));
		
		//testing constructor with input parameters
		Spaceship newShip2 = new Spaceship(500, 199.3, "Water", 50);
		System.out.println("Ship with custom parameters: " + newShip2);
	}
}
	
