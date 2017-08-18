import java.util.Scanner;

public class Multipicationtable {

    public static void main (String args[]){

        int t,i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter MultiplicationTable value to be created: ");
         t=scanner.nextInt();
        for (i=0;i<20;i++){
               System.out.println("Value of " +t+"*"+i+"="+(t*i));
        }
    }

}
