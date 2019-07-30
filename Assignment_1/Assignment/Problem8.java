package Assignment;

public class Problem8 
{

	public static void main(String[] args) 
	{
//		int i,j;
//		int k=1;
//		int n = 5;
//		for (i=n;i>=1;i--)					
//		{	
//			if(i==1)
//			{
//				k=0;
//				System.out.println();
//			}
//		
//			for (j=1;j<(2*i)-k;j++)
//			{
//				System.out.print("* ");
//				
//			} 
//			
//			System.out.println("\n");
//		}
		//print the rows
		int k=1;
		for(int i=4; i>=0; i--) //for loop initialization,declaration and decrement (iterate over rows)
		{
			if(i==0)
			{
				k=0;
			}
			if(i != 0 && i!=4)  //print a new line for every rows except for row(i) 1 and row(i) 4
			{
				System.out.println();
			}
			//print the columns
			for(int j=0; j<=i*2-k; j++) //for loop initialization,declaration and decrement (iterate over columns)
			{
				System.out.print("* ");
			
			}
			
			System.out.println();
			}
		}
		


}

