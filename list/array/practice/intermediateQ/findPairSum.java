package DSA.list.array.practice.intermediateQ;

public class findPairSum {
    public static void main(String[] args) {
        int []arr={1, 5, 2, 9, 6, 7, 2, 6, 8, 7, 5, 9, 6, 3, 7, 2, 6, 8};
        int target = 15, count=0;

        //finding the target value in the array by adding to index value
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("The value of first index is "+i+" , The second index is  "+j);
                    count++;
                }
            }
        }
        System.out.println("The no. of target is found in the array "+count);
    }
}
