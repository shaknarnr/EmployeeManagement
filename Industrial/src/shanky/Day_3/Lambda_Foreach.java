package shanky.Day_3;

import java.util.ArrayList;

public class Lambda_Foreach {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		
		System.out.println(al);
	/*	
		for (Integer integer : al) {
			
			System.out.println(integer );
			
			System.out.println(al);
		}*/
		
		al.forEach((aa) -> System.out.println(aa));
		
		
		ArrayList<String> ll=new ArrayList<>();
		
		ll.add("Shan");
		ll.add("Shan");
		ll.add("Shan");
		ll.add("Shan");
		ll.add("Shan");
		
		System.out.println(ll);
		
		ll.forEach((bb) -> System.out.println(bb));
		
		
		

	}

}
