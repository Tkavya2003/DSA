package DSA.list.array.practice.basicQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Copy {
    public static void main(String[] args) {
        int a[] = {14, 82, 45, 62, 15, 18, 17, 34,34,5,8,5,6,6,6, 65, 67, 59, 84, 28, 24};
        int b[] = new int[a.length];
        for (int i = 0; i <=a.length-1; i++){
            b[i]=a[i];
        }
        Arrays.sort(b);
        Set<Integer> set=new HashSet<>();

        for(int i:b){
                set.add(i);
        }
        System.out.println(set);
    }
}
