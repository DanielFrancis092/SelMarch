package week1.day1;

public class Bicycle {
	// method syntax
	/*
	 * accessModifier returnType methodName(input arguments)
	 * access modifier
	 * 1. public
	 * 2. private
	 * 3. protected
	 * 4. default or package
	 * 
	 * syntax variables
	 * access modifier returnType varibaleName = value;
	 */
	public String brandName = "Hero";
	public boolean hasBasket = false;
	
	
	public void doRide() {
		System.out.println("Riding cycle");
	}
	public void performClean() {
		System.out.println("cleaning the cycle");
	}
	public String getColor() {
		return "red";
	}
	public String getColor(String whom) {
		if(whom.equalsIgnoreCase("son"))
			return "blue";
		else if(whom.equals("wife"))
			return "pink";
		else
		return "red";
	}
	public boolean isPuncture() {
		return true;
	}
	
	
	
	
	
	









}
