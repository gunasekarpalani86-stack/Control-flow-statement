import java.util.Scanner;

public class mass {
//Get the input from the user and Find the second largest number //

    static Scanner sc= new Scanner(System.in);

    public static void main(String [] args)throws Exception{

        System.out.print("Enter the First number :");
        int n1=sc.nextInt();

        System.out.print("Enter the Second number :");
        int n2=sc.nextInt();
        
        System.out.print("Enter the Third number :");
        int n3=sc.nextInt();


        if(n1>n2 && n1>n3){

            System.out.println("The second largest number is "+ (n2>n3?n2:n3));

        }
        else if(n2>n1 && n2>n3){

            System.out.println("The second largest number is "+ (n1>n3?n1:n3));

        }

        else{

            System.out.println("The second largest number is "+ (n1>n2?n1:n2));

        }



    }
    
}
