package DSA.String;
import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        // This method remove the duplicate character in the string.
        System.out.println(duplicate(str));
    }
    public static String duplicate(String St){
        StringBuilder sb =new StringBuilder();

        //Track the ascii character.
        boolean []b=new boolean[256];

        for(int i=0; i<St.length(); i++){

            //Takes the string index value character in ch.
            char ch=St.charAt(i);

            //if character is not present in the array then go inside.
            if(!b[ch]){
                b[ch]=true;

                //Inserting the character in an StringBuilder.
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
