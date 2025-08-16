package DSA.String;

import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String st=sc.nextLine();

        System.out.println("Please enter a one character");
        String ch=sc.next().substring(0,1);

        //This will replaceAll the character as you given in ch.
        String str=st.replaceAll(ch," ");
        System.out.println(str);
    }
}
