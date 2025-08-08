package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class mergeArrays {
    public static void main(String[] args) {
        int []arr={1,5,12,89,56,17,22,46,38};
        int []arr1={11,55,19,92,23,87,22,46,38};
        Integer []arrMerge=new Integer[arr.length+ arr1.length];

        //Merging to arrays
        for (int i=0 , j=0 ;i<arrMerge.length; i++){
            if(i<arr.length){
                arrMerge[i]=arr[i];
            }else{
                arrMerge[i]=arr1[j++];
            }
        }
        System.out.println(Arrays.toString(arrMerge));

        //for removing duplicates
        Set<Integer> set= new HashSet<>();
        Collections.addAll(set,arrMerge);
        System.out.println(set);
    }
}
