package week1.day2;

public class LearnLoops {

	public static void main(String[] args) {
		//String txt = "Gayatri";
		String[] txt = new String[6];
		txt[0] = "Gayatri";
		txt[1] = "Sarath";
		txt[2] = "Koushik";
		txt[3] = "Balaji";
		txt[4] = "Mohan";
		txt[5] = "Babu";
		//syntax foreach
		for(String eachTxt : txt) {
			System.out.println(eachTxt); 
		}
		
		
		
		
		
		
		/*//syntax for getting size of array
		System.out.println(txt.length);
		for(int i=txt.length-1; i>=0; i--) {
			System.out.println(txt[i]);	
		}*/
		
		
		
		//syntax for loop
		/*for(int i=0; i<txt.length; i++) {
			System.out.println(txt[i]);	
		}*/
	}
}








