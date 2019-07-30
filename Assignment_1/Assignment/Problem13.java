package Assignment;


public class Problem13 {
	public static void main(String[] args)
	{
		int[] input = {20,20,30,40,50,50,50};  //store array values in input variable
		
		System.out.print("INPUT = ");
		
		//print the array values
		for(int i=0; i<input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("After removing duplicates= ");
		int length =0;  //initialize 0 to length
		
		//print the unique elements of an array after removing duplicate elements
		for(int i=0; i<input.length; i++)
		{
			boolean unique =false;   //false is stored to unique variable
			for(int n=i+1; n<input.length; n++)
			{
			if(input[i] == input[n])  //Each element of an array compared with every other element
			{
				 unique =true;     //store true to unique variable
				break;
			}
		}
		
			
		if(!unique) //if false, excludes the duplicate elements and the unique elements get printed 
		{


			System.out.print( input[i] + " ");
			length++;   //increment length every time a value printed
			
		}
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("The length of the new array= " + length ); //print the length
		
	}
}
