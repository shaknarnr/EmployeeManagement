package shanky.Day_3;

import java.util.ArrayList;

public class Stream {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		
		System.out.println(al);
		
		al.stream().forEach((aa) -> System.out.println(aa));
		
		//Stream api speed up the the method 

	}
	
	

}
