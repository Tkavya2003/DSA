package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;

public class findingMissing {
    public static void main(String[] args) {
        int []arr={1,2,3,5,6,7,8,9};

        //This is a logic to find the missing no. in 1 to n
       /* for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println("The missing no. is  "+(i+1));
                break;
            }
        }------------------------------------------------------*/

        //This is another way to find the missing no.
        int arrSum= Arrays.stream(arr).sum();
        System.out.println(arrSum);
        int n=arr.length+1;
        int expected=n*(n+1)/2;
        int missing=expected-arrSum;
        System.out.println(missing);
    }
}
