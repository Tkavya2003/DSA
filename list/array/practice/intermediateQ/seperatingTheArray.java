package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;

public class seperatingTheArray {
    public static void main(String[] args) {
        int []Arr={15,-89,59,-96,-52,-5,35,95,-12,-23,88,-16};
        int []pos=new int[Arr.length];
        int []neg=new int[Arr.length];

        //insert the value in a new array on the basis of value nature
        for(int i=0,k=0,j=0; i<Arr.length ; i++){
            if(Arr[i]>0){
                pos[k++]=Arr[i];
            }else {
                neg[j++]=Arr[i];
            }
        }
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
    }
}
