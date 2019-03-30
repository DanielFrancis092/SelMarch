package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		List<String> mentors = new ArrayList<>();
		mentors.add("Balaji");
		mentors.add("Gayatri");
		mentors.add("Koushik");
		mentors.add("Sarath");
		mentors.add("Mohan");
		
		mentors.remove("Koushik");
		
		System.out.println(mentors);
		
		System.out.println("Size "+mentors.size());
		Set<String> newmentors = new TreeSet<>();
		newmentors.addAll(mentors);
		System.out.println(newmentors);
		
		
		
		
		
		
		

	}

}
