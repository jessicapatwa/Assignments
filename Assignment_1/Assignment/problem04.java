package Assignment;

public class problem04 
{
	
	public static void main(String[] args) 
	{
		int i,j;
		int n = 4;
		for (i=1;i<=n;i++)  //outer loop for incrementing the value of i from its 0th position
			
		{
			for (j=n;j>=i;j--)   //inner for loop for decrementing the j value starting with 4th location
			{
				System.out.print("* ");  //printing stars
			}
			
			//for space in increasing order
			
			for(int k=1;k<i;k++)
			{
			System.out.print(" ");
			}
			System.out.println("\n");   //for new line
		}


		}
	
	

	}


