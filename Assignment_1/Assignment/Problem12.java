package Assignment;

import java.util.Scanner;

	public class Problem12
	{
	    public static void main(String[] args) 
	    {
	        int n, temp;
	        Scanner s = new Scanner(System.in);  //assigning s as the object for reading elements
	        System.out.print("Enter no. of elements you want in array(Minimum 2):");  //Enter no. of elements
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++)   //printing array values
	        {
	            a[i] = s.nextInt();
	        }
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j])    //if condition
	                {
	                    temp = a[i];   //assigning a[i] as the temporary value
	                    a[i] = a[j];    // copying a[i] value to a[j] 
	                    a[j] = temp;    //new temporary value is a[j]
	                }
	            }
	        }
	        System.out.println("Second Largest:"+a[n-2]); //subtracting 2 from the last array position; hence printing the second last array element 
	        System.out.println("Smallest:"+a[0]);      //printing the first array element 
	    }
	}