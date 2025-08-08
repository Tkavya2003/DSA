package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;

public class WithoutUsingMethod {
    public static void main(String[] args) {
        int []arr={15,23,62,95,96,34,1,4,6,17};
        int []arr1={15,23,62,95,96,34,1,4,6,17};

        //This is user define ascending sorting method
       /*--------------------------------------------------
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }------------------------------------------------*/

        //This is user define descending sorting method
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // sorting on the basis of last digit in an array values
        /*--------------------------------------------------
        for(int i=0; i<arr1.length-1; i++){
            for(int j=0; j<arr1.length-i-1; j++){
                if(arr1[j]%10>arr1[j+1]%10){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }---------------------------------------------------*/

        // sorting on the basis of first digit in an array values
        /*for(int i=0; i<arr1.length-1; i++){
            for(int j=0; j<arr1.length-i-1; j++){
                if(arr1[j]/10>arr1[j+1]/10){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }-----------------------------------------------------*/
        System.out.println(Arrays.toString(arr));

//        This line print the Array arr1
//        System.out.println(Arrays.toString(arr1));
    }
}
