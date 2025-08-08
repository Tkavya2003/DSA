package DSA.list.array.practice.basicQuestion;

import java.util.Arrays;

public class maxNum {
    public static void main(String[] args) {
        int num[]={15,78,98,15,78,19,4,5};
        int max=num[0];
        int min=num[0];
        for (int i:num){
            if(max<i) max=i;
            if(min>i) min=i;
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static class print2D{
        public static void main(String[] args) {
            int[][]matrix={{15,12,19},{26,28,22},{34,36,32}};
            int[][]mar= Arrays.copyOf(matrix,matrix.length);
            for (int i=0;i< mar.length;i++){
                for (int j=0; j< mar.length; j++){
                    System.out.print(mar[i][j]+" ,  ");
                }
                System.out.println();
            }

        }
    }
}
