package ExceptionHandling;

import java.util.Scanner;

public class Use_of_exp {

	public static void main(String[] args) 
	{
		
		Use_of_exp obj=new Use_of_exp();
		try 
		{
			obj.demo();
		} 
		catch (BashatExp e) 
		{
			System.out.println("MSG="+e.getMessage());
		}

	}
	
	public void demo() throws MansiExp
	{
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Numbers : ");
		num1=sc.nextInt();
		if(num1>0)
		{
			throw new MansiExp("It is an Positive Number");
		}
		else
		{
			throw new MansiExp("It is an Negative Number");
		}
	}

}