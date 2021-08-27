package shanky.string.hashcode;

public class EqualsExample_2 {

	public static void main(String[] args) {
	
		String s1="javatpoint";
		String s2="javatpoint";
		String s3="Javatpoint";
		
		System.out.println(s1.equals(s2));
		
		if(s1.equals(s3)){
			System.out.println("Both string are same");
		}else
			
		{
			System.out.println("Both String are Different");
		}

	}

}
