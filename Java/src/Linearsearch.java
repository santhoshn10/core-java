import java.util.Scanner;

public class Linearsearch {

    public static void main(String args[]){

        System.out.println("Enter no of elements you wish search :");


        int i,j,k;


        Scanner scanner= new Scanner(System.in);
        i=scanner.nextInt();

        int array[]=new int[i];
        System.out.println("Enter Series of elements you wish search");


        for (j=0;j<i;j++){

            array[j]=scanner.nextInt();
        }
        System.out.println("Enter the elements you wish search");
         k=scanner.nextInt();
         for (j=0;j<i;j++){
             if(array[j] ==k){
                 System.out.println("the element is at position :"+(j+1));
             }
         }

    }
}
