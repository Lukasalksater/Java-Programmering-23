package MethodsTraining;

import java.util.Scanner;

public class myStringMethods {


    public static void main(String[] args) {
        System.out.println("Enter your email");
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();
        boolean isEmailValid = isEmailValid(email);
        System.out.println(isEmailValid);
  
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

    public static boolean isEmailValid(String email){

        boolean isEmailValid;
        String emailEnding[] = {".com",".org",".edu",".se"};
        
   for (int i = 0; i<= email.length(); i++){
  int characterLocation = email.indexOf('@', i);
    
   if (characterLocation <0) {
    isEmailValid = false;
    System.out.println("Ivalid email, no @");
    return isEmailValid;
   }

      if (characterLocation> 0) {
    for (int j =0; j <= emailEnding.length; j++){
       boolean doesEmailEndWith = email.endsWith(emailEnding[j]);

       if(doesEmailEndWith == true){
        isEmailValid = true;
        return isEmailValid;
       }
    }
   } 
   
   }



   isEmailValid = false;
   return isEmailValid;

    }
}
