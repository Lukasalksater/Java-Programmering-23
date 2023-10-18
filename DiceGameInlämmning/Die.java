package DiceGameInlämmning;
import  java.util.Random;
public class Die {
    private int maxValue;
    private int currentValue;
    private Random random = new Random();

    Die (int maxValue){
        
        this.maxValue = maxValue;
    }


    public int getCurrentValue (){
        return currentValue;
    }

    public int getMaxValue () {

       return maxValue;
    }

public void roll (int maxValue){

    
   currentValue = random.nextInt( maxValue)  + 1;
    
}
    
}
