public class Strings {

    public static void main(String args[]){

        String s= "Java Programming",t="c",u="Love it";

        int length = s.length();

        System.out.println("Length of s String is: " + length);

        String r=s.replace("Java","C++");

        System.out.println("s String after replaced java to c++: " + r);


        String c=s.concat(u);

        System.out.println("s concat u is:"+ c);



    }
}
