package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int []arr={1,5,12,89,56,17,22,46,38};
        int[]arr1=new int[arr.length];

        // This line takes the first element in an array
        int first=arr[0];
        for(int i=0; i<arr.length ;i++){

            //now adding data in a new array by after index 1
            if(i != arr.length - 1){
            arr1[i]=arr[i+1];
            }

            //Add the first value at the last
                arr1[arr.length - 1] = first;

        }
        System.out.println(Arrays.toString(arr1));
    }
}
