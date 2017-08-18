import java.util.Scanner;

public class FharenheitToCelsius {

    public static void main(String args[]){

        Float temparature;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Temperature in Farenheit: ");

        temparature=scanner.nextFloat();

        temparature=((temparature-32)*5)/9;

        System.out.println("Enter Temperature in celsius is : "+ temparature);

    }
}
