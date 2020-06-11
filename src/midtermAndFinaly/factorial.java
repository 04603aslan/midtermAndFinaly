package midtermAndFinaly;

import java.util.Scanner;

public class factorial 
{
public static void main(String[] args)
{

	int multiplication=1;
	Scanner scan = new Scanner(System.in);
	 
	System.out.print("Please Enter Number : ");
	
	int factorial=scan.nextInt();
	
	/*for(int i=1;i<=factorial;i++)
	{
		multiplication=multiplication*i;
	}*/
	int loop=0;
	int result;
	while(loop<factorial)
	{
	
		multiplication=multiplication*(++loop);
		
	}
	
	System.out.println("factorial result is " +multiplication);
}
}
