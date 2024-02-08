// Print the Even length words in the sentence

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       String input="sky is blue and vast";
       String[] wordsofString=input.split(" ");
       for(String currentWord :wordsofString){
           if(currentWord.length() % 2==0){
               System.out.println(currentWord);
           }
       }
    }
}
