import java.util.Scanner;

class dm 
{
	
	/* Read the salary and check whether the employee is salary
	
	Note : if the Employee salary is more than 30000 print the employee the is eligible for the bonus or  print not eligible for the bonus*/
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
	  System.out.print("Enter Your Salary : ");
	  
	  int sal=sc.nextInt();
	  
	  if (sal>=30000)
	  {
		  System.out.println("You're eligible to get Bonus");
	  }
	  else
		  System.out.println("You're Not-eligible to get Bonus ");
	  
	}
}
