package shanky.string.hashcode;

public class EqualsExample_4 {

	public static void main(String[] args) {
		
		String str="a";
		String str1="129";
		String str2="45.89";
		String str3="false";
		
		Character c =new Character('a');
		Integer   i=new Integer(129);
		Float  f=new Float(45.89);
		Boolean b=new Boolean(false);
		
		// reference of the Character object is passed  
		System.out.println(str.equals(c));
		
		// reference of the integer object is passed 
		System.out.println(str1.equals(i));
		
		// reference of the Float object is passed 
		System.out.println(str2.equals(f));
		
		// reference of the Boolean object is passed 
		System.out.println(str3.equals(b));
		
		System.out.println(str.equals(c.toString()));
		System.out.println(str1.equals(i.toString()));
		System.out.println(str2.equals(f.toString()));
		System.out.println(str3.equals(b.toString()));
				
	

	}

}
