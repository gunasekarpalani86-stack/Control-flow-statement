import java.util.Scanner;

class dm 
{
	
	/* Get the number from user and check the number positive or negative or Zero using  Nested if */
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
	  System.out.print("Enter the First number : ");
	  int n1=sc.nextInt();
	  
	  System.out.print("Enter the Second number : ");
	  int n2=sc.nextInt();
	  
	  if (n1>n2)
	  {
		  System.out.println("The Number is " + n1 );
	  }
	  else if (n1==n2)
	  {
		  System.out.println("Both the numbers is Equal");
	  }
	  else {
		  System.out.println("The Largest number is " + n2);
	  }
	  
	}
}
