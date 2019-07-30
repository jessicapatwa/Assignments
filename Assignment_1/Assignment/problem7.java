package Assignment;

public class problem7 
{

	public static void main(String[] args)
	{
		for(int i=1; i<=5;i++)  //outer for loop
		{
		int temp = i;    //assigning i value as integer temp
		for (int j=1; j<= i;j++)  //inner for loop
		{
			System.out.print(temp + " ");  //printing numbers from 1
			temp=temp + 1;  //adding 1 to the number ; hence incrementing
		}
			temp = temp - 2;  //subtracting 2 if the inner for loop condition doesnt match
			for(int k=i-1; k>=1;k--)
			{
				System.out.print(temp+" ");
				temp=temp-1;
			}
			System.out.println();
		}

	}

}
