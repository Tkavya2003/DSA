package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;
import java.util.Scanner;

public class insertAtGiven {
    public static void main(String[] args) {
        int[] arr={15,78,49,16,23,19,26,22,19};
        Scanner sc=new Scanner(System.in);
        int position =sc.nextInt();
        int value=sc.nextInt();

//This is using for adding a value on a given index position
        int []arr1=new int[arr.length+1];
        for(int i=0 ,j=0;i<arr1.length; i++){
            if(i==position){
                arr1[i]=value;
            }else {
                arr1[i]=arr[j++];
            }
        }
        String st=Arrays.toString(arr1);
        System.out.println(st);
    }
}
