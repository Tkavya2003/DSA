package DSA.String;

import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter a lowerCase string it will convert into upperCase");
        String st=sc.nextLine().toUpperCase();
        System.out.println(st);

        System.out.println("Please enter a UpperCase string it will convert into lowerCase");
        String st1=sc.nextLine().toLowerCase();
        System.out.println(st1);

        System.out.println("Please enter a more white spaces in this string it will it will remove those white spaces");
        String st2=sc.nextLine().replaceAll("   "," ");
        System.out.println(st2);

    }
}
