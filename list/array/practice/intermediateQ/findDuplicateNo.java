package DSA.list.array.practice.intermediateQ;

import java.util.HashSet;
import java.util.Set;

public class findDuplicateNo {
    public static void main(String[] args) {
        int []arr={8,6,5,9,5,3,4,6,2,2,4,7,9,6};
        Set<Integer> check=new HashSet<>();

        for(int i=0;i<arr.length-1;i++){
            if(check.contains(arr[i])){
                continue;
            }
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

                System.out.println("The value of "+ arr[i]+" repeating "+count);
            check.add(arr[i]);
        }
    }
}
