import java.util.Scanner;

public class Challenges28 {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int num = scanner.nextInt();
scanner.close();

printDiamond(num);
  

 
}



public static void printDiamond (int num){

  int i,j;
for ( i=1; i<= num; i++ ) {
 
  for ( j = 0; j<i; j++){
System.out.print("*");

  }

  System.out.println();
}

for (i = num - 1; i != 0; i--){

    for ( j = 0; j<i; j++){
System.out.print("*");

  }

  System.out.println();
}
    }

  }