package week3.day2;

import week3.day1.Car;

public class LearnStatic {

	static int i =5;  
	int a =5;
	public void counter() {
		i++;
		a++;
		System.out.println("static: "+i+" non-static: "+a);
	}  
	public static void main(String[] args) {
		LearnStatic ls = new LearnStatic();
		ls.counter();
		ls.counter();
		LearnStatic ls1 = new LearnStatic();
		ls1.counter();
		ls1.counter();
		ls.counter();
		
		
		/*System.out.println(i);
		test(); 
		Car.acclerate();*/
	}
	
	/*static {
		System.out.println("i am static block");
	}
	public static void test() {
		System.out.println("test msg");
	}*/
}





