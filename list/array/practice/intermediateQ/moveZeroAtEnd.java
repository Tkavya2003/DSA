package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;


public class moveZeroAtEnd {
    public static void main(String[] args) {
        int []arr={8,0,5,9,0,3,4,0,2,0,4,7,0,6};
        int count=1;
        int n=arr.length;
        for(int i=0;i<n-count;i++) {
           while (arr[i]==0 && n-count>i){

               int temp = arr[i];
               arr[i] = arr[arr.length - count];
               arr[arr.length - count] = temp;
               count++;

           }
        }
        System.out.println(Arrays.toString(arr));
    }
}
