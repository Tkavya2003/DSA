package DSA.String;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {

        String st="this program convert the normal string to first letter capitalize in a each word";

        String []word =st.split(" ");

        System.out.println(" The sentence before converting the words  \n "+st +" \n\n The sentence after converting the words ");

        for(int i=0; i<word.length; i++){

            //This is a way to converting the sentences into a first letter capitalize
            word[i]=word[i].substring(0,1).toUpperCase()+word[i].substring(1);
            System.out.print(word[i]+" ");
        }
    }
}
