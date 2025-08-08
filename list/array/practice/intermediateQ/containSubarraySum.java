package DSA.list.array.practice.intermediateQ;
import java.util.HashSet;
import java.util.Set;
public class containSubarraySum {
        public static void main(String[] args) {
            int[] arr = {4, 2, -3, 1, 6};

            if (hasZero(arr)) {
                System.out.println("Yes, there exists a subarray with sum 0");
            } else {
                System.out.println("No, there is no subarray with sum 0");
            }
        }

        public static boolean hasZero(int []arr){
            Set<Integer> set=new HashSet<>();
            int sum=0;
            for(int i:arr){
                sum+=i;
                // If prefix sum is 0 or already seen before
                if(sum==0 || set.contains(sum)){
                    return true;
                }
                set.add(sum);
            }
            return true;
        }
}


