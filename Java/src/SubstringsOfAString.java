import java.util.Scanner;

public class SubstringsOfAString {

    public static void main(String args[]){
        String string, sub;
        int i, c, length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string  = in.nextLine();

        length = string.length();
        System.out.println(length);
        System.out.println("Substrings of \""+string+"\" are :-");

        for (i=0;i<length;i++){
            for(c=1;c<=length-i;c++){
                sub=string.substring(i,c+i);
                System.out.println(sub);
            }
        }
    }
}
