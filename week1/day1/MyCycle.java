package week1.day1;

public class MyCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// syntax - to call another class
		// ClassName referenceName = new ClassName();
		// Syntax to call method of a Class
		// referenceName.methodName();
		// referenceName.variableName;
		Bicycle mycycle = new Bicycle();
		mycycle.doRide();
		String color = mycycle.getColor("Son");
		System.out.println(color);
		String brandName = mycycle.brandName;
		System.out.println(brandName);
		

	}

	
	
	
	
	
	
	
}
