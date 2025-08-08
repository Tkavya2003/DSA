package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;

public class rightRotate {
    public static void main(String[] args) {
        int []arr={1,5,12,89,56,17,22,46,38};
        int[]arr1=new int[arr.length];

        // This line takes the first element in an array
        int last=arr[arr.length-1];

        //now adding data in a new array by after index 1
        arr1[0]=last;
        for(int i=1; i<arr.length ;i++){

            //Add the first value at the last
            arr1[i] = arr[i-1];

        }
        System.out.println(Arrays.toString(arr1));
    }
}
