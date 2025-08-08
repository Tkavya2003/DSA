package DSA.list.array.practice.intermediateQ;

import java.util.Arrays;

public class addValue{
    public static void main(String[] args) {
        //----This will remove the previous entered data----
//        int []arr=new int[]{15,16,16,46,13,4631,64};
//        arr[arr.length](15);


        //--This is predefined class use
/*        List<Integer> arr=new ArrayList<>();
        arr.add(15);
        arr.add(48);
        arr.add(95);
        arr.add(92);
        arr.add(56);
        System.out.println(arr);
        arr.add(50);
        for (int i:arr){
            System.out.println(i);
        }

 */
        //now without using predefined method add data in array
        int []arr={15,48,65,98};
        arrayData arrD=new arrayData();
        int []array=arrD.addData(arr.length,arr,50);
        System.out.println(Arrays.toString(array));
    }
}
class arrayData{
    public static int[] addData(int size, int arr1[], int nData){
        int newArray[]=new int[size+1];
        for(int i=0;i<size;i++){
            newArray[i]=arr1[i];
        }
        newArray[size]=nData;
        return newArray;
    }
}
