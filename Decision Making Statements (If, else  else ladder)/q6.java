import java.util.Scanner;

class dm 
{
	
	/* Read the Temperature and check whether the person has fever 
	
	Note : If the Temperature  of the person >37 print Fever detected 
	
	       or Else Temperature is normal*/
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
	  System.out.print("Enter your body temperature: ");
	  
	  double temp=sc.nextDouble();
	  
	  if (temp>37)
	  {
		  System.out.println("Fever detected");
	  }
	  else
		  System.out.println("Temperature is Normal ");
	  
	}
}
