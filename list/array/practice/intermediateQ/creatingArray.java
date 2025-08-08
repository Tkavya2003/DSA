package DSA.list.array.practice.intermediateQ;

public class creatingArray {
    public static void main(String[] args) {
        int sum=0;
        int max=0;

        int[] arr={15,78,9,9,78,5,65,45};
        int min=arr[0];
        for(int i:arr){
            if(max<i){
                max=i;
            }
            if(min>i){
                min=i;
            }
            sum+=i;
            System.out.println(i);
        }
        System.out.println("The sum of a array is : "+sum);
        System.out.println("The maximum no. is: "+max);
        System.out.println("The minimum no. is: "+min);

        System.out.println();
//        Arrays.sort(arr);
//        System.out.println("print the array in reverse order");
//        int i=0, j=0;
//        for(i=0, j=arr.length-1; i<j;i++, j--){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//
//        }
//        System.out.println(Arrays.toString(arr));

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter a no.");
//        int value= sc.nextInt();
//
//        for(i=0; i<arr.length;i++){
//           if(value==arr[i]){
//               System.out.println("The data is found at index : "+i);
//               break;
//           }
//        }
        int even=0,odd=0;
        for(int m:arr){
            if(m%2==0){
                even++;
            }else {
                odd ++;
            }
        }
        System.out.println("The no. of even and odd are "+even+" , "+odd);

//        int []arr1=new int[arr.length];
//        for(int K=0;K<arr.length;K++){
//            arr1[K]=arr[K];
//            System.out.println(arr1[K]);
//        }

        boolean hasDuplicate=false;
        for (int a=0;a<arr.length; a++){
            for(int b=a+1;b<arr.length;b++){
                if(arr[a]==arr[b]){
                    hasDuplicate=true;
                    break;
                }
            }
        }
        System.out.println(hasDuplicate);

    }
}
