package DSA.list.array.practice.intermediateQ;

public class secondLarget {
    public static void main(String[] args) {
        int []arr={15,87,95,62,37,12,63,19,16};

        //Here we are checking the array is sorted on not.
        for(int j=0; j<arr.length-1; j++){
            if(arr[j]>arr[j+1]){
                System.out.println("Array is not sorted in a ascending order");
                break;
            }
        }
        // Here we are finding a first max value
        int max=arr[0];
        int max2=0;
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        // Now finding the second max value in an array
        for (int i:arr){
            if(i<max && i>max2){
                max2=i;
            }
        }
        System.out.println(max+" , "+max2);
    }
}
