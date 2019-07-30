package Assignment;

public class problem03 
{

	public static void main(String[] args) 
	{
		int n = 65;   //assigning integer value of n as 65
		for (int i=0;i<=4;i++)     //outer loop where the i starts with 0 and keeps incrementing till 4
		{
			
			for (int j=0;j<=i;j++)  //inner loop
			{
				System.out.print((char) n + " ");  //printing alphabets
			}
			n++;    //incrementation of n
			System.out.println();
		}
		}
	}


