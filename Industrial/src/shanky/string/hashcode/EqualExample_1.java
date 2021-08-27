package shanky.string.hashcode;

public class EqualExample_1 {    //Equals() method return type is => boolean

	public static void main(String[] args) {
		
		
		String s1="javatpoint";
		String s2="javatpoint";
		String s3="Javatpoint";
		String s4="python";
		
		System.out.println(s1.equals(s2)); //true as its content and case is same
		System.out.println(s1.equals(s3)); //false as its content is same but case is different
        System.out.println(s1.equals(s4)); //fase as its content is not same
	}

}
