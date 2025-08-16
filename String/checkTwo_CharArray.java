package DSA.String;

import java.util.Arrays;
import java.util.Scanner;

public class checkTwo_CharArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a first string I will convert into a char array");
        char[] ar=sc.nextLine().toCharArray();
        System.out.println("please enter a second string I will convert into a char array");
        char[] arr=sc.nextLine().toCharArray();

        Arrays.sort(ar); Arrays.sort(arr);
        System.out.println(Arrays.equals(ar,arr));
    }
}
