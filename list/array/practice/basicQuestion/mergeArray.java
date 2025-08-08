package DSA.list.array.practice.basicQuestion;

public class mergeArray {
    public static void main(String[] args) {
        int []e={14,15,26,34,42,5,15,25};
        int[]b={96,92,93,98,94};
        int[]merge= new int[e.length+b.length];

        for(int i=0;i<=e.length-1; i++){
            merge[i]=e[i];
        }
        for(int i=0;i<=b.length-1; i++){
            merge[e.length+i]=b[i];
        }
        for(int i:merge){
            System.out.print(i+" , ");
        }
    }
}
