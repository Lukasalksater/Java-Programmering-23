package MethodsTraining;

import java.util.Scanner;

public class myMathMethods {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();

       boolean isPrime = isPrime(number);
       System.out.println(isPrime);
       scanner.close();


        

    }

    public static int calculateFactorial(int number){

    int factorial = 1;

    if (number == 0) {
             factorial = 1;
            return factorial;
    
}

if (number <0) {
    System.out.println(" Error: No number lower than 0");
    return 0;
}

for(int i = 2; i< number; i++){
    factorial = factorial * i;
}
    return factorial;


    }

    public static int caclculateFibonacci(int number){

        int fibbonacci = 0;

        if (number == 1){

            fibbonacci = 0;
            return fibbonacci;
        }

        if (number == 2){
            fibbonacci = 1;
            return fibbonacci;
        }

        if (number <= 0){
            System.out.println("Error: Only postive integers");
            return 0;
        }

        return 0;

    
 
    }

    public static boolean isPrime (int number){

        boolean isPrime;
        for (int i = 2; i <number; i++){

            if (number % i == 0){

                isPrime = false;
                return isPrime;
            }

 


        }

        
        if (number == 1){

                isPrime = true;
                return isPrime;
            }

        isPrime = true;
        return isPrime;



       

    }
}
