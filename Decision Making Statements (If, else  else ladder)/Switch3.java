import java.util.Scanner;

/**
 * mass
 */
public class mass {

    
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number of the month : ");
        int num=sc.nextInt();

        switch (num) {
            case 3,4,5:

                System.out.println("This is Summer season");
                break;
				
				  case 6,7,8:

                System.out.println("This is Winter season");
                break;
				
				  case 9,10,11:

                System.out.println("This is Spring season");
                break;
				
				
				  case 12,1,2:

                System.out.println("This is Rainy season");
                break;
        }

    }
}
