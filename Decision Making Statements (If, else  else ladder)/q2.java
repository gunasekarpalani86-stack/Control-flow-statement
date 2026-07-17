import java.util.Scanner;

class dm 
{
	
	/* Get the number from user and check the number positive or negative or Zero using  Nested if */
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
	  System.out.print("Enter the number : ");
	  
	  int n=sc.nextInt();
	  
	  if (n%2==0)
	  {
		  System.out.println("The Entered Number is Even");
	  }
	  else
		  System.out.println("THe Entered Number is Odd");
	  
	}
}
