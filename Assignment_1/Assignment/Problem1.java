package Assignment;

public class Problem1 
{
	public static void printstars(int n)
	{
		
	int i,j;
	for (i=0;i<n;i++)  //outer loop where the value of i starts from 0 and keeps incrementing
	{
		for (j=0;j<=i;j++)  //inner loop of j
		{
			System.out.print("* ");
		}
		
		
		System.out.println(" ");
		System.out.println(" ");
		
	}


	}
	public static void main(String[] args) 
	
	{
		int n=4;
		printstars(n);

		

	}

}
