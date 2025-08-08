package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;

public class rotateArrayAtK {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int k=13;

        // Ensure k is within array length
        k=k%arr.length;

        // Step 1: Reverse entire array
        reverse(arr,0,arr.length-1);

        // Step 2: Reverse first k elements
        reverse(arr,0,k);


        // Step 3: Reverse remaining elements
        reverse(arr, k+1, arr.length-1);

        // Print result
        System.out.println(Arrays.toString(arr));

    }
    public static void  reverse(int []arr, int left, int right){
        while(left<right){
            int temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
    }
}
