package shanky.Day_3;

import java.util.HashMap;

public class HashMappp {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<>();
		 
		hm.put(1, "Shankar");
		hm.put(2, "Shankar");
		hm.put(3, "Shankar");
		hm.put(4, "Shankar");
		hm.put(5, "Shankar");
		
		hm.forEach((aa,bb) -> System.out.println("key :"+aa +"  value : " +bb ));
		  
		System.out.println("-------------------------------------------------------");
		//System.out.println("-------------------------------------------------------");
		
		hm.put(11, "Manya");
		hm.put(12, "Manya");
		hm.put(13, "Manya");
		hm.put(14, "Manya");
		hm.put(15, "Manya");
		
		hm.forEach((cc,dd) -> System.out.println("key :"+cc + "  value : " +dd));
		
		System.out.println("-------------------------------------------------------");
		
		
		HashMap<Integer, Integer> hmm=new HashMap<>();
		
		hmm.put(1, 100);
		hmm.put(2, 100);
		hmm.put(3, 100);
		hmm.put(4, 100);
		hmm.put(5, 100);
		
		System.out.println(hmm);
		System.out.println("==========================================");
		
		hmm.forEach((xx,yy) -> System.out.println("key :" +xx +"  value : "+yy));
		
		
         
	}

}
