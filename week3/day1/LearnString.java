package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		String text="TestLeaf";
		char[] textarray = text.toCharArray();
		for(int i=(textarray.length-1);i>=0;i--) {
			System.out.print(textarray[i]);
		}
	}

}
