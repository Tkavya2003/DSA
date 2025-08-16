package DSA.String;

public class ReverseWord {

    public static String reverseWords(String str) {
        // Split the input string into words based on spaces
        String[] words = str.split(" ");

        // StringBuilder to build the final reversed-words string
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // Add a space before appending word (except for the very first one)
            if (i != 0 && i != words.length) {
                sb.append(" ");
            }

            // Reverse the current word
            words[i] = new StringBuffer(words[i]).reverse().toString();
            
            sb.append(words[i]);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String st="Reverse the words in a sentence at there on place";
        System.out.println(reverseWords(st));

        String[] arr=st.split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<arr.length;i++){

            //Takes the word one by one and convert into a char array for reverse the word.
            char [] ch=arr[i].toCharArray();

            for(int j=ch.length-1; j>=0; j--){


                //add the reverse order letter in a StingBuilder.
                sb.append(ch[j]);
            }
            sb.append(" ");

        }
        System.out.println(sb);
    }
}
