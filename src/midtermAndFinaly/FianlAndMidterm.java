package midtermAndFinaly;

import java.util.Scanner;

public class FianlAndMidterm
{

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		
		float midterm,finaly,sum;
		
		
		
		System.out.print("Please Enter Midterm point :");
		
		midterm=scan.nextInt();
		
		midterm= (float) (midterm*(0.4));
		
		System.out.print("Please Enter Finaly  point :");
		
		finaly=scan.nextFloat();
		
		finaly =(float) (finaly*(0.6));
		
		sum=finaly+midterm;
		if(sum>=50)
		{
			System.out.println("Pass Point " + sum);
		}
		else
		{
		System.out.println("Fail Point " + sum);	
		}
		
		
	}

}
