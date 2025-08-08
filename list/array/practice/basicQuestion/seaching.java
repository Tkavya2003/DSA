package DSA.list.array.practice.basicQuestion;

import java.util.Scanner;

public class seaching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int flag=-1;
        int n=sc.nextInt();
        int[] ar={48,59,23,78,95,64,2,3,7623,795,318,46,94,31};
        for (int i=0; i<=ar.length; i++){
            if(ar[i]==n) {
                flag=i;
                break;
            }

        }
        if(flag<0){
            System.out.println("This data is not found");
        }else {
            System.out.println("Data is found on index "+ flag);
        }
    }
}
