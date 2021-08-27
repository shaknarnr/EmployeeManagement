package shanky.Day_3;

import java.util.ArrayList;

public class ParrellelStream {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		    al.add(20);
		    al.add(203);
		    al.add(205);
		    al.add(20);
		    al.add(11);
		    
		    System.out.println(al);
		    
		    al.parallelStream().forEach((aa) -> System.out.println(aa));

	}

}
