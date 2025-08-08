package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;
import java.util.Scanner;

public class deletingAtGiven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int []arr={15,46,8,632,98,8,3,49,56};
        int []arr1=new int[arr.length-1];

        //for deleting a given index in an array
        for(int i=0, j=0; i<arr.length; i++){
            if(i!=index){
                arr1[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
