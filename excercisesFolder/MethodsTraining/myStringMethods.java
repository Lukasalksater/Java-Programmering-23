package MethodsTraining;

import java.util.Scanner;

public class myStringMethods {


    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        System.out.println("Enter the character you want to count");
       String reverseWord = reverseString(word);
       System.out.println(reverseWord);
    }
    

    public static String reverseString(String input){
        input.length();
        input.charAt(0);
        String revereseWord = "";

        for(int i = input.length()-1; i >= 0; i-- ){

             revereseWord += input.charAt(i);


        }

        return revereseWord;

    }

    public static int characterCount(String input, char character){

        int howManyCharacters = 0;
        
        for (int i = 0; i < input.length(); i++){
            if(input.charAt(i) == character) howManyCharacters++;
        }

        return howManyCharacters;

    }
}
