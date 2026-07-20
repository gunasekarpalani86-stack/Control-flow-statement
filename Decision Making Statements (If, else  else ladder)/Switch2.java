import java.util.Scanner;

/**
 * mass
 */
public class mass {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number : " );
        int n=sc.nextInt();
        
        switch (n%7) {

            case 1:System.out.println("This is Sunday");  
            break;

            case 2:System.out.println("This is Monday"); 
            break;

            case 3:System.out.println("This is Thusday");
            break;

            case 4:System.out.println("This is Wednesday");
            break;

            case 5:System.out.println("This is Thursday");
            break;

            case 6:System.out.println("This is Friday");
            break;

            case 7%7:System.out.println("This is Saturday");
            break;

        }
    }
}
