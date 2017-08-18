import java.util.Scanner;
//Armstrong number is a number which is equal to sum of digits raise to the power total number of digits in the

//numberArmstrong number is a number which is equal to sum of digits raise to the

//power total number of digits in the number

public class Armstrong {

    public static void main (String args[]){

     int i=0,j=0,k,n,s=0,z=0;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number to verify Weather it is an arm strong or not: ");

        n=scanner.nextInt();

        k=n;
        //no.of digits
        while (k!=0){
            i++;
            k=k/10;
        }
        System.out.println(i);
        k=n;
        //divide the number by each digit
        while (k!=0){
         z=k %10;
         s=s+power(z,i);
         k=k/10;
        }
        System.out.println(s);
        System.out.println(n);

        if (n == s){
            System.out.println(n+" is Armstrong");
        }
        else{
            System.out.println(n+" is not Armstrong");
        }

    }
    static int power(int b, int m){
        int p=1,l;
        for(l=1;l<=m;l++){
            p=p*b;
        }
        return p;
    }
}
