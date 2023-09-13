import java.util.Scanner;

public class Challenges25 {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
String letter;
String[] vokal ={"A","a","E","e","I","i", "O","o","U","u","Y","y","Å","å","Ä","ä","Ö","ö"};
letter = scanner.nextLine();
int wordLenght = letter.length();
scanner.close();
boolean isItVokal = false;
for (int i = 0;  i < vokal.length; i++) {
  if (letter.equals(vokal[i])) {
    isItVokal = true;
  }
}
if ( isItVokal) {
      System.out.println("Vokal");
}
else if (wordLenght >1){
  System.out.println("Wrong Input");
}

else {
  System.out.println("Konsonant");
}





    


        
    }
}
