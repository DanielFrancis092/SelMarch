package week3.day1;

public class Audi extends Car {
	public void airBag() {
		System.out.println("Air Bag available");
	}

	public void brake()
	{
		super.brake();
		System.out.println("ABS Brake");
	}
}
