package DSA.String;

import java.util.Scanner;

public class countCharacter {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string");
        String st=sc.nextLine();

        //converting the string into an array.
        char[] arr=st.toCharArray();
        int letter=0, digit=0, symbol=0;
        
        for(int i=0; i<arr.length; i++){
            //This will find the given arr is a letter
            if(Character.isLetter(arr[i])){
                letter++;

                //this will find the given arr is digit
            } else if (Character.isDigit(arr[i])) {
                digit++;
            }else {
                symbol++;
            }
        }
          

        //it defines that the string only contain the digit.
        if(arr.length==digit){
            System.out.println("The String only contains digit");

            //it defines that the string only contain the alphabet.
        } else if (arr.length==letter) {
            System.out.println("The string only contain letters");
        }else {
            System.out.println("The no. of letters is : " + letter);
            System.out.println("The no. of digit is : " + digit);
            System.out.println("The no. of symbols is : " + symbol);
        }
    }
}
