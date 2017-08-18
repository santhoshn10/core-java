import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]){

        String s="";

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a string to check for palindrome:");

        s=scanner.nextLine();

        int i=s.length();


        String reverse="";
        for(int j=(i-1);j>=0;j--){
            reverse=reverse+s.charAt(j);
        }

        System.out.println("Reverse is :"+reverse);



        if(s.equalsIgnoreCase(reverse)) {
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }

    }
}
