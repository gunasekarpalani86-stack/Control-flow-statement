import java.util.Scanner;

/**
 * mass
 */
public class mass {

    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        
       System.out.print("Enter the Letter : ");
       char le=sc.next().charAt(0);

       switch (le) {
        case 'a','A':
        case 'e','E':
        case 'i','I':
        case 'o','O':
        case 'u','U'-> System.out.println("The enter letter is Vowel :" + le);
        break;
       
        default:
            System.out.println("The entered Letter is consonet");
       }



    }
}
