package DSA.list.array.practice.intermediateQ;

import java.util.HashSet;
import java.util.Set;

public class commonElement {
    public static void main(String[] args) {
        int []arr={16,84,9,562,3,48,56,15,26,35};
        int []arr1={11,34,24,45,33,48,56,15,26,35};
        int i,j;

        //This is using for finding the common values in two different array
        /*------------------------------------------------------
        for (i=0;i<arr.length;i++){

            for (j=0;j< arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println("The match is found : "+ arr[i]);
                }
            }
        }-------------------------------------------------------*/

        //This is using for finding the common values in two different array by using the set interface
        Set<Integer> set=new HashSet<>();
        for(int m: arr){
            set.add(m);
        }
        for(int n: arr1){
            if(set.contains(n)){
                System.out.println("The duplicate value is : "+ n);
            }
        }

    }
}
