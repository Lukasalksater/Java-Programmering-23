public class Player  {

   private int playerPoint;
   private Die dice = new Die(6);
   private String playerName;

Player (String playerName){
    this.playerName = playerName;
}

public String getPlayerName(){

    return playerName;
}

public void  rollDice (Die playerDice){

       playerDice.roll(playerDice.getMaxValue());

}

public int getDieValue(){

    int rolledNumber = dice.getCurrentValue();
    return rolledNumber;

}

public int setPlayerPoints (int startingPlayerPoint) {

    this.playerPoint = startingPlayerPoint;
    return playerPoint;
}

public int getPlayerPoints () {

    return playerPoint;
}

public void increaseScore(){

    playerPoint = playerPoint + 1;
}

public Die addDie (int dieSides) {
    Die newDie = new Die(dieSides);

    return newDie;
    
}



   


}
