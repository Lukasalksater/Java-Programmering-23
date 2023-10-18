package DiceGameInlämmning;
import java.util.Scanner;

public class DiceGame {

   static Scanner scanner = new Scanner(System.in);
   static boolean playing = true;

    
   
    public static void main(String[] args) {

        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
     

        System.out.println("How many rounds do you want to play?");
        int rounds = scanner.nextInt();

        System.out.println("How many sides does your dice have?");
        int maxDiceValue = scanner.nextInt();
        Die playerDice = new Die(maxDiceValue);


        

        playGame(rounds, player, playerDice);  
       
    }


    public static void playGame (int howManyRounds, Player player, Die playerDice){

        
       int currentRound = howManyRounds - howManyRounds + 1;


     while (playing) {

       
        System.out.println("This is round: " + currentRound );
        System.out.println("Guess what number your dice rolls and if it's correct get 1 point");
        int guess = scanner.nextInt();
        player.rollDice(playerDice);
        

        System.out.println (  player.getPlayerName() +", The dice value is " + playerDice.getCurrentValue());

        if (guess == playerDice.getCurrentValue()) {

            player.increaseScore();

            System.out.println( player.getPlayerName() +" guessed correct and got 1 point, your score is " + player.getPlayerPoints());
            
        }

        else {
            System.out.println( player.getPlayerName() + " guessed wrong, your score is " + player.getPlayerPoints());
        }

        if (currentRound == howManyRounds) {

          System.out.println("The game has ended, " + player.getPlayerName() + " score was: " + player.getPlayerPoints());
          playing = false;
        }

        currentRound++;

        
     }

       

      
       





      

    
    }
}
