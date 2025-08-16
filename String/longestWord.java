package DSA.String;

public class longestWord {
    public static void main(String[] args) {
        String st="This is a program to find the longest word in a sentence";

        //Here splitting the words with the help of white space.
        String []word =st.split(" ");
        int max=0,index=0,value=-1;

        //finding the maximum length size word with the help of for each loop.
        for(String Str: word){
            if(Str.length()>max){
                max=Str.length();
                value=index;
            }

            //increment the index value at every iteration
            index++;
        }

        System.out.println("The larges size is " +max +" and the word is "+word[value]);
    }
}
