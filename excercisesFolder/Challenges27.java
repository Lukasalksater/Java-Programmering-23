import java.util.Scanner;

public class Challenges27 {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int num = scanner.nextInt();
scanner.close();
printPyramid(num);
  

 
}



public static void printPyramid (int num){

  int i,j;
for ( i=1; i<= num; i++ ) {
 
  for ( j = 0; j<i; j++){
System.out.print(i);

  }

  System.out.println();
}
    }

  }