package Assignment;
	import java.util.Arrays; 
	
	public class Problem11
	{  
	public static int removeDuplicateElements(int arr[], int n)
	{  
	        if (n==0 || n==1)    //if condition: if n=0 or n=1
	        {  
	            return n;  
	        }  
	        int[] temp = new int[n];    //assigning the new integer array as the temporary array
	        int j = 0;  
	        for (int i=0; i<n-1; i++)    //for loop condition(outer loop)
	        {  
	            if (arr[i] != arr[i+1])   //if condition: to check if the two consecutive array elements are not equal
	            {  
	                temp[j++] = arr[i];  //if true: assign the array with i size to the temp array whose size gets incremented every loop 
	            }  
	         }  
	        temp[j++] = arr[n-1];       
	        // Changing original array  
	        for (int i=0; i<j; i++)
	        {  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  
	       
	    public static void main (String[] args) 
	    {  
	        int arr[] = {1, 2, 3, 1, 2, 3, 4 };//unsorted array  
	        Arrays.sort(arr);//sorting array  
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
	    }  
	}  