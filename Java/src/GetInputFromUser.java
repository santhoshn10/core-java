import java.util.Scanner;

public class GetInputFromUser {

    public static void main(String args[]) {
     Integer a;
     Float b;
     String c;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Integer value:");
        a=scanner.nextInt();
        System.out.println("Entered value is :"+a);

        System.out.println("Enter Float Value:");
        b=scanner.nextFloat();
        System.out.println("Entered Value:"+b);

        System.out.println("Enter String ");
        c=scanner.nextLine();
        System.out.println("EnteredLine is :"+c);


    }
}
