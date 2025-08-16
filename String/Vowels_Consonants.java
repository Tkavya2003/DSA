package DSA.String;

import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine().toLowerCase();
        char j;
        int countVowels=0;
        int countConsonant=0;

        //Converting the sting into a char array.
        char []ch=st.toCharArray();


        for(int a=0; a<ch.length; a++){
           j=ch[a];

           //check either a given is char or symbol.
            if(Character.isLetter(ch[a])) {
                if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u' || j == 'A' || j == 'E' || j == 'I' || j == 'O' || j == 'U') {
                    countVowels++;
                } else {
                    countConsonant++;
                }
            }
        }
        System.out.println(countVowels +" "+countConsonant);
    }
}
