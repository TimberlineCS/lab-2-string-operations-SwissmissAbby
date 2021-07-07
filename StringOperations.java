//Abby Stamper
//8/31/20
//Period 2


/*
Challenge 1
This challenge takes the first half and second half of a word and swaps them
*/
public class StringOperations{

     public static void main(String args[]){
       
       String word = "Scissors";
       int wordLength = word.length();
       String firstHalf = word.substring(0,wordLength/2);
       String secondHalf = word.substring(wordLength/2);
       String a = secondHalf + firstHalf;   
       String c = a.toLowerCase();
       System.out.println(c);

       String word2 = "Picture";
       int wordLength2 = word2.length();
       String firstHalf2 = word2.substring(0,wordLength2/2);
       String secondHalf2 = word2.substring(wordLength2/2);
       String a2 = secondHalf2 + firstHalf2;
       String c2 = a2.toLowerCase();   
       System.out.println(c2);

       String word3 = "Computer";
       int wordLength3 = word3.length();
       String firstHalf3 = word3.substring(0,wordLength3/2);
       String secondHalf3 = word3.substring(wordLength3/2);
       String a3 = secondHalf3 + firstHalf3; 
       String c3 = a3.toLowerCase();  
       System.out.println(c3);


/*
Challenge 2
Creates geometric ascii art while using escaping techniques
*/
       System.out.println("    ________\n   /_______/\\\n   \\ \\    / /\n ___\\ \\__/_/___\n/____\\ \\______/\\\n\\ \\   \\/ /   / /\n \\ \\  / /\\  / /\n  \\ \\/ /\\ \\/ /\n   \\_\\/  \\_\\/");

     }


}