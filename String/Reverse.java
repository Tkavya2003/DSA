package DSA.String;

public class Reverse {
    public static void main(String[] args) {
        String st="Hi my name is Kavya Tomar";

        //Converting the sting into a char array.
        char []ch=st.toCharArray();

        //Printing the array into reverse order.
        for(int a=ch.length-1; a>=0; a--){
            System.out.print(ch[a]);
        }


        //Here I have one more way to print the array into reverse order.
        String reverse=new StringBuffer(st).reverse().toString();
        System.out.println(reverse);
    }
}
