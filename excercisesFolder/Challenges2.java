import java.util.Scanner;

public class Challenges2 {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

 

 double num = scanner.nextInt();
 scanner.close();

if (num <1) {


  if (num == 0) {
    System.out.println("0");
  }
  else if (num >=0){
    System.out.println("Positivt");
  }
  else if (num <0) {
    System.out.println("Negativt");
  }
  System.out.println(" Litet");
}
else if (num >= 1){

  if (num >1000000){
  System.out.println("Stort");

  }
    System.out.println("Positivt");

}
}
}
