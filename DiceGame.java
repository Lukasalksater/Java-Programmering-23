import java.util.Scanner;

public class DiceGame {

    static boolean playing = true;
   static Scanner scanner = new Scanner(System.in);

    
   
    public static void main(String[] args) {
     

    do {
        playGame();
    }
     while ( playing == true);

        


     
      
          


       






    }


    public static void playGame (){

        
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        System.out.println("How many sides does your dice have?");
        int maxDiceValue = scanner.nextInt();
        Die playerDice = new Die(maxDiceValue);
        
        System.out.println("Guess what number your dice rolls and if it's correct get 1 point");
        int guess = scanner.nextInt();
        player.rollDice(playerDice);
        

        System.out.println ("The dice value is " + playerDice.getCurrentValue());

        if (guess == playerDice.getCurrentValue()) {

            player.increaseScore();

            System.out.println("You guessed correct and got 1 point, your score is " + player.getPlayerPoints());
            
        }

        else {
            System.out.println("You guessed wrong, your score is " + player.getPlayerPoints());
        }

      System.out.println("Do you want to play again? If so write Y elser write N");

      String answer = scanner.nextLine();

      if(answer.equalsIgnoreCase("Y")) {

        playing = true;
        
      }

      else {

        playing = false;
        scanner.close();
      }
      






    
    }
}
