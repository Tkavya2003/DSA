package DSA.list.array.practice.intermediateQ;

public class maxProduct {
    public static void main(String[] args) {
        int []arr={5,3,6,9,0,2,4,1,6,0,1,7};
        int max=0;
        String st="";
        int min =arr[0]+arr[1];
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length; j++){

                //This is using for finding the max product sum of two no
                if(arr[i]+arr[j]>max){
                    max=arr[i]+arr[j];
                }

                //This is using for finding the min product sum of two no
                if(arr[i]+arr[j]<min){
                    min=arr[i]+arr[j];
                }

                //Finding the values at product is zero
                if(arr[i]+arr[j]==0){
                   st="the index of i is "+ i+" and the index of j is "+j;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(st);
    }
}
