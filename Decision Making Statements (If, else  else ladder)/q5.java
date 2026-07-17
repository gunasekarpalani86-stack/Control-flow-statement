import java.util.Scanner;

class dm 
{
	
	/* Read the Height and check whether the person is eligible for the ride 
	
	Note : If the height of the person >=140 print eligible for the ride 
	
	       or Else print not eligible for the ride */
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
	  System.out.print("Enter Your Height  In CM(Centi metre): ");
	  
	  double h=sc.nextDouble();
	  
	  if (h>=140)
	  {
		  System.out.println("You're eligible for Ride");
	  }
	  else
		  System.out.println("You're Not-eligible for Ride ");
	  
	}
}
