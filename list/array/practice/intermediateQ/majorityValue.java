package DSA.list.array.practice.intermediateQ;

public class majorityValue {
    public static void main(String[] args) {
        int []arr = {2, 2, 1, 1, 2, 2, 2};
        int count=1;
        int majorElement=-1;
        int majorValue=0;


        for(int i=0;i<arr.length-1;i++){

            for (int j=i+1;j<arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(arr.length/2< count){
                majorElement=arr[i];
                majorValue=count;
                break;
            }
        }
        if(majorElement!=-1){
            System.out.println("The majorElement and majurValue is "+majorElement +" "+majorValue);
        }else {
            System.out.println("No major element is found");
        }
    }
}
