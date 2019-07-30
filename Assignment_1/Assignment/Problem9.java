package Assignment;

import java.util.Arrays;

public class Problem9 
{

	public static void main(String[] args) 
	{
		String[] alphabet = new String[] {"A","B","C"};    
		boolean result=Arrays.stream(alphabet).anyMatch("A"::equals);    //boolean return type
		if(result)   //if loop to print presence of A in array 
		{
			System.out.println("A is in the Array");
		}
		
		else
		{
			System.out.println("There isnt such value in the array"); //If "A" is present in the Array then the compiler prints
		}

	}

}
