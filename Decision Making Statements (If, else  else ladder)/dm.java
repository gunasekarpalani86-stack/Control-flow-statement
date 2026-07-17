import java.util.Scanner;

class dm 
{
	
	/* Get the number from user and check the number positive or negative or Zero using  Nested if */
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the number :");
		
		int num=sc.nextInt();
		
		if(num>=0){
			if(num==0)
				System.out.println("The Enter number is Zero ");
			else
				System.out.println("The Enter number is Positive Number");
		}
		else {
			System.out.println("The Enter number is Negative Number ");
		}
		
	}
}
