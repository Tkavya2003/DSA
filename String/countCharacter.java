package DSA.String;

public class countCharacter {
    public static void main(String[] args) {
        String st="aman Kush @*()*@ 159654 singh";

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
        System.out.println("The no. of letters is : "+letter);
        System.out.println("The no. of digit is : "+digit);
        System.out.println("The no. of symbols is : "+symbol);
    }
}
