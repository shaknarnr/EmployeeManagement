package shanky.Day_3;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
/*
		al.add(20);
		al.add(21);
		al.add(24);
		al.add(25);
		al.add(26);
		al.add(26);
		al.add(26);

		System.out.println(al);

		for (Integer integer : al) {

			System.out.println(integer);
			
			System.out.println(al);

		}
		*/
		ArrayList<String> als = new ArrayList<>();
		
		als.add("Shankar");
		
		als.add("Shankarr");
		als.add("Shankarrr");
		als.add("Shankarrrr");
		als.add("Shankarrrrr");
		
		System.out.println(als);
		
		for (String abc :als) {
			
			System.out.println(als);
			
			System.out.println(abc);
		}

	}
	
	

}
