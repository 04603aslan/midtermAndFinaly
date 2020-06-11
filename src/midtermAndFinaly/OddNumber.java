package midtermAndFinaly;

import java.util.Scanner;

public class OddNumber
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("Please Enter Number : ");
		
		int factorial=scan.nextInt();
		
		int sum=0,sum1=0,result;
		
		
		
		for (int i = 0; i < factorial; i++) 
		{
			result=i%2;
			if(result==0)
			{
				sum=sum+i;
			}
			else if(result==1)
			{
				sum1=sum1+i;
			}
		}
		System.out.println(sum1);
	}

}
