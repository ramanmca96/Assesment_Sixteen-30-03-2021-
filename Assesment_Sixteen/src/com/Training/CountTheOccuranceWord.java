package com.Training;

import java.util.HashMap;
import java.util.Scanner;

public class CountTheOccuranceWord {

	public static void main(String[] args) {
		
		//Get The words from User
		System.out.println("Enter The Words:");
		Scanner scan=new Scanner(System.in);
		String Words = scan.nextLine();
		
		//Use Hashmap to find key and value
		HashMap<Character, Integer>map=new HashMap<>();
		
		
		for (int i = 0; i < Words.length(); i++) {
			char charAt = Words.charAt(i);
			
			if (map.containsKey(charAt)) {
				
				map.put(charAt, map.get(charAt)+1);
				
			}
			else {
				map.put(charAt, 1);
		}
		
	}
	System.out.println(map);
	}
	
	
}
