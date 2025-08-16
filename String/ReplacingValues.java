package DSA.String;

public class ReplacingValues {
    public static void main(String[] args) {

        //multiline String with line separated.
        String letter= """ 
                Hi my name is Name
                I live is City
                I love my country Country
                """;

        //Replacing the Elements of a string.
        String Print=letter.replace("Name","Kavya Tomar").replace("City","Gwalior").replace("Country","India");

        System.out.println("\n"+Print);

        //also fine how many letter in the sentence
        char[] ch=Print.toCharArray();
        int count=1;
        for(int i=0; i<ch.length; i++){
            if(Character.isLetter(ch[i])){
                count++;
            }
        }
        System.out.println("The no. of letter in a sentence with spaces :- "+ch.length);
        System.out.println("The no. of letter in a sentence without spaces :- "+count);
    }

}
