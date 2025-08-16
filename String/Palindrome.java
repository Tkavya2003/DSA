package DSA.String;

public class Palindrome {
    public static void main(String[] args) {
        String st="madam";

        //Converting the sting into a char array.
        char []ch=st.toCharArray();

        //cheating a string to temporarily storing the data of ch array.
        char []temp=new char[ch.length];
        int i=0;

        for(int a=ch.length-1; a>=0; a--){
            temp[i]=ch[a];
            i++;
        }

        //Convert char data into a string.
        String st2=String.valueOf(temp);

        if(st.equals(st2)){
            System.out.println("Yes, It is a palindrome");
        }else {
            System.out.println("No, It is not a palindrome");
        }

        //There is another way to find the String is palindrome or not.
        boolean str=st.equals(new StringBuffer(st).reverse().toString());
        System.out.println("It is palindrome :- "+str);
    }
}
