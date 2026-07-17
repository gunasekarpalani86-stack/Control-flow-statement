import java.util.Scanner;

class dm 
{
	
	/* Read the age from the User and check the person is eligible  to Vote 
	
	Note : If the person age is Greater then 18 they are eligible to Vote or else not Eligible */
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
	  System.out.print("Enter Your Age  to Check the Voter Eligiblity : ");
	  
	  int age=sc.nextInt();
	  
	  if (age>=18 && age<150)
	  {
		  System.out.println("You're eligible to Vote");
	  }
	  else if (age>=150)
	  {
		  System.out.println("Please enter valid Age ");
	  }
	  else
		  System.out.println("You're Not-eligible to Vote");
	  
	}
}
