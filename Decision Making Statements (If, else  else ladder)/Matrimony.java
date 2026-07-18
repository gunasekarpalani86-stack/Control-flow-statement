/**
 * mass
 */
import java.util.Scanner;

public class mass {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Tamil Matrimony");
        System.out.println("To predict Guna's Future wife Please Enter the number 1 to 5 ");


        System.out.print("Enter the Number :");
        int n=sc.nextInt();

        if(n==1)
            System.out.println("The Guna future wife is Sai Pallavi");

        else if(n==2)
        System.out.println("The Guna future wife is Kayadu Lohar");

        else if(n==3)
        System.out.println("The Guna future wife is Malavika Mohanan");
        
        else if(n==4)
        System.out.println("The Guna future wife is Mamitha Baiju");
    else 
        System.out.println("Guna's Future wifes is Saipallavi and Kayadu Lohar");
        
    }


}
