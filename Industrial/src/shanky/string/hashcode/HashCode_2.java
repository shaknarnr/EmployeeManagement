package shanky.string.hashcode;

import java.util.Scanner;

public class HashCode_2 {

	public static void main(String[] args) {
		
		
		//Create integer object 
		
		System.out.println("Enter the Desire Input Value : ");
		
		Scanner readinput=new Scanner(System.in);
         
		Integer i=readinput.nextInt();
		
		readinput.close();
		
		 // Returned hash code value for this object  
		
		   int hashvalue=i.hashCode();
		   
		   System.out.println("Hashcode Value for Object is :" +hashvalue);
		      
	}

}
