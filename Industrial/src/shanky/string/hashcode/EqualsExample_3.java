package shanky.string.hashcode;

import java.util.ArrayList;

public class EqualsExample_3 {

	public static void main(String[] args) {
		String s1="shankar";
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("manya");
		al.add("shankar");
		al.add("shan");
		al.add("Sunil");
		al.add("shekhar");
		
		System.out.println(al);
		
		for (String strng : al) {
			
			System.out.println(strng);
			
			if(strng.equals(s1))
			{
				System.out.println(" shankar is present");
			}
			
		}
	
	}

}
